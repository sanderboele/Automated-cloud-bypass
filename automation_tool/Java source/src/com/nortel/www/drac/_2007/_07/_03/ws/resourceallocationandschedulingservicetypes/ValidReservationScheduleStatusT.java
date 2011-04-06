/*
 * XML Type:  ValidReservationScheduleStatusT
 * Namespace: http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes
 * Java type: com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT
 *
 * Automatically generated - do not modify.
 */
package com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes;


/**
 * An XML ValidReservationScheduleStatusT(@http://www.nortel.com/drac/2007/07/03/ws/ResourceAllocationAndSchedulingServiceTypes).
 *
 * This is an atomic type that is a restriction of com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.
 */
public interface ValidReservationScheduleStatusT extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ValidReservationScheduleStatusT.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3BA69BFB11D077B12A924F8A8A3504B3").resolveHandle("validreservationschedulestatusta2f4type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CONFIRMATION_PENDING = Enum.forString("ConfirmationPending");
    static final Enum CONFIRMATION_TIMED_OUT = Enum.forString("ConfirmationTimedOut");
    static final Enum CONFIRMATION_CANCELLED = Enum.forString("ConfirmationCancelled");
    static final Enum EXECUTION_PENDING = Enum.forString("ExecutionPending");
    static final Enum EXECUTION_IN_PROGRESS = Enum.forString("ExecutionInProgress");
    static final Enum EXECUTION_TIMED_OUT = Enum.forString("ExecutionTimedOut");
    static final Enum EXECUTION_SUCCEEDED = Enum.forString("ExecutionSucceeded");
    static final Enum EXECUTION_PARTIALLY_SUCCEEDED = Enum.forString("ExecutionPartiallySucceeded");
    static final Enum EXECUTION_FAILED = Enum.forString("ExecutionFailed");
    static final Enum EXECUTION_PARTIALLY_CANCELLED = Enum.forString("ExecutionPartiallyCancelled");
    static final Enum EXECUTION_CANCELLED = Enum.forString("ExecutionCancelled");
    static final Enum UNKNOWN = Enum.forString("Unknown");
    
    static final int INT_CONFIRMATION_PENDING = Enum.INT_CONFIRMATION_PENDING;
    static final int INT_CONFIRMATION_TIMED_OUT = Enum.INT_CONFIRMATION_TIMED_OUT;
    static final int INT_CONFIRMATION_CANCELLED = Enum.INT_CONFIRMATION_CANCELLED;
    static final int INT_EXECUTION_PENDING = Enum.INT_EXECUTION_PENDING;
    static final int INT_EXECUTION_IN_PROGRESS = Enum.INT_EXECUTION_IN_PROGRESS;
    static final int INT_EXECUTION_TIMED_OUT = Enum.INT_EXECUTION_TIMED_OUT;
    static final int INT_EXECUTION_SUCCEEDED = Enum.INT_EXECUTION_SUCCEEDED;
    static final int INT_EXECUTION_PARTIALLY_SUCCEEDED = Enum.INT_EXECUTION_PARTIALLY_SUCCEEDED;
    static final int INT_EXECUTION_FAILED = Enum.INT_EXECUTION_FAILED;
    static final int INT_EXECUTION_PARTIALLY_CANCELLED = Enum.INT_EXECUTION_PARTIALLY_CANCELLED;
    static final int INT_EXECUTION_CANCELLED = Enum.INT_EXECUTION_CANCELLED;
    static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
    
    /**
     * Enumeration value class for com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CONFIRMATION_PENDING
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_CONFIRMATION_PENDING = 1;
        static final int INT_CONFIRMATION_TIMED_OUT = 2;
        static final int INT_CONFIRMATION_CANCELLED = 3;
        static final int INT_EXECUTION_PENDING = 4;
        static final int INT_EXECUTION_IN_PROGRESS = 5;
        static final int INT_EXECUTION_TIMED_OUT = 6;
        static final int INT_EXECUTION_SUCCEEDED = 7;
        static final int INT_EXECUTION_PARTIALLY_SUCCEEDED = 8;
        static final int INT_EXECUTION_FAILED = 9;
        static final int INT_EXECUTION_PARTIALLY_CANCELLED = 10;
        static final int INT_EXECUTION_CANCELLED = 11;
        static final int INT_UNKNOWN = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ConfirmationPending", INT_CONFIRMATION_PENDING),
                new Enum("ConfirmationTimedOut", INT_CONFIRMATION_TIMED_OUT),
                new Enum("ConfirmationCancelled", INT_CONFIRMATION_CANCELLED),
                new Enum("ExecutionPending", INT_EXECUTION_PENDING),
                new Enum("ExecutionInProgress", INT_EXECUTION_IN_PROGRESS),
                new Enum("ExecutionTimedOut", INT_EXECUTION_TIMED_OUT),
                new Enum("ExecutionSucceeded", INT_EXECUTION_SUCCEEDED),
                new Enum("ExecutionPartiallySucceeded", INT_EXECUTION_PARTIALLY_SUCCEEDED),
                new Enum("ExecutionFailed", INT_EXECUTION_FAILED),
                new Enum("ExecutionPartiallyCancelled", INT_EXECUTION_PARTIALLY_CANCELLED),
                new Enum("ExecutionCancelled", INT_EXECUTION_CANCELLED),
                new Enum("Unknown", INT_UNKNOWN),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT newValue(java.lang.Object obj) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) type.newValue( obj ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT newInstance() {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.nortel.www.drac._2007._07._03.ws.resourceallocationandschedulingservicetypes.ValidReservationScheduleStatusT) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
