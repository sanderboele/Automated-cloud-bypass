/*
 * XML Type:  ReservationOccurrenceInfoT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML ReservationOccurrenceInfoT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class ReservationOccurrenceInfoTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT
{
    
    public ReservationOccurrenceInfoTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OCCURRENCEID$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceId");
    private static final javax.xml.namespace.QName STARTTIME$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "startTime");
    private static final javax.xml.namespace.QName ENDTIME$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "endTime");
    private static final javax.xml.namespace.QName RESULT$6 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "result");
    private static final javax.xml.namespace.QName REASON$8 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reason");
    
    
    /**
     * Gets the "occurrenceId" element
     */
    public java.lang.String getOccurrenceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "occurrenceId" element
     */
    public boolean isNilOccurrenceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$0, 0);
            if (target == null) return false;
            return target.isNil();
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCEID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OCCURRENCEID$0);
            }
            target.set(occurrenceId);
        }
    }
    
    /**
     * Nils the "occurrenceId" element
     */
    public void setNilOccurrenceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OCCURRENCEID$0);
            }
            target.setNil();
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
     * Gets the "endTime" element
     */
    public java.util.Calendar getEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "endTime" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetEndTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(ENDTIME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endTime" element
     */
    public void setEndTime(java.util.Calendar endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$4);
            }
            target.setCalendarValue(endTime);
        }
    }
    
    /**
     * Sets (as xml) the "endTime" element
     */
    public void xsetEndTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT endTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(ENDTIME$4, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(ENDTIME$4);
            }
            target.set(endTime);
        }
    }
    
    /**
     * Gets the "result" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT.Enum getResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "result" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT xgetResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT)get_store().find_element_user(RESULT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "result" element
     */
    public void setResult(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT.Enum result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$6);
            }
            target.setEnumValue(result);
        }
    }
    
    /**
     * Sets (as xml) the "result" element
     */
    public void xsetResult(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT result)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT)get_store().find_element_user(RESULT$6, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOccurrenceCreationResultT)get_store().add_element_user(RESULT$6);
            }
            target.set(result);
        }
    }
    
    /**
     * Gets the "reason" element
     */
    public java.lang.String getReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "reason" element
     */
    public org.apache.xmlbeans.XmlString xgetReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reason" element
     */
    public void setReason(java.lang.String reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$8);
            }
            target.setStringValue(reason);
        }
    }
    
    /**
     * Sets (as xml) the "reason" element
     */
    public void xsetReason(org.apache.xmlbeans.XmlString reason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$8);
            }
            target.set(reason);
        }
    }
}
