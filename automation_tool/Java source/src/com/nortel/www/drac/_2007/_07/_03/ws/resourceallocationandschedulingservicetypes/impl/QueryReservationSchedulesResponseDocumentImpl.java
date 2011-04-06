/*
 * An XML document type.
 * Localname: QueryReservationSchedulesResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryReservationSchedulesResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryReservationSchedulesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument
{
    
    public QueryReservationSchedulesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESERVATIONSCHEDULESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryReservationSchedulesResponse");
    
    
    /**
     * Gets the "QueryReservationSchedulesResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse getQueryReservationSchedulesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse)get_store().find_element_user(QUERYRESERVATIONSCHEDULESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryReservationSchedulesResponse" element
     */
    public void setQueryReservationSchedulesResponse(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse queryReservationSchedulesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse)get_store().find_element_user(QUERYRESERVATIONSCHEDULESRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse)get_store().add_element_user(QUERYRESERVATIONSCHEDULESRESPONSE$0);
            }
            target.set(queryReservationSchedulesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryReservationSchedulesResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse addNewQueryReservationSchedulesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse)get_store().add_element_user(QUERYRESERVATIONSCHEDULESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML QueryReservationSchedulesResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryReservationSchedulesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationSchedulesResponseDocument.QueryReservationSchedulesResponse
    {
        
        public QueryReservationSchedulesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMOFELEMENTSINCLUDED$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "numOfElementsIncluded");
        private static final javax.xml.namespace.QName NUMOFELEMENTSFOUND$2 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "numOfElementsFound");
        private static final javax.xml.namespace.QName RESERVATIONSCHEDULE$4 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationSchedule");
        
        
        /**
         * Gets the "numOfElementsIncluded" element
         */
        public int getNumOfElementsIncluded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numOfElementsIncluded" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumOfElementsIncluded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numOfElementsIncluded" element
         */
        public void setNumOfElementsIncluded(int numOfElementsIncluded)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMOFELEMENTSINCLUDED$0);
                }
                target.setIntValue(numOfElementsIncluded);
            }
        }
        
        /**
         * Sets (as xml) the "numOfElementsIncluded" element
         */
        public void xsetNumOfElementsIncluded(org.apache.xmlbeans.XmlInt numOfElementsIncluded)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMOFELEMENTSINCLUDED$0);
                }
                target.set(numOfElementsIncluded);
            }
        }
        
        /**
         * Gets the "numOfElementsFound" element
         */
        public int getNumOfElementsFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numOfElementsFound" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumOfElementsFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numOfElementsFound" element
         */
        public void setNumOfElementsFound(int numOfElementsFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMOFELEMENTSFOUND$2);
                }
                target.setIntValue(numOfElementsFound);
            }
        }
        
        /**
         * Sets (as xml) the "numOfElementsFound" element
         */
        public void xsetNumOfElementsFound(org.apache.xmlbeans.XmlInt numOfElementsFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMOFELEMENTSFOUND$2);
                }
                target.set(numOfElementsFound);
            }
        }
        
        /**
         * Gets array of all "reservationSchedule" elements
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT[] getReservationScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESERVATIONSCHEDULE$4, targetList);
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT[] result = new com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "reservationSchedule" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT getReservationScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT)get_store().find_element_user(RESERVATIONSCHEDULE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "reservationSchedule" element
         */
        public boolean isNilReservationScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT)get_store().find_element_user(RESERVATIONSCHEDULE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "reservationSchedule" element
         */
        public int sizeOfReservationScheduleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESERVATIONSCHEDULE$4);
            }
        }
        
        /**
         * Sets array of all "reservationSchedule" element
         */
        public void setReservationScheduleArray(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT[] reservationScheduleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reservationScheduleArray, RESERVATIONSCHEDULE$4);
            }
        }
        
        /**
         * Sets ith "reservationSchedule" element
         */
        public void setReservationScheduleArray(int i, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT reservationSchedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT)get_store().find_element_user(RESERVATIONSCHEDULE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reservationSchedule);
            }
        }
        
        /**
         * Nils the ith "reservationSchedule" element
         */
        public void setNilReservationScheduleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT)get_store().find_element_user(RESERVATIONSCHEDULE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reservationSchedule" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT insertNewReservationSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT)get_store().insert_element_user(RESERVATIONSCHEDULE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reservationSchedule" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT addNewReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT)get_store().add_element_user(RESERVATIONSCHEDULE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "reservationSchedule" element
         */
        public void removeReservationSchedule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESERVATIONSCHEDULE$4, i);
            }
        }
    }
}
