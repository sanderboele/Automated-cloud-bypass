package dracp1;

/**
 *
 * @author Erno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

    //Create an instance of the cmdParser class
    //parse commandline arguments
    cmdParser cp = new cmdParser();
    cp.parse(args);

       if(cp.runNow == true){
        //Make an instance of the Connection and Reservation class
        //connect > make reservation schedule > disconnect

       if(cp.configFile != null){
            Connection c = new Connection(cp.configFile);
            Reservation r = new Reservation(cp.configFile);
            c.connectDRAC();
            r.makeReservationNow();
            c.disconnectDRAC();
        }

        else{
            Connection c = new Connection();
            Reservation r = new Reservation();
            c.connectDRAC();
            r.makeReservationNow();
            c.disconnectDRAC();
        }
   }

    //makeSched boolean from the cmdParser class is true so we'll make a reservation schedule
    if(cp.makeSched == true){
        //Make an instance of the Connection and Reservation class
        //connect > make reservation schedule > disconnect

        if(cp.configFile != null){
            Connection c = new Connection(cp.configFile);
            Reservation r = new Reservation(cp.configFile);
            c.connectDRAC();
            r.makeReservation();
            c.disconnectDRAC();
        }

        else{
            Connection c = new Connection();
            Reservation r = new Reservation();
            c.connectDRAC();
            r.makeReservation();
            c.disconnectDRAC();
        }
   }
    //queryScheds boolean is true so we'll list reservations schedules
    if(cp.queryScheds == true){
        //Make an instance of the Connection and Reservation class
        //connect > list schedules > disconnect
        if(cp.configFile != null){
            Connection c = new Connection(cp.configFile);
            Reservation r = new Reservation(cp.configFile);
            c.connectDRAC();
            r.listSchedules();
            c.disconnectDRAC();
        }
        else{
            Connection c = new Connection();
            Reservation r = new Reservation();
            c.connectDRAC();
            r.listSchedules();
            c.disconnectDRAC();
        }
   }


    //schedIdStatus String is not null thus has a string value that we'll use to check the status of that
    //specific schedule
    if(cp.schedIdStatus != null){
        //Make an instance of the Connection and Reservation class
        //connect > check schedule status > disconnect
        if(cp.configFile != null){
            Connection c = new Connection(cp.configFile);
            Reservation r = new Reservation(cp.configFile);
            c.connectDRAC();
            r.scheduleStatus(cp.schedIdStatus);
            c.disconnectDRAC();
        }
        else{
            Connection c = new Connection();
            Reservation r = new Reservation();
            c.connectDRAC();
            r.scheduleStatus(cp.schedIdStatus);
            c.disconnectDRAC();
        }
    }

     //schedIdCancel String is not null thus has a string that we'll use as an argument to cancel
    //that specific schedule
    if(cp.schedIdCancel != null){
        //Make an instance of the Connection and Reservation class
        //connect > cancel schedule > disconnect
        if(cp.configFile != null){
            Connection c = new Connection(cp.configFile);
            Reservation r = new Reservation(cp.configFile);
            c.connectDRAC();
            r.cancelSchedule(cp.schedIdCancel);
            c.disconnectDRAC();
        }
        else{
            Connection c = new Connection();
            Reservation r = new Reservation();
            c.connectDRAC();
            r.cancelSchedule(cp.schedIdCancel);
            c.disconnectDRAC();
            //System.out.println(cp.schedIdCancel);
        }
    }

  if(cp.listScheds != null){
        //Make an instance of the Connection and Reservation class
        //connect > list schedules CLI specified > disconnect
        if(cp.configFile != null){
            Connection c = new Connection(cp.configFile);
            Reservation r = new Reservation(cp.configFile);
            c.connectDRAC();
            try{
            r.listSchedules(cp.listvals[0], cp.listvals[1]);
            }
            catch (Exception e){
                System.out.println(" -------------Error!-----------\n"
                                  +"|  -Check Time format          |\n"
                                  +"|  -Set 1 startime & 1 endtime |\n"
                                  +"|                              |\n"
                                  +" ---------------------------- \n");

           }
            c.disconnectDRAC();
            }
         else{
            Connection c = new Connection();
            Reservation r = new Reservation();
            c.connectDRAC();
        try{
            r.listSchedules(cp.listvals[0],cp.listvals[1]);
        }
        catch (Exception e){
                System.out.println(" -------------Error!-----------\n"
                                  +"|  -Check Time format          |\n"
                                  +"|  -Set 1 startime & 1 endtime |\n"
                                  +"|                              |\n"
                                  +" ---------------------------- \n");
        }
        c.disconnectDRAC();
        }
    }
 

   }
}
