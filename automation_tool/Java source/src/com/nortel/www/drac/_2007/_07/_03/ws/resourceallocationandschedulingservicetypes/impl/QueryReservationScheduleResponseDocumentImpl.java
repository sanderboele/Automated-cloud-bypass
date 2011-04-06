/*
 * An XML document type.
 * Localname: QueryReservationScheduleResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryReservationScheduleResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryReservationScheduleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument
{
    
    public QueryReservationScheduleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESERVATIONSCHEDULERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryReservationScheduleResponse");
    
    
    /**
     * Gets the "QueryReservationScheduleResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse getQueryReservationScheduleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse)get_store().find_element_user(QUERYRESERVATIONSCHEDULERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryReservationScheduleResponse" element
     */
    public void setQueryReservationScheduleResponse(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse queryReservationScheduleResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse)get_store().find_element_user(QUERYRESERVATIONSCHEDULERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse)get_store().add_element_user(QUERYRESERVATIONSCHEDULERESPONSE$0);
            }
            target.set(queryReservationScheduleResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryReservationScheduleResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse addNewQueryReservationScheduleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse)get_store().add_element_user(QUERYRESERVATIONSCHEDULERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML QueryReservationScheduleResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryReservationScheduleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationScheduleResponseDocument.QueryReservationScheduleResponse
    {
        
        public QueryReservationScheduleResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ISFOUND$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "isFound");
        private static final javax.xml.namespace.QName RESERVATIONSCHEDULE$2 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationSchedule");
        
        
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
         * Gets the "reservationSchedule" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT getReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT)get_store().find_element_user(RESERVATIONSCHEDULE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "reservationSchedule" element
         */
        public boolean isNilReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT)get_store().find_element_user(RESERVATIONSCHEDULE$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "reservationSchedule" element
         */
        public boolean isSetReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESERVATIONSCHEDULE$2) != 0;
            }
        }
        
        /**
         * Sets the "reservationSchedule" element
         */
        public void setReservationSchedule(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT reservationSchedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT)get_store().find_element_user(RESERVATIONSCHEDULE$2, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT)get_store().add_element_user(RESERVATIONSCHEDULE$2);
                }
                target.set(reservationSchedule);
            }
        }
        
        /**
         * Appends and returns a new empty "reservationSchedule" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT addNewReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT)get_store().add_element_user(RESERVATIONSCHEDULE$2);
                return target;
            }
        }
        
        /**
         * Nils the "reservationSchedule" element
         */
        public void setNilReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT)get_store().find_element_user(RESERVATIONSCHEDULE$2, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT)get_store().add_element_user(RESERVATIONSCHEDULE$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "reservationSchedule" element
         */
        public void unsetReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESERVATIONSCHEDULE$2, 0);
            }
        }
    }
}
