#! /usr/bin/env ruby

require 'rubygems'
require 'pcap'
require 'ipaddr'
require 'syslog'
require 'hpricot'
require 'active_record' 
require 'DRAC' #This is the DRAC module inside the DRAC.rb script

################################ write syslog notification with pid ######################
Syslog.open('auto_cloud_bypass')
Syslog.notice("Cloud bypass automator started with pid: #{Process.pid}")
################ extend IPAddr class to also contain other useful properties.

class Network < IPAddr
  attr_accessor :total_bytes, :total_packets, :name, :DLP_interface, :user_group, :resource_user_group, :resource_type
end

# Include the settings after extending the IPAddr class into the new Network class 

begin
  require 'settings'
rescue LoadError
  puts "No settings.rb found. Please copy/edit from settings_example.rb"
  Process.exit
end
  
  
if not File.exists? RESERVATION_DB
 puts "Reservation DB not found, creating the reservation db at #{RESERVATION_DB}..."
 %x[/usr/bin/sqlite3 #{RESERVATION_DB} 'CREATE TABLE reservations(
 id integer primary key,
 reservation_id varchar(30),
 created_at timestamp,
 updated_at timestamp,
 reservation_start timestamp,
 reservation_end timestamp,
 reservation_cancel timestamp,
 source varchar(30),
 destination varchar(30),
 resource_type varchar(30));']
end

ActiveRecord::Base.establish_connection(
      :adapter => "sqlite3",
      :database  => RESERVATION_DB
)
class Reservation < ActiveRecord::Base
  self.table_name = "reservations"
end
  
def inspect_traffic(interface, interval, setup_threshold, remove_threshold, watched_sites)
  dev = Pcap.lookupdev
  cap = Pcap::Capture.open_live(interface)
  watched_sites.each do |network|
    network.total_bytes = 0
    network.total_packets = 0
  end

  startTime = Time.now
  cap.setfilter("ip")
  # loop through packets
  cap.loop do |pkt|
    watched_sites.each do |network|
      if network.include?(pkt.ip_src) or network.include?(pkt.ip_dst)
        network.total_packets+=1 #total packets to and from watched network
        network.total_bytes+= pkt.ip_len #total bytes to and from watched network
      end
    end
      
    if Time.now > (startTime + interval)
      watched_sites.each do |network|
        puts Time.now  
        puts "Traffic for possible #{network.resource_type} #{network.name} IP (#{network.to_s}) this interval is #{(network.total_bytes/1000000).to_i} MB"
        if (network.total_bytes / 1000000) > setup_threshold
          #query for active reservation, otherwise, try to setup a new one.
          if Reservation.where( :reservation_end => ((Time.now) .. (Time.now + 30.day)),
                                :source => $homeSite.DLP_interface,
                                :destination => network.DLP_interface,
                                :reservation_cancel => nil).empty?
                                
            puts "Set up dynamic circuit (#Mbytes = #{(network.total_bytes/1000000).to_i})" #try to setup DLP to site
            Syslog.notice("Will try to set up dynamic circuit to #{network.name} (type: #{network.resource_type}) because #{(network.total_bytes/1000000).to_i} MB sent+received in #{interval} seconds")
            ############################################
            #
            # Possibly include other types of dynamic circuits here by changing the resource type and adding another module.
            #
            ############################################ 
            if network.resource_type == "DRAC"
              DRAC.write_DRAC_config($homeSite, network, $automator_config_path)
              DRAC.create_dlp($homeSite.DLP_interface, network.DLP_interface)
              # elseif network.type = "Autobahn/Fenius/NSI" setup dynamic with functions provided by other modules
            end
          else
            puts "Packetcount is above threshold, but there already is an active reservation."
          end
        elsif (network.total_bytes / 1000000) < remove_threshold #remove the reservation if it exists and not younger than $min_circuit_time seconds
          puts "Throughput is below threshold, checking if there is an active reservation older than #{$min_circuit_time} seconds..."
          reservation = Reservation.where(:reservation_start => (Time.now - 30.day) .. (Time.now - $min_circuit_time), 
                                          :source => $homeSite.DLP_interface, 
                                          :destination =>network.DLP_interface).last
          if not reservation.nil? and reservation.reservation_cancel.nil?
            if reservation.resource_type == "DRAC"
              puts "Found an active DRAC reservation (#{reservation.reservation_id}) that is older than #{$min_circuit_time} seconds. It will now be cancelled"
              DRAC.write_DRAC_config($homeSite, network, $automator_config_path)
              DRAC.cancel_reservation(reservation.reservation_id, "because traffic below cut-off threshold of #{$remove_threshold} MB and circuit has existed longer than #{$min_circuit_time}s.")
            end
            reservation.reservation_cancel = Time.now
            reservation.save
          else
            puts "No reservation found. Nothing to be done."
          end
        end
      end
      puts cap.stats
      puts ""
      cap.close
      break #break out of cap loop, reset counters and start over.
    end
  end
end

loop do
  inspect_traffic($interface, $interval, $setup_threshold, $remove_threshold, $watched_sites)
end
