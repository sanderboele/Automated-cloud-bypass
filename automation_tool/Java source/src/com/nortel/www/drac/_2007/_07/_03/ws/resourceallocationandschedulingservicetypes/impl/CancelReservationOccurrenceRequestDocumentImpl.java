/*
 * An XML document type.
 * Localname: CancelReservationOccurrenceRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one CancelReservationOccurrenceRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class CancelReservationOccurrenceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument
{
    
    public CancelReservationOccurrenceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELRESERVATIONOCCURRENCEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "CancelReservationOccurrenceRequest");
    
    
    /**
     * Gets the "CancelReservationOccurrenceRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest getCancelReservationOccurrenceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest)get_store().find_element_user(CANCELRESERVATIONOCCURRENCEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CancelReservationOccurrenceRequest" element
     */
    public void setCancelReservationOccurrenceRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest cancelReservationOccurrenceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest)get_store().find_element_user(CANCELRESERVATIONOCCURRENCEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest)get_store().add_element_user(CANCELRESERVATIONOCCURRENCEREQUEST$0);
            }
            target.set(cancelReservationOccurrenceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CancelReservationOccurrenceRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest addNewCancelReservationOccurrenceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest)get_store().add_element_user(CANCELRESERVATIONOCCURRENCEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CancelReservationOccurrenceRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class CancelReservationOccurrenceRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationOccurrenceRequestDocument.CancelReservationOccurrenceRequest
    {
        
        public CancelReservationOccurrenceRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
