/*
 * XML Type:  ReservationOccurrenceRequestT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML ReservationOccurrenceRequestT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class ReservationOccurrenceRequestTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT
{
    
    public ReservationOccurrenceRequestTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULEID$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleId");
    private static final javax.xml.namespace.QName STARTTIME$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "startTime");
    private static final javax.xml.namespace.QName SHAREDRISKRESERVATIONOCCURRENCEGROUP$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "sharedRiskReservationOccurrenceGroup");
    private static final javax.xml.namespace.QName SRLGEXCLUSIONS$6 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "srlgExclusions");
    
    
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
     * Gets the "startTime" element
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$2, 0);
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
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(STARTTIME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$2);
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
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(STARTTIME$2, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(STARTTIME$2);
            }
            target.set(startTime);
        }
    }
    
    /**
     * Gets the "sharedRiskReservationOccurrenceGroup" element
     */
    public java.lang.String getSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sharedRiskReservationOccurrenceGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "sharedRiskReservationOccurrenceGroup" element
     */
    public boolean isNilSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "sharedRiskReservationOccurrenceGroup" element
     */
    public boolean isSetSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4) != 0;
        }
    }
    
    /**
     * Sets the "sharedRiskReservationOccurrenceGroup" element
     */
    public void setSharedRiskReservationOccurrenceGroup(java.lang.String sharedRiskReservationOccurrenceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4);
            }
            target.setStringValue(sharedRiskReservationOccurrenceGroup);
        }
    }
    
    /**
     * Sets (as xml) the "sharedRiskReservationOccurrenceGroup" element
     */
    public void xsetSharedRiskReservationOccurrenceGroup(org.apache.xmlbeans.XmlString sharedRiskReservationOccurrenceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4);
            }
            target.set(sharedRiskReservationOccurrenceGroup);
        }
    }
    
    /**
     * Nils the "sharedRiskReservationOccurrenceGroup" element
     */
    public void setNilSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "sharedRiskReservationOccurrenceGroup" element
     */
    public void unsetSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAREDRISKRESERVATIONOCCURRENCEGROUP$4, 0);
        }
    }
    
    /**
     * Gets the "srlgExclusions" element
     */
    public java.lang.String getSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRLGEXCLUSIONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "srlgExclusions" element
     */
    public org.apache.xmlbeans.XmlString xgetSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "srlgExclusions" element
     */
    public boolean isNilSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "srlgExclusions" element
     */
    public boolean isSetSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRLGEXCLUSIONS$6) != 0;
        }
    }
    
    /**
     * Sets the "srlgExclusions" element
     */
    public void setSrlgExclusions(java.lang.String srlgExclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRLGEXCLUSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRLGEXCLUSIONS$6);
            }
            target.setStringValue(srlgExclusions);
        }
    }
    
    /**
     * Sets (as xml) the "srlgExclusions" element
     */
    public void xsetSrlgExclusions(org.apache.xmlbeans.XmlString srlgExclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRLGEXCLUSIONS$6);
            }
            target.set(srlgExclusions);
        }
    }
    
    /**
     * Nils the "srlgExclusions" element
     */
    public void setNilSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRLGEXCLUSIONS$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "srlgExclusions" element
     */
    public void unsetSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRLGEXCLUSIONS$6, 0);
        }
    }
}
