package dracp1;

import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument;
import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument;
import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT;
import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT;
import com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault;
import com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceStub;
import com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.*;
import com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument;
import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.apache.xmlbeans.XmlCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Erno
 */
public class Reservation {
    //Service address & User credentials variables
    private String userName;
    private String pass;
    private String serviceURL;
    private CredentialsDocument userCredsDoc;
    //Schedule Information
    private String scheduleName;
    private String billingGroup;
    private String startTime;
    private String endTime;
    private String serviceDuration;
    //Lightpath Connectivity
    private String srcUserGroup;
    private String srcUserRsrcGroup;
    private String srcEndpoint;
    private String destEndpoint;
    private String destUserGroup;
    private String destUserRsrcGroup;
    private int rate;
    private String srcVlanID;
    private String destVlanID;
    private String protectionType;
    private String srcChannel;
    private String destChannel;
    public String routingAlgorithm;

    private Calendar fixStartTime,fixStartTime2;
    private Calendar fixEndTime,fixEndTime2;
    private TimeZone tz = TimeZone.getTimeZone("GMT+1");
    //private Calendar nowStartTime = Calendar.getInstance(tz);

    private CreateReservationScheduleRequestDocument resSchedReqDoc,resSchedReqDoc2,resSchedReqDoc3;
    private CreateReservationScheduleResponseDocument resSchedRespDoc;
    private ResourceAllocationAndSchedulingServiceStub sClient;
    private CancelReservationScheduleRequestDocument cancelResSchedReqDoc;
    private QueryReservationScheduleRequestDocument queryResSchedReqDoc; // look at  these two objects carefully
    private QueryReservationSchedulesRequestDocument queryResSchedSSReqdoc; // there are different SCHEDULE(S)
    private QueryReservationSchedulesByDateTimeAndUserGroupT queryResSchedByTimeUserGroup;

    private ConfigLoader cl = new ConfigLoader();

    /**
     * Setup the Reservation class.
     *
     * Initialize user credentials, and reservation info.
     */
     public Reservation() throws IOException {
        //Make an instance of ConfigLoader & and load config
        //Old Line// ConfigLoader cl = new ConfigLoader();
        cl.loadConfig();
        //Service address & User credentials
        userName            =cl.Uname;
        pass                =cl.Pass;
        serviceURL          =cl.serviceURL;
         //Schedule Information
        scheduleName        =cl.scheduleName;
        billingGroup        =cl.billingGroup;
        startTime           =cl.startTime;
        endTime             =cl.endTime;
        serviceDuration     =cl.serviceDuration;
        //Lightpath Connectivity
        srcUserGroup        =cl.sourceUserGroup;
        srcUserRsrcGroup    =cl.sourceUserResourceGroup;
        srcEndpoint         =cl.sourceEndpoint;
        destEndpoint        =cl.destinationEndpoint;
        destUserGroup       =cl.destinationUserGroup;
        destUserRsrcGroup   =cl.destinationResourceUserGroup;
        rate                =Integer.parseInt(cl.rate);
        srcVlanID           =cl.sourceVlanID;
        destVlanID          =cl.destinationVlANID;
        protectionType      =cl.protectionType;
        srcChannel          =cl.sourceChannel;
        destChannel         =cl.destinationChannel;
        routingAlgorithm    =cl.routingAlgorithm;

        //Create an XML formatted date string with the parsed start time & endtime
        fixStartTime = Calendar.getInstance(tz);
        fixStartTime.setTimeInMillis(new XmlCalendar(startTime).getTimeInMillis());
        fixEndTime = Calendar.getInstance(tz);
        fixEndTime.setTimeInMillis(new XmlCalendar(endTime).getTimeInMillis());
        //Create a client service stub & and specify URL & timeout
        sClient = new ResourceAllocationAndSchedulingServiceStub(serviceURL);
        sClient._getServiceClient().getOptions().setTimeOutInMilliSeconds(120000L); //2 minutes in milliseconds
         //Create credential request doc with same user credentials
        userCredsDoc = CredentialsDocument.Factory.newInstance();
        CredentialsT credsData = CredentialsT.Factory.newInstance();
        credsData.setUserId(userName);
        credsData.setCertificate(pass); //not really a certificate just a password
        userCredsDoc.setCredentials(credsData);
    }

