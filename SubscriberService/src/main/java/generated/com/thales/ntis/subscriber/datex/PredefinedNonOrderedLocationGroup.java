//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An identifiable versioned instance of a predefined group of non ordered locations (i.e. more than one).
 * 
 * <p>Java class for PredefinedNonOrderedLocationGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedNonOrderedLocationGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PredefinedLocationContainer">
 *       &lt;sequence>
 *         &lt;element name="predefinedNonOrderedLocationGroupName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/2/2_0}PredefinedLocation" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="predefinedNonOrderedLocationGroupExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedNonOrderedLocationGroup", propOrder = {
    "predefinedNonOrderedLocationGroupName",
    "predefinedLocation",
    "predefinedNonOrderedLocationGroupExtension"
})
public class PredefinedNonOrderedLocationGroup
    extends PredefinedLocationContainer
{

    protected MultilingualString predefinedNonOrderedLocationGroupName;
    @XmlElement(required = true)
    protected List<PredefinedLocation> predefinedLocation;
    protected ExtensionType predefinedNonOrderedLocationGroupExtension;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPredefinedNonOrderedLocationGroupName() {
        return predefinedNonOrderedLocationGroupName;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupName(MultilingualString value) {
        this.predefinedNonOrderedLocationGroupName = value;
    }

    /**
     * Gets the value of the predefinedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocation }
     * 
     * 
     */
    public List<PredefinedLocation> getPredefinedLocation() {
        if (predefinedLocation == null) {
            predefinedLocation = new ArrayList<PredefinedLocation>();
        }
        return this.predefinedLocation;
    }

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedNonOrderedLocationGroupExtension() {
        return predefinedNonOrderedLocationGroupExtension;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupExtension(ExtensionType value) {
        this.predefinedNonOrderedLocationGroupExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}