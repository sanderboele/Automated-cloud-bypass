/*
 * XML Type:  ReservationScheduleRequestT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML ReservationScheduleRequestT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public interface ReservationScheduleRequestT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReservationScheduleRequestT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("reservationschedulerequestt1a07type");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "type" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT xgetType();
    
    /**
     * Tests for nil "type" element
     */
    boolean isNilType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT type);
    
    /**
     * Nils the "type" element
     */
    void setNilType();
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
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
     * Gets the "reservationOccurrenceDuration" element
     */
    int getReservationOccurrenceDuration();
    
    /**
     * Gets (as xml) the "reservationOccurrenceDuration" element
     */
    org.apache.xmlbeans.XmlInt xgetReservationOccurrenceDuration();
    
    /**
     * Sets the "reservationOccurrenceDuration" element
     */
    void setReservationOccurrenceDuration(int reservationOccurrenceDuration);
    
    /**
     * Sets (as xml) the "reservationOccurrenceDuration" element
     */
    void xsetReservationOccurrenceDuration(org.apache.xmlbeans.XmlInt reservationOccurrenceDuration);
    
    /**
     * Gets the "resource" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT getResource();
    
    /**
     * Sets the "resource" element
     */
    void setResource(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT resource);
    
    /**
     * Appends and returns a new empty "resource" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ResourceRequestT addNewResource();
    
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
     * Gets the "isRecurring" element
     */
    boolean getIsRecurring();
    
    /**
     * Gets (as xml) the "isRecurring" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsRecurring();
    
    /**
     * Sets the "isRecurring" element
     */
    void setIsRecurring(boolean isRecurring);
    
    /**
     * Sets (as xml) the "isRecurring" element
     */
    void xsetIsRecurring(org.apache.xmlbeans.XmlBoolean isRecurring);
    
    /**
     * Gets the "recurrence" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT getRecurrence();
    
    /**
     * Tests for nil "recurrence" element
     */
    boolean isNilRecurrence();
    
    /**
     * True if has "recurrence" element
     */
    boolean isSetRecurrence();
    
    /**
     * Sets the "recurrence" element
     */
    void setRecurrence(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT recurrence);
    
    /**
     * Appends and returns a new empty "recurrence" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.RecurrenceT addNewRecurrence();
    
    /**
     * Nils the "recurrence" element
     */
    void setNilRecurrence();
    
    /**
     * Unsets the "recurrence" element
     */
    void unsetRecurrence();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleRequestT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
