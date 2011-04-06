
/**
 * ResourceAllocationAndSchedulingServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice;

        

        /*
        *  ResourceAllocationAndSchedulingServiceStub java implementation
        */

        
        public class ResourceAllocationAndSchedulingServiceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("ResourceAllocationAndSchedulingService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[14];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "cancelReservationSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationSchedules"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "authenticate"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrences"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrenceAlarms"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrence"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[6]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "cancelReservationOccurrence"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[7]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "disconnect"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[8]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "confirmReservationSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[9]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryPathAvailability"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[10]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "addReservationOccurrence"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[11]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "activateReservationOccurrence"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[12]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "createReservationSchedule"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[13]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           
              faultExceptionNameMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultExceptionClassNameMap.put(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault");
              faultMessageMap.put( new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes","DracFault"),"com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public ResourceAllocationAndSchedulingServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public ResourceAllocationAndSchedulingServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public ResourceAllocationAndSchedulingServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"https://drac.surfnet.nl:8443/axis2/services/ResourceAllocationAndSchedulingService" );
                
    }

    /**
     * Default Constructor
     */
    public ResourceAllocationAndSchedulingServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("https://drac.surfnet.nl:8443/axis2/services/ResourceAllocationAndSchedulingService" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public ResourceAllocationAndSchedulingServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#cancelReservationSchedule
                     * @param cancelReservationScheduleRequest19
                    
                     * @param credentials20
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument cancelReservationSchedule(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument cancelReservationScheduleRequest19,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials20)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/cancelReservationSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cancelReservationScheduleRequest19,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "cancelReservationSchedule")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials20!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials20 = toOM(credentials20, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "cancelReservationSchedule")));
                                                    addHeader(omElementcredentials20,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startcancelReservationSchedule
                    * @param cancelReservationScheduleRequest19
                
                    * @param credentials20
                
                */
                public  void startcancelReservationSchedule(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument cancelReservationScheduleRequest19,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials20,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/cancelReservationSchedule");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cancelReservationScheduleRequest19,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "cancelReservationSchedule")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials20!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials20 = toOM(credentials20, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "cancelReservationSchedule")));
                                                    addHeader(omElementcredentials20,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcancelReservationSchedule(
                                        (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcancelReservationSchedule(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorcancelReservationSchedule((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcancelReservationSchedule(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationSchedule(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationSchedule(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationSchedule(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationSchedule(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationSchedule(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationSchedule(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationSchedule(f);
                                            }
									    } else {
										    callback.receiveErrorcancelReservationSchedule(f);
									    }
									} else {
									    callback.receiveErrorcancelReservationSchedule(f);
									}
								} else {
								    callback.receiveErrorcancelReservationSchedule(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcancelReservationSchedule(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#queryReservationSchedules
                     * @param queryReservationSchedulesRequest22
                    
                     * @param credentials23
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument queryReservationSchedules(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument queryReservationSchedulesRequest22,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials23)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationSchedules");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationSchedulesRequest22,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationSchedules")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials23!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials23 = toOM(credentials23, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationSchedules")));
                                                    addHeader(omElementcredentials23,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startqueryReservationSchedules
                    * @param queryReservationSchedulesRequest22
                
                    * @param credentials23
                
                */
                public  void startqueryReservationSchedules(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument queryReservationSchedulesRequest22,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials23,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationSchedules");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationSchedulesRequest22,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationSchedules")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials23!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials23 = toOM(credentials23, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationSchedules")));
                                                    addHeader(omElementcredentials23,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryReservationSchedules(
                                        (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryReservationSchedules(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorqueryReservationSchedules((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryReservationSchedules(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedules(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedules(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedules(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedules(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedules(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedules(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedules(f);
                                            }
									    } else {
										    callback.receiveErrorqueryReservationSchedules(f);
									    }
									} else {
									    callback.receiveErrorqueryReservationSchedules(f);
									}
								} else {
								    callback.receiveErrorqueryReservationSchedules(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryReservationSchedules(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[1].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * The authenticate operation must be invoked as the first operation before invoking any other operations on this service.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#authenticate
                     * @param authenticationRequest25
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument authenticate(

                            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument authenticationRequest25)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/authenticate");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    authenticationRequest25,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "authenticate")));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * The authenticate operation must be invoked as the first operation before invoking any other operations on this service.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startauthenticate
                    * @param authenticationRequest25
                
                */
                public  void startauthenticate(

                 com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument authenticationRequest25,

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/authenticate");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    authenticationRequest25,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "authenticate")));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultauthenticate(
                                        (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorauthenticate(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorauthenticate((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorauthenticate(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorauthenticate(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorauthenticate(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorauthenticate(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorauthenticate(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorauthenticate(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorauthenticate(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorauthenticate(f);
                                            }
									    } else {
										    callback.receiveErrorauthenticate(f);
									    }
									} else {
									    callback.receiveErrorauthenticate(f);
									}
								} else {
								    callback.receiveErrorauthenticate(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorauthenticate(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[2].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#queryReservationSchedule
                     * @param queryReservationScheduleRequest27
                    
                     * @param credentials28
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument queryReservationSchedule(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument queryReservationScheduleRequest27,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials28)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationScheduleRequest27,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationSchedule")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials28!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials28 = toOM(credentials28, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationSchedule")));
                                                    addHeader(omElementcredentials28,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startqueryReservationSchedule
                    * @param queryReservationScheduleRequest27
                
                    * @param credentials28
                
                */
                public  void startqueryReservationSchedule(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument queryReservationScheduleRequest27,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials28,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationSchedule");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationScheduleRequest27,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationSchedule")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials28!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials28 = toOM(credentials28, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationSchedule")));
                                                    addHeader(omElementcredentials28,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryReservationSchedule(
                                        (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryReservationSchedule(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorqueryReservationSchedule((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryReservationSchedule(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedule(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedule(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedule(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedule(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedule(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedule(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationSchedule(f);
                                            }
									    } else {
										    callback.receiveErrorqueryReservationSchedule(f);
									    }
									} else {
									    callback.receiveErrorqueryReservationSchedule(f);
									}
								} else {
								    callback.receiveErrorqueryReservationSchedule(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryReservationSchedule(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[3].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#queryReservationOccurrences
                     * @param queryReservationOccurrencesRequest30
                    
                     * @param credentials31
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument queryReservationOccurrences(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument queryReservationOccurrencesRequest30,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials31)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationOccurrences");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationOccurrencesRequest30,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationOccurrences")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials31!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials31 = toOM(credentials31, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrences")));
                                                    addHeader(omElementcredentials31,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startqueryReservationOccurrences
                    * @param queryReservationOccurrencesRequest30
                
                    * @param credentials31
                
                */
                public  void startqueryReservationOccurrences(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument queryReservationOccurrencesRequest30,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials31,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationOccurrences");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationOccurrencesRequest30,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationOccurrences")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials31!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials31 = toOM(credentials31, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrences")));
                                                    addHeader(omElementcredentials31,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryReservationOccurrences(
                                        (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryReservationOccurrences(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorqueryReservationOccurrences((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryReservationOccurrences(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrences(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrences(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrences(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrences(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrences(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrences(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrences(f);
                                            }
									    } else {
										    callback.receiveErrorqueryReservationOccurrences(f);
									    }
									} else {
									    callback.receiveErrorqueryReservationOccurrences(f);
									}
								} else {
								    callback.receiveErrorqueryReservationOccurrences(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryReservationOccurrences(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[4].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#queryReservationOccurrenceAlarms
                     * @param queryAlarmsRequest33
                    
                     * @param credentials34
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument queryReservationOccurrenceAlarms(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument queryAlarmsRequest33,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials34)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationOccurrenceAlarms");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryAlarmsRequest33,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationOccurrenceAlarms")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials34!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials34 = toOM(credentials34, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrenceAlarms")));
                                                    addHeader(omElementcredentials34,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startqueryReservationOccurrenceAlarms
                    * @param queryAlarmsRequest33
                
                    * @param credentials34
                
                */
                public  void startqueryReservationOccurrenceAlarms(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument queryAlarmsRequest33,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials34,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationOccurrenceAlarms");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryAlarmsRequest33,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationOccurrenceAlarms")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials34!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials34 = toOM(credentials34, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrenceAlarms")));
                                                    addHeader(omElementcredentials34,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryReservationOccurrenceAlarms(
                                        (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryReservationOccurrenceAlarms(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorqueryReservationOccurrenceAlarms((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryReservationOccurrenceAlarms(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrenceAlarms(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrenceAlarms(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrenceAlarms(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrenceAlarms(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrenceAlarms(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrenceAlarms(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrenceAlarms(f);
                                            }
									    } else {
										    callback.receiveErrorqueryReservationOccurrenceAlarms(f);
									    }
									} else {
									    callback.receiveErrorqueryReservationOccurrenceAlarms(f);
									}
								} else {
								    callback.receiveErrorqueryReservationOccurrenceAlarms(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryReservationOccurrenceAlarms(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[5].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#queryReservationOccurrence
                     * @param queryReservationOccurrenceRequest36
                    
                     * @param credentials37
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument queryReservationOccurrence(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument queryReservationOccurrenceRequest36,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials37)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationOccurrence");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationOccurrenceRequest36,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationOccurrence")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials37!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials37 = toOM(credentials37, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrence")));
                                                    addHeader(omElementcredentials37,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startqueryReservationOccurrence
                    * @param queryReservationOccurrenceRequest36
                
                    * @param credentials37
                
                */
                public  void startqueryReservationOccurrence(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument queryReservationOccurrenceRequest36,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials37,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryReservationOccurrence");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryReservationOccurrenceRequest36,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryReservationOccurrence")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials37!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials37 = toOM(credentials37, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryReservationOccurrence")));
                                                    addHeader(omElementcredentials37,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryReservationOccurrence(
                                        (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryReservationOccurrence(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorqueryReservationOccurrence((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryReservationOccurrence(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrence(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrence(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrence(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrence(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrence(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrence(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryReservationOccurrence(f);
                                            }
									    } else {
										    callback.receiveErrorqueryReservationOccurrence(f);
									    }
									} else {
									    callback.receiveErrorqueryReservationOccurrence(f);
									}
								} else {
								    callback.receiveErrorqueryReservationOccurrence(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryReservationOccurrence(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[6].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#cancelReservationOccurrence
                     * @param cancelReservationOccurrenceRequest39
                    
                     * @param credentials40
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument cancelReservationOccurrence(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument cancelReservationOccurrenceRequest39,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials40)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/cancelReservationOccurrence");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cancelReservationOccurrenceRequest39,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "cancelReservationOccurrence")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials40!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials40 = toOM(credentials40, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "cancelReservationOccurrence")));
                                                    addHeader(omElementcredentials40,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startcancelReservationOccurrence
                    * @param cancelReservationOccurrenceRequest39
                
                    * @param credentials40
                
                */
                public  void startcancelReservationOccurrence(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument cancelReservationOccurrenceRequest39,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials40,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/cancelReservationOccurrence");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    cancelReservationOccurrenceRequest39,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "cancelReservationOccurrence")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials40!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials40 = toOM(credentials40, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "cancelReservationOccurrence")));
                                                    addHeader(omElementcredentials40,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcancelReservationOccurrence(
                                        (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcancelReservationOccurrence(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorcancelReservationOccurrence((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcancelReservationOccurrence(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationOccurrence(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationOccurrence(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationOccurrence(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationOccurrence(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationOccurrence(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationOccurrence(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcancelReservationOccurrence(f);
                                            }
									    } else {
										    callback.receiveErrorcancelReservationOccurrence(f);
									    }
									} else {
									    callback.receiveErrorcancelReservationOccurrence(f);
									}
								} else {
								    callback.receiveErrorcancelReservationOccurrence(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcancelReservationOccurrence(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[7].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#disconnect
                     * @param credentials43
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument disconnect(

                            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials43)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/disconnect");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                              env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()));
                                        
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials43!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials43 = toOM(credentials43, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "disconnect")));
                                                    addHeader(omElementcredentials43,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startdisconnect
                    * @param credentials43
                
                */
                public  void startdisconnect(

                 com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials43,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/disconnect");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                              env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()));
                                        
                                         // add the soap_headers only if they are not null
                                        if (credentials43!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials43 = toOM(credentials43, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "disconnect")));
                                                    addHeader(omElementcredentials43,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultdisconnect(
                                        (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrordisconnect(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrordisconnect((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrordisconnect(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordisconnect(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordisconnect(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordisconnect(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordisconnect(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordisconnect(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordisconnect(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrordisconnect(f);
                                            }
									    } else {
										    callback.receiveErrordisconnect(f);
									    }
									} else {
									    callback.receiveErrordisconnect(f);
									}
								} else {
								    callback.receiveErrordisconnect(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrordisconnect(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[8].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#confirmReservationSchedule
                     * @param confirmReservationScheduleRequest45
                    
                     * @param credentials46
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument confirmReservationSchedule(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument confirmReservationScheduleRequest45,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials46)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/confirmReservationSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    confirmReservationScheduleRequest45,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "confirmReservationSchedule")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials46!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials46 = toOM(credentials46, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "confirmReservationSchedule")));
                                                    addHeader(omElementcredentials46,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startconfirmReservationSchedule
                    * @param confirmReservationScheduleRequest45
                
                    * @param credentials46
                
                */
                public  void startconfirmReservationSchedule(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument confirmReservationScheduleRequest45,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials46,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/confirmReservationSchedule");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    confirmReservationScheduleRequest45,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "confirmReservationSchedule")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials46!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials46 = toOM(credentials46, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "confirmReservationSchedule")));
                                                    addHeader(omElementcredentials46,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultconfirmReservationSchedule(
                                        (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorconfirmReservationSchedule(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorconfirmReservationSchedule((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorconfirmReservationSchedule(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconfirmReservationSchedule(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconfirmReservationSchedule(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconfirmReservationSchedule(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconfirmReservationSchedule(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconfirmReservationSchedule(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconfirmReservationSchedule(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorconfirmReservationSchedule(f);
                                            }
									    } else {
										    callback.receiveErrorconfirmReservationSchedule(f);
									    }
									} else {
									    callback.receiveErrorconfirmReservationSchedule(f);
									}
								} else {
								    callback.receiveErrorconfirmReservationSchedule(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorconfirmReservationSchedule(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[9].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#queryPathAvailability
                     * @param queryPathAvailabilityRequest48
                    
                     * @param credentials49
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument queryPathAvailability(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument queryPathAvailabilityRequest48,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials49)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryPathAvailability");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryPathAvailabilityRequest48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryPathAvailability")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials49!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials49 = toOM(credentials49, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryPathAvailability")));
                                                    addHeader(omElementcredentials49,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startqueryPathAvailability
                    * @param queryPathAvailabilityRequest48
                
                    * @param credentials49
                
                */
                public  void startqueryPathAvailability(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument queryPathAvailabilityRequest48,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials49,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/queryPathAvailability");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    queryPathAvailabilityRequest48,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "queryPathAvailability")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials49!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials49 = toOM(credentials49, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "queryPathAvailability")));
                                                    addHeader(omElementcredentials49,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultqueryPathAvailability(
                                        (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorqueryPathAvailability(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorqueryPathAvailability((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorqueryPathAvailability(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryPathAvailability(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryPathAvailability(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryPathAvailability(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryPathAvailability(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryPathAvailability(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryPathAvailability(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorqueryPathAvailability(f);
                                            }
									    } else {
										    callback.receiveErrorqueryPathAvailability(f);
									    }
									} else {
									    callback.receiveErrorqueryPathAvailability(f);
									}
								} else {
								    callback.receiveErrorqueryPathAvailability(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorqueryPathAvailability(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[10].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#addReservationOccurrence
                     * @param addReservationOccurrenceRequest51
                    
                     * @param credentials52
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument addReservationOccurrence(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument addReservationOccurrenceRequest51,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials52)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/addReservationOccurrence");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addReservationOccurrenceRequest51,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "addReservationOccurrence")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials52!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials52 = toOM(credentials52, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "addReservationOccurrence")));
                                                    addHeader(omElementcredentials52,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startaddReservationOccurrence
                    * @param addReservationOccurrenceRequest51
                
                    * @param credentials52
                
                */
                public  void startaddReservationOccurrence(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument addReservationOccurrenceRequest51,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials52,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/addReservationOccurrence");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    addReservationOccurrenceRequest51,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "addReservationOccurrence")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials52!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials52 = toOM(credentials52, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "addReservationOccurrence")));
                                                    addHeader(omElementcredentials52,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultaddReservationOccurrence(
                                        (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroraddReservationOccurrence(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErroraddReservationOccurrence((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErroraddReservationOccurrence(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddReservationOccurrence(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddReservationOccurrence(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddReservationOccurrence(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddReservationOccurrence(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddReservationOccurrence(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddReservationOccurrence(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroraddReservationOccurrence(f);
                                            }
									    } else {
										    callback.receiveErroraddReservationOccurrence(f);
									    }
									} else {
									    callback.receiveErroraddReservationOccurrence(f);
									}
								} else {
								    callback.receiveErroraddReservationOccurrence(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErroraddReservationOccurrence(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[11].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#activateReservationOccurrence
                     * @param activateReservationOccurrenceRequest54
                    
                     * @param credentials55
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument activateReservationOccurrence(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument activateReservationOccurrenceRequest54,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials55)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/activateReservationOccurrence");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    activateReservationOccurrenceRequest54,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "activateReservationOccurrence")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials55!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials55 = toOM(credentials55, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "activateReservationOccurrence")));
                                                    addHeader(omElementcredentials55,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startactivateReservationOccurrence
                    * @param activateReservationOccurrenceRequest54
                
                    * @param credentials55
                
                */
                public  void startactivateReservationOccurrence(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument activateReservationOccurrenceRequest54,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials55,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/activateReservationOccurrence");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    activateReservationOccurrenceRequest54,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "activateReservationOccurrence")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials55!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials55 = toOM(credentials55, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "activateReservationOccurrence")));
                                                    addHeader(omElementcredentials55,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultactivateReservationOccurrence(
                                        (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErroractivateReservationOccurrence(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErroractivateReservationOccurrence((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErroractivateReservationOccurrence(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroractivateReservationOccurrence(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroractivateReservationOccurrence(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroractivateReservationOccurrence(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroractivateReservationOccurrence(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroractivateReservationOccurrence(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroractivateReservationOccurrence(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErroractivateReservationOccurrence(f);
                                            }
									    } else {
										    callback.receiveErroractivateReservationOccurrence(f);
									    }
									} else {
									    callback.receiveErroractivateReservationOccurrence(f);
									}
								} else {
								    callback.receiveErroractivateReservationOccurrence(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErroractivateReservationOccurrence(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[12].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                
                    /**
                     * Auto generated method signature
                     * For authorization purposes user id must be included in the SOAP message header.
                     * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#createReservationSchedule
                     * @param createReservationScheduleRequest57
                    
                     * @param credentials58
                    
                     * @throws com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault : 
                     */

                    

                            public  com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument createReservationSchedule(

                            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument createReservationScheduleRequest57,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials58)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
              _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/createReservationSchedule");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createReservationScheduleRequest57,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "createReservationSchedule")));
                                                
                                               env.build();
                                    
                                        // add the children only if the parameter is not null
                                        if (credentials58!=null){
                                            
                                                    org.apache.axiom.om.OMElement omElementcredentials58 = toOM(credentials58, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "createReservationSchedule")));
                                                    addHeader(omElementcredentials58,env);
                                                
                                        }
                                    
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(faultElt.getQName())){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex=
                                (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
                          throw (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * For authorization purposes user id must be included in the SOAP message header.
                * @see com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingService#startcreateReservationSchedule
                    * @param createReservationScheduleRequest57
                
                    * @param credentials58
                
                */
                public  void startcreateReservationSchedule(

                 com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument createReservationScheduleRequest57,com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument credentials58,
                    

                  final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
             _operationClient.getOptions().setAction("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService/createReservationSchedule");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    createReservationScheduleRequest57,
                                                    optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService",
                                                    "createReservationSchedule")));
                                                
                                         // add the soap_headers only if they are not null
                                        if (credentials58!=null){
                                           
                                                    org.apache.axiom.om.OMElement omElementcredentials58 = toOM(credentials58, optimizeContent(new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingService", "createReservationSchedule")));
                                                    addHeader(omElementcredentials58,env);
                                                
                                        }
                                    
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultcreateReservationSchedule(
                                        (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorcreateReservationSchedule(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(faultElt.getQName())){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(faultElt.getQName());
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.Exception ex=
														(java.lang.Exception) exceptionClass.newInstance();
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(faultElt.getQName());
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
													if (ex instanceof com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault){
														callback.receiveErrorcreateReservationSchedule((com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice.ResourceAllocationAndSchedulingServiceFault)ex);
											            return;
										            }
										            
					
										            callback.receiveErrorcreateReservationSchedule(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateReservationSchedule(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateReservationSchedule(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateReservationSchedule(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateReservationSchedule(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateReservationSchedule(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateReservationSchedule(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorcreateReservationSchedule(f);
                                            }
									    } else {
										    callback.receiveErrorcreateReservationSchedule(f);
									    }
									} else {
									    callback.receiveErrorcreateReservationSchedule(f);
									}
								} else {
								    callback.receiveErrorcreateReservationSchedule(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorcreateReservationSchedule(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[13].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //https://drac.surfnet.nl:8443/axis2/services/ResourceAllocationAndSchedulingService

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        

            private  org.apache.axiom.om.OMElement  toOM(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument param)
                    throws org.apache.axis2.AxisFault {

                final javax.xml.stream.XMLStreamReader xmlReader = param.newXMLStreamReader();
                while (!xmlReader.isStartElement()) {
                    try {
                        xmlReader.next();
                    } catch (javax.xml.stream.XMLStreamException e) {
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                }

                org.apache.axiom.om.OMDataSource omDataSource = new org.apache.axiom.om.OMDataSource() {

                    public void serialize(java.io.OutputStream outputStream, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(outputStream,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(java.io.Writer writer, org.apache.axiom.om.OMOutputFormat omOutputFormat)
                            throws javax.xml.stream.XMLStreamException {
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(writer,xmlOptions.setSaveNoXmlDecl());
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document",e);
                        }
                    }

                    public void serialize(javax.xml.stream.XMLStreamWriter xmlStreamWriter)
                            throws javax.xml.stream.XMLStreamException {
                        org.apache.axiom.om.impl.MTOMXMLStreamWriter mtomxmlStreamWriter =
                                                        (org.apache.axiom.om.impl.MTOMXMLStreamWriter) xmlStreamWriter;
                        try {
                            org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                            param.save(mtomxmlStreamWriter.getOutputStream(),xmlOptions.setSaveNoXmlDecl());
                            mtomxmlStreamWriter.getOutputStream().flush();
                        } catch (java.io.IOException e) {
                            throw new javax.xml.stream.XMLStreamException("Problem with saving document", e);
                        }
                    }

                    public javax.xml.stream.XMLStreamReader getReader()
                            throws javax.xml.stream.XMLStreamException {
                        return param.newXMLStreamReader();
                    }
                };
            
                return  new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(xmlReader.getName(),
                        org.apache.axiom.om.OMAbstractFactory.getOMFactory(),
                        omDataSource);
            }
        
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument param, boolean optimizeContent)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        
   }
   