     /**
     * Setup the Reservation class.
     *
     * Initialize user credentials, and reservation info.
     *
     *@param  configFile Fill in path to configuration file.
     */
    public Reservation(String configFile) throws IOException {
        //Make an instance of ConfigLoader & and load config
        //Old Line// ConfigLoader cl = new ConfigLoader();
        cl.loadConfig(configFile);
        //Service address & User credentials
        userName            =cl.Uname;
        pass                =cl.Pass;
        serviceURL          =cl.serviceURL;
         //Schedule Information
        scheduleName        =cl.scheduleName;
        billingGroup        =cl.billingGroup;
        startTime           =cl.startTime;
        endTime             =cl.endTime;
        serviceDuration     =cl.serviceDuration;
        //Lightpath Connectivity
        srcUserGroup        =cl.sourceUserGroup;
        srcUserRsrcGroup    =cl.sourceUserResourceGroup;
        srcEndpoint         =cl.sourceEndpoint;
        destEndpoint        =cl.destinationEndpoint;
        destUserGroup       =cl.destinationUserGroup;
        destUserRsrcGroup   =cl.destinationResourceUserGroup;
        rate                =Integer.parseInt(cl.rate);
        srcVlanID           =cl.sourceVlanID;
        destVlanID          =cl.destinationVlANID;
        protectionType      =cl.protectionType;
        srcChannel          =cl.sourceChannel;
        destChannel         =cl.destinationChannel;
        routingAlgorithm    =cl.routingAlgorithm;

        //Create an XML formatted date string with the parsed start time & endtime
        fixStartTime = Calendar.getInstance(tz);
        fixStartTime.setTimeInMillis(new XmlCalendar(startTime).getTimeInMillis());
        fixEndTime = Calendar.getInstance(tz);
        fixEndTime.setTimeInMillis(new XmlCalendar(endTime).getTimeInMillis());
        //Create a client service stub & and specify URL & timeout
        sClient = new ResourceAllocationAndSchedulingServiceStub(serviceURL);
        sClient._getServiceClient().getOptions().setTimeOutInMilliSeconds(120000L); //2 minutes in milliseconds
         //Create credential request doc with same user credentials
        userCredsDoc = CredentialsDocument.Factory.newInstance();
        CredentialsT credsData = CredentialsT.Factory.newInstance();
        credsData.setUserId(userName);
        credsData.setCertificate(pass); //not really a certificate just a password
        userCredsDoc.setCredentials(credsData);
    }

     /**
     * Create reservation schedule request document.
     *
     * Configure the parameters required for making reservations.
     *
     *@return Returns a CreateReservationScheduleRequestDocument
     */
     public CreateReservationScheduleRequestDocument createResSchedReqDoc(){
        //Create reservation request document
        resSchedReqDoc = CreateReservationScheduleRequestDocument.Factory.newInstance();
        CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest resSchedReq =
        resSchedReqDoc.addNewCreateReservationScheduleRequest();
        ReservationScheduleRequestT reservationSched = resSchedReq.addNewReservationSchedule();
        //Add reservation request document settings
        reservationSched.setName(scheduleName);
        reservationSched.setType(ValidReservationScheduleTypeT.RESERVATION_SCHEDULE_AUTOMATIC);
        reservationSched.setStartTime(fixStartTime);
        reservationSched.setReservationOccurrenceDuration(Integer.parseInt(serviceDuration));
        reservationSched.setIsRecurring(false);
        PathRequestT pathReq = setupPath();
        reservationSched.setResource(pathReq);
        UserInfoT userInfo = setupUser();
        reservationSched.setUserInfo(userInfo);

        return resSchedReqDoc;
    }

    public UserInfoT setupUser() {
        //User info data
        UserInfoT userInfo = UserInfoT.Factory.newInstance();
        userInfo.setBillingGroup(billingGroup);
        userInfo.setSourceEndpointResourceGroup(srcUserRsrcGroup);
        userInfo.setSourceEndpointUserGroup(srcUserGroup);
        userInfo.setTargetEndpointResourceGroup(destUserRsrcGroup);
        userInfo.setTargetEndpointUserGroup(destUserGroup);
        return userInfo;
    }

    public PathRequestT setupPath() {
        // Service path data
        PathRequestT pathReq = PathRequestT.Factory.newInstance();
        pathReq.setSourceTna(srcEndpoint);
        pathReq.setTargetTna(destEndpoint);
        pathReq.setRate(rate);
        pathReq.setSourceVlanId(srcVlanID);
        pathReq.setTargetVlanId(destVlanID);
        pathReq.setRoutingAlgorithm(routingAlgorithm);
        ValidProtectionTypeT.Enum pType = ValidProtectionTypeT.Enum.forString(protectionType);
        pathReq.setProtectionType(pType);
        return pathReq;
    }

