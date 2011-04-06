package dracp1;

import java.io.*;
import java.util.Properties;
/**
 *
 * @author Erno 
 */
public class ConfigLoader {
    //Create variables that will store the settings configured
    //in the DRAC_config.prop property file
    public String Uname;
    public String Pass;
    public String serviceURL;
    public String scheduleName;
    public String billingGroup;
    public String startTime;
    public String endTime;
    public String serviceDuration;
    public String sourceUserGroup;
    public String sourceUserResourceGroup;
    public String sourceEndpoint;
    public String destinationEndpoint;
    public String destinationUserGroup;
    public String destinationResourceUserGroup;
    public String rate;
    public String sourceVlanID;
    public String destinationVlANID;
    public String protectionType;
    public String sourceChannel;
    public String destinationChannel;
    public String routingAlgorithm;

    public ConfigLoader(){}

    public void loadConfig() throws IOException {
        //Attempt to load the configuration settings from the DRAC_config.pro file
        try {
        //create a new property file and load config from(config/DRAC_config.prop)
        //After cleaning and building this file will be deleted so it must be copied
        //into the same folder as the jar file, otherwise an error will occur.
        Properties prop = new Properties();
        prop.load(new BufferedInputStream(new FileInputStream("config/DRAC_config.properties")));
        Uname               = prop.getProperty("Username");
        Pass                = prop.getProperty("Pass");
        serviceURL          = prop.getProperty("serviceURL");
        scheduleName        = prop.getProperty("scheduleName");
        billingGroup        = prop.getProperty("billingGroup");
        startTime           = prop.getProperty("startTime");
        endTime             = prop.getProperty("endTime");
        serviceDuration     = prop.getProperty("serviceDuration");
        sourceUserGroup     = prop.getProperty("sourceUserGroup");
        sourceUserResourceGroup = prop.getProperty("sourceUserResourceGroup");
        sourceEndpoint      = prop.getProperty("sourceEndpoint");
        destinationEndpoint = prop.getProperty("destinationEndpoint");
        destinationUserGroup= prop.getProperty("destinationUserGroup");
        destinationResourceUserGroup = prop.getProperty("destinationResourceUserGroup");
        rate                = prop.getProperty("rate");
        sourceVlanID        = prop.getProperty("sourceVlanID");
        destinationVlANID   = prop.getProperty("destVlanID");
        protectionType      = prop.getProperty("protectionType");//note don't leave any white space after this property
        sourceChannel       = prop.getProperty("sourceChannel");
        destinationChannel  = prop.getProperty("destinationChannel");
        routingAlgorithm    = prop.getProperty("routingAlgorithm");

        }
        //catch exception and display
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
   }


     public void loadConfig(String configFile) throws IOException {
        //Attempt to load the configuration settings from the DRAC_config.pro file
        try {
        //create a new property file and load config from(config/DRAC_config.prop)
        //After cleaning and building this file will be deleted so it must be copied
        //into the same folder as the jar file, otherwise an error will occur.
        Properties prop = new Properties();
        prop.load(new BufferedInputStream(new FileInputStream(configFile)));
        Uname               = prop.getProperty("Username");
        Pass                = prop.getProperty("Pass");
        serviceURL          = prop.getProperty("serviceURL");
        scheduleName        = prop.getProperty("scheduleName");
        billingGroup        = prop.getProperty("billingGroup");
        startTime           = prop.getProperty("startTime");
        endTime             = prop.getProperty("endTime");
        serviceDuration     = prop.getProperty("serviceDuration");
        sourceUserGroup     = prop.getProperty("sourceUserGroup");
        sourceUserResourceGroup = prop.getProperty("sourceUserResourceGroup");
        sourceEndpoint      = prop.getProperty("sourceEndpoint");
        destinationEndpoint = prop.getProperty("destinationEndpoint");
        destinationUserGroup= prop.getProperty("destinationUserGroup");
        destinationResourceUserGroup = prop.getProperty("destinationResourceUserGroup");
        rate                = prop.getProperty("rate");
        sourceVlanID        = prop.getProperty("sourceVlanID");
        destinationVlANID   = prop.getProperty("destVlanID");
        protectionType      = prop.getProperty("protectionType");//note don't leave any white space after this property
        sourceChannel       = prop.getProperty("sourceChannel");
        destinationChannel  = prop.getProperty("destinationChannel");
        routingAlgorithm    = prop.getProperty("routingAlgorithm");


        }
        //catch exception and display
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
   }






}