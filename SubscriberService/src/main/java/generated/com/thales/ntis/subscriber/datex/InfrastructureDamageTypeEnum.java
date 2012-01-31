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
 * <p>Java class for InfrastructureDamageTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InfrastructureDamageTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="burstPipe"/>
 *     &lt;enumeration value="burstWaterMain"/>
 *     &lt;enumeration value="collapsedSewer"/>
 *     &lt;enumeration value="damagedBridge"/>
 *     &lt;enumeration value="damagedCrashBarrier"/>
 *     &lt;enumeration value="damagedFlyover"/>
 *     &lt;enumeration value="damagedGallery"/>
 *     &lt;enumeration value="damagedGantry"/>
 *     &lt;enumeration value="damagedRoadSurface"/>
 *     &lt;enumeration value="damagedTunnel"/>
 *     &lt;enumeration value="damagedViaduct"/>
 *     &lt;enumeration value="fallenPowerCables"/>
 *     &lt;enumeration value="gasLeak"/>
 *     &lt;enumeration value="weakBridge"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InfrastructureDamageTypeEnum")
@XmlEnum
public enum InfrastructureDamageTypeEnum {


    /**
     * The road surface has sunken or collapsed in places due to burst pipes.
     * 
     */
    @XmlEnumValue("burstPipe")
    BURST_PIPE("burstPipe"),

    /**
     * Traffic may be disrupted due to local flooding and/or subsidence because of a broken water main.
     * 
     */
    @XmlEnumValue("burstWaterMain")
    BURST_WATER_MAIN("burstWaterMain"),

    /**
     * The road surface has sunken or collapsed in places due to sewer failure.
     * 
     */
    @XmlEnumValue("collapsedSewer")
    COLLAPSED_SEWER("collapsedSewer"),

    /**
     * Damage to a bridge that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedBridge")
    DAMAGED_BRIDGE("damagedBridge"),

    /**
     * Damage to a crash barrier that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedCrashBarrier")
    DAMAGED_CRASH_BARRIER("damagedCrashBarrier"),

    /**
     * Damage to an elevated section of the carriageway over another carriageway that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedFlyover")
    DAMAGED_FLYOVER("damagedFlyover"),

    /**
     * Damage to a gallery that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedGallery")
    DAMAGED_GALLERY("damagedGallery"),

    /**
     * Damage to a gantry above the roadway that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedGantry")
    DAMAGED_GANTRY("damagedGantry"),

    /**
     * Damage to the road surface that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedRoadSurface")
    DAMAGED_ROAD_SURFACE("damagedRoadSurface"),

    /**
     * Damage to a tunnel that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedTunnel")
    DAMAGED_TUNNEL("damagedTunnel"),

    /**
     * Damage to a viaduct that may cause traffic disruption.
     * 
     */
    @XmlEnumValue("damagedViaduct")
    DAMAGED_VIADUCT("damagedViaduct"),

    /**
     * The road is obstructed or partially obstructed by one or more fallen power cables.
     * 
     */
    @XmlEnumValue("fallenPowerCables")
    FALLEN_POWER_CABLES("fallenPowerCables"),

    /**
     * Traffic may be disrupted due to an explosion hazard from gas escaping in or near the roadway.
     * 
     */
    @XmlEnumValue("gasLeak")
    GAS_LEAK("gasLeak"),

    /**
     * Weak bridge capable of carrying a reduced load, typically with a reduced weight limit restriction imposed.
     * 
     */
    @XmlEnumValue("weakBridge")
    WEAK_BRIDGE("weakBridge"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    InfrastructureDamageTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InfrastructureDamageTypeEnum fromValue(String v) {
        for (InfrastructureDamageTypeEnum c: InfrastructureDamageTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}