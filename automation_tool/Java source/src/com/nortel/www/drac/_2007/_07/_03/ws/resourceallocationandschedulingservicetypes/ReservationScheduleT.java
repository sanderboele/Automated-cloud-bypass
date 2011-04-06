/*
 * XML Type:  ReservationScheduleT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML ReservationScheduleT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is a complex type.
 */
public interface ReservationScheduleT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReservationScheduleT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("reservationschedulet51cctype");
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Gets the "type" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleTypeT type);
    
    /**
     * Gets the "status" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" element
     */
    com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT xgetStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.Enum status);
    
    /**
     * Sets (as xml) the "status" element
     */
    void xsetStatus(com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT status);
    
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
     * Gets array of all "occurrenceId" elements
     */
    java.lang.String[] getOccurrenceIdArray();
    
    /**
     * Gets ith "occurrenceId" element
     */
    java.lang.String getOccurrenceIdArray(int i);
    
    /**
     * Gets (as xml) array of all "occurrenceId" elements
     */
    org.apache.xmlbeans.XmlString[] xgetOccurrenceIdArray();
    
    /**
     * Gets (as xml) ith "occurrenceId" element
     */
    org.apache.xmlbeans.XmlString xgetOccurrenceIdArray(int i);
    
    /**
     * Tests for nil ith "occurrenceId" element
     */
    boolean isNilOccurrenceIdArray(int i);
    
    /**
     * Returns number of "occurrenceId" element
     */
    int sizeOfOccurrenceIdArray();
    
    /**
     * Sets array of all "occurrenceId" element
     */
    void setOccurrenceIdArray(java.lang.String[] occurrenceIdArray);
    
    /**
     * Sets ith "occurrenceId" element
     */
    void setOccurrenceIdArray(int i, java.lang.String occurrenceId);
    
    /**
     * Sets (as xml) array of all "occurrenceId" element
     */
    void xsetOccurrenceIdArray(org.apache.xmlbeans.XmlString[] occurrenceIdArray);
    
    /**
     * Sets (as xml) ith "occurrenceId" element
     */
    void xsetOccurrenceIdArray(int i, org.apache.xmlbeans.XmlString occurrenceId);
    
    /**
     * Nils the ith "occurrenceId" element
     */
    void setNilOccurrenceIdArray(int i);
    
    /**
     * Inserts the value as the ith "occurrenceId" element
     */
    void insertOccurrenceId(int i, java.lang.String occurrenceId);
    
    /**
     * Appends the value as the last "occurrenceId" element
     */
    void addOccurrenceId(java.lang.String occurrenceId);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "occurrenceId" element
     */
    org.apache.xmlbeans.XmlString insertNewOccurrenceId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "occurrenceId" element
     */
    org.apache.xmlbeans.XmlString addNewOccurrenceId();
    
    /**
     * Removes the ith "occurrenceId" element
     */
    void removeOccurrenceId(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ReservationScheduleT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
