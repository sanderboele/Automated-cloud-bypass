/*
 * XML Type:  EndsAfterDateT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML EndsAfterDateT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public interface EndsAfterDateT extends com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceRangeT
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EndsAfterDateT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("endsafterdateta2dbtype");
    
    /**
     * Gets the "endDate" element
     */
    java.util.Calendar getEndDate();
    
    /**
     * Gets (as xml) the "endDate" element
     */
    org.apache.xmlbeans.XmlDate xgetEndDate();
    
    /**
     * Sets the "endDate" element
     */
    void setEndDate(java.util.Calendar endDate);
    
    /**
     * Sets (as xml) the "endDate" element
     */
    void xsetEndDate(org.apache.xmlbeans.XmlDate endDate);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.EndsAfterDateT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
