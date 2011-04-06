/*
 * XML Type:  UserInfoT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML UserInfoT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public interface UserInfoT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UserInfoT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("userinfotaf14type");
    
    /**
     * Gets the "billingGroup" element
     */
    java.lang.String getBillingGroup();
    
    /**
     * Gets (as xml) the "billingGroup" element
     */
    org.apache.xmlbeans.XmlString xgetBillingGroup();
    
    /**
     * Sets the "billingGroup" element
     */
    void setBillingGroup(java.lang.String billingGroup);
    
    /**
     * Sets (as xml) the "billingGroup" element
     */
    void xsetBillingGroup(org.apache.xmlbeans.XmlString billingGroup);
    
    /**
     * Gets the "sourceEndpointResourceGroup" element
     */
    java.lang.String getSourceEndpointResourceGroup();
    
    /**
     * Gets (as xml) the "sourceEndpointResourceGroup" element
     */
    org.apache.xmlbeans.XmlString xgetSourceEndpointResourceGroup();
    
    /**
     * Sets the "sourceEndpointResourceGroup" element
     */
    void setSourceEndpointResourceGroup(java.lang.String sourceEndpointResourceGroup);
    
    /**
     * Sets (as xml) the "sourceEndpointResourceGroup" element
     */
    void xsetSourceEndpointResourceGroup(org.apache.xmlbeans.XmlString sourceEndpointResourceGroup);
    
    /**
     * Gets the "targetEndpointResourceGroup" element
     */
    java.lang.String getTargetEndpointResourceGroup();
    
    /**
     * Gets (as xml) the "targetEndpointResourceGroup" element
     */
    org.apache.xmlbeans.XmlString xgetTargetEndpointResourceGroup();
    
    /**
     * Sets the "targetEndpointResourceGroup" element
     */
    void setTargetEndpointResourceGroup(java.lang.String targetEndpointResourceGroup);
    
    /**
     * Sets (as xml) the "targetEndpointResourceGroup" element
     */
    void xsetTargetEndpointResourceGroup(org.apache.xmlbeans.XmlString targetEndpointResourceGroup);
    
    /**
     * Gets the "sourceEndpointUserGroup" element
     */
    java.lang.String getSourceEndpointUserGroup();
    
    /**
     * Gets (as xml) the "sourceEndpointUserGroup" element
     */
    org.apache.xmlbeans.XmlString xgetSourceEndpointUserGroup();
    
    /**
     * Tests for nil "sourceEndpointUserGroup" element
     */
    boolean isNilSourceEndpointUserGroup();
    
    /**
     * Sets the "sourceEndpointUserGroup" element
     */
    void setSourceEndpointUserGroup(java.lang.String sourceEndpointUserGroup);
    
    /**
     * Sets (as xml) the "sourceEndpointUserGroup" element
     */
    void xsetSourceEndpointUserGroup(org.apache.xmlbeans.XmlString sourceEndpointUserGroup);
    
    /**
     * Nils the "sourceEndpointUserGroup" element
     */
    void setNilSourceEndpointUserGroup();
    
    /**
     * Gets the "targetEndpointUserGroup" element
     */
    java.lang.String getTargetEndpointUserGroup();
    
    /**
     * Gets (as xml) the "targetEndpointUserGroup" element
     */
    org.apache.xmlbeans.XmlString xgetTargetEndpointUserGroup();
    
    /**
     * Tests for nil "targetEndpointUserGroup" element
     */
    boolean isNilTargetEndpointUserGroup();
    
    /**
     * Sets the "targetEndpointUserGroup" element
     */
    void setTargetEndpointUserGroup(java.lang.String targetEndpointUserGroup);
    
    /**
     * Sets (as xml) the "targetEndpointUserGroup" element
     */
    void xsetTargetEndpointUserGroup(org.apache.xmlbeans.XmlString targetEndpointUserGroup);
    
    /**
     * Nils the "targetEndpointUserGroup" element
     */
    void setNilTargetEndpointUserGroup();
    
    /**
     * Gets the "emailAddress" element
     */
    java.lang.String getEmailAddress();
    
    /**
     * Gets (as xml) the "emailAddress" element
     */
    org.apache.xmlbeans.XmlString xgetEmailAddress();
    
    /**
     * Tests for nil "emailAddress" element
     */
    boolean isNilEmailAddress();
    
    /**
     * Sets the "emailAddress" element
     */
    void setEmailAddress(java.lang.String emailAddress);
    
    /**
     * Sets (as xml) the "emailAddress" element
     */
    void xsetEmailAddress(org.apache.xmlbeans.XmlString emailAddress);
    
    /**
     * Nils the "emailAddress" element
     */
    void setNilEmailAddress();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
