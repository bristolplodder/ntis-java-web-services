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
 * <p>Java class for MaintenanceVehicleActionsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaintenanceVehicleActionsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="maintenanceVehiclesMergingIntoTrafficFlow"/>
 *     &lt;enumeration value="saltAndGritSpreading"/>
 *     &lt;enumeration value="slowMoving"/>
 *     &lt;enumeration value="snowClearing"/>
 *     &lt;enumeration value="stoppingToServiceEquipments"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaintenanceVehicleActionsEnum")
@XmlEnum
public enum MaintenanceVehicleActionsEnum {


    /**
     * Maintenance vehicles are merging into the traffic flow creating a potential hazard for road users.
     * 
     */
    @XmlEnumValue("maintenanceVehiclesMergingIntoTrafficFlow")
    MAINTENANCE_VEHICLES_MERGING_INTO_TRAFFIC_FLOW("maintenanceVehiclesMergingIntoTrafficFlow"),

    /**
     * Maintenance vehicle(s) are spreading salt and/or grit.
     * 
     */
    @XmlEnumValue("saltAndGritSpreading")
    SALT_AND_GRIT_SPREADING("saltAndGritSpreading"),

    /**
     * Maintenance vehicles are slow moving.
     * 
     */
    @XmlEnumValue("slowMoving")
    SLOW_MOVING("slowMoving"),

    /**
     * Maintenance vehicle(s) are involved in the clearance of snow.
     * 
     */
    @XmlEnumValue("snowClearing")
    SNOW_CLEARING("snowClearing"),

    /**
     * Maintenance vehicles are stopping to service equipments on or next to the roadway.
     * 
     */
    @XmlEnumValue("stoppingToServiceEquipments")
    STOPPING_TO_SERVICE_EQUIPMENTS("stoppingToServiceEquipments");
    private final String value;

    MaintenanceVehicleActionsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaintenanceVehicleActionsEnum fromValue(String v) {
        for (MaintenanceVehicleActionsEnum c: MaintenanceVehicleActionsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}