/*
 * An XML document type.
 * Localname: QueryReservationSchedulesRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryReservationSchedulesRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryReservationSchedulesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument
{
    
    public QueryReservationSchedulesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESERVATIONSCHEDULESREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryReservationSchedulesRequest");
    
    
    /**
     * Gets the "QueryReservationSchedulesRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest getQueryReservationSchedulesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest)get_store().find_element_user(QUERYRESERVATIONSCHEDULESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryReservationSchedulesRequest" element
     */
    public void setQueryReservationSchedulesRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest queryReservationSchedulesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest)get_store().find_element_user(QUERYRESERVATIONSCHEDULESREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest)get_store().add_element_user(QUERYRESERVATIONSCHEDULESREQUEST$0);
            }
            target.set(queryReservationSchedulesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryReservationSchedulesRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest addNewQueryReservationSchedulesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest)get_store().add_element_user(QUERYRESERVATIONSCHEDULESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML QueryReservationSchedulesRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryReservationSchedulesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesRequestDocument.QueryReservationSchedulesRequest
    {
        
        public QueryReservationSchedulesRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CRITERIA$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "criteria");
        
        
        /**
         * Gets the "criteria" element
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT getCriteria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT)get_store().find_element_user(CRITERIA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "criteria" element
         */
        public void setCriteria(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT criteria)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT)get_store().find_element_user(CRITERIA$0, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT)get_store().add_element_user(CRITERIA$0);
                }
                target.set(criteria);
            }
        }
        
        /**
         * Appends and returns a new empty "criteria" element
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT addNewCriteria()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.QueryCriteriaT)get_store().add_element_user(CRITERIA$0);
                return target;
            }
        }
    }
}
