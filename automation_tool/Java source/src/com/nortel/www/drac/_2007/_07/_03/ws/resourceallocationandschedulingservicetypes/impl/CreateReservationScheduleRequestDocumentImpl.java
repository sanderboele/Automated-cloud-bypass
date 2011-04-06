/*
 * An XML document type.
 * Localname: CreateReservationScheduleRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one CreateReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class CreateReservationScheduleRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument
{
    
    public CreateReservationScheduleRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATERESERVATIONSCHEDULEREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "CreateReservationScheduleRequest");
    
    
    /**
     * Gets the "CreateReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest getCreateReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest)get_store().find_element_user(CREATERESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateReservationScheduleRequest" element
     */
    public void setCreateReservationScheduleRequest(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest createReservationScheduleRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest)get_store().find_element_user(CREATERESERVATIONSCHEDULEREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest)get_store().add_element_user(CREATERESERVATIONSCHEDULEREQUEST$0);
            }
            target.set(createReservationScheduleRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateReservationScheduleRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest addNewCreateReservationScheduleRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest)get_store().add_element_user(CREATERESERVATIONSCHEDULEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateReservationScheduleRequest(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class CreateReservationScheduleRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleRequestDocument.CreateReservationScheduleRequest
    {
        
        public CreateReservationScheduleRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESERVATIONSCHEDULE$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationSchedule");
        
        
        /**
         * Gets the "reservationSchedule" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT getReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT)get_store().find_element_user(RESERVATIONSCHEDULE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "reservationSchedule" element
         */
        public void setReservationSchedule(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT reservationSchedule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT)get_store().find_element_user(RESERVATIONSCHEDULE$0, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT)get_store().add_element_user(RESERVATIONSCHEDULE$0);
                }
                target.set(reservationSchedule);
            }
        }
        
        /**
         * Appends and returns a new empty "reservationSchedule" element
         */
        public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT addNewReservationSchedule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT)get_store().add_element_user(RESERVATIONSCHEDULE$0);
                return target;
            }
        }
    }
}
