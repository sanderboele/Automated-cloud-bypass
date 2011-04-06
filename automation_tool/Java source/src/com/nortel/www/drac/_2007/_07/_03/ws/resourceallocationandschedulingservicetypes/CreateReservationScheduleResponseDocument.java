/*
 * An XML document type.
 * Localname: CreateReservationScheduleResponse
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * A document containing one CreateReservationScheduleResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes) element.
 *
 * This is a complex type.
 */
public interface CreateReservationScheduleResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateReservationScheduleResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("createreservationscheduleresponsea357doctype");
    
    /**
     * Gets the "CreateReservationScheduleResponse" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse getCreateReservationScheduleResponse();
    
    /**
     * Sets the "CreateReservationScheduleResponse" element
     */
    void setCreateReservationScheduleResponse(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse createReservationScheduleResponse);
    
    /**
     * Appends and returns a new empty "CreateReservationScheduleResponse" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse addNewCreateReservationScheduleResponse();
    
    /**
     * An XML CreateReservationScheduleResponse(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
     *
     * This is a complex type.
     */
    public interface CreateReservationScheduleResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateReservationScheduleResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("createreservationscheduleresponse1a43elemtype");
        
        /**
         * Gets the "reservationScheduleId" element
         */
        java.lang.String getReservationScheduleId();
        
        /**
         * Gets (as xml) the "reservationScheduleId" element
         */
        org.apache.xmlbeans.XmlString xgetReservationScheduleId();
        
        /**
         * Sets the "reservationScheduleId" element
         */
        void setReservationScheduleId(java.lang.String reservationScheduleId);
        
        /**
         * Sets (as xml) the "reservationScheduleId" element
         */
        void xsetReservationScheduleId(org.apache.xmlbeans.XmlString reservationScheduleId);
        
        /**
         * Gets the "result" element
         */
        com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT.Enum getResult();
        
        /**
         * Gets (as xml) the "result" element
         */
        com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT xgetResult();
        
        /**
         * Sets the "result" element
         */
        void setResult(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT.Enum result);
        
        /**
         * Sets (as xml) the "result" element
         */
        void xsetResult(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleCreationResultT result);
        
        /**
         * Gets array of all "occurrenceInfo" elements
         */
        com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT[] getOccurrenceInfoArray();
        
        /**
         * Gets ith "occurrenceInfo" element
         */
        com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT getOccurrenceInfoArray(int i);
        
        /**
         * Returns number of "occurrenceInfo" element
         */
        int sizeOfOccurrenceInfoArray();
        
        /**
         * Sets array of all "occurrenceInfo" element
         */
        void setOccurrenceInfoArray(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT[] occurrenceInfoArray);
        
        /**
         * Sets ith "occurrenceInfo" element
         */
        void setOccurrenceInfoArray(int i, com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT occurrenceInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "occurrenceInfo" element
         */
        com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT insertNewOccurrenceInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "occurrenceInfo" element
         */
        com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceInfoT addNewOccurrenceInfo();
        
        /**
         * Removes the ith "occurrenceInfo" element
         */
        void removeOccurrenceInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse newInstance() {
              return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument.CreateReservationScheduleResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.CreateReservationScheduleResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
