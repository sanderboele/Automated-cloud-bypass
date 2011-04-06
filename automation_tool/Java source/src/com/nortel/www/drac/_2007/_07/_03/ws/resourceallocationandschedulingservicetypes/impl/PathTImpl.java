/*
 * XML Type:  PathT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl;
/**
 * An XML PathT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public class PathTImpl extends com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.impl.ResourceTImpl implements com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT
{
    
    public PathTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCETNA$0 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "sourceTna");
    private static final javax.xml.namespace.QName TARGETTNA$2 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "targetTna");
    private static final javax.xml.namespace.QName SOURCECHANNEL$4 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "sourceChannel");
    private static final javax.xml.namespace.QName TARGETCHANNEL$6 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "targetChannel");
    private static final javax.xml.namespace.QName SOURCEVLANID$8 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "source_vlanId");
    private static final javax.xml.namespace.QName TARGETVLANID$10 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "target_vlanId");
    private static final javax.xml.namespace.QName RATE$12 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "rate");
    private static final javax.xml.namespace.QName SRLGEXCLUSIONS$14 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "srlgExclusions");
    private static final javax.xml.namespace.QName SRLGINCLUSIONS$16 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "srlgInclusions");
    private static final javax.xml.namespace.QName COST$18 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "cost");
    private static final javax.xml.namespace.QName METRIC$20 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "metric");
    private static final javax.xml.namespace.QName HOP$22 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "hop");
    private static final javax.xml.namespace.QName ROUTINGMETRIC$24 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "routingMetric");
    private static final javax.xml.namespace.QName ROUTINGALGORITHM$26 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "routingAlgorithm");
    private static final javax.xml.namespace.QName PROTECTIONTYPE$28 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "protectionType");
    private static final javax.xml.namespace.QName SHAREDRISKRESERVATIONOCCURRENCEGROUP$30 = 
        new javax.xml.namespace.QName("http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes", "sharedRiskReservationOccurrenceGroup");
    
    
    /**
     * Gets the "sourceTna" element
     */
    public java.lang.String getSourceTna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETNA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceTna" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceTna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETNA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sourceTna" element
     */
    public void setSourceTna(java.lang.String sourceTna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCETNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCETNA$0);
            }
            target.setStringValue(sourceTna);
        }
    }
    
    /**
     * Sets (as xml) the "sourceTna" element
     */
    public void xsetSourceTna(org.apache.xmlbeans.XmlString sourceTna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCETNA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCETNA$0);
            }
            target.set(sourceTna);
        }
    }
    
    /**
     * Gets the "targetTna" element
     */
    public java.lang.String getTargetTna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTNA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetTna" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetTna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTNA$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetTna" element
     */
    public void setTargetTna(java.lang.String targetTna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETTNA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETTNA$2);
            }
            target.setStringValue(targetTna);
        }
    }
    
    /**
     * Sets (as xml) the "targetTna" element
     */
    public void xsetTargetTna(org.apache.xmlbeans.XmlString targetTna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETTNA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETTNA$2);
            }
            target.set(targetTna);
        }
    }
    
    /**
     * Gets the "sourceChannel" element
     */
    public int getSourceChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCECHANNEL$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "sourceChannel" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT xgetSourceChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(SOURCECHANNEL$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "sourceChannel" element
     */
    public boolean isNilSourceChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(SOURCECHANNEL$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "sourceChannel" element
     */
    public boolean isSetSourceChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCECHANNEL$4) != 0;
        }
    }
    
    /**
     * Sets the "sourceChannel" element
     */
    public void setSourceChannel(int sourceChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCECHANNEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCECHANNEL$4);
            }
            target.setIntValue(sourceChannel);
        }
    }
    
    /**
     * Sets (as xml) the "sourceChannel" element
     */
    public void xsetSourceChannel(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT sourceChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(SOURCECHANNEL$4, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().add_element_user(SOURCECHANNEL$4);
            }
            target.set(sourceChannel);
        }
    }
    
    /**
     * Nils the "sourceChannel" element
     */
    public void setNilSourceChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(SOURCECHANNEL$4, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().add_element_user(SOURCECHANNEL$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "sourceChannel" element
     */
    public void unsetSourceChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCECHANNEL$4, 0);
        }
    }
    
    /**
     * Gets the "targetChannel" element
     */
    public int getTargetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCHANNEL$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetChannel" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT xgetTargetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(TARGETCHANNEL$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "targetChannel" element
     */
    public boolean isNilTargetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(TARGETCHANNEL$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "targetChannel" element
     */
    public boolean isSetTargetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETCHANNEL$6) != 0;
        }
    }
    
    /**
     * Sets the "targetChannel" element
     */
    public void setTargetChannel(int targetChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETCHANNEL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETCHANNEL$6);
            }
            target.setIntValue(targetChannel);
        }
    }
    
    /**
     * Sets (as xml) the "targetChannel" element
     */
    public void xsetTargetChannel(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT targetChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(TARGETCHANNEL$6, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().add_element_user(TARGETCHANNEL$6);
            }
            target.set(targetChannel);
        }
    }
    
    /**
     * Nils the "targetChannel" element
     */
    public void setNilTargetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().find_element_user(TARGETCHANNEL$6, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT)get_store().add_element_user(TARGETCHANNEL$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "targetChannel" element
     */
    public void unsetTargetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETCHANNEL$6, 0);
        }
    }
    
    /**
     * Gets the "source_vlanId" element
     */
    public java.lang.String getSourceVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEVLANID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source_vlanId" element
     */
    public org.apache.xmlbeans.XmlString xgetSourceVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEVLANID$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "source_vlanId" element
     */
    public boolean isNilSourceVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEVLANID$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "source_vlanId" element
     */
    public boolean isSetSourceVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEVLANID$8) != 0;
        }
    }
    
    /**
     * Sets the "source_vlanId" element
     */
    public void setSourceVlanId(java.lang.String sourceVlanId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEVLANID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEVLANID$8);
            }
            target.setStringValue(sourceVlanId);
        }
    }
    
    /**
     * Sets (as xml) the "source_vlanId" element
     */
    public void xsetSourceVlanId(org.apache.xmlbeans.XmlString sourceVlanId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEVLANID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEVLANID$8);
            }
            target.set(sourceVlanId);
        }
    }
    
    /**
     * Nils the "source_vlanId" element
     */
    public void setNilSourceVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCEVLANID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCEVLANID$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "source_vlanId" element
     */
    public void unsetSourceVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEVLANID$8, 0);
        }
    }
    
    /**
     * Gets the "target_vlanId" element
     */
    public java.lang.String getTargetVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETVLANID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "target_vlanId" element
     */
    public org.apache.xmlbeans.XmlString xgetTargetVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETVLANID$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "target_vlanId" element
     */
    public boolean isNilTargetVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETVLANID$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "target_vlanId" element
     */
    public boolean isSetTargetVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETVLANID$10) != 0;
        }
    }
    
    /**
     * Sets the "target_vlanId" element
     */
    public void setTargetVlanId(java.lang.String targetVlanId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETVLANID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETVLANID$10);
            }
            target.setStringValue(targetVlanId);
        }
    }
    
    /**
     * Sets (as xml) the "target_vlanId" element
     */
    public void xsetTargetVlanId(org.apache.xmlbeans.XmlString targetVlanId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETVLANID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETVLANID$10);
            }
            target.set(targetVlanId);
        }
    }
    
    /**
     * Nils the "target_vlanId" element
     */
    public void setNilTargetVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TARGETVLANID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TARGETVLANID$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "target_vlanId" element
     */
    public void unsetTargetVlanId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETVLANID$10, 0);
        }
    }
    
    /**
     * Gets the "rate" element
     */
    public int getRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATE$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "rate" element
     */
    public org.apache.xmlbeans.XmlInt xgetRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RATE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rate" element
     */
    public void setRate(int rate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RATE$12);
            }
            target.setIntValue(rate);
        }
    }
    
    /**
     * Sets (as xml) the "rate" element
     */
    public void xsetRate(org.apache.xmlbeans.XmlInt rate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(RATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(RATE$12);
            }
            target.set(rate);
        }
    }
    
    /**
     * Gets the "srlgExclusions" element
     */
    public java.lang.String getSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRLGEXCLUSIONS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "srlgExclusions" element
     */
    public org.apache.xmlbeans.XmlString xgetSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$14, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "srlgExclusions" element
     */
    public boolean isNilSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$14, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "srlgExclusions" element
     */
    public boolean isSetSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRLGEXCLUSIONS$14) != 0;
        }
    }
    
    /**
     * Sets the "srlgExclusions" element
     */
    public void setSrlgExclusions(java.lang.String srlgExclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRLGEXCLUSIONS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRLGEXCLUSIONS$14);
            }
            target.setStringValue(srlgExclusions);
        }
    }
    
    /**
     * Sets (as xml) the "srlgExclusions" element
     */
    public void xsetSrlgExclusions(org.apache.xmlbeans.XmlString srlgExclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRLGEXCLUSIONS$14);
            }
            target.set(srlgExclusions);
        }
    }
    
    /**
     * Nils the "srlgExclusions" element
     */
    public void setNilSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGEXCLUSIONS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRLGEXCLUSIONS$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "srlgExclusions" element
     */
    public void unsetSrlgExclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRLGEXCLUSIONS$14, 0);
        }
    }
    
    /**
     * Gets the "srlgInclusions" element
     */
    public java.lang.String getSrlgInclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRLGINCLUSIONS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "srlgInclusions" element
     */
    public org.apache.xmlbeans.XmlString xgetSrlgInclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGINCLUSIONS$16, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "srlgInclusions" element
     */
    public boolean isNilSrlgInclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGINCLUSIONS$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "srlgInclusions" element
     */
    public boolean isSetSrlgInclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRLGINCLUSIONS$16) != 0;
        }
    }
    
    /**
     * Sets the "srlgInclusions" element
     */
    public void setSrlgInclusions(java.lang.String srlgInclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRLGINCLUSIONS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRLGINCLUSIONS$16);
            }
            target.setStringValue(srlgInclusions);
        }
    }
    
    /**
     * Sets (as xml) the "srlgInclusions" element
     */
    public void xsetSrlgInclusions(org.apache.xmlbeans.XmlString srlgInclusions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGINCLUSIONS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRLGINCLUSIONS$16);
            }
            target.set(srlgInclusions);
        }
    }
    
    /**
     * Nils the "srlgInclusions" element
     */
    public void setNilSrlgInclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRLGINCLUSIONS$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRLGINCLUSIONS$16);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "srlgInclusions" element
     */
    public void unsetSrlgInclusions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRLGINCLUSIONS$16, 0);
        }
    }
    
    /**
     * Gets the "cost" element
     */
    public int getCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COST$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cost" element
     */
    public org.apache.xmlbeans.XmlInt xgetCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COST$18, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "cost" element
     */
    public boolean isNilCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COST$18, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "cost" element
     */
    public boolean isSetCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COST$18) != 0;
        }
    }
    
    /**
     * Sets the "cost" element
     */
    public void setCost(int cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COST$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COST$18);
            }
            target.setIntValue(cost);
        }
    }
    
    /**
     * Sets (as xml) the "cost" element
     */
    public void xsetCost(org.apache.xmlbeans.XmlInt cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COST$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COST$18);
            }
            target.set(cost);
        }
    }
    
    /**
     * Nils the "cost" element
     */
    public void setNilCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(COST$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(COST$18);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "cost" element
     */
    public void unsetCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COST$18, 0);
        }
    }
    
    /**
     * Gets the "metric" element
     */
    public int getMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METRIC$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "metric" element
     */
    public org.apache.xmlbeans.XmlInt xgetMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METRIC$20, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "metric" element
     */
    public boolean isNilMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METRIC$20, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "metric" element
     */
    public boolean isSetMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METRIC$20) != 0;
        }
    }
    
    /**
     * Sets the "metric" element
     */
    public void setMetric(int metric)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METRIC$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METRIC$20);
            }
            target.setIntValue(metric);
        }
    }
    
    /**
     * Sets (as xml) the "metric" element
     */
    public void xsetMetric(org.apache.xmlbeans.XmlInt metric)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METRIC$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(METRIC$20);
            }
            target.set(metric);
        }
    }
    
    /**
     * Nils the "metric" element
     */
    public void setNilMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(METRIC$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(METRIC$20);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "metric" element
     */
    public void unsetMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METRIC$20, 0);
        }
    }
    
    /**
     * Gets the "hop" element
     */
    public int getHop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOP$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "hop" element
     */
    public org.apache.xmlbeans.XmlInt xgetHop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOP$22, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "hop" element
     */
    public boolean isNilHop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOP$22, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "hop" element
     */
    public boolean isSetHop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOP$22) != 0;
        }
    }
    
    /**
     * Sets the "hop" element
     */
    public void setHop(int hop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOP$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOP$22);
            }
            target.setIntValue(hop);
        }
    }
    
    /**
     * Sets (as xml) the "hop" element
     */
    public void xsetHop(org.apache.xmlbeans.XmlInt hop)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOP$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOP$22);
            }
            target.set(hop);
        }
    }
    
    /**
     * Nils the "hop" element
     */
    public void setNilHop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HOP$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HOP$22);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "hop" element
     */
    public void unsetHop()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOP$22, 0);
        }
    }
    
    /**
     * Gets the "routingMetric" element
     */
    public int getRoutingMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTINGMETRIC$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "routingMetric" element
     */
    public org.apache.xmlbeans.XmlInt xgetRoutingMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROUTINGMETRIC$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "routingMetric" element
     */
    public boolean isNilRoutingMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROUTINGMETRIC$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "routingMetric" element
     */
    public boolean isSetRoutingMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTINGMETRIC$24) != 0;
        }
    }
    
    /**
     * Sets the "routingMetric" element
     */
    public void setRoutingMetric(int routingMetric)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTINGMETRIC$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROUTINGMETRIC$24);
            }
            target.setIntValue(routingMetric);
        }
    }
    
    /**
     * Sets (as xml) the "routingMetric" element
     */
    public void xsetRoutingMetric(org.apache.xmlbeans.XmlInt routingMetric)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROUTINGMETRIC$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ROUTINGMETRIC$24);
            }
            target.set(routingMetric);
        }
    }
    
    /**
     * Nils the "routingMetric" element
     */
    public void setNilRoutingMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ROUTINGMETRIC$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ROUTINGMETRIC$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "routingMetric" element
     */
    public void unsetRoutingMetric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTINGMETRIC$24, 0);
        }
    }
    
    /**
     * Gets the "routingAlgorithm" element
     */
    public java.lang.String getRoutingAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTINGALGORITHM$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "routingAlgorithm" element
     */
    public org.apache.xmlbeans.XmlString xgetRoutingAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROUTINGALGORITHM$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "routingAlgorithm" element
     */
    public boolean isNilRoutingAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROUTINGALGORITHM$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "routingAlgorithm" element
     */
    public boolean isSetRoutingAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROUTINGALGORITHM$26) != 0;
        }
    }
    
    /**
     * Sets the "routingAlgorithm" element
     */
    public void setRoutingAlgorithm(java.lang.String routingAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROUTINGALGORITHM$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROUTINGALGORITHM$26);
            }
            target.setStringValue(routingAlgorithm);
        }
    }
    
    /**
     * Sets (as xml) the "routingAlgorithm" element
     */
    public void xsetRoutingAlgorithm(org.apache.xmlbeans.XmlString routingAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROUTINGALGORITHM$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROUTINGALGORITHM$26);
            }
            target.set(routingAlgorithm);
        }
    }
    
    /**
     * Nils the "routingAlgorithm" element
     */
    public void setNilRoutingAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ROUTINGALGORITHM$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ROUTINGALGORITHM$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "routingAlgorithm" element
     */
    public void unsetRoutingAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROUTINGALGORITHM$26, 0);
        }
    }
    
    /**
     * Gets the "protectionType" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT.Enum getProtectionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTECTIONTYPE$28, 0);
            if (target == null)
            {
                return null;
            }
            return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "protectionType" element
     */
    public com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT xgetProtectionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT)get_store().find_element_user(PROTECTIONTYPE$28, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "protectionType" element
     */
    public boolean isNilProtectionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT)get_store().find_element_user(PROTECTIONTYPE$28, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "protectionType" element
     */
    public boolean isSetProtectionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROTECTIONTYPE$28) != 0;
        }
    }
    
    /**
     * Sets the "protectionType" element
     */
    public void setProtectionType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT.Enum protectionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROTECTIONTYPE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROTECTIONTYPE$28);
            }
            target.setEnumValue(protectionType);
        }
    }
    
    /**
     * Sets (as xml) the "protectionType" element
     */
    public void xsetProtectionType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT protectionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT)get_store().find_element_user(PROTECTIONTYPE$28, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT)get_store().add_element_user(PROTECTIONTYPE$28);
            }
            target.set(protectionType);
        }
    }
    
    /**
     * Nils the "protectionType" element
     */
    public void setNilProtectionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT target = null;
            target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT)get_store().find_element_user(PROTECTIONTYPE$28, 0);
            if (target == null)
            {
                target = (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT)get_store().add_element_user(PROTECTIONTYPE$28);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "protectionType" element
     */
    public void unsetProtectionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROTECTIONTYPE$28, 0);
        }
    }
    
    /**
     * Gets the "sharedRiskReservationOccurrenceGroup" element
     */
    public java.lang.String getSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sharedRiskReservationOccurrenceGroup" element
     */
    public org.apache.xmlbeans.XmlString xgetSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "sharedRiskReservationOccurrenceGroup" element
     */
    public boolean isNilSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "sharedRiskReservationOccurrenceGroup" element
     */
    public boolean isSetSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30) != 0;
        }
    }
    
    /**
     * Sets the "sharedRiskReservationOccurrenceGroup" element
     */
    public void setSharedRiskReservationOccurrenceGroup(java.lang.String sharedRiskReservationOccurrenceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30);
            }
            target.setStringValue(sharedRiskReservationOccurrenceGroup);
        }
    }
    
    /**
     * Sets (as xml) the "sharedRiskReservationOccurrenceGroup" element
     */
    public void xsetSharedRiskReservationOccurrenceGroup(org.apache.xmlbeans.XmlString sharedRiskReservationOccurrenceGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30);
            }
            target.set(sharedRiskReservationOccurrenceGroup);
        }
    }
    
    /**
     * Nils the "sharedRiskReservationOccurrenceGroup" element
     */
    public void setNilSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "sharedRiskReservationOccurrenceGroup" element
     */
    public void unsetSharedRiskReservationOccurrenceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAREDRISKRESERVATIONOCCURRENCEGROUP$30, 0);
        }
    }
}
