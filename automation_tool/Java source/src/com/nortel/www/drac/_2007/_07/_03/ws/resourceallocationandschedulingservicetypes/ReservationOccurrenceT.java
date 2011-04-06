/*
 * XML Type:  ReservationOccurrenceT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML ReservationOccurrenceT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public interface ReservationOccurrenceT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReservationOccurrenceT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("reservationoccurrencetbcc6type");
    
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
     * Gets the "reservationScheduleStartTime" element
     */
    java.util.Calendar getReservationScheduleStartTime();
    
    /**
     * Gets (as xml) the "reservationScheduleStartTime" element
     */
    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetReservationScheduleStartTime();
    
    /**
     * Sets the "reservationScheduleStartTime" element
     */
    void setReservationScheduleStartTime(java.util.Calendar reservationScheduleStartTime);
    
    /**
     * Sets (as xml) the "reservationScheduleStartTime" element
     */
    void xsetReservationScheduleStartTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT reservationScheduleStartTime);
    
    /**
     * Gets the "reservationScheduleEndTime" element
     */
    java.util.Calendar getReservationScheduleEndTime();
    
    /**
     * Gets (as xml) the "reservationScheduleEndTime" element
     */
    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetReservationScheduleEndTime();
    
    /**
     * Sets the "reservationScheduleEndTime" element
     */
    void setReservationScheduleEndTime(java.util.Calendar reservationScheduleEndTime);
    
    /**
     * Sets (as xml) the "reservationScheduleEndTime" element
     */
    void xsetReservationScheduleEndTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT reservationScheduleEndTime);
    
    /**
     * Gets the "reservationScheduleStatus" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.Enum getReservationScheduleStatus();
    
    /**
     * Gets (as xml) the "reservationScheduleStatus" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT xgetReservationScheduleStatus();
    
    /**
     * Sets the "reservationScheduleStatus" element
     */
    void setReservationScheduleStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.Enum reservationScheduleStatus);
    
    /**
     * Sets (as xml) the "reservationScheduleStatus" element
     */
    void xsetReservationScheduleStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT reservationScheduleStatus);
    
    /**
     * Gets the "reservationScheduleName" element
     */
    java.lang.String getReservationScheduleName();
    
    /**
     * Gets (as xml) the "reservationScheduleName" element
     */
    org.apache.xmlbeans.XmlString xgetReservationScheduleName();
    
    /**
     * Sets the "reservationScheduleName" element
     */
    void setReservationScheduleName(java.lang.String reservationScheduleName);
    
    /**
     * Sets (as xml) the "reservationScheduleName" element
     */
    void xsetReservationScheduleName(org.apache.xmlbeans.XmlString reservationScheduleName);
    
    /**
     * Gets the "occurrenceId" element
     */
    java.lang.String getOccurrenceId();
    
    /**
     * Gets (as xml) the "occurrenceId" element
     */
    org.apache.xmlbeans.XmlString xgetOccurrenceId();
    
    /**
     * Sets the "occurrenceId" element
     */
    void setOccurrenceId(java.lang.String occurrenceId);
    
    /**
     * Sets (as xml) the "occurrenceId" element
     */
    void xsetOccurrenceId(org.apache.xmlbeans.XmlString occurrenceId);
    
    /**
     * Gets the "occurrenceStartTime" element
     */
    java.util.Calendar getOccurrenceStartTime();
    
    /**
     * Gets (as xml) the "occurrenceStartTime" element
     */
    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetOccurrenceStartTime();
    
    /**
     * Sets the "occurrenceStartTime" element
     */
    void setOccurrenceStartTime(java.util.Calendar occurrenceStartTime);
    
    /**
     * Sets (as xml) the "occurrenceStartTime" element
     */
    void xsetOccurrenceStartTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT occurrenceStartTime);
    
    /**
     * Gets the "occurrenceEndTime" element
     */
    java.util.Calendar getOccurrenceEndTime();
    
    /**
     * Gets (as xml) the "occurrenceEndTime" element
     */
    com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT xgetOccurrenceEndTime();
    
    /**
     * Sets the "occurrenceEndTime" element
     */
    void setOccurrenceEndTime(java.util.Calendar occurrenceEndTime);
    
    /**
     * Sets (as xml) the "occurrenceEndTime" element
     */
    void xsetOccurrenceEndTime(com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.DateTimeWithTimezoneT occurrenceEndTime);
    
    /**
     * Gets the "occurrenceStatus" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT.Enum getOccurrenceStatus();
    
    /**
     * Gets (as xml) the "occurrenceStatus" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT xgetOccurrenceStatus();
    
    /**
     * Sets the "occurrenceStatus" element
     */
    void setOccurrenceStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT.Enum occurrenceStatus);
    
    /**
     * Sets (as xml) the "occurrenceStatus" element
     */
    void xsetOccurrenceStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationOcurrenceStatusT occurrenceStatus);
    
    /**
     * Gets the "resource" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT getResource();
    
    /**
     * Sets the "resource" element
     */
    void setResource(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT resource);
    
    /**
     * Appends and returns a new empty "resource" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceT addNewResource();
    
    /**
     * Gets the "userInfo" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT getUserInfo();
    
    /**
     * Sets the "userInfo" element
     */
    void setUserInfo(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT userInfo);
    
    /**
     * Appends and returns a new empty "userInfo" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.UserInfoT addNewUserInfo();
    
    /**
     * Gets the "userId" element
     */
    java.lang.String getUserId();
    
    /**
     * Gets (as xml) the "userId" element
     */
    org.apache.xmlbeans.XmlString xgetUserId();
    
    /**
     * Sets the "userId" element
     */
    void setUserId(java.lang.String userId);
    
    /**
     * Sets (as xml) the "userId" element
     */
    void xsetUserId(org.apache.xmlbeans.XmlString userId);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationOccurrenceT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
