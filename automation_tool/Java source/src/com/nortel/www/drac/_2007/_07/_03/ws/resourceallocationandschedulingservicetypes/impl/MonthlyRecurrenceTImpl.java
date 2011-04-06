/*
 * XML Type:  MonthlyRecurrenceT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.MonthlyRecurrenceT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML MonthlyRecurrenceT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class MonthlyRecurrenceTImpl extends com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl.RecurrenceTypeTImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.MonthlyRecurrenceT
{
    
    public MonthlyRecurrenceTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAY$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "day");
    
    
    /**
     * Gets the "day" element
     */
    public java.util.Calendar getDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "day" element
     */
    public org.apache.xmlbeans.XmlGDay xgetDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGDay target = null;
            target = (org.apache.xmlbeans.XmlGDay)get_store().find_element_user(DAY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "day" element
     */
    public void setDay(java.util.Calendar day)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAY$0);
            }
            target.setCalendarValue(day);
        }
    }
    
    /**
     * Sets (as xml) the "day" element
     */
    public void xsetDay(org.apache.xmlbeans.XmlGDay day)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGDay target = null;
            target = (org.apache.xmlbeans.XmlGDay)get_store().find_element_user(DAY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGDay)get_store().add_element_user(DAY$0);
            }
            target.set(day);
        }
    }
}
