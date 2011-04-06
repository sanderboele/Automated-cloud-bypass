/*
 * An XML document type.
 * Localname: Credentials
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl;
/**
 * A document containing one Credentials(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes) element.
 *
 * This is a complex type.
 */
public class CredentialsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsDocument
{
    
    public CredentialsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREDENTIALS$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "Credentials");
    
    
    /**
     * Gets the "Credentials" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT getCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT)get_store().find_element_user(CREDENTIALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Credentials" element
     */
    public void setCredentials(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT credentials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT)get_store().find_element_user(CREDENTIALS$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT)get_store().add_element_user(CREDENTIALS$0);
            }
            target.set(credentials);
        }
    }
    
    /**
     * Appends and returns a new empty "Credentials" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT addNewCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CredentialsT)get_store().add_element_user(CREDENTIALS$0);
            return target;
        }
    }
}
