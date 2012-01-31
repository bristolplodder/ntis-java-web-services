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
 * <p>Java class for UpdateMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateMethodEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="allElementUpdate"/>
 *     &lt;enumeration value="singleElementUpdate"/>
 *     &lt;enumeration value="snapshot"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateMethodEnum")
@XmlEnum
public enum UpdateMethodEnum {


    /**
     * The client has currently requested that all situation elements are sent when one or more component elements are updated.
     * 
     */
    @XmlEnumValue("allElementUpdate")
    ALL_ELEMENT_UPDATE("allElementUpdate"),

    /**
     * The client has currently requested that only the individual elements of a situation that have changed are sent when updated.
     * 
     */
    @XmlEnumValue("singleElementUpdate")
    SINGLE_ELEMENT_UPDATE("singleElementUpdate"),

    /**
     * The client has requested that all situations and their elements which are valid at the time of request be sent together, i.e. a snapshot in time of all valid situations.
     * 
     */
    @XmlEnumValue("snapshot")
    SNAPSHOT("snapshot");
    private final String value;

    UpdateMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateMethodEnum fromValue(String v) {
        for (UpdateMethodEnum c: UpdateMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}