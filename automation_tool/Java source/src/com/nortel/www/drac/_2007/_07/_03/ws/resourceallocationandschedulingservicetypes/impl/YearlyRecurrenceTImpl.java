/*
 * XML Type:  YearlyRecurrenceT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.YearlyRecurrenceT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML YearlyRecurrenceT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class YearlyRecurrenceTImpl extends com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl.RecurrenceTypeTImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.YearlyRecurrenceT
{
    
    public YearlyRecurrenceTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DAYOFMONTH$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "dayOfMonth");
    
    
    /**
     * Gets the "dayOfMonth" element
     */
    public java.util.Calendar getDayOfMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFMONTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dayOfMonth" element
     */
    public org.apache.xmlbeans.XmlGMonthDay xgetDayOfMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGMonthDay target = null;
            target = (org.apache.xmlbeans.XmlGMonthDay)get_store().find_element_user(DAYOFMONTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dayOfMonth" element
     */
    public void setDayOfMonth(java.util.Calendar dayOfMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYOFMONTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYOFMONTH$0);
            }
            target.setCalendarValue(dayOfMonth);
        }
    }
    
    /**
     * Sets (as xml) the "dayOfMonth" element
     */
    public void xsetDayOfMonth(org.apache.xmlbeans.XmlGMonthDay dayOfMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGMonthDay target = null;
            target = (org.apache.xmlbeans.XmlGMonthDay)get_store().find_element_user(DAYOFMONTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGMonthDay)get_store().add_element_user(DAYOFMONTH$0);
            }
            target.set(dayOfMonth);
        }
    }
}
