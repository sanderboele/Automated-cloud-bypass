/*
 * An XML document type.
 * Localname: CreateReservationScheduleResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one CreateReservationScheduleResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class CreateReservationScheduleResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument
{
    
    public CreateReservationScheduleResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATERESERVATIONSCHEDULERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "CreateReservationScheduleResponse");
    
    
    /**
     * Gets the "CreateReservationScheduleResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse getCreateReservationScheduleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse)get_store().find_element_user(CREATERESERVATIONSCHEDULERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateReservationScheduleResponse" element
     */
    public void setCreateReservationScheduleResponse(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse createReservationScheduleResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse)get_store().find_element_user(CREATERESERVATIONSCHEDULERESPONSE$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse)get_store().add_element_user(CREATERESERVATIONSCHEDULERESPONSE$0);
            }
            target.set(createReservationScheduleResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateReservationScheduleResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse addNewCreateReservationScheduleResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse)get_store().add_element_user(CREATERESERVATIONSCHEDULERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateReservationScheduleResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class CreateReservationScheduleResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse
    {
        
        public CreateReservationScheduleResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESERVATIONSCHEDULEID$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleId");
        private static final javax.xml.namespace.QName RESULT$2 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "result");
        private static final javax.xml.namespace.QName OCCURRENCEINFO$4 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceInfo");
        
        
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
        
        /**
         * Gets the "result" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT.Enum getResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "result" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT xgetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT)get_store().find_element_user(RESULT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "result" element
         */
        public void setResult(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT.Enum result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$2);
                }
                target.setEnumValue(result);
            }
        }
        
        /**
         * Sets (as xml) the "result" element
         */
        public void xsetResult(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT)get_store().find_element_user(RESULT$2, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT)get_store().add_element_user(RESULT$2);
                }
                target.set(result);
            }
        }
        
        /**
         * Gets array of all "occurrenceInfo" elements
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT[] getOccurrenceInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OCCURRENCEINFO$4, targetList);
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT[] result = new com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "occurrenceInfo" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT getOccurrenceInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT)get_store().find_element_user(OCCURRENCEINFO$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "occurrenceInfo" element
         */
        public int sizeOfOccurrenceInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OCCURRENCEINFO$4);
            }
        }
        
        /**
         * Sets array of all "occurrenceInfo" element
         */
        public void setOccurrenceInfoArray(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT[] occurrenceInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(occurrenceInfoArray, OCCURRENCEINFO$4);
            }
        }
        
        /**
         * Sets ith "occurrenceInfo" element
         */
        public void setOccurrenceInfoArray(int i, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT occurrenceInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT)get_store().find_element_user(OCCURRENCEINFO$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(occurrenceInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "occurrenceInfo" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT insertNewOccurrenceInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT)get_store().insert_element_user(OCCURRENCEINFO$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "occurrenceInfo" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT addNewOccurrenceInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT)get_store().add_element_user(OCCURRENCEINFO$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "occurrenceInfo" element
         */
        public void removeOccurrenceInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OCCURRENCEINFO$4, i);
            }
        }
    }
}
