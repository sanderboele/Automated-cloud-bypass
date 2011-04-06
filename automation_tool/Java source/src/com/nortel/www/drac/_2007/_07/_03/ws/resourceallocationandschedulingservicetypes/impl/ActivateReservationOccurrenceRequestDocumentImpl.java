/*
 * An XML document type.
 * Localname: ActivateReservationOccurrenceRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one ActivateReservationOccurrenceRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class ActivateReservationOccurrenceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument
{
    
    public ActivateReservationOccurrenceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVATERESERVATIONOCCURRENCEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "ActivateReservationOccurrenceRequest");
    
    
    /**
     * Gets the "ActivateReservationOccurrenceRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest getActivateReservationOccurrenceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest)get_store().find_element_user(ACTIVATERESERVATIONOCCURRENCEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ActivateReservationOccurrenceRequest" element
     */
    public void setActivateReservationOccurrenceRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest activateReservationOccurrenceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest)get_store().find_element_user(ACTIVATERESERVATIONOCCURRENCEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest)get_store().add_element_user(ACTIVATERESERVATIONOCCURRENCEREQUEST$0);
            }
            target.set(activateReservationOccurrenceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivateReservationOccurrenceRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest addNewActivateReservationOccurrenceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest)get_store().add_element_user(ACTIVATERESERVATIONOCCURRENCEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ActivateReservationOccurrenceRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class ActivateReservationOccurrenceRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ActivateReservationOccurrenceRequestDocument.ActivateReservationOccurrenceRequest
    {
        
        public ActivateReservationOccurrenceRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OCCURRENCEID$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceId");
        
        
        /**
         * Gets the "occurrenceId" element
         */
        public java.lang.String getOccurrenceId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "occurrenceId" element
         */
        public org.apache.xmlbeans.XmlString xgetOccurrenceId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "occurrenceId" element
         */
        public void setOccurrenceId(java.lang.String occurrenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCEID$0);
                }
                target.setStringValue(occurrenceId);
            }
        }
        
        /**
         * Sets (as xml) the "occurrenceId" element
         */
        public void xsetOccurrenceId(org.apache.xmlbeans.XmlString occurrenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OCCURRENCEID$0);
                }
                target.set(occurrenceId);
            }
        }
    }
}
