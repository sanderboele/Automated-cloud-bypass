/*
 * An XML document type.
 * Localname: QueryAlarmsRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryAlarmsRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryAlarmsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument
{
    
    public QueryAlarmsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYALARMSREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryAlarmsRequest");
    
    
    /**
     * Gets the "QueryAlarmsRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest getQueryAlarmsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest)get_store().find_element_user(QUERYALARMSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryAlarmsRequest" element
     */
    public void setQueryAlarmsRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest queryAlarmsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest)get_store().find_element_user(QUERYALARMSREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest)get_store().add_element_user(QUERYALARMSREQUEST$0);
            }
            target.set(queryAlarmsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryAlarmsRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest addNewQueryAlarmsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest)get_store().add_element_user(QUERYALARMSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML QueryAlarmsRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryAlarmsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsRequestDocument.QueryAlarmsRequest
    {
        
        public QueryAlarmsRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