     /**
     * Create reservation schedule request document.
     *
     * Configure the parameters required for making reservations.
     * @param duration specifies how long the reservation should last for.
     * @return Returns a CreateReservationScheduleRequestDocument
     */
    public CreateReservationScheduleRequestDocument createResSchedReqDoc(String duration){
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        TimeZone timeZone = TimeZone.getTimeZone("GMT+1"); //Amsterdam TimeZone
        dateTimeFormat.setTimeZone(timeZone);
        Date now = new Date();
        String dateTimeNow = dateTimeFormat.format(now);

        //Create reservation request document
        resSchedReqDoc = CreateReservationScheduleRequestDocument.Factory.newInstance();
        CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest resSchedReq =
        resSchedReqDoc.addNewCreateReservationScheduleRequest();
        ReservationScheduleRequestT reservationSched = resSchedReq.addNewReservationSchedule();
        //Add reservation request document settings
        reservationSched.setName(scheduleName);
        reservationSched.setType(ValidReservationScheduleTypeT.RESERVATION_SCHEDULE_AUTOMATIC);

        reservationSched.setStartTime(fixStartTime);
        reservationSched.setReservationOccurrenceDuration(Integer.parseInt(duration));
        reservationSched.setIsRecurring(false);
        
        UserInfoT userInfo = setupUser();
        PathRequestT pathReq = setupPath();
        reservationSched.setResource(pathReq);
        reservationSched.setUserInfo(userInfo);

        return resSchedReqDoc;
    }

    /**
     * Create reservation schedule request document
     *
     * Configure the parameters required for making reservations. However the
     * startTime is automatically set to the current time.
     * @param duration specifies how long the reservation should last for.
     * @return Returns a CreateReservationScheduleRequestDocument
     */
    public CreateReservationScheduleRequestDocument createResSchedReqDocNow(String duration){
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        TimeZone timeZone = TimeZone.getTimeZone("GMT+1"); //Amsterdam TimeZone
        dateTimeFormat.setTimeZone(timeZone);
        Date now = new Date();
        String dateTimeNow = dateTimeFormat.format(now);

        //Create reservation request document
        resSchedReqDoc = CreateReservationScheduleRequestDocument.Factory.newInstance();
        CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest resSchedReq =
        resSchedReqDoc.addNewCreateReservationScheduleRequest();
        ReservationScheduleRequestT reservationSched = resSchedReq.addNewReservationSchedule();
        //Add reservation request document settings
        reservationSched.setName(scheduleName);
        reservationSched.setType(ValidReservationScheduleTypeT.RESERVATION_SCHEDULE_AUTOMATIC);

        reservationSched.setStartTime(setTimeNow());
        reservationSched.setReservationOccurrenceDuration(Integer.parseInt(duration));
        reservationSched.setIsRecurring(false);
        
        UserInfoT userInfo = setupUser();
        PathRequestT pathReq = setupPath();
        reservationSched.setUserInfo(userInfo);
        reservationSched.setResource(pathReq);

        return resSchedReqDoc;
    }

     /**
     * Create reservation schedule request document
     *
     * Configure the parameters required for making reservations. However the
     * startTime is automatically set to the current time.
     * @return Returns a CreateReservationScheduleRequestDocument
     */
    public CreateReservationScheduleRequestDocument createResSchedReqDocNow(){
        //Create reservation request document
        resSchedReqDoc = CreateReservationScheduleRequestDocument.Factory.newInstance();
        CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest resSchedReq =
        resSchedReqDoc.addNewCreateReservationScheduleRequest();
        ReservationScheduleRequestT reservationSched = resSchedReq.addNewReservationSchedule();
        //Add reservation request document settings
        reservationSched.setName(scheduleName);
        reservationSched.setType(ValidReservationScheduleTypeT.RESERVATION_SCHEDULE_AUTOMATIC);

        reservationSched.setStartTime(setTimeNow());
        reservationSched.setReservationOccurrenceDuration(Integer.parseInt(serviceDuration));
        reservationSched.setIsRecurring(false);
        PathRequestT pathReq = setupPath();
        reservationSched.setResource(pathReq);
        UserInfoT userInfo = setupUser();
        reservationSched.setUserInfo(userInfo);

        return resSchedReqDoc;
    }



