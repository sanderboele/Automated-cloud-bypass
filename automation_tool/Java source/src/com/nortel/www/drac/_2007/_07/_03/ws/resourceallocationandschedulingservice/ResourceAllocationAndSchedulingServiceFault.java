
/**
 * ResourceAllocationAndSchedulingServiceFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservice;

public class ResourceAllocationAndSchedulingServiceFault extends java.lang.Exception{
    
    private com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument faultMessage;

    
        public ResourceAllocationAndSchedulingServiceFault() {
            super("ResourceAllocationAndSchedulingServiceFault");
        }

        public ResourceAllocationAndSchedulingServiceFault(java.lang.String s) {
           super(s);
        }

        public ResourceAllocationAndSchedulingServiceFault(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ResourceAllocationAndSchedulingServiceFault(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument msg){
       faultMessage = msg;
    }
    
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument getFaultMessage(){
       return faultMessage;
    }
}
    