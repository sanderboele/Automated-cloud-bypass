package dracp1;

import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument;
import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument;
import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument;
import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT;
import com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT;
import com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault;
import com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceStub;
import java.io.IOException;
/**
 *
 * @author Erno
 */
public class Connection {

    private String userName;
    private String pass;
    private String serviceURL;
    private CredentialsDocument userCredsDoc;
    private AuthenticationRequestDocument authReqDoc;
    private ResourceAllocationAndSchedulingServiceStub sClient;
    private ConfigLoader cl = new ConfigLoader();

    //Setup the connection class
    /**
     * Setup Connection class.                           
     *
     * Initialize username,password,and service URL,
     * and service stub.     
     *
     *
     */
    public Connection() throws IOException{
        // Old line// ConfigLoader cl = new ConfigLoader();
        cl.loadConfig();
        userName    = cl.Uname;
        pass        = cl.Pass;
        serviceURL  = cl.serviceURL;
        //Create a client service stub & and specify URL & timeout
        sClient = new ResourceAllocationAndSchedulingServiceStub(serviceURL);
        sClient._getServiceClient().getOptions().setTimeOutInMilliSeconds(120000L); //2 minutes in milliseconds
    }

    //Setup the connection class
    /**
     * Setup Connection class.
     *
     * Initialize username,password,and service URL,
     * and service stub.
     *
     * @param  configFile Fill in path to configuration file

     */
    public Connection(String configFile) throws IOException{
        // Old line// ConfigLoader cl = new ConfigLoader();
        cl.loadConfig(configFile);
        userName    = cl.Uname;
        pass        = cl.Pass;
        serviceURL  = cl.serviceURL;
        //Create a client service stub & and specify URL & timeout
        sClient = new ResourceAllocationAndSchedulingServiceStub(serviceURL);
        sClient._getServiceClient().getOptions().setTimeOutInMilliSeconds(120000L); //2 minutes in milliseconds
    }

    //Authenticate to OpenDRAC
    /**
     * Create connection to Open DRAC
     *
     * A connection to Open DRAC will established
     * and the application will authenticate with the
     * provided user credentials that initialized
     * in the constructor.
     *
     * Console output of this method is the completion response
     * sent from the Open DRAC web service.
     */
    public void connectDRAC() throws Exception {
        //Create an authentication request doc & add user credentials
        authReqDoc = AuthenticationRequestDocument.Factory.newInstance();
        AuthenticationRequestDocument.AuthenticationRequest authReqData = authReqDoc.addNewAuthenticationRequest();
        authReqData.addNewCredentials();
        authReqData.getCredentials().setUserId(userName);
        authReqData.getCredentials().setCertificate(pass);
        authReqDoc.setAuthenticationRequest(authReqData);       
        //Attempt to authenticate the Open DRAC web service & store the response in response doc
        //Display the response
        try {
        CompletionResponseDocument authRespDoc = sClient.authenticate(authReqDoc);
        System.out.println("<----AUTHENTICATION RESPONSE------->\n\n" +
                            authRespDoc.getCompletionResponse() +"\n\n" +
                           "<---------------------------------->");
        }
        //Catch any exceptions & display the output
        catch (ResourceAllocationAndSchedulingServiceFault e){
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
            }
        }
    
    //Log out of the OpenDRAC web service
    /**
     * Close connection to Open DRAC
     *
     * The application will de-authenticate with the provided user credentials
     * initialized in the constructor. Then the connection will be torn down.
     *
     * Console output of this method is the completion response
     * sent from the Open DRAC web service.
     */

    public void disconnectDRAC() throws Exception {
        //Create credential request doc with same user credentials
        userCredsDoc = CredentialsDocument.Factory.newInstance();
        CredentialsT credsData = CredentialsT.Factory.newInstance();
        credsData.setUserId(userName);
        credsData.setCertificate(pass); //not really a certificate just a pass
        userCredsDoc.setCredentials(credsData);
        //Attempt to disconnect with the provided user credentials
        //Store the server response in a response doc & display the output
        try {
            sClient._getServiceClient().disengageModule("addressing");
            CompletionResponseDocument disconnectRespDoc = sClient.disconnect(userCredsDoc);
            System.out.println("<----DISCONNECT RESPONSE------->\n\n" +
                                disconnectRespDoc.getCompletionResponse() +"\n\n"+
                               "<------------------------------>");
        //Cath any exceptions and display the output
        }
        catch (ResourceAllocationAndSchedulingServiceFault e){
            DracWsFaultT dracFault = e.getFaultMessage().getDracFault();
            System.out.println(dracFault.getErrorMsg());
        }
    }
}