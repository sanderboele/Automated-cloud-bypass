/*
 * XML Type:  AlarmT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes;


/**
 * An XML AlarmT(@http://www.nortel.com/drac/2007/07/03/ws/ct/DracCommonTypes).
 *
 * This is a complex type.
 */
public interface AlarmT extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlarmT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("alarmtd7e7type");
    
    /**
     * Gets the "alarmId" element
     */
    java.lang.String getAlarmId();
    
    /**
     * Gets (as xml) the "alarmId" element
     */
    org.apache.xmlbeans.XmlString xgetAlarmId();
    
    /**
     * Sets the "alarmId" element
     */
    void setAlarmId(java.lang.String alarmId);
    
    /**
     * Sets (as xml) the "alarmId" element
     */
    void xsetAlarmId(org.apache.xmlbeans.XmlString alarmId);
    
    /**
     * Gets the "alarmSourceId" element
     */
    java.lang.String getAlarmSourceId();
    
    /**
     * Gets (as xml) the "alarmSourceId" element
     */
    org.apache.xmlbeans.XmlString xgetAlarmSourceId();
    
    /**
     * Sets the "alarmSourceId" element
     */
    void setAlarmSourceId(java.lang.String alarmSourceId);
    
    /**
     * Sets (as xml) the "alarmSourceId" element
     */
    void xsetAlarmSourceId(org.apache.xmlbeans.XmlString alarmSourceId);
    
    /**
     * Gets the "severity" element
     */
    java.lang.String getSeverity();
    
    /**
     * Gets (as xml) the "severity" element
     */
    org.apache.xmlbeans.XmlString xgetSeverity();
    
    /**
     * Sets the "severity" element
     */
    void setSeverity(java.lang.String severity);
    
    /**
     * Sets (as xml) the "severity" element
     */
    void xsetSeverity(org.apache.xmlbeans.XmlString severity);
    
    /**
     * Gets the "timeRaised" element
     */
    java.util.Calendar getTimeRaised();
    
    /**
     * Gets (as xml) the "timeRaised" element
     */
    org.apache.xmlbeans.XmlDateTime xgetTimeRaised();
    
    /**
     * Sets the "timeRaised" element
     */
    void setTimeRaised(java.util.Calendar timeRaised);
    
    /**
     * Sets (as xml) the "timeRaised" element
     */
    void xsetTimeRaised(org.apache.xmlbeans.XmlDateTime timeRaised);
    
    /**
     * Gets the "isCleared" element
     */
    boolean getIsCleared();
    
    /**
     * Gets (as xml) the "isCleared" element
     */
    org.apache.xmlbeans.XmlBoolean xgetIsCleared();
    
    /**
     * Sets the "isCleared" element
     */
    void setIsCleared(boolean isCleared);
    
    /**
     * Sets (as xml) the "isCleared" element
     */
    void xsetIsCleared(org.apache.xmlbeans.XmlBoolean isCleared);
    
    /**
     * Gets the "timeCleared" element
     */
    java.util.Calendar getTimeCleared();
    
    /**
     * Gets (as xml) the "timeCleared" element
     */
    org.apache.xmlbeans.XmlDateTime xgetTimeCleared();
    
    /**
     * True if has "timeCleared" element
     */
    boolean isSetTimeCleared();
    
    /**
     * Sets the "timeCleared" element
     */
    void setTimeCleared(java.util.Calendar timeCleared);
    
    /**
     * Sets (as xml) the "timeCleared" element
     */
    void xsetTimeCleared(org.apache.xmlbeans.XmlDateTime timeCleared);
    
    /**
     * Unsets the "timeCleared" element
     */
    void unsetTimeCleared();
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "additionalInfo" element
     */
    java.lang.String getAdditionalInfo();
    
    /**
     * Gets (as xml) the "additionalInfo" element
     */
    org.apache.xmlbeans.XmlString xgetAdditionalInfo();
    
    /**
     * True if has "additionalInfo" element
     */
    boolean isSetAdditionalInfo();
    
    /**
     * Sets the "additionalInfo" element
     */
    void setAdditionalInfo(java.lang.String additionalInfo);
    
    /**
     * Sets (as xml) the "additionalInfo" element
     */
    void xsetAdditionalInfo(org.apache.xmlbeans.XmlString additionalInfo);
    
    /**
     * Unsets the "additionalInfo" element
     */
    void unsetAdditionalInfo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.ct.draccommontypes.AlarmT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
