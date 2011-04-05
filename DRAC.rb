module DRAC
  DRAC_response = Struct.new :authentication, :create, :cancelation, :disconnect, :reservation_id, :reason, :reservation_start, :reservation_end

  def self.parse_response(response)
    current_response = DRAC_response.new

    auth_response = false
    create_response = false
    disconnect_response = false
    cancelation_response = false
    auth_xml = ""
    create_xml = ""
    disconnect_xml = ""
    cancelation_xml =""
    response.each_with_index do |line, index|
      if line.match "not authenticated, must be authenticated before calling"
        current_response.authentication = false
        return current_response
      else
        if line.match("-------------------------->")
          auth_response = false
          create_response = false
          disconnect_response = false
          next
        end
        if line.match("--AUTHENTICATION RESPONSE--") 
          auth_response=true
          next
        end
        if line.match("--CREATE SCHEDULE RESPONSE--") 
          create_response=true
          next
        end
        if line.match("--CANCELATION RESPONSE--") 
          cancelation_response=true
          next
        end
        if line.match("--DISCONNECT RESPONSE--") 
          disconnect_response=true
          next
        end      
        if auth_response
          auth_xml += line
        elsif create_response
          create_xml += line
        elsif cancelation_response
          cancelation_xml += line
        elsif disconnect_response
          disconnect_xml += line
        end
      end
    end

    # transform the xml's into an Hpricot object for easy searching.

    auth_xml = Hpricot::XML(auth_xml)
    if auth_xml.at("drac:result").inner_html == "Success" #DRAC authentication succesfull
      current_response.authentication = true
      if create_xml !="" # 
        create_xml = Hpricot(create_xml)
        if create_xml.at("res:result").inner_html == "Succeeded"
          current_response.create = true
          current_response.reservation_id = create_xml.at("res:reservationscheduleid").inner_html
          current_response.reservation_start = create_xml.at("res:occurrenceinfo").at("res:starttime").inner_html
          current_response.reservation_end = create_xml.at("res:occurrenceinfo").at("res:endtime").inner_html
        else
          current_response.create = false
        end
        current_response.reason = create_xml.at("res:occurrenceinfo").at("res:reason").inner_html
      elsif cancelation_xml != ""
        cancelation_xml = Hpricot(cancelation_xml)
        if cancelation_xml.at("res:result").inner_html == "Success"
          current_response.cancelation = true
        end
      end
    else
      current_response.authentication = false
    end
    return current_response
  end
  
  def self.write_DRAC_config(source, destination, filename)
    configuratie = ""
    configuratie << "Username                       =#{$DRAC_Username}\n"
    configuratie << "Pass                           =#{$DRAC_Pass}\n"
    configuratie << "serviceURL                     =#{$DRAC_serviceURL}\n"
    configuratie << "scheduleName                   =DRAC_automator_#{Time.now.strftime("%Y-%m-%dT%H:%M:%S")}\n"
    configuratie << "billingGroup                   =#{$DRAC_billingGroup}\n"
    configuratie << "startTime                      =#{(Time.now + 20).strftime("%Y-%m-%dT%H:%M:%S")}\n" #30 seconds from now
    configuratie << "endTime                        =#{(Time.now + 20 + ($DRAC_serviceDuration * 60)).strftime("%Y-%m-%dT%H:%M:%S")}\n"
    configuratie << "serviceDuration                =#{$DRAC_serviceDuration}\n"
    configuratie << "rate                           =#{$DRAC_rate}\n"
    configuratie << "sourceUserGroup                =#{source.user_group}\n"
    configuratie << "sourceUserResourceGroup        =#{source.resource_user_group}\n"
    configuratie << "sourceEndpoint                 =#{source.DLP_interface}\n"
    configuratie << "destinationEndpoint            =#{destination.DLP_interface}\n"
    configuratie << "destinationUserGroup           =#{destination.user_group}\n"         
    configuratie << "destinationResourceUserGroup   =#{destination.resource_user_group}\n"
    configuratie << "sourceVlanID                   =#{$DRAC_sourceVlanID}\n"
    configuratie << "destinationVlanID              =#{$DRAC_destinationVlanID}\n"      
    configuratie << "protectionType                 =Unprotected\n"
    configuratie << "sourceChannel                  =not_specified\n"
    configuratie << "destinationChannel             =not_specified\n"
    configuratie << "routingAlgorithm               =VCAT\n"
    File.open(filename, 'w') {|f| f.write(configuratie) }
  end
  
  
  def self.create_dlp(source, destination)
    drac_tool_response = %x[/usr/bin/java -jar #{$automator_binary_path} -m -f #{$automator_config_path} 2> /dev/null]
    filename = "#{$automator_log_path}DRAC-response-XML-#{Time.now.strftime("%Y-%m-%dT%H:%M:%S")}"
    File.open(filename, 'w') {|f| f.write(drac_tool_response)}
    result = parse_response(drac_tool_response)
    if not result.authentication
      Syslog.notice "New DLP reservation failed because authentication failed"
    elsif result.create
      Syslog.notice "NEW DLP reservation: ID: #{result.reservation_id}, Reason: #{result.reason} "
      my_reservation = Reservation.new
      my_reservation.resource_type = "DRAC"
      my_reservation.reservation_id = result.reservation_id
      my_reservation.reservation_start = DateTime.parse(result.reservation_start)
      my_reservation.reservation_end = DateTime.parse(result.reservation_end)
      my_reservation.source = source
      my_reservation.destination = destination
      my_reservation.save
    else
      Syslog.notice "NEW DLP reservation failed. Reason given: #{result.reason}"
    end
  end
  
  def self.cancel_reservation(reservation_id, reason)
    drac_tool_response = %x[/usr/bin/java -jar #{$automator_binary_path} -c #{reservation_id} -f #{$automator_config_path} 2> /dev/null]
    result = parse_response(drac_tool_response)
    if result.cancelation
      message = "DRAC DLP with id #{reservation_id} cancelled #{reason}" 
      Syslog.notice message
      puts message
    else
      message = "Cancellation of #{reservation_id} failed"
      Syslog.notice message
      puts message
    end
  end
end #module