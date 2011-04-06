
/**
 * ResourceAllocationAndSchedulingServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice;

    /**
     *  ResourceAllocationAndSchedulingServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ResourceAllocationAndSchedulingServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ResourceAllocationAndSchedulingServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ResourceAllocationAndSchedulingServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for cancelReservationSchedule method
            * override this method for handling normal response from cancelReservationSchedule operation
            */
           public void receiveResultcancelReservationSchedule(
                    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelReservationSchedule operation
           */
            public void receiveErrorcancelReservationSchedule(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryReservationSchedules method
            * override this method for handling normal response from queryReservationSchedules operation
            */
           public void receiveResultqueryReservationSchedules(
                    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryReservationSchedules operation
           */
            public void receiveErrorqueryReservationSchedules(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for authenticate method
            * override this method for handling normal response from authenticate operation
            */
           public void receiveResultauthenticate(
                    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from authenticate operation
           */
            public void receiveErrorauthenticate(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryReservationSchedule method
            * override this method for handling normal response from queryReservationSchedule operation
            */
           public void receiveResultqueryReservationSchedule(
                    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryReservationSchedule operation
           */
            public void receiveErrorqueryReservationSchedule(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryReservationOccurrences method
            * override this method for handling normal response from queryReservationOccurrences operation
            */
           public void receiveResultqueryReservationOccurrences(
                    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryReservationOccurrences operation
           */
            public void receiveErrorqueryReservationOccurrences(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryReservationOccurrenceAlarms method
            * override this method for handling normal response from queryReservationOccurrenceAlarms operation
            */
           public void receiveResultqueryReservationOccurrenceAlarms(
                    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryReservationOccurrenceAlarms operation
           */
            public void receiveErrorqueryReservationOccurrenceAlarms(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryReservationOccurrence method
            * override this method for handling normal response from queryReservationOccurrence operation
            */
           public void receiveResultqueryReservationOccurrence(
                    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryReservationOccurrence operation
           */
            public void receiveErrorqueryReservationOccurrence(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for cancelReservationOccurrence method
            * override this method for handling normal response from cancelReservationOccurrence operation
            */
           public void receiveResultcancelReservationOccurrence(
                    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from cancelReservationOccurrence operation
           */
            public void receiveErrorcancelReservationOccurrence(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for disconnect method
            * override this method for handling normal response from disconnect operation
            */
           public void receiveResultdisconnect(
                    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from disconnect operation
           */
            public void receiveErrordisconnect(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for confirmReservationSchedule method
            * override this method for handling normal response from confirmReservationSchedule operation
            */
           public void receiveResultconfirmReservationSchedule(
                    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from confirmReservationSchedule operation
           */
            public void receiveErrorconfirmReservationSchedule(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for queryPathAvailability method
            * override this method for handling normal response from queryPathAvailability operation
            */
           public void receiveResultqueryPathAvailability(
                    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from queryPathAvailability operation
           */
            public void receiveErrorqueryPathAvailability(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addReservationOccurrence method
            * override this method for handling normal response from addReservationOccurrence operation
            */
           public void receiveResultaddReservationOccurrence(
                    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addReservationOccurrence operation
           */
            public void receiveErroraddReservationOccurrence(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for activateReservationOccurrence method
            * override this method for handling normal response from activateReservationOccurrence operation
            */
           public void receiveResultactivateReservationOccurrence(
                    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from activateReservationOccurrence operation
           */
            public void receiveErroractivateReservationOccurrence(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for createReservationSchedule method
            * override this method for handling normal response from createReservationSchedule operation
            */
           public void receiveResultcreateReservationSchedule(
                    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from createReservationSchedule operation
           */
            public void receiveErrorcreateReservationSchedule(java.lang.Exception e) {
            }
                


    }
    