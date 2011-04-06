/*
 * An XML document type.
 * Localname: QueryReservationOccurrencesResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryReservationOccurrencesResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryReservationOccurrencesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument
{
    
    public QueryReservationOccurrencesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYRESERVATIONOCCURRENCESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryReservationOccurrencesResponse");
    
    
    /**
     * Gets the "QueryReservationOccurrencesResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse getQueryReservationOccurrencesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse)get_store().find_element_user(QUERYRESERVATIONOCCURRENCESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryReservationOccurrencesResponse" element
     */
    public void setQueryReservationOccurrencesResponse(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse queryReservationOccurrencesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse)get_store().find_element_user(QUERYRESERVATIONOCCURRENCESRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse)get_store().add_element_user(QUERYRESERVATIONOCCURRENCESRESPONSE$0);
            }
            target.set(queryReservationOccurrencesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryReservationOccurrencesResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse addNewQueryReservationOccurrencesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse)get_store().add_element_user(QUERYRESERVATIONOCCURRENCESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML QueryReservationOccurrencesResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryReservationOccurrencesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryReservationOccurrencesResponseDocument.QueryReservationOccurrencesResponse
    {
        
        public QueryReservationOccurrencesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMOFELEMENTSINCLUDED$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "numOfElementsIncluded");
        private static final javax.xml.namespace.QName NUMOFELEMENTSFOUND$2 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "numOfElementsFound");
        private static final javax.xml.namespace.QName OCCURRENCEID$4 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "occurrenceId");
        
        
        /**
         * Gets the "numOfElementsIncluded" element
         */
        public int getNumOfElementsIncluded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numOfElementsIncluded" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumOfElementsIncluded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numOfElementsIncluded" element
         */
        public void setNumOfElementsIncluded(int numOfElementsIncluded)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMOFELEMENTSINCLUDED$0);
                }
                target.setIntValue(numOfElementsIncluded);
            }
        }
        
        /**
         * Sets (as xml) the "numOfElementsIncluded" element
         */
        public void xsetNumOfElementsIncluded(org.apache.xmlbeans.XmlInt numOfElementsIncluded)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSINCLUDED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMOFELEMENTSINCLUDED$0);
                }
                target.set(numOfElementsIncluded);
            }
        }
        
        /**
         * Gets the "numOfElementsFound" element
         */
        public int getNumOfElementsFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numOfElementsFound" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumOfElementsFound()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numOfElementsFound" element
         */
        public void setNumOfElementsFound(int numOfElementsFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMOFELEMENTSFOUND$2);
                }
                target.setIntValue(numOfElementsFound);
            }
        }
        
        /**
         * Sets (as xml) the "numOfElementsFound" element
         */
        public void xsetNumOfElementsFound(org.apache.xmlbeans.XmlInt numOfElementsFound)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMOFELEMENTSFOUND$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMOFELEMENTSFOUND$2);
                }
                target.set(numOfElementsFound);
            }
        }
        
        /**
         * Gets array of all "occurrenceId" elements
         */
        public java.lang.String[] getOccurrenceIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OCCURRENCEID$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "occurrenceId" element
         */
        public java.lang.String getOccurrenceIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "occurrenceId" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetOccurrenceIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OCCURRENCEID$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "occurrenceId" element
         */
        public org.apache.xmlbeans.XmlString xgetOccurrenceIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Tests for nil ith "occurrenceId" element
         */
        public boolean isNilOccurrenceIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "occurrenceId" element
         */
        public int sizeOfOccurrenceIdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OCCURRENCEID$4);
            }
        }
        
        /**
         * Sets array of all "occurrenceId" element
         */
        public void setOccurrenceIdArray(java.lang.String[] occurrenceIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(occurrenceIdArray, OCCURRENCEID$4);
            }
        }
        
        /**
         * Sets ith "occurrenceId" element
         */
        public void setOccurrenceIdArray(int i, java.lang.String occurrenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OCCURRENCEID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(occurrenceId);
            }
        }
        
        /**
         * Sets (as xml) array of all "occurrenceId" element
         */
        public void xsetOccurrenceIdArray(org.apache.xmlbeans.XmlString[]occurrenceIdArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(occurrenceIdArray, OCCURRENCEID$4);
            }
        }
        
        /**
         * Sets (as xml) ith "occurrenceId" element
         */
        public void xsetOccurrenceIdArray(int i, org.apache.xmlbeans.XmlString occurrenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(occurrenceId);
            }
        }
        
        /**
         * Nils the ith "occurrenceId" element
         */
        public void setNilOccurrenceIdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OCCURRENCEID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "occurrenceId" element
         */
        public void insertOccurrenceId(int i, java.lang.String occurrenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OCCURRENCEID$4, i);
                target.setStringValue(occurrenceId);
            }
        }
        
        /**
         * Appends the value as the last "occurrenceId" element
         */
        public void addOccurrenceId(java.lang.String occurrenceId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OCCURRENCEID$4);
                target.setStringValue(occurrenceId);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "occurrenceId" element
         */
        public org.apache.xmlbeans.XmlString insertNewOccurrenceId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(OCCURRENCEID$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "occurrenceId" element
         */
        public org.apache.xmlbeans.XmlString addNewOccurrenceId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OCCURRENCEID$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "occurrenceId" element
         */
        public void removeOccurrenceId(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OCCURRENCEID$4, i);
            }
        }
    }
}
