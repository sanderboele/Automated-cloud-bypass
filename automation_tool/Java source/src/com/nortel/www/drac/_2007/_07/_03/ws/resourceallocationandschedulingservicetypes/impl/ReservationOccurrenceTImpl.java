/*
 * XML Type:  ReservationOccurrenceT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML ReservationOccurrenceT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class ReservationOccurrenceTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT
{
    
    public ReservationOccurrenceTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULEID$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleId");
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULESTARTTIME$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleStartTime");
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULEENDTIME$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleEndTime");
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULESTATUS$6 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleStatus");
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULENAME$8 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleName");
    private static final javax.xml.namespace.QName OCCURRENCEID$10 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceId");
    private static final javax.xml.namespace.QName OCCURRENCESTARTTIME$12 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceStartTime");
    private static final javax.xml.namespace.QName OCCURRENCEENDTIME$14 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceEndTime");
    private static final javax.xml.namespace.QName OCCURRENCESTATUS$16 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceStatus");
    private static final javax.xml.namespace.QName RESOURCE$18 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "resource");
    private static final javax.xml.namespace.QName USERINFO$20 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "userInfo");
    private static final javax.xml.namespace.QName USERID$22 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "userId");
    
    
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
     * Gets the "reservationScheduleStartTime" element
     */
    public java.util.Calendar getReservationScheduleStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULESTARTTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "reservationScheduleStartTime" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetReservationScheduleStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(RESERVATIONSCHEDULESTARTTIME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reservationScheduleStartTime" element
     */
    public void setReservationScheduleStartTime(java.util.Calendar reservationScheduleStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULESTARTTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONSCHEDULESTARTTIME$2);
            }
            target.setCalendarValue(reservationScheduleStartTime);
        }
    }
    
    /**
     * Sets (as xml) the "reservationScheduleStartTime" element
     */
    public void xsetReservationScheduleStartTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT reservationScheduleStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(RESERVATIONSCHEDULESTARTTIME$2, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(RESERVATIONSCHEDULESTARTTIME$2);
            }
            target.set(reservationScheduleStartTime);
        }
    }
    
    /**
     * Gets the "reservationScheduleEndTime" element
     */
    public java.util.Calendar getReservationScheduleEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULEENDTIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "reservationScheduleEndTime" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetReservationScheduleEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(RESERVATIONSCHEDULEENDTIME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reservationScheduleEndTime" element
     */
    public void setReservationScheduleEndTime(java.util.Calendar reservationScheduleEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULEENDTIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONSCHEDULEENDTIME$4);
            }
            target.setCalendarValue(reservationScheduleEndTime);
        }
    }
    
    /**
     * Sets (as xml) the "reservationScheduleEndTime" element
     */
    public void xsetReservationScheduleEndTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT reservationScheduleEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(RESERVATIONSCHEDULEENDTIME$4, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(RESERVATIONSCHEDULEENDTIME$4);
            }
            target.set(reservationScheduleEndTime);
        }
    }
    
    /**
     * Gets the "reservationScheduleStatus" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.Enum getReservationScheduleStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULESTATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reservationScheduleStatus" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT xgetReservationScheduleStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT)get_store().find_element_user(RESERVATIONSCHEDULESTATUS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reservationScheduleStatus" element
     */
    public void setReservationScheduleStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.Enum reservationScheduleStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULESTATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONSCHEDULESTATUS$6);
            }
            target.setEnumValue(reservationScheduleStatus);
        }
    }
    
    /**
     * Sets (as xml) the "reservationScheduleStatus" element
     */
    public void xsetReservationScheduleStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT reservationScheduleStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT)get_store().find_element_user(RESERVATIONSCHEDULESTATUS$6, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT)get_store().add_element_user(RESERVATIONSCHEDULESTATUS$6);
            }
            target.set(reservationScheduleStatus);
        }
    }
    
    /**
     * Gets the "reservationScheduleName" element
     */
    public java.lang.String getReservationScheduleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULENAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reservationScheduleName" element
     */
    public org.apache.xmlbeans.XmlString xgetReservationScheduleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVATIONSCHEDULENAME$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reservationScheduleName" element
     */
    public void setReservationScheduleName(java.lang.String reservationScheduleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONSCHEDULENAME$8);
            }
            target.setStringValue(reservationScheduleName);
        }
    }
    
    /**
     * Sets (as xml) the "reservationScheduleName" element
     */
    public void xsetReservationScheduleName(org.apache.xmlbeans.XmlString reservationScheduleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVATIONSCHEDULENAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESERVATIONSCHEDULENAME$8);
            }
            target.set(reservationScheduleName);
        }
    }
    
    /**
     * Gets the "occurrenceId" element
     */
    public java.lang.String getOccurrenceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "occurrenceId" element
     */
    public org.apache.xmlbeans.XmlString xgetOccurrenceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "occurrenceId" element
     */
    public void setOccurrenceId(java.lang.String occurrenceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCEID$10);
            }
            target.setStringValue(occurrenceId);
        }
    }
    
    /**
     * Sets (as xml) the "occurrenceId" element
     */
    public void xsetOccurrenceId(org.apache.xmlbeans.XmlString occurrenceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OCCURRENCEID$10);
            }
            target.set(occurrenceId);
        }
    }
    
    /**
     * Gets the "occurrenceStartTime" element
     */
    public java.util.Calendar getOccurrenceStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCESTARTTIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "occurrenceStartTime" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetOccurrenceStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(OCCURRENCESTARTTIME$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "occurrenceStartTime" element
     */
    public void setOccurrenceStartTime(java.util.Calendar occurrenceStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCESTARTTIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCESTARTTIME$12);
            }
            target.setCalendarValue(occurrenceStartTime);
        }
    }
    
    /**
     * Sets (as xml) the "occurrenceStartTime" element
     */
    public void xsetOccurrenceStartTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT occurrenceStartTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(OCCURRENCESTARTTIME$12, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(OCCURRENCESTARTTIME$12);
            }
            target.set(occurrenceStartTime);
        }
    }
    
    /**
     * Gets the "occurrenceEndTime" element
     */
    public java.util.Calendar getOccurrenceEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEENDTIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "occurrenceEndTime" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetOccurrenceEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(OCCURRENCEENDTIME$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "occurrenceEndTime" element
     */
    public void setOccurrenceEndTime(java.util.Calendar occurrenceEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEENDTIME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCEENDTIME$14);
            }
            target.setCalendarValue(occurrenceEndTime);
        }
    }
    
    /**
     * Sets (as xml) the "occurrenceEndTime" element
     */
    public void xsetOccurrenceEndTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT occurrenceEndTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(OCCURRENCEENDTIME$14, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(OCCURRENCEENDTIME$14);
            }
            target.set(occurrenceEndTime);
        }
    }
    
    /**
     * Gets the "occurrenceStatus" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT.Enum getOccurrenceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCESTATUS$16, 0);
            if (target == null)
            {
                return null;
            }
            return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "occurrenceStatus" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT xgetOccurrenceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT)get_store().find_element_user(OCCURRENCESTATUS$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "occurrenceStatus" element
     */
    public void setOccurrenceStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT.Enum occurrenceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCESTATUS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCESTATUS$16);
            }
            target.setEnumValue(occurrenceStatus);
        }
    }
    
    /**
     * Sets (as xml) the "occurrenceStatus" element
     */
    public void xsetOccurrenceStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT occurrenceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT)get_store().find_element_user(OCCURRENCESTATUS$16, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT)get_store().add_element_user(OCCURRENCESTATUS$16);
            }
            target.set(occurrenceStatus);
        }
    }
    
    /**
     * Gets the "resource" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT)get_store().find_element_user(RESOURCE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource" element
     */
    public void setResource(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT)get_store().find_element_user(RESOURCE$18, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT)get_store().add_element_user(RESOURCE$18);
            }
            target.set(resource);
        }
    }
    
    /**
     * Appends and returns a new empty "resource" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT)get_store().add_element_user(RESOURCE$18);
            return target;
        }
    }
    
    /**
     * Gets the "userInfo" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT getUserInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().find_element_user(USERINFO$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "userInfo" element
     */
    public void setUserInfo(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT userInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().find_element_user(USERINFO$20, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().add_element_user(USERINFO$20);
            }
            target.set(userInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "userInfo" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT addNewUserInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().add_element_user(USERINFO$20);
            return target;
        }
    }
    
    /**
     * Gets the "userId" element
     */
    public java.lang.String getUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userId" element
     */
    public org.apache.xmlbeans.XmlString xgetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userId" element
     */
    public void setUserId(java.lang.String userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$22);
            }
            target.setStringValue(userId);
        }
    }
    
    /**
     * Sets (as xml) the "userId" element
     */
    public void xsetUserId(org.apache.xmlbeans.XmlString userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$22);
            }
            target.set(userId);
        }
    }
}