     /**
     * Make a reservation schedule request.
     *
     * This calls the createResSchedReqDoc() method to retrieve a
     * a reservation request document. This document is then sent
     * to the Open DRAC web service.
     *
     * Console output is the completion response sent from Open DRAC
     */
    public void makeReservation() throws Exception {
        //Create credential request doc with same user credentials
        resSchedReqDoc2 = createResSchedReqDoc();
        try {
       //Attempt to make a reservation request
       //Store the server response in a response doc & display the response
        resSchedRespDoc = sClient.createReservationSchedule(resSchedReqDoc2, userCredsDoc);
        System.out.println("<------CREATE SCHEDULE RESPONSE------->\n\n" +
                            resSchedRespDoc.getCreateReservationScheduleResponse() +"\n\n" +
                           "<------------------------------------->");
        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e){
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }
    }

    /**
     * Make a reservation schedule request.
     *
     * This calls the createResSchedReqDoc() method to retrieve a
     * a reservation request document. This document is then sent
     * to the Open DRAC web service. However the startTime is automatically
     * set to the current time.
     *
     * Console output is the completion response sent from Open DRAC
     */
    public void makeReservationNow() throws Exception {
        //Create credential request doc with same user credentials
        resSchedReqDoc3 = createResSchedReqDocNow();
        try {
       //Attempt to make a reservation request
       //Store the server response in a response doc & display the response
        resSchedRespDoc = sClient.createReservationSchedule(resSchedReqDoc3, userCredsDoc);
        System.out.println("<------CREATE SCHEDULE RESPONSE------->\n\n" +
                            resSchedRespDoc.getCreateReservationScheduleResponse() +"\n\n" +
                           "<------------------------------------->");
        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e){
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }
    }

    /**
     * Make a reservation schedule request.
     *
     * This calls the createResSchedReqDoc() method to retrieve a
     * a reservation request document. This document is then sent
     * to the Open DRAC web service. However the startTime set by specifying a
     * value for the the duration parameter.

     *Console output is the completion response sent from Open DRAC
     *@param duration specify duration
     */
    public void makeReservationNow(String duration) throws Exception {
        //Create credential request doc with same user credentials
        resSchedReqDoc3 = createResSchedReqDocNow(duration);
        try {
       //Attempt to make a reservation request
       //Store the server response in a response doc & display the response
        resSchedRespDoc = sClient.createReservationSchedule(resSchedReqDoc3, userCredsDoc);
        System.out.println("<------CREATE SCHEDULE RESPONSE------->\n\n" +
                            resSchedRespDoc.getCreateReservationScheduleResponse() +"\n\n" +
                           "<------------------------------------->");
        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e){
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }
    }

    /**
     * Setup current date & time
     *
     * @return Returns a Calendar object with current date & time
     */
    public Calendar setTimeNow(){
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        TimeZone timeZone = TimeZone.getTimeZone("GMT+1"); //Amsterdam Winter TimeZone
        dateTimeFormat.setTimeZone(timeZone);
        Date now = new Date();
        String dateTimeNow = dateTimeFormat.format(now);

        Calendar nowStartTime = Calendar.getInstance(tz);
        nowStartTime.setTimeInMillis(new XmlCalendar(dateTimeNow).getTimeInMillis());

        return nowStartTime;
    }

     /**
     * Display Schedule status.
     *
     * The Open DRAC web service queries the status of a reservation schedule.
     *
     * Console output is the status of the specified reservation schedule.
     */
    public void scheduleStatus(String id) throws Exception {
        //Create a Query Reservation request document with the same user credentials
        queryResSchedReqDoc = QueryReservationScheduleRequestDocument.Factory.newInstance();
        queryResSchedReqDoc.addNewQueryReservationScheduleRequest();
        queryResSchedReqDoc.getQueryReservationScheduleRequest().setReservationScheduleId(id);  
        //Attempt to query a reservation to check its status
        try{
        QueryReservationScheduleResponseDocument queryRespDoc = sClient.queryReservationSchedule(queryResSchedReqDoc, userCredsDoc);
        System.out.println("<---------SCHEDULE STATUS--------->\n\n" +
                            queryRespDoc.getQueryReservationScheduleResponse() +"\n\n" +
                           "<--------------------------------->");

        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e) {
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }
    }


     /**
     * List reservation schedules.
     *
     * Query a list of schedules from the Open DRAC web service.
     * Console output is a list of reservation schedules. 
     */

