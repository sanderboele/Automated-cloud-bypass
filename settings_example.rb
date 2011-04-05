# This is the settings file that is included in the ruby script.
# Everything in this file is Ruby code

#interface to do traffic inspection on, typically this is the interface the attached switch should mirror traffic to
$interface = "eth1" 
$interval = 60 #number of seconds to count bytes before making a decision
$setup_threshold = 500 #MB transfered in interval to trigger dynamic circuit
$remove_threshold = 300 #lower limit MB transfered in interval to trigger removal of lightpath
$min_circuit_time = 180 #seconds the dynamic circuit should -at least- be active for. 

############################ local reservation database ######################

BASE_PATH = "/home/yourname/cloud_bypass"
RESERVATION_DB = "#{BASE_PATH}/reservations.sqlite3"

######################## Automation tool path ################################

$automator_binary_path = "#{BASE_PATH}/automation_tool/AutomationTool.jar"
$automator_config_path = "#{BASE_PATH}/automation_tool/config/temporary_drac_automator_config.properties"
$automator_log_path="#{BASE_PATH}/log/"

#################################### SITES CONFIGURATION #################################################
# The resources that you want to make available to the program can be entered below 
#
#
# The first site titled $homeSite is the site the DRAC automator script is deployed. It will be the source
# of all dynamic circuits. 
# the Network object inherits from the IpAddress object.

$homeSite = Network.new
$homeSite.name = "My site"
$homeSite.DLP_interface= "Asd001A_OME12_ETH-10-3-1"
$homeSite.user_group = "my_group"
$homeSite.resource_user_group = "my_resource_group"
$homeSite.resource_type = "DRAC"

$site1 = Network.new("10.0.0.0/27") 
$site1.name = "Some other site"
$site1.DLP_interface = "Asd006A_OME018_ETH-10-2-3"
$site1.user_group = "my_group"
$site1.resource_user_group = "my_resource_group"
$site1.resource_type = "DRAC"

$site2= Network.new("192.168.0.0/24")
$site2.name="Yet another site"
$site2.DLP_interface ="Gn001A_OME014_ETH-14-54-24"
$site2.user_group = "my_group"
$site2.resource_user_group = "my_resource_group"
$site2.resource_type = "DRAC"


# Sum up the sites (networks) you'd like the script to watch for activity and setup dynamic circuits for.

$watched_sites = [$site1, $site2]

############################################################################################
#
#   Config properties for DRAC automation tool, this is only necesary when DRAC is used in 
#   in conjunction witht the Automation tool
#
############################################################################################
#
# Authentication settings

$DRAC_Username = "myname" 
$DRAC_Pass = "my pass"
$DRAC_serviceURL = "https://drac.surfnet.nl:8443/axis2/services/ResourceAllocationAndSchedulingService"
#
# Reservation settings
#
$DRAC_scheduleName = "automated_setup"
$DRAC_billingGroup = "my billing group"
$DRAC_serviceDuration = 1440 #default service duration for lightpaths in minutes
$DRAC_rate = 1000 #lightpath bandwidth in Mb/s
#
$DRAC_sourceVlanID = 4096
$DRAC_destinationVlanID = 4096 
$DRAC_protectionType = "Unprotected"
$DRAC_sourceChannel = "not_specified"
$DRAC_destinationChannel = "not_specified"
$DRAC_routingAlgorithm = "VCAT"
