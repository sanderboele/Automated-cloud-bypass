/*
 * XML Type:  WeeklyRecurrenceT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.WeeklyRecurrenceT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML WeeklyRecurrenceT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class WeeklyRecurrenceTImpl extends com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl.RecurrenceTypeTImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.WeeklyRecurrenceT
{
    
    public WeeklyRecurrenceTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEEKDAY$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "weekday");
    
    
    /**
     * Gets array of all "weekday" elements
     */
    public int[] getWeekdayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEEKDAY$0, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "weekday" element
     */
    public int getWeekdayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKDAY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "weekday" elements
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT[] xgetWeekdayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEEKDAY$0, targetList);
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT[] result = new com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "weekday" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT xgetWeekdayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT)get_store().find_element_user(WEEKDAY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT)target;
        }
    }
    
    /**
     * Returns number of "weekday" element
     */
    public int sizeOfWeekdayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEEKDAY$0);
        }
    }
    
    /**
     * Sets array of all "weekday" element
     */
    public void setWeekdayArray(int[] weekdayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(weekdayArray, WEEKDAY$0);
        }
    }
    
    /**
     * Sets ith "weekday" element
     */
    public void setWeekdayArray(int i, int weekday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEEKDAY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(weekday);
        }
    }
    
    /**
     * Sets (as xml) array of all "weekday" element
     */
    public void xsetWeekdayArray(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT[]weekdayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(weekdayArray, WEEKDAY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "weekday" element
     */
    public void xsetWeekdayArray(int i, com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT weekday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT)get_store().find_element_user(WEEKDAY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(weekday);
        }
    }
    
    /**
     * Inserts the value as the ith "weekday" element
     */
    public void insertWeekday(int i, int weekday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WEEKDAY$0, i);
            target.setIntValue(weekday);
        }
    }
    
    /**
     * Appends the value as the last "weekday" element
     */
    public void addWeekday(int weekday)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEEKDAY$0);
            target.setIntValue(weekday);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "weekday" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT insertNewWeekday(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT)get_store().insert_element_user(WEEKDAY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "weekday" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT addNewWeekday()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.WeekdayT)get_store().add_element_user(WEEKDAY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "weekday" element
     */
    public void removeWeekday(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEEKDAY$0, i);
        }
    }
}
