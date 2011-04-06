/*
 * An XML document type.
 * Localname: AuthenticationRequest
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl;
/**
 * A document containing one AuthenticationRequest(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes) element.
 *
 * This is a complex type.
 */
public class AuthenticationRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument
{
    
    public AuthenticationRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTICATIONREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "AuthenticationRequest");
    
    
    /**
     * Gets the "AuthenticationRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest getAuthenticationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest)get_store().find_element_user(AUTHENTICATIONREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthenticationRequest" element
     */
    public void setAuthenticationRequest(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest authenticationRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest)get_store().find_element_user(AUTHENTICATIONREQUEST$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest)get_store().add_element_user(AUTHENTICATIONREQUEST$0);
            }
            target.set(authenticationRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AuthenticationRequest" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest addNewAuthenticationRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest)get_store().add_element_user(AUTHENTICATIONREQUEST$0);
            return target;
        }
    }
    /**
     * An XML AuthenticationRequest(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes).
     *
     * This is a complex type.
     */
    public static class AuthenticationRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AuthenticationRequestDocument.AuthenticationRequest
    {
        
        public AuthenticationRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CREDENTIALS$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "credentials");
        
        
        /**
         * Gets the "credentials" element
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
         * Sets the "credentials" element
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
         * Appends and returns a new empty "credentials" element
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
}
