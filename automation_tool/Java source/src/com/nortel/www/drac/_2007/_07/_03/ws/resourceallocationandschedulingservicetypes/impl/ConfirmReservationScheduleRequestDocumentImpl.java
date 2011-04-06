/*
 * An XML document type.
 * Localname: ConfirmReservationScheduleRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one ConfirmReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class ConfirmReservationScheduleRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument
{
    
    public ConfirmReservationScheduleRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFIRMRESERVATIONSCHEDULEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "ConfirmReservationScheduleRequest");
    
    
    /**
     * Gets the "ConfirmReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest getConfirmReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest)get_store().find_element_user(CONFIRMRESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConfirmReservationScheduleRequest" element
     */
    public void setConfirmReservationScheduleRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest confirmReservationScheduleRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest)get_store().find_element_user(CONFIRMRESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest)get_store().add_element_user(CONFIRMRESERVATIONSCHEDULEREQUEST$0);
            }
            target.set(confirmReservationScheduleRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ConfirmReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest addNewConfirmReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest)get_store().add_element_user(CONFIRMRESERVATIONSCHEDULEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ConfirmReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class ConfirmReservationScheduleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ConfirmReservationScheduleRequestDocument.ConfirmReservationScheduleRequest
    {
        
        public ConfirmReservationScheduleRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
