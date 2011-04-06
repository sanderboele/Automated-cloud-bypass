/*
 * An XML document type.
 * Localname: CompletionResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes;


/**
 * A document containing one CompletionResponse(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes) element.
 *
 * This is a complex type.
 */
public interface CompletionResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompletionResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("completionresponse9191doctype");
    
    /**
     * Gets the "CompletionResponse" element
     */
    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse getCompletionResponse();
    
    /**
     * Sets the "CompletionResponse" element
     */
    void setCompletionResponse(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse completionResponse);
    
    /**
     * Appends and returns a new empty "CompletionResponse" element
     */
    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse addNewCompletionResponse();
    
    /**
     * An XML CompletionResponse(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes).
     *
     * This is a complex type.
     */
    public interface CompletionResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompletionResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("completionresponsefbb8elemtype");
        
        /**
         * Gets the "result" element
         */
        com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT.Enum getResult();
        
        /**
         * Gets (as xml) the "result" element
         */
        com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT xgetResult();
        
        /**
         * Sets the "result" element
         */
        void setResult(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT.Enum result);
        
        /**
         * Sets (as xml) the "result" element
         */
        void xsetResult(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.ValidCompletionTypeT result);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse newInstance() {
              return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument.CompletionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.CompletionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
