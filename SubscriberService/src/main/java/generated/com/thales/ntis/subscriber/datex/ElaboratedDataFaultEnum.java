//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElaboratedDataFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ElaboratedDataFaultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="intermittentDataValues"/>
 *     &lt;enumeration value="noDataValuesAvailable"/>
 *     &lt;enumeration value="spuriousUnreliableDataValues"/>
 *     &lt;enumeration value="unspecifiedOrUnknownFault"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElaboratedDataFaultEnum")
@XmlEnum
public enum ElaboratedDataFaultEnum {


    /**
     * Data values are being produced at intermittent intervals which are not consitent with the expected reporting interval.
     * 
     */
    @XmlEnumValue("intermittentDataValues")
    INTERMITTENT_DATA_VALUES("intermittentDataValues"),

    /**
     * No elaborated data values are currently available.
     * 
     */
    @XmlEnumValue("noDataValuesAvailable")
    NO_DATA_VALUES_AVAILABLE("noDataValuesAvailable"),

    /**
     * Spurious or unreliable data values are being produced.
     * 
     */
    @XmlEnumValue("spuriousUnreliableDataValues")
    SPURIOUS_UNRELIABLE_DATA_VALUES("spuriousUnreliableDataValues"),

    /**
     * An unspecified or unknown fault exists in the process which is generating elaborated data.
     * 
     */
    @XmlEnumValue("unspecifiedOrUnknownFault")
    UNSPECIFIED_OR_UNKNOWN_FAULT("unspecifiedOrUnknownFault"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ElaboratedDataFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElaboratedDataFaultEnum fromValue(String v) {
        for (ElaboratedDataFaultEnum c: ElaboratedDataFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}