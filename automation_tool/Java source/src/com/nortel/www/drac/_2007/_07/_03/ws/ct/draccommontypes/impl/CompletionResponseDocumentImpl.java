/*
 * An XML document type.
 * Localname: CompletionResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.impl;
/**
 * A document containing one CompletionResponse(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes) element.
 *
 * This is a complex type.
 */
public class CompletionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument
{
    
    public CompletionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "CompletionResponse");
    
    
    /**
     * Gets the "CompletionResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse getCompletionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse)get_store().find_element_user(COMPLETIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompletionResponse" element
     */
    public void setCompletionResponse(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse completionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse)get_store().find_element_user(COMPLETIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse)get_store().add_element_user(COMPLETIONRESPONSE$0);
            }
            target.set(completionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CompletionResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse addNewCompletionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse)get_store().add_element_user(COMPLETIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CompletionResponse(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes).
     *
     * This is a complex type.
     */
    public static class CompletionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse
    {
        
        public CompletionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULT$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes", "result");
        
        
        /**
         * Gets the "result" element
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT.Enum getResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "result" element
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT xgetResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT)get_store().find_element_user(RESULT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "result" element
         */
        public void setResult(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT.Enum result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULT$0);
                }
                target.setEnumValue(result);
            }
        }
        
        /**
         * Sets (as xml) the "result" element
         */
        public void xsetResult(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT result)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT)get_store().find_element_user(RESULT$0, 0);
                if (target == null)
                {
                    target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT)get_store().add_element_user(RESULT$0);
                }
                target.set(result);
            }
        }
    }
}
