/*
 * An XML document type.
 * Localname: CancelReservationScheduleRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one CancelReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class CancelReservationScheduleRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument
{
    
    public CancelReservationScheduleRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELRESERVATIONSCHEDULEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "CancelReservationScheduleRequest");
    
    
    /**
     * Gets the "CancelReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest getCancelReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest)get_store().find_element_user(CANCELRESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CancelReservationScheduleRequest" element
     */
    public void setCancelReservationScheduleRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest cancelReservationScheduleRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest)get_store().find_element_user(CANCELRESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest)get_store().add_element_user(CANCELRESERVATIONSCHEDULEREQUEST$0);
            }
            target.set(cancelReservationScheduleRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CancelReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest addNewCancelReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest)get_store().add_element_user(CANCELRESERVATIONSCHEDULEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CancelReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class CancelReservationScheduleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CancelReservationScheduleRequestDocument.CancelReservationScheduleRequest
    {
        
        public CancelReservationScheduleRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESERVATIONSCHEDULEID$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleId");
        
        
        /**
         * Gets the "reservationScheduleId" element
         */
        public java.lang.String getReservationScheduleId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "reservationScheduleId" element
         */
        public org.apache.xmlbeans.XmlString xgetReservationScheduleId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVATIONSCHEDULEID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "reservationScheduleId" element
         */
        public void setReservationScheduleId(java.lang.String reservationScheduleId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONSCHEDULEID$0);
                }
                target.setStringValue(reservationScheduleId);
            }
        }
        
        /**
         * Sets (as xml) the "reservationScheduleId" element
         */
        public void xsetReservationScheduleId(org.apache.xmlbeans.XmlString reservationScheduleId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVATIONSCHEDULEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESERVATIONSCHEDULEID$0);
                }
                target.set(reservationScheduleId);
            }
        }
    }
}
