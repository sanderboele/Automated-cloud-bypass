/*
 * XML Type:  ReservationOccurrenceRequestT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML ReservationOccurrenceRequestT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public interface ReservationOccurrenceRequestT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReservationOccurrenceRequestT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("reservationoccurrencerequestt41cdtype");
    
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
     * Gets the "startTime" element
     */
    java.util.Calendar getStartTime();
    
    /**
     * Gets (as xml) the "startTime" element
     */
    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetStartTime();
    
    /**
     * Sets the "startTime" element
     */
    void setStartTime(java.util.Calendar startTime);
    
    /**
     * Sets (as xml) the "startTime" element
     */
    void xsetStartTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT startTime);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
