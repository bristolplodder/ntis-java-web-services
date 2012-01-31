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
 * <p>Java class for PositionRelativeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionRelativeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="above"/>
 *     &lt;enumeration value="below"/>
 *     &lt;enumeration value="toTheLeft"/>
 *     &lt;enumeration value="toTheRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionRelativeEnum")
@XmlEnum
public enum PositionRelativeEnum {


    /**
     * Positioned above relative item.
     * 
     */
    @XmlEnumValue("above")
    ABOVE("above"),

    /**
     * Positioned below relative item.
     * 
     */
    @XmlEnumValue("below")
    BELOW("below"),

    /**
     * Positioned to the left of relative item.
     * 
     */
    @XmlEnumValue("toTheLeft")
    TO_THE_LEFT("toTheLeft"),

    /**
     * Positioned to the right of relative item.
     * 
     */
    @XmlEnumValue("toTheRight")
    TO_THE_RIGHT("toTheRight");
    private final String value;

    PositionRelativeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionRelativeEnum fromValue(String v) {
        for (PositionRelativeEnum c: PositionRelativeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}