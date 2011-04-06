/*
 * An XML document type.
 * Localname: QueryReservationOccurrencesRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryReservationOccurrencesRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryReservationOccurrencesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument
{
    
    public QueryReservationOccurrencesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESERVATIONOCCURRENCESREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryReservationOccurrencesRequest");
    
    
    /**
     * Gets the "QueryReservationOccurrencesRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest getQueryReservationOccurrencesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest)get_store().find_element_user(QUERYRESERVATIONOCCURRENCESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryReservationOccurrencesRequest" element
     */
    public void setQueryReservationOccurrencesRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest queryReservationOccurrencesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest)get_store().find_element_user(QUERYRESERVATIONOCCURRENCESREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest)get_store().add_element_user(QUERYRESERVATIONOCCURRENCESREQUEST$0);
            }
            target.set(queryReservationOccurrencesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryReservationOccurrencesRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest addNewQueryReservationOccurrencesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest)get_store().add_element_user(QUERYRESERVATIONOCCURRENCESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML QueryReservationOccurrencesRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryReservationOccurrencesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesRequestDocument.QueryReservationOccurrencesRequest
    {
        
        public QueryReservationOccurrencesRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
