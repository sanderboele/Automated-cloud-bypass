/*
 * An XML document type.
 * Localname: QueryReservationScheduleRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryReservationScheduleRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument
{
    
    public QueryReservationScheduleRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESERVATIONSCHEDULEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryReservationScheduleRequest");
    
    
    /**
     * Gets the "QueryReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest getQueryReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest)get_store().find_element_user(QUERYRESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryReservationScheduleRequest" element
     */
    public void setQueryReservationScheduleRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest queryReservationScheduleRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest)get_store().find_element_user(QUERYRESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest)get_store().add_element_user(QUERYRESERVATIONSCHEDULEREQUEST$0);
            }
            target.set(queryReservationScheduleRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest addNewQueryReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest)get_store().add_element_user(QUERYRESERVATIONSCHEDULEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML QueryReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryReservationScheduleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleRequestDocument.QueryReservationScheduleRequest
    {
        
        public QueryReservationScheduleRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
