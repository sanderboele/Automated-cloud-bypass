/*
 * An XML document type.
 * Localname: QueryAlarmsResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * A document containing one QueryAlarmsResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public class QueryAlarmsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument
{
    
    public QueryAlarmsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERYALARMSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "QueryAlarmsResponse");
    
    
    /**
     * Gets the "QueryAlarmsResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse getQueryAlarmsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse)get_store().find_element_user(QUERYALARMSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "QueryAlarmsResponse" element
     */
    public void setQueryAlarmsResponse(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse queryAlarmsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse)get_store().find_element_user(QUERYALARMSRESPONSE$0, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse)get_store().add_element_user(QUERYALARMSRESPONSE$0);
            }
            target.set(queryAlarmsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "QueryAlarmsResponse" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse addNewQueryAlarmsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse)get_store().add_element_user(QUERYALARMSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML QueryAlarmsResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public static class QueryAlarmsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.QueryAlarmsResponseDocument.QueryAlarmsResponse
    {
        
        public QueryAlarmsResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMOFELEMENTSINCLUDED$0 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "numOfElementsIncluded");
        private static final javax.xml.namespace.QName NUMOFELEMENTSFOUND$2 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "numOfElementsFound");
        private static final javax.xml.namespace.QName ALARM$4 = 
            new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "alarm");
        
        
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
         * Gets array of all "alarm" elements
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT[] getAlarmArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALARM$4, targetList);
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT[] result = new com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alarm" element
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT getAlarmArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT)get_store().find_element_user(ALARM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "alarm" element
         */
        public boolean isNilAlarmArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT)get_store().find_element_user(ALARM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "alarm" element
         */
        public int sizeOfAlarmArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALARM$4);
            }
        }
        
        /**
         * Sets array of all "alarm" element
         */
        public void setAlarmArray(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT[] alarmArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(alarmArray, ALARM$4);
            }
        }
        
        /**
         * Sets ith "alarm" element
         */
        public void setAlarmArray(int i, com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT alarm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT)get_store().find_element_user(ALARM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(alarm);
            }
        }
        
        /**
         * Nils the ith "alarm" element
         */
        public void setNilAlarmArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT)get_store().find_element_user(ALARM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alarm" element
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT insertNewAlarm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT)get_store().insert_element_user(ALARM$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alarm" element
         */
        public com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT addNewAlarm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT target = null;
                target = (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT)get_store().add_element_user(ALARM$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "alarm" element
         */
        public void removeAlarm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALARM$4, i);
            }
        }
    }
}
