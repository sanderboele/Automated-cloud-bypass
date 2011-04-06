/*
 * XML Type:  DracWsFaultT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl;
/**
 * An XML DracWsFaultT(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes).
 *
 * This is a complex type.
 */
public class DracWsFaultTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT
{
    
    public DracWsFaultTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORID$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "errorId");
    private static final javax.xml.namespace.QName ERRORMSG$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "errorMsg");
    
    
    /**
     * Gets the "errorId" element
     */
    public short getErrorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorId" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsErrorIdT xgetErrorId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsErrorIdT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsErrorIdT)get_store().find_element_user(ERRORID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "errorId" element
     */
    public void setErrorId(short errorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORID$0);
            }
            target.setShortValue(errorId);
        }
    }
    
    /**
     * Sets (as xml) the "errorId" element
     */
    public void xsetErrorId(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsErrorIdT errorId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsErrorIdT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsErrorIdT)get_store().find_element_user(ERRORID$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsErrorIdT)get_store().add_element_user(ERRORID$0);
            }
            target.set(errorId);
        }
    }
    
    /**
     * Gets the "errorMsg" element
     */
    public java.lang.String getErrorMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMSG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorMsg" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMSG$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "errorMsg" element
     */
    public void setErrorMsg(java.lang.String errorMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORMSG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORMSG$2);
            }
            target.setStringValue(errorMsg);
        }
    }
    
    /**
     * Sets (as xml) the "errorMsg" element
     */
    public void xsetErrorMsg(org.apache.xmlbeans.XmlString errorMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORMSG$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORMSG$2);
            }
            target.set(errorMsg);
        }
    }
}
