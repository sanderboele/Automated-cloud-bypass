/*
 * XML Type:  PathT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML PathT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public interface PathT extends com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("patht07a0type");
    
    /**
     * Gets the "sourceTna" element
     */
    java.lang.String getSourceTna();
    
    /**
     * Gets (as xml) the "sourceTna" element
     */
    org.apache.xmlbeans.XmlString xgetSourceTna();
    
    /**
     * Sets the "sourceTna" element
     */
    void setSourceTna(java.lang.String sourceTna);
    
    /**
     * Sets (as xml) the "sourceTna" element
     */
    void xsetSourceTna(org.apache.xmlbeans.XmlString sourceTna);
    
    /**
     * Gets the "targetTna" element
     */
    java.lang.String getTargetTna();
    
    /**
     * Gets (as xml) the "targetTna" element
     */
    org.apache.xmlbeans.XmlString xgetTargetTna();
    
    /**
     * Sets the "targetTna" element
     */
    void setTargetTna(java.lang.String targetTna);
    
    /**
     * Sets (as xml) the "targetTna" element
     */
    void xsetTargetTna(org.apache.xmlbeans.XmlString targetTna);
    
    /**
     * Gets the "sourceChannel" element
     */
    int getSourceChannel();
    
    /**
     * Gets (as xml) the "sourceChannel" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT xgetSourceChannel();
    
    /**
     * Tests for nil "sourceChannel" element
     */
    boolean isNilSourceChannel();
    
    /**
     * True if has "sourceChannel" element
     */
    boolean isSetSourceChannel();
    
    /**
     * Sets the "sourceChannel" element
     */
    void setSourceChannel(int sourceChannel);
    
    /**
     * Sets (as xml) the "sourceChannel" element
     */
    void xsetSourceChannel(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT sourceChannel);
    
    /**
     * Nils the "sourceChannel" element
     */
    void setNilSourceChannel();
    
    /**
     * Unsets the "sourceChannel" element
     */
    void unsetSourceChannel();
    
    /**
     * Gets the "targetChannel" element
     */
    int getTargetChannel();
    
    /**
     * Gets (as xml) the "targetChannel" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT xgetTargetChannel();
    
    /**
     * Tests for nil "targetChannel" element
     */
    boolean isNilTargetChannel();
    
    /**
     * True if has "targetChannel" element
     */
    boolean isSetTargetChannel();
    
    /**
     * Sets the "targetChannel" element
     */
    void setTargetChannel(int targetChannel);
    
    /**
     * Sets (as xml) the "targetChannel" element
     */
    void xsetTargetChannel(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidChannelNumberT targetChannel);
    
    /**
     * Nils the "targetChannel" element
     */
    void setNilTargetChannel();
    
    /**
     * Unsets the "targetChannel" element
     */
    void unsetTargetChannel();
    
    /**
     * Gets the "source_vlanId" element
     */
    java.lang.String getSourceVlanId();
    
    /**
     * Gets (as xml) the "source_vlanId" element
     */
    org.apache.xmlbeans.XmlString xgetSourceVlanId();
    
    /**
     * Tests for nil "source_vlanId" element
     */
    boolean isNilSourceVlanId();
    
    /**
     * True if has "source_vlanId" element
     */
    boolean isSetSourceVlanId();
    
    /**
     * Sets the "source_vlanId" element
     */
    void setSourceVlanId(java.lang.String sourceVlanId);
    
    /**
     * Sets (as xml) the "source_vlanId" element
     */
    void xsetSourceVlanId(org.apache.xmlbeans.XmlString sourceVlanId);
    
    /**
     * Nils the "source_vlanId" element
     */
    void setNilSourceVlanId();
    
    /**
     * Unsets the "source_vlanId" element
     */
    void unsetSourceVlanId();
    
    /**
     * Gets the "target_vlanId" element
     */
    java.lang.String getTargetVlanId();
    
    /**
     * Gets (as xml) the "target_vlanId" element
     */
    org.apache.xmlbeans.XmlString xgetTargetVlanId();
    
    /**
     * Tests for nil "target_vlanId" element
     */
    boolean isNilTargetVlanId();
    
    /**
     * True if has "target_vlanId" element
     */
    boolean isSetTargetVlanId();
    
    /**
     * Sets the "target_vlanId" element
     */
    void setTargetVlanId(java.lang.String targetVlanId);
    
    /**
     * Sets (as xml) the "target_vlanId" element
     */
    void xsetTargetVlanId(org.apache.xmlbeans.XmlString targetVlanId);
    
    /**
     * Nils the "target_vlanId" element
     */
    void setNilTargetVlanId();
    
    /**
     * Unsets the "target_vlanId" element
     */
    void unsetTargetVlanId();
    
    /**
     * Gets the "rate" element
     */
    int getRate();
    
    /**
     * Gets (as xml) the "rate" element
     */
    org.apache.xmlbeans.XmlInt xgetRate();
    
    /**
     * Sets the "rate" element
     */
    void setRate(int rate);
    
    /**
     * Sets (as xml) the "rate" element
     */
    void xsetRate(org.apache.xmlbeans.XmlInt rate);
    
    /**
     * Gets the "srlgExclusions" element
     */
    java.lang.String getSrlgExclusions();
    
    /**
     * Gets (as xml) the "srlgExclusions" element
     */
    org.apache.xmlbeans.XmlString xgetSrlgExclusions();
    
    /**
     * Tests for nil "srlgExclusions" element
     */
    boolean isNilSrlgExclusions();
    
    /**
     * True if has "srlgExclusions" element
     */
    boolean isSetSrlgExclusions();
    
    /**
     * Sets the "srlgExclusions" element
     */
    void setSrlgExclusions(java.lang.String srlgExclusions);
    
    /**
     * Sets (as xml) the "srlgExclusions" element
     */
    void xsetSrlgExclusions(org.apache.xmlbeans.XmlString srlgExclusions);
    
    /**
     * Nils the "srlgExclusions" element
     */
    void setNilSrlgExclusions();
    
    /**
     * Unsets the "srlgExclusions" element
     */
    void unsetSrlgExclusions();
    
    /**
     * Gets the "srlgInclusions" element
     */
    java.lang.String getSrlgInclusions();
    
    /**
     * Gets (as xml) the "srlgInclusions" element
     */
    org.apache.xmlbeans.XmlString xgetSrlgInclusions();
    
    /**
     * Tests for nil "srlgInclusions" element
     */
    boolean isNilSrlgInclusions();
    
    /**
     * True if has "srlgInclusions" element
     */
    boolean isSetSrlgInclusions();
    
    /**
     * Sets the "srlgInclusions" element
     */
    void setSrlgInclusions(java.lang.String srlgInclusions);
    
    /**
     * Sets (as xml) the "srlgInclusions" element
     */
    void xsetSrlgInclusions(org.apache.xmlbeans.XmlString srlgInclusions);
    
    /**
     * Nils the "srlgInclusions" element
     */
    void setNilSrlgInclusions();
    
    /**
     * Unsets the "srlgInclusions" element
     */
    void unsetSrlgInclusions();
    
    /**
     * Gets the "cost" element
     */
    int getCost();
    
    /**
     * Gets (as xml) the "cost" element
     */
    org.apache.xmlbeans.XmlInt xgetCost();
    
    /**
     * Tests for nil "cost" element
     */
    boolean isNilCost();
    
    /**
     * True if has "cost" element
     */
    boolean isSetCost();
    
    /**
     * Sets the "cost" element
     */
    void setCost(int cost);
    
    /**
     * Sets (as xml) the "cost" element
     */
    void xsetCost(org.apache.xmlbeans.XmlInt cost);
    
    /**
     * Nils the "cost" element
     */
    void setNilCost();
    
    /**
     * Unsets the "cost" element
     */
    void unsetCost();
    
    /**
     * Gets the "metric" element
     */
    int getMetric();
    
    /**
     * Gets (as xml) the "metric" element
     */
    org.apache.xmlbeans.XmlInt xgetMetric();
    
    /**
     * Tests for nil "metric" element
     */
    boolean isNilMetric();
    
    /**
     * True if has "metric" element
     */
    boolean isSetMetric();
    
    /**
     * Sets the "metric" element
     */
    void setMetric(int metric);
    
    /**
     * Sets (as xml) the "metric" element
     */
    void xsetMetric(org.apache.xmlbeans.XmlInt metric);
    
    /**
     * Nils the "metric" element
     */
    void setNilMetric();
    
    /**
     * Unsets the "metric" element
     */
    void unsetMetric();
    
    /**
     * Gets the "hop" element
     */
    int getHop();
    
    /**
     * Gets (as xml) the "hop" element
     */
    org.apache.xmlbeans.XmlInt xgetHop();
    
    /**
     * Tests for nil "hop" element
     */
    boolean isNilHop();
    
    /**
     * True if has "hop" element
     */
    boolean isSetHop();
    
    /**
     * Sets the "hop" element
     */
    void setHop(int hop);
    
    /**
     * Sets (as xml) the "hop" element
     */
    void xsetHop(org.apache.xmlbeans.XmlInt hop);
    
    /**
     * Nils the "hop" element
     */
    void setNilHop();
    
    /**
     * Unsets the "hop" element
     */
    void unsetHop();
    
    /**
     * Gets the "routingMetric" element
     */
    int getRoutingMetric();
    
    /**
     * Gets (as xml) the "routingMetric" element
     */
    org.apache.xmlbeans.XmlInt xgetRoutingMetric();
    
    /**
     * Tests for nil "routingMetric" element
     */
    boolean isNilRoutingMetric();
    
    /**
     * True if has "routingMetric" element
     */
    boolean isSetRoutingMetric();
    
    /**
     * Sets the "routingMetric" element
     */
    void setRoutingMetric(int routingMetric);
    
    /**
     * Sets (as xml) the "routingMetric" element
     */
    void xsetRoutingMetric(org.apache.xmlbeans.XmlInt routingMetric);
    
    /**
     * Nils the "routingMetric" element
     */
    void setNilRoutingMetric();
    
    /**
     * Unsets the "routingMetric" element
     */
    void unsetRoutingMetric();
    
    /**
     * Gets the "routingAlgorithm" element
     */
    java.lang.String getRoutingAlgorithm();
    
    /**
     * Gets (as xml) the "routingAlgorithm" element
     */
    org.apache.xmlbeans.XmlString xgetRoutingAlgorithm();
    
    /**
     * Tests for nil "routingAlgorithm" element
     */
    boolean isNilRoutingAlgorithm();
    
    /**
     * True if has "routingAlgorithm" element
     */
    boolean isSetRoutingAlgorithm();
    
    /**
     * Sets the "routingAlgorithm" element
     */
    void setRoutingAlgorithm(java.lang.String routingAlgorithm);
    
    /**
     * Sets (as xml) the "routingAlgorithm" element
     */
    void xsetRoutingAlgorithm(org.apache.xmlbeans.XmlString routingAlgorithm);
    
    /**
     * Nils the "routingAlgorithm" element
     */
    void setNilRoutingAlgorithm();
    
    /**
     * Unsets the "routingAlgorithm" element
     */
    void unsetRoutingAlgorithm();
    
    /**
     * Gets the "protectionType" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT.Enum getProtectionType();
    
    /**
     * Gets (as xml) the "protectionType" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT xgetProtectionType();
    
    /**
     * Tests for nil "protectionType" element
     */
    boolean isNilProtectionType();
    
    /**
     * True if has "protectionType" element
     */
    boolean isSetProtectionType();
    
    /**
     * Sets the "protectionType" element
     */
    void setProtectionType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT.Enum protectionType);
    
    /**
     * Sets (as xml) the "protectionType" element
     */
    void xsetProtectionType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidProtectionTypeT protectionType);
    
    /**
     * Nils the "protectionType" element
     */
    void setNilProtectionType();
    
    /**
     * Unsets the "protectionType" element
     */
    void unsetProtectionType();
    
    /**
     * Gets the "sharedRiskReservationOccurrenceGroup" element
     */
    java.lang.String getSharedRiskReservationOccurrenceGroup();
    
    /**
     * Gets (as xml) the "sharedRiskReservationOccurrenceGroup" element
     */
    org.apache.xmlbeans.XmlString xgetSharedRiskReservationOccurrenceGroup();
    
    /**
     * Tests for nil "sharedRiskReservationOccurrenceGroup" element
     */
    boolean isNilSharedRiskReservationOccurrenceGroup();
    
    /**
     * True if has "sharedRiskReservationOccurrenceGroup" element
     */
    boolean isSetSharedRiskReservationOccurrenceGroup();
    
    /**
     * Sets the "sharedRiskReservationOccurrenceGroup" element
     */
    void setSharedRiskReservationOccurrenceGroup(java.lang.String sharedRiskReservationOccurrenceGroup);
    
    /**
     * Sets (as xml) the "sharedRiskReservationOccurrenceGroup" element
     */
    void xsetSharedRiskReservationOccurrenceGroup(org.apache.xmlbeans.XmlString sharedRiskReservationOccurrenceGroup);
    
    /**
     * Nils the "sharedRiskReservationOccurrenceGroup" element
     */
    void setNilSharedRiskReservationOccurrenceGroup();
    
    /**
     * Unsets the "sharedRiskReservationOccurrenceGroup" element
     */
    void unsetSharedRiskReservationOccurrenceGroup();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.PathT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
