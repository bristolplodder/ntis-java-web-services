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
 * Specification of the default value for traffic status on a group of predefined locations on the road network. Only when traffic status differs from this value at a location in the group need a value be sent.
 * 
 * <p>Java class for ReferenceSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedNonOrderedLocationGroupReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedNonOrderedLocationGroupVersionedReference" minOccurs="0"/>
 *         &lt;element name="trafficStatusDefault" type="{http://datex2.eu/schema/2/2_0}TrafficStatusEnum" minOccurs="0"/>
 *         &lt;element name="referenceSettingsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSettings", propOrder = {
    "predefinedNonOrderedLocationGroupReference",
    "trafficStatusDefault",
    "referenceSettingsExtension"
})
public class ReferenceSettings {

    protected PredefinedNonOrderedLocationGroupVersionedReference predefinedNonOrderedLocationGroupReference;
    protected TrafficStatusEnum trafficStatusDefault;
    protected ExtensionType referenceSettingsExtension;

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public PredefinedNonOrderedLocationGroupVersionedReference getPredefinedNonOrderedLocationGroupReference() {
        return predefinedNonOrderedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupReference(PredefinedNonOrderedLocationGroupVersionedReference value) {
        this.predefinedNonOrderedLocationGroupReference = value;
    }

    /**
     * Gets the value of the trafficStatusDefault property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatusDefault() {
        return trafficStatusDefault;
    }

    /**
     * Sets the value of the trafficStatusDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusDefault(TrafficStatusEnum value) {
        this.trafficStatusDefault = value;
    }

    /**
     * Gets the value of the referenceSettingsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReferenceSettingsExtension() {
        return referenceSettingsExtension;
    }

    /**
     * Sets the value of the referenceSettingsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReferenceSettingsExtension(ExtensionType value) {
        this.referenceSettingsExtension = value;
    }

}