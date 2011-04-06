/*
 * XML Type:  QueryAlarmsByDateTimeAndUserGroupT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsByDateTimeAndUserGroupT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML QueryAlarmsByDateTimeAndUserGroupT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class QueryAlarmsByDateTimeAndUserGroupTImpl extends com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl.QueryCriteriaTImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsByDateTimeAndUserGroupT
{
    
    public QueryAlarmsByDateTimeAndUserGroupTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTTIME$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "startTime");
    private static final javax.xml.namespace.QName ENDTIME$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "endTime");
    private static final javax.xml.namespace.QName USERGROUP$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "userGroup");
    
    
    /**
     * Gets the "startTime" element
     */
    public java.util.Calendar getStartTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
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
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(STARTTIME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTTIME$0);
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
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(STARTTIME$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(STARTTIME$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
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
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(ENDTIME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDTIME$2);
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
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().find_element_user(ENDTIME$2, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT)get_store().add_element_user(ENDTIME$2);
            }
            target.set(endTime);
        }
    }
    
    /**
     * Gets the "userGroup" element
     */
    public java.lang.String getUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERGROUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERGROUP$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "userGroup" element
     */
    public boolean isNilUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERGROUP$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "userGroup" element
     */
    public void setUserGroup(java.lang.String userGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERGROUP$4);
            }
            target.setStringValue(userGroup);
        }
    }
    
    /**
     * Sets (as xml) the "userGroup" element
     */
    public void xsetUserGroup(org.apache.xmlbeans.XmlString userGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERGROUP$4);
            }
            target.set(userGroup);
        }
    }
    
    /**
     * Nils the "userGroup" element
     */
    public void setNilUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERGROUP$4);
            }
            target.setNil();
        }
    }
}