    public void listSchedules() throws Exception {
        //Create a Query Reservation Schedule(S) document(not this is a tottaly different doc than the one above)
        //once again with the same user credentials
        queryResSchedSSReqdoc = QueryReservationSchedulesRequestDocument.Factory.newInstance();
        QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest 
        queryResSchedSSReqData = queryResSchedSSReqdoc.addNewQueryReservationSchedulesRequest();
        
        queryResSchedByTimeUserGroup = QueryReservationSchedulesByDateTimeAndUserGroupT.Factory.newInstance();
        queryResSchedSSReqData.addNewCriteria();
        queryResSchedByTimeUserGroup.setStartTime(fixStartTime);
        queryResSchedByTimeUserGroup.setEndTime(fixEndTime);
        queryResSchedByTimeUserGroup.setUserGroup(srcUserGroup);
        queryResSchedSSReqData.setCriteria(queryResSchedByTimeUserGroup);
        //Attempt to query a list of schedules within the fixStartTime and fixEndTime intervals
        //Display the response
        try {
        QueryReservationSchedulesResponseDocument queryRespSchedSSDoc = sClient.queryReservationSchedules(queryResSchedSSReqdoc, userCredsDoc);
        
        System.out.println("<---------LISTED SCHEDULES--------->\n\n" +
                            queryRespSchedSSDoc.getQueryReservationSchedulesResponse() +"\n\n" +
                           "<---------------------------------->");
        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e) {
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }

    }

     /**
     * List reservation schedules.
     *
     * Query a list of schedules from the Open DRAC web service
     * with a specified interval.
     * @param startTime2 start date & time in the XML format YYYY-MM-DDThh:mm:ss.
     * @param endtime end date date & time in the XML format YYYY-MM-DDThh:mm:ss.
     *
     * Console output is a list of reservation schedules
     */
    public void listSchedules(String startTime2, String endTime2) throws Exception {
        //Create an XML formatted date string with the parsed start time & endtime
        fixStartTime2 = Calendar.getInstance(tz);
        fixStartTime2.setTimeInMillis(new XmlCalendar(startTime2).getTimeInMillis());
        fixEndTime2 = Calendar.getInstance(tz);
        fixEndTime2.setTimeInMillis(new XmlCalendar(endTime2).getTimeInMillis());
        //Create a Query Reservation Schedule(S) document(not this is a tottaly different doc than the one above)
        //once again with the same user credentials
        queryResSchedSSReqdoc = QueryReservationSchedulesRequestDocument.Factory.newInstance();
        QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest
        queryResSchedSSReqData = queryResSchedSSReqdoc.addNewQueryReservationSchedulesRequest();

        queryResSchedByTimeUserGroup = QueryReservationSchedulesByDateTimeAndUserGroupT.Factory.newInstance();
        queryResSchedSSReqData.addNewCriteria();
        queryResSchedByTimeUserGroup.setStartTime(fixStartTime2);
        queryResSchedByTimeUserGroup.setEndTime(fixEndTime2);
        queryResSchedByTimeUserGroup.setUserGroup(srcUserGroup);
        queryResSchedSSReqData.setCriteria(queryResSchedByTimeUserGroup);
        //Attempt to query a list of schedules within the fixStartTime and fixEndTime intervals
        //Display the response
        try {
        QueryReservationSchedulesResponseDocument queryRespSchedSSDoc = sClient.queryReservationSchedules(queryResSchedSSReqdoc, userCredsDoc);

        System.out.println("<---------LISTED SCHEDULES--------->\n\n" +
                            queryRespSchedSSDoc.getQueryReservationSchedulesResponse() +"\n\n" +
                           "<---------------------------------->");
        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e) {
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }

    }

    /**
     * Cancel  reservation schedules
     *
     * Query a list of schedules from the Open DRAC web service
     * with a specified interval.
     * @param startTime2 start date & time in the XML format YYYY-MM-DDThh:mm:ss.
     * @param endtime end date date & time in the XML format YYYY-MM-DDThh:mm:ss.
     * Console output is the completion response from Open DRAC
     */
    public void cancelSchedule(String id) throws Exception {
        //Create a Cancel Reservation Schedule document with your user credentials
        cancelResSchedReqDoc = CancelReservationScheduleRequestDocument.Factory.newInstance();
        cancelResSchedReqDoc.addNewCancelReservationScheduleRequest();
        cancelResSchedReqDoc.getCancelReservationScheduleRequest().setReservationScheduleId(id);
        //Attempt to cancel a reservation schedule & display the output
        try {
        CompletionResponseDocument cancelRespDoc = sClient.cancelReservationSchedule(cancelResSchedReqDoc, userCredsDoc);
        System.out.println("<------CANCELATION RESPONSE------->\n\n" +
                            cancelRespDoc.getCompletionResponse() +"\n\n" +
                           "<--------------------------------->");
        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e) {
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }

     }
}