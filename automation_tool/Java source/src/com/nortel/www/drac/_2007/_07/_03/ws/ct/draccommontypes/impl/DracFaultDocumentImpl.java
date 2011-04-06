/*
 * An XML document type.
 * Localname: DracFault
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl;
/**
 * A document containing one DracFault(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes) element.
 *
 * This is a complex type.
 */
public class DracFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracFaultDocument
{
    
    public DracFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DRACFAULT$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "DracFault");
    
    
    /**
     * Gets the "DracFault" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT getDracFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT)get_store().find_element_user(DRACFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DracFault" element
     */
    public void setDracFault(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT dracFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT)get_store().find_element_user(DRACFAULT$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT)get_store().add_element_user(DRACFAULT$0);
            }
            target.set(dracFault);
        }
    }
    
    /**
     * Appends and returns a new empty "DracFault" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT addNewDracFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DracWsFaultT)get_store().add_element_user(DRACFAULT$0);
            return target;
        }
    }
}
