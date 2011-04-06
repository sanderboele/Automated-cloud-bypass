/*
 * XML Type:  CredentialsT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl;
/**
 * An XML CredentialsT(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes).
 *
 * This is a complex type.
 */
public class CredentialsTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT
{
    
    public CredentialsTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERID$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "userId");
    private static final javax.xml.namespace.QName CERTIFICATE$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "certificate");
    
    
    /**
     * Gets the "userId" element
     */
    public java.lang.String getUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userId" element
     */
    public org.apache.xmlbeans.XmlString xgetUserId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "userId" element
     */
    public void setUserId(java.lang.String userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$0);
            }
            target.setStringValue(userId);
        }
    }
    
    /**
     * Sets (as xml) the "userId" element
     */
    public void xsetUserId(org.apache.xmlbeans.XmlString userId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$0);
            }
            target.set(userId);
        }
    }
    
    /**
     * Gets the "certificate" element
     */
    public java.lang.String getCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERTIFICATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "certificate" element
     */
    public org.apache.xmlbeans.XmlString xgetCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CERTIFICATE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "certificate" element
     */
    public void setCertificate(java.lang.String certificate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERTIFICATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CERTIFICATE$2);
            }
            target.setStringValue(certificate);
        }
    }
    
    /**
     * Sets (as xml) the "certificate" element
     */
    public void xsetCertificate(org.apache.xmlbeans.XmlString certificate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CERTIFICATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CERTIFICATE$2);
            }
            target.set(certificate);
        }
    }
}
