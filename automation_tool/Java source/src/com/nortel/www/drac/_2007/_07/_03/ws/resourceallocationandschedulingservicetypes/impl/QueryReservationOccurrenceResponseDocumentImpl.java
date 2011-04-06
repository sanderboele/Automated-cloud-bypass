/*
 * An XML document type.
 * Localname: QueryReservationOccurrenceResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryReservationOccurrenceResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryReservationOccurrenceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument
{
    
    public QueryReservationOccurrenceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESERVATIONOCCURRENCERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryReservationOccurrenceResponse");
    
    
    /**
     * Gets the "QueryReservationOccurrenceResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse getQueryReservationOccurrenceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse)get_store().find_element_user(QUERYRESERVATIONOCCURRENCERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryReservationOccurrenceResponse" element
     */
    public void setQueryReservationOccurrenceResponse(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse queryReservationOccurrenceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse)get_store().find_element_user(QUERYRESERVATIONOCCURRENCERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse)get_store().add_element_user(QUERYRESERVATIONOCCURRENCERESPONSE$0);
            }
            target.set(queryReservationOccurrenceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryReservationOccurrenceResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse addNewQueryReservationOccurrenceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse)get_store().add_element_user(QUERYRESERVATIONOCCURRENCERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML QueryReservationOccurrenceResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryReservationOccurrenceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrenceResponseDocument.QueryReservationOccurrenceResponse
    {
        
        public QueryReservationOccurrenceResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ISFOUND$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "isFound");
        private static final javax.xml.namespace.QName OCCURRENCE$2 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrence");
        
        
        /**
         * Gets the "isFound" element
         */
        public boolean getIsFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFOUND$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "isFound" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetIsFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFOUND$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "isFound" element
         */
        public void setIsFound(boolean isFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFOUND$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISFOUND$0);
                }
                target.setBooleanValue(isFound);
            }
        }
        
        /**
         * Sets (as xml) the "isFound" element
         */
        public void xsetIsFound(org.apache.xmlbeans.XmlBoolean isFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISFOUND$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISFOUND$0);
                }
                target.set(isFound);
            }
        }
        
        /**
         * Gets the "occurrence" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT getOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT)get_store().find_element_user(OCCURRENCE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "occurrence" element
         */
        public boolean isNilOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT)get_store().find_element_user(OCCURRENCE$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "occurrence" element
         */
        public boolean isSetOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OCCURRENCE$2) != 0;
            }
        }
        
        /**
         * Sets the "occurrence" element
         */
        public void setOccurrence(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT occurrence)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT)get_store().find_element_user(OCCURRENCE$2, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT)get_store().add_element_user(OCCURRENCE$2);
                }
                target.set(occurrence);
            }
        }
        
        /**
         * Appends and returns a new empty "occurrence" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT addNewOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT)get_store().add_element_user(OCCURRENCE$2);
                return target;
            }
        }
        
        /**
         * Nils the "occurrence" element
         */
        public void setNilOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT)get_store().find_element_user(OCCURRENCE$2, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT)get_store().add_element_user(OCCURRENCE$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "occurrence" element
         */
        public void unsetOccurrence()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OCCURRENCE$2, 0);
            }
        }
    }
}
