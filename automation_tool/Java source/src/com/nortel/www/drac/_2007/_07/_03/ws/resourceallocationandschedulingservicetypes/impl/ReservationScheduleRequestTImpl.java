/*
 * XML Type:  ReservationScheduleRequestT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML ReservationScheduleRequestT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class ReservationScheduleRequestTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT
{
    
    public ReservationScheduleRequestTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "name");
    private static final javax.xml.namespace.QName TYPE$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "type");
    private static final javax.xml.namespace.QName STARTTIME$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "startTime");
    private static final javax.xml.namespace.QName RESERVATIONOCCURRENCEDURATION$6 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationOccurrenceDuration");
    private static final javax.xml.namespace.QName RESOURCE$8 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "resource");
    private static final javax.xml.namespace.QName USERINFO$10 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "userInfo");
    private static final javax.xml.namespace.QName ISRECURRING$12 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "isRecurring");
    private static final javax.xml.namespace.QName RECURRENCE$14 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "recurrence");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT)get_store().find_element_user(TYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "type" element
     */
    public boolean isNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT)get_store().find_element_user(TYPE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT)get_store().add_element_user(TYPE$2);
            }
            target.set(type);
        }
    }
    
    /**
     * Nils the "type" element
     */
    public void setNilType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT)get_store().find_element_user(TYPE$2, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT)get_store().add_element_user(TYPE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$2, 0);
        }
    }
    
    /**
     * Gets the "startTime" element
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "startTime" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(STARTTIME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "startTime" element
     */
    public void setStartTime(java.util.Calendar startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$4);
            }
            target.setCalendarValue(startTime);
        }
    }
    
    /**
     * Sets (as xml) the "startTime" element
     */
    public void xsetStartTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT startTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(STARTTIME$4, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(STARTTIME$4);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Gets the "reservationOccurrenceDuration" element
     */
    public int getReservationOccurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONOCCURRENCEDURATION$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "reservationOccurrenceDuration" element
     */
    public org.apache.xmlbeans.XmlInt xgetReservationOccurrenceDuration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESERVATIONOCCURRENCEDURATION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reservationOccurrenceDuration" element
     */
    public void setReservationOccurrenceDuration(int reservationOccurrenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONOCCURRENCEDURATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONOCCURRENCEDURATION$6);
            }
            target.setIntValue(reservationOccurrenceDuration);
        }
    }
    
    /**
     * Sets (as xml) the "reservationOccurrenceDuration" element
     */
    public void xsetReservationOccurrenceDuration(org.apache.xmlbeans.XmlInt reservationOccurrenceDuration)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RESERVATIONOCCURRENCEDURATION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RESERVATIONOCCURRENCEDURATION$6);
            }
            target.set(reservationOccurrenceDuration);
        }
    }
    
    /**
     * Gets the "resource" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT)get_store().find_element_user(RESOURCE$8, 0);
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
    public void setResource(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT)get_store().find_element_user(RESOURCE$8, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT)get_store().add_element_user(RESOURCE$8);
            }
            target.set(resource);
        }
    }
    
    /**
     * Appends and returns a new empty "resource" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT)get_store().add_element_user(RESOURCE$8);
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
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().find_element_user(USERINFO$10, 0);
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
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().find_element_user(USERINFO$10, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().add_element_user(USERINFO$10);
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
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT)get_store().add_element_user(USERINFO$10);
            return target;
        }
    }
    
    /**
     * Gets the "isRecurring" element
     */
    public boolean getIsRecurring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRECURRING$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isRecurring" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsRecurring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRECURRING$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isRecurring" element
     */
    public void setIsRecurring(boolean isRecurring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISRECURRING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISRECURRING$12);
            }
            target.setBooleanValue(isRecurring);
        }
    }
    
    /**
     * Sets (as xml) the "isRecurring" element
     */
    public void xsetIsRecurring(org.apache.xmlbeans.XmlBoolean isRecurring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISRECURRING$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISRECURRING$12);
            }
            target.set(isRecurring);
        }
    }
    
    /**
     * Gets the "recurrence" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT getRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT)get_store().find_element_user(RECURRENCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "recurrence" element
     */
    public boolean isNilRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT)get_store().find_element_user(RECURRENCE$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "recurrence" element
     */
    public boolean isSetRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECURRENCE$14) != 0;
        }
    }
    
    /**
     * Sets the "recurrence" element
     */
    public void setRecurrence(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT recurrence)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT)get_store().find_element_user(RECURRENCE$14, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT)get_store().add_element_user(RECURRENCE$14);
            }
            target.set(recurrence);
        }
    }
    
    /**
     * Appends and returns a new empty "recurrence" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT addNewRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT)get_store().add_element_user(RECURRENCE$14);
            return target;
        }
    }
    
    /**
     * Nils the "recurrence" element
     */
    public void setNilRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT)get_store().find_element_user(RECURRENCE$14, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT)get_store().add_element_user(RECURRENCE$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "recurrence" element
     */
    public void unsetRecurrence()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECURRENCE$14, 0);
        }
    }
}
