/*
 * XML Type:  UserInfoT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML UserInfoT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class UserInfoTImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT
{
    
    public UserInfoTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BILLINGGROUP$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "billingGroup");
    private static final javax.xml.namespace.QName SOURCEENDPOINTRESOURCEGROUP$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "sourceEndpointResourceGroup");
    private static final javax.xml.namespace.QName TARGETENDPOINTRESOURCEGROUP$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "targetEndpointResourceGroup");
    private static final javax.xml.namespace.QName SOURCEENDPOINTUSERGROUP$6 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "sourceEndpointUserGroup");
    private static final javax.xml.namespace.QName TARGETENDPOINTUSERGROUP$8 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "targetEndpointUserGroup");
    private static final javax.xml.namespace.QName EMAILADDRESS$10 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "emailAddress");
    
    
    /**
     * Gets the "billingGroup" element
     */
    public java.lang.String getBillingGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLINGGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "billingGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetBillingGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLINGGROUP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "billingGroup" element
     */
    public void setBillingGroup(java.lang.String billingGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BILLINGGROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BILLINGGROUP$0);
            }
            target.setStringValue(billingGroup);
        }
    }
    
    /**
     * Sets (as xml) the "billingGroup" element
     */
    public void xsetBillingGroup(org.apache.xmlbeans.XmlString billingGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BILLINGGROUP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BILLINGGROUP$0);
            }
            target.set(billingGroup);
        }
    }
    
    /**
     * Gets the "sourceEndpointResourceGroup" element
     */
    public java.lang.String getSourceEndpointResourceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENDPOINTRESOURCEGROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceEndpointResourceGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceEndpointResourceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENDPOINTRESOURCEGROUP$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceEndpointResourceGroup" element
     */
    public void setSourceEndpointResourceGroup(java.lang.String sourceEndpointResourceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENDPOINTRESOURCEGROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEENDPOINTRESOURCEGROUP$2);
            }
            target.setStringValue(sourceEndpointResourceGroup);
        }
    }
    
    /**
     * Sets (as xml) the "sourceEndpointResourceGroup" element
     */
    public void xsetSourceEndpointResourceGroup(org.apache.xmlbeans.XmlString sourceEndpointResourceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENDPOINTRESOURCEGROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEENDPOINTRESOURCEGROUP$2);
            }
            target.set(sourceEndpointResourceGroup);
        }
    }
    
    /**
     * Gets the "targetEndpointResourceGroup" element
     */
    public java.lang.String getTargetEndpointResourceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENDPOINTRESOURCEGROUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetEndpointResourceGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetEndpointResourceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENDPOINTRESOURCEGROUP$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetEndpointResourceGroup" element
     */
    public void setTargetEndpointResourceGroup(java.lang.String targetEndpointResourceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENDPOINTRESOURCEGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETENDPOINTRESOURCEGROUP$4);
            }
            target.setStringValue(targetEndpointResourceGroup);
        }
    }
    
    /**
     * Sets (as xml) the "targetEndpointResourceGroup" element
     */
    public void xsetTargetEndpointResourceGroup(org.apache.xmlbeans.XmlString targetEndpointResourceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENDPOINTRESOURCEGROUP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETENDPOINTRESOURCEGROUP$4);
            }
            target.set(targetEndpointResourceGroup);
        }
    }
    
    /**
     * Gets the "sourceEndpointUserGroup" element
     */
    public java.lang.String getSourceEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENDPOINTUSERGROUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceEndpointUserGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENDPOINTUSERGROUP$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "sourceEndpointUserGroup" element
     */
    public boolean isNilSourceEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENDPOINTUSERGROUP$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "sourceEndpointUserGroup" element
     */
    public void setSourceEndpointUserGroup(java.lang.String sourceEndpointUserGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEENDPOINTUSERGROUP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEENDPOINTUSERGROUP$6);
            }
            target.setStringValue(sourceEndpointUserGroup);
        }
    }
    
    /**
     * Sets (as xml) the "sourceEndpointUserGroup" element
     */
    public void xsetSourceEndpointUserGroup(org.apache.xmlbeans.XmlString sourceEndpointUserGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENDPOINTUSERGROUP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEENDPOINTUSERGROUP$6);
            }
            target.set(sourceEndpointUserGroup);
        }
    }
    
    /**
     * Nils the "sourceEndpointUserGroup" element
     */
    public void setNilSourceEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEENDPOINTUSERGROUP$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEENDPOINTUSERGROUP$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "targetEndpointUserGroup" element
     */
    public java.lang.String getTargetEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENDPOINTUSERGROUP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetEndpointUserGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENDPOINTUSERGROUP$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "targetEndpointUserGroup" element
     */
    public boolean isNilTargetEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENDPOINTUSERGROUP$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "targetEndpointUserGroup" element
     */
    public void setTargetEndpointUserGroup(java.lang.String targetEndpointUserGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETENDPOINTUSERGROUP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETENDPOINTUSERGROUP$8);
            }
            target.setStringValue(targetEndpointUserGroup);
        }
    }
    
    /**
     * Sets (as xml) the "targetEndpointUserGroup" element
     */
    public void xsetTargetEndpointUserGroup(org.apache.xmlbeans.XmlString targetEndpointUserGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENDPOINTUSERGROUP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETENDPOINTUSERGROUP$8);
            }
            target.set(targetEndpointUserGroup);
        }
    }
    
    /**
     * Nils the "targetEndpointUserGroup" element
     */
    public void setNilTargetEndpointUserGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETENDPOINTUSERGROUP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETENDPOINTUSERGROUP$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "emailAddress" element
     */
    public java.lang.String getEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "emailAddress" element
     */
    public boolean isNilEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "emailAddress" element
     */
    public void setEmailAddress(java.lang.String emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILADDRESS$10);
            }
            target.setStringValue(emailAddress);
        }
    }
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    public void xsetEmailAddress(org.apache.xmlbeans.XmlString emailAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS$10);
            }
            target.set(emailAddress);
        }
    }
    
    /**
     * Nils the "emailAddress" element
     */
    public void setNilEmailAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILADDRESS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILADDRESS$10);
            }
            target.setNil();
        }
    }
}
