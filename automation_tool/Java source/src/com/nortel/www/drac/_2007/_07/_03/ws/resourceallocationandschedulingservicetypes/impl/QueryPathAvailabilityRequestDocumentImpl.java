/*
 * An XML document type.
 * Localname: QueryPathAvailabilityRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryPathAvailabilityRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryPathAvailabilityRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument
{
    
    public QueryPathAvailabilityRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYPATHAVAILABILITYREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryPathAvailabilityRequest");
    
    
    /**
     * Gets the "QueryPathAvailabilityRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest getQueryPathAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest)get_store().find_element_user(QUERYPATHAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryPathAvailabilityRequest" element
     */
    public void setQueryPathAvailabilityRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest queryPathAvailabilityRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest)get_store().find_element_user(QUERYPATHAVAILABILITYREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest)get_store().add_element_user(QUERYPATHAVAILABILITYREQUEST$0);
            }
            target.set(queryPathAvailabilityRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryPathAvailabilityRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest addNewQueryPathAvailabilityRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest)get_store().add_element_user(QUERYPATHAVAILABILITYREQUEST$0);
            return target;
        }
    }
    /**
     * An XML QueryPathAvailabilityRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryPathAvailabilityRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryPathAvailabilityRequestDocument.QueryPathAvailabilityRequest
    {
        
        public QueryPathAvailabilityRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PATHAVAILABILITY$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "pathAvailability");
        
        
        /**
         * Gets the "pathAvailability" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT getPathAvailability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT)get_store().find_element_user(PATHAVAILABILITY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "pathAvailability" element
         */
        public void setPathAvailability(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT pathAvailability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT)get_store().find_element_user(PATHAVAILABILITY$0, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT)get_store().add_element_user(PATHAVAILABILITY$0);
                }
                target.set(pathAvailability);
            }
        }
        
        /**
         * Appends and returns a new empty "pathAvailability" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT addNewPathAvailability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathAvailabilityRequestT)get_store().add_element_user(PATHAVAILABILITY$0);
                return target;
            }
        }
    }
}
