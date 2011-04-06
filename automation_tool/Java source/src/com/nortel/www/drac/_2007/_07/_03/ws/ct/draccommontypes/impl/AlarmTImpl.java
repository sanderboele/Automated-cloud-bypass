/*
 * XML Type:  AlarmT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl;
/**
 * An XML AlarmT(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes).
 *
 * This is a complex type.
 */
public class AlarmTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT
{
    
    public AlarmTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALARMID$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "alarmId");
    private static final javax.xml.namespace.QName ALARMSOURCEID$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "alarmSourceId");
    private static final javax.xml.namespace.QName SEVERITY$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "severity");
    private static final javax.xml.namespace.QName TIMERAISED$6 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "timeRaised");
    private static final javax.xml.namespace.QName ISCLEARED$8 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "isCleared");
    private static final javax.xml.namespace.QName TIMECLEARED$10 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "timeCleared");
    private static final javax.xml.namespace.QName DESCRIPTION$12 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "description");
    private static final javax.xml.namespace.QName ADDITIONALINFO$14 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "additionalInfo");
    
    
    /**
     * Gets the "alarmId" element
     */
    public java.lang.String getAlarmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALARMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alarmId" element
     */
    public org.apache.xmlbeans.XmlString xgetAlarmId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALARMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "alarmId" element
     */
    public void setAlarmId(java.lang.String alarmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALARMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALARMID$0);
            }
            target.setStringValue(alarmId);
        }
    }
    
    /**
     * Sets (as xml) the "alarmId" element
     */
    public void xsetAlarmId(org.apache.xmlbeans.XmlString alarmId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALARMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALARMID$0);
            }
            target.set(alarmId);
        }
    }
    
    /**
     * Gets the "alarmSourceId" element
     */
    public java.lang.String getAlarmSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALARMSOURCEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alarmSourceId" element
     */
    public org.apache.xmlbeans.XmlString xgetAlarmSourceId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALARMSOURCEID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "alarmSourceId" element
     */
    public void setAlarmSourceId(java.lang.String alarmSourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALARMSOURCEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALARMSOURCEID$2);
            }
            target.setStringValue(alarmSourceId);
        }
    }
    
    /**
     * Sets (as xml) the "alarmSourceId" element
     */
    public void xsetAlarmSourceId(org.apache.xmlbeans.XmlString alarmSourceId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALARMSOURCEID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALARMSOURCEID$2);
            }
            target.set(alarmSourceId);
        }
    }
    
    /**
     * Gets the "severity" element
     */
    public java.lang.String getSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "severity" element
     */
    public org.apache.xmlbeans.XmlString xgetSeverity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEVERITY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "severity" element
     */
    public void setSeverity(java.lang.String severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITY$4);
            }
            target.setStringValue(severity);
        }
    }
    
    /**
     * Sets (as xml) the "severity" element
     */
    public void xsetSeverity(org.apache.xmlbeans.XmlString severity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEVERITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEVERITY$4);
            }
            target.set(severity);
        }
    }
    
    /**
     * Gets the "timeRaised" element
     */
    public java.util.Calendar getTimeRaised()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMERAISED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeRaised" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimeRaised()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMERAISED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "timeRaised" element
     */
    public void setTimeRaised(java.util.Calendar timeRaised)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMERAISED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMERAISED$6);
            }
            target.setCalendarValue(timeRaised);
        }
    }
    
    /**
     * Sets (as xml) the "timeRaised" element
     */
    public void xsetTimeRaised(org.apache.xmlbeans.XmlDateTime timeRaised)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMERAISED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMERAISED$6);
            }
            target.set(timeRaised);
        }
    }
    
    /**
     * Gets the "isCleared" element
     */
    public boolean getIsCleared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLEARED$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isCleared" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsCleared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLEARED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isCleared" element
     */
    public void setIsCleared(boolean isCleared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISCLEARED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISCLEARED$8);
            }
            target.setBooleanValue(isCleared);
        }
    }
    
    /**
     * Sets (as xml) the "isCleared" element
     */
    public void xsetIsCleared(org.apache.xmlbeans.XmlBoolean isCleared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISCLEARED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISCLEARED$8);
            }
            target.set(isCleared);
        }
    }
    
    /**
     * Gets the "timeCleared" element
     */
    public java.util.Calendar getTimeCleared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECLEARED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "timeCleared" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTimeCleared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMECLEARED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "timeCleared" element
     */
    public boolean isSetTimeCleared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECLEARED$10) != 0;
        }
    }
    
    /**
     * Sets the "timeCleared" element
     */
    public void setTimeCleared(java.util.Calendar timeCleared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMECLEARED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMECLEARED$10);
            }
            target.setCalendarValue(timeCleared);
        }
    }
    
    /**
     * Sets (as xml) the "timeCleared" element
     */
    public void xsetTimeCleared(org.apache.xmlbeans.XmlDateTime timeCleared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMECLEARED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMECLEARED$10);
            }
            target.set(timeCleared);
        }
    }
    
    /**
     * Unsets the "timeCleared" element
     */
    public void unsetTimeCleared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECLEARED$10, 0);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$12);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$12);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "additionalInfo" element
     */
    public java.lang.String getAdditionalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "additionalInfo" element
     */
    public org.apache.xmlbeans.XmlString xgetAdditionalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "additionalInfo" element
     */
    public boolean isSetAdditionalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALINFO$14) != 0;
        }
    }
    
    /**
     * Sets the "additionalInfo" element
     */
    public void setAdditionalInfo(java.lang.String additionalInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONALINFO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONALINFO$14);
            }
            target.setStringValue(additionalInfo);
        }
    }
    
    /**
     * Sets (as xml) the "additionalInfo" element
     */
    public void xsetAdditionalInfo(org.apache.xmlbeans.XmlString additionalInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONALINFO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONALINFO$14);
            }
            target.set(additionalInfo);
        }
    }
    
    /**
     * Unsets the "additionalInfo" element
     */
    public void unsetAdditionalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALINFO$14, 0);
        }
    }
}
