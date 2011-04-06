/*
 * XML Type:  ReservationScheduleInfoT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML ReservationScheduleInfoT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class ReservationScheduleInfoTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleInfoT
{
    
    public ReservationScheduleInfoTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULEID$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleId");
    private static final javax.xml.namespace.QName RESERVATIONSCHEDULENAME$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "reservationScheduleName");
    
    
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
     * Gets the "reservationScheduleName" element
     */
    public java.lang.String getReservationScheduleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULENAME$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVATIONSCHEDULENAME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESERVATIONSCHEDULENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESERVATIONSCHEDULENAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESERVATIONSCHEDULENAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESERVATIONSCHEDULENAME$2);
            }
            target.set(reservationScheduleName);
        }
    }
}
