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
 * An identifiable instance of a traffic/travel situation comprising one or more traffic/travel circumstances which are linked by one or more causal relationships. Each traffic/travel circumstance is represented by a Situation Record.
 * 
 * <p>Java class for Situation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Situation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overallSeverity" type="{http://datex2.eu/schema/2/2_0}SeverityEnum" minOccurs="0"/>
 *         &lt;element name="relatedSituation" type="{http://datex2.eu/schema/2/2_0}_SituationVersionedReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="situationVersionTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2/2_0}HeaderInformation"/>
 *         &lt;element name="situationRecord" type="{http://datex2.eu/schema/2/2_0}SituationRecord" maxOccurs="unbounded"/>
 *         &lt;element name="situationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Situation", propOrder = {
    "overallSeverity",
    "relatedSituation",
    "situationVersionTime",
    "headerInformation",
    "situationRecord",
    "situationExtension"
})
public class Situation {

    protected SeverityEnum overallSeverity;
    protected List<SituationVersionedReference> relatedSituation;
    protected XMLGregorianCalendar situationVersionTime;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SituationRecord> situationRecord;
    protected ExtensionType situationExtension;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the overallSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnum }
     *     
     */
    public SeverityEnum getOverallSeverity() {
        return overallSeverity;
    }

    /**
     * Sets the value of the overallSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnum }
     *     
     */
    public void setOverallSeverity(SeverityEnum value) {
        this.overallSeverity = value;
    }

    /**
     * Gets the value of the relatedSituation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedSituation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationVersionedReference }
     * 
     * 
     */
    public List<SituationVersionedReference> getRelatedSituation() {
        if (relatedSituation == null) {
            relatedSituation = new ArrayList<SituationVersionedReference>();
        }
        return this.relatedSituation;
    }

    /**
     * Gets the value of the situationVersionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSituationVersionTime() {
        return situationVersionTime;
    }

    /**
     * Sets the value of the situationVersionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSituationVersionTime(XMLGregorianCalendar value) {
        this.situationVersionTime = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the situationRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRecord }
     * 
     * 
     */
    public List<SituationRecord> getSituationRecord() {
        if (situationRecord == null) {
            situationRecord = new ArrayList<SituationRecord>();
        }
        return this.situationRecord;
    }

    /**
     * Gets the value of the situationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationExtension() {
        return situationExtension;
    }

    /**
     * Sets the value of the situationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationExtension(ExtensionType value) {
        this.situationExtension = value;
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