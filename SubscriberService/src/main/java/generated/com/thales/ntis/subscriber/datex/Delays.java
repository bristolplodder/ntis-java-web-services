//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The details of the delays being caused by the situation element defined in the situation record. It is recommended to only use one of the optional attributes to avoid confusion.
 * 
 * <p>Java class for Delays complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Delays">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delayBand" type="{http://datex2.eu/schema/2/2_0}DelayBandEnum" minOccurs="0"/>
 *         &lt;element name="delaysType" type="{http://datex2.eu/schema/2/2_0}DelaysTypeEnum" minOccurs="0"/>
 *         &lt;element name="delayTimeValue" type="{http://datex2.eu/schema/2/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="delaysExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delays", propOrder = {
    "delayBand",
    "delaysType",
    "delayTimeValue",
    "delaysExtension"
})
public class Delays {

    protected DelayBandEnum delayBand;
    protected DelaysTypeEnum delaysType;
    protected Float delayTimeValue;
    protected ExtensionType delaysExtension;

    /**
     * Gets the value of the delayBand property.
     * 
     * @return
     *     possible object is
     *     {@link DelayBandEnum }
     *     
     */
    public DelayBandEnum getDelayBand() {
        return delayBand;
    }

    /**
     * Sets the value of the delayBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayBandEnum }
     *     
     */
    public void setDelayBand(DelayBandEnum value) {
        this.delayBand = value;
    }

    /**
     * Gets the value of the delaysType property.
     * 
     * @return
     *     possible object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public DelaysTypeEnum getDelaysType() {
        return delaysType;
    }

    /**
     * Sets the value of the delaysType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysTypeEnum }
     *     
     */
    public void setDelaysType(DelaysTypeEnum value) {
        this.delaysType = value;
    }

    /**
     * Gets the value of the delayTimeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDelayTimeValue() {
        return delayTimeValue;
    }

    /**
     * Sets the value of the delayTimeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDelayTimeValue(Float value) {
        this.delayTimeValue = value;
    }

    /**
     * Gets the value of the delaysExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDelaysExtension() {
        return delaysExtension;
    }

    /**
     * Sets the value of the delaysExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDelaysExtension(ExtensionType value) {
        this.delaysExtension = value;
    }

}