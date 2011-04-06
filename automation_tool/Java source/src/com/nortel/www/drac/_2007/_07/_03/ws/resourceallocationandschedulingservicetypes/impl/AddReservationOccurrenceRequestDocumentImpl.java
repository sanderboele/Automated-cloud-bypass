/*
 * An XML document type.
 * Localname: AddReservationOccurrenceRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one AddReservationOccurrenceRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class AddReservationOccurrenceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument
{
    
    public AddReservationOccurrenceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESERVATIONOCCURRENCEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "AddReservationOccurrenceRequest");
    
    
    /**
     * Gets the "AddReservationOccurrenceRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest getAddReservationOccurrenceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest)get_store().find_element_user(ADDRESERVATIONOCCURRENCEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddReservationOccurrenceRequest" element
     */
    public void setAddReservationOccurrenceRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest addReservationOccurrenceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest)get_store().find_element_user(ADDRESERVATIONOCCURRENCEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest)get_store().add_element_user(ADDRESERVATIONOCCURRENCEREQUEST$0);
            }
            target.set(addReservationOccurrenceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AddReservationOccurrenceRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest addNewAddReservationOccurrenceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest)get_store().add_element_user(ADDRESERVATIONOCCURRENCEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML AddReservationOccurrenceRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class AddReservationOccurrenceRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.AddReservationOccurrenceRequestDocument.AddReservationOccurrenceRequest
    {
        
        public AddReservationOccurrenceRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OCCURRENCE$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrence");
        
        
        /**
         * Gets the "occurrence" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT getOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT)get_store().find_element_user(OCCURRENCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "occurrence" element
         */
        public void setOccurrence(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT occurrence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT)get_store().find_element_user(OCCURRENCE$0, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT)get_store().add_element_user(OCCURRENCE$0);
                }
                target.set(occurrence);
            }
        }
        
        /**
         * Appends and returns a new empty "occurrence" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT addNewOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT)get_store().add_element_user(OCCURRENCE$0);
                return target;
            }
        }
    }
}
