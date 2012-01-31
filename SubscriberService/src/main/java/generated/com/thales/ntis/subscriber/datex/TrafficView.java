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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An identifiable instance of a traffic view at a single point in time relating to a predefined location set, comprising one or more linear traffic views each of which comprise one or more traffic view records.
 * 
 * <p>Java class for TrafficView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trafficViewTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/>
 *         &lt;element name="predefinedNonOrderedLocationGroupReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedNonOrderedLocationGroupVersionedReference"/>
 *         &lt;element name="linearTrafficView" type="{http://datex2.eu/schema/2/2_0}LinearTrafficView" maxOccurs="unbounded"/>
 *         &lt;element name="trafficViewExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficView", propOrder = {
    "trafficViewTime",
    "predefinedNonOrderedLocationGroupReference",
    "linearTrafficView",
    "trafficViewExtension"
})
public class TrafficView {

    @XmlElement(required = true)
    protected XMLGregorianCalendar trafficViewTime;
    @XmlElement(required = true)
    protected PredefinedNonOrderedLocationGroupVersionedReference predefinedNonOrderedLocationGroupReference;
    @XmlElement(required = true)
    protected List<LinearTrafficView> linearTrafficView;
    protected ExtensionType trafficViewExtension;
    @XmlAttribute(required = true)
    protected String id;

    /**
     * Gets the value of the trafficViewTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrafficViewTime() {
        return trafficViewTime;
    }

    /**
     * Sets the value of the trafficViewTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrafficViewTime(XMLGregorianCalendar value) {
        this.trafficViewTime = value;
    }

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
     * Gets the value of the linearTrafficView property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linearTrafficView property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinearTrafficView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearTrafficView }
     * 
     * 
     */
    public List<LinearTrafficView> getLinearTrafficView() {
        if (linearTrafficView == null) {
            linearTrafficView = new ArrayList<LinearTrafficView>();
        }
        return this.linearTrafficView;
    }

    /**
     * Gets the value of the trafficViewExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficViewExtension() {
        return trafficViewExtension;
    }

    /**
     * Sets the value of the trafficViewExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficViewExtension(ExtensionType value) {
        this.trafficViewExtension = value;
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

}