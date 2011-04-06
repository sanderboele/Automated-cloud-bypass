package dracp1;

import jargs.gnu.CmdLineParser;

/**
 *
 * @author Erno
 */
public class cmdParser {

    private CmdLineParser parser;
    public boolean makeSched = false;
    public boolean queryScheds = false;
    public String schedIdCancel = null;
    public String schedIdStatus = null;
    public boolean runNow =false;
    public static Object good = true;

    public String listScheds = null;
    public String[] listvals = new String[2];
    public String configFile =null;

    public cmdParser(){}
    //Method to print how to use the DRAC Automation Tool
    public void printUsage() {
        System.out.println(
        "Usage: [-n,--now][-m,--make] [{-q,--query}] [{-c,--cancel [value]}]\n" +
        "       [{-s,--status}[value] [{-l,--list} [value1] [value2]] [{-f,--file} [value]] [{-h,--help}]\n"
                + "-n --now     Make a reservation with the current time as startTime.\n"
                + "-m --make    Make a reservation with the settings in the DRAC_confg2.properties file.\n"
                + "-q --query   Retrieve a list of reservtions based on the startTime and endTime interval.\n"
                + "             specified in the config file used.\n"
                + "-c --cancel  Cancel a  reservation based on the schedule ID value.\n"
                + "-s --status  Retrieve the status of a reservation based on the schedule ID value.\n"
                + "-l --list    Query a list of reservations based on the startTime and endTime you specify.\n"
                + "             at the command line."
                + "-f --file    Specify a configuration file that you wish to use.\n"
                + "-h --help    Display this helpfile."
                 );
    }   
    
    
    //Method to parse commandline arguments
    public void parse(String[] argz) throws CmdLineParser.OptionException {

        //create parser and options we recognize for parsing
        parser = new CmdLineParser();
        CmdLineParser.Option makeSchedule   = parser.addBooleanOption('m',"make");
        CmdLineParser.Option querySchedules = parser.addBooleanOption('q', "query");
        CmdLineParser.Option cancelSchedule = parser.addStringOption('c', "cancel");
        CmdLineParser.Option scheduleStatus = parser.addStringOption('s', "status");
        CmdLineParser.Option help           = parser.addBooleanOption('h', "help");

        CmdLineParser.Option listSchedules  = parser.addStringOption('l', "list");
        CmdLineParser.Option setConfig      = parser.addStringOption('f', "file");
        CmdLineParser.Option makeScheduleNow= parser.addBooleanOption('n', "--now");

        //Attempt to parse the command line arguments
        try {
            parser.parse(argz);
            //Create standard objects from commandline arguments which will be used to 
            //compare if they were used(true) or not.
            Object ms = (Object)parser.getOptionValue(makeSchedule);
            Object qs = (Object)parser.getOptionValue(querySchedules);
            Object hf = (Object)parser.getOptionValue(help);
            Object mn = (Object)parser.getOptionValue(makeScheduleNow);

            //Object ls2 =(Object)parser.getOptionValue(zeta);
            //Compare the arguments value to check if they were uses or not.
            //Based on this we make a choice wether to make a schedule, list schedules
            //check schedule status, and or cancel a schedule
            try {
                if(ms.equals(good) == true) {
                //make this boolean true
                makeSched = true;
                }
            }
            // Catch Exception and then do nothing with it because if an exception was
            //thrown we're certain the argument was null and thus not used.
            catch(Exception e){}

            try{
                if(qs.equals(good) == true) {
                //make this boolean true
                queryScheds = true;
                }
            }
            // Catch Exception and then do nothing with it because if an exception was
            //thrown we're certain the argument was null and thus not used.
            catch(Exception e){}

            schedIdCancel   = (String)parser.getOptionValue(cancelSchedule);
            schedIdStatus   = (String)parser.getOptionValue(scheduleStatus);
            configFile      = (String)parser.getOptionValue(setConfig);
            listScheds      = (String)parser.getOptionValue(listSchedules);
            
            try{
                if(listScheds != null){
                listvals = listScheds.split("_");
               
                }
               
            }
            catch(Exception e){
            System.out.println();
            }
            //System.out.println(listScheds);
            try {
            if(hf.equals(good) == true) {
                printUsage();
                }
            }
            // Catch Exception and then do nothing with it because if an exception was
            //thrown we're certain the argument was null and thus not used.
            catch(Exception e){}

            try {
            if(mn.equals(good) == true) {
                runNow = true;
                }
            }
            catch(Exception e){}
        }
        //Catch a CMDLineParser exception & display the error & call the printUsage
        //method to display how the application should be used, then terminate app.
        catch(CmdLineParser.OptionException e ) {
            System.err.println(e.getMessage());
            printUsage();
            System.exit(1);
        }
    }
}
