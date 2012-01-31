//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Generic data that is either measured or calculated (elaborated) at the same time or over the same time period.
 * 
 * <p>Java class for BasicData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementOrCalculationPeriod" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="measurementOrCalculationTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="pertinentLocation" type="{http://datex2.eu/schema/2/2_0}GroupOfLocations" minOccurs="0"/>
 *         &lt;element name="basicDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="measurementOrCalculatedTimePrecision" type="{http://datex2.eu/schema/2/2_0}TimePrecisionEnum" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicData", propOrder = {
    "measurementOrCalculationPeriod",
    "measurementOrCalculationTime",
    "pertinentLocation",
    "basicDataExtension"
})
@XmlSeeAlso({
    TravelTimeData.class,
    TrafficStatus.class,
    WeatherData.class,
    TrafficData.class
})
public abstract class BasicData {

    protected Float measurementOrCalculationPeriod;
    protected XMLGregorianCalendar measurementOrCalculationTime;
    protected GroupOfLocations pertinentLocation;
    protected ExtensionType basicDataExtension;
    @XmlAttribute
    protected TimePrecisionEnum measurementOrCalculatedTimePrecision;

    /**
     * Gets the value of the measurementOrCalculationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMeasurementOrCalculationPeriod() {
        return measurementOrCalculationPeriod;
    }

    /**
     * Sets the value of the measurementOrCalculationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMeasurementOrCalculationPeriod(Float value) {
        this.measurementOrCalculationPeriod = value;
    }

    /**
     * Gets the value of the measurementOrCalculationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMeasurementOrCalculationTime() {
        return measurementOrCalculationTime;
    }

    /**
     * Sets the value of the measurementOrCalculationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMeasurementOrCalculationTime(XMLGregorianCalendar value) {
        this.measurementOrCalculationTime = value;
    }

    /**
     * Gets the value of the pertinentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getPertinentLocation() {
        return pertinentLocation;
    }

    /**
     * Sets the value of the pertinentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setPertinentLocation(GroupOfLocations value) {
        this.pertinentLocation = value;
    }

    /**
     * Gets the value of the basicDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getBasicDataExtension() {
        return basicDataExtension;
    }

    /**
     * Sets the value of the basicDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setBasicDataExtension(ExtensionType value) {
        this.basicDataExtension = value;
    }

    /**
     * Gets the value of the measurementOrCalculatedTimePrecision property.
     * 
     * @return
     *     possible object is
     *     {@link TimePrecisionEnum }
     *     
     */
    public TimePrecisionEnum getMeasurementOrCalculatedTimePrecision() {
        return measurementOrCalculatedTimePrecision;
    }

    /**
     * Sets the value of the measurementOrCalculatedTimePrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePrecisionEnum }
     *     
     */
    public void setMeasurementOrCalculatedTimePrecision(TimePrecisionEnum value) {
        this.measurementOrCalculatedTimePrecision = value;
    }

}