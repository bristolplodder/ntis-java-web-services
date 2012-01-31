//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.31 at 02:44:31 PM GMT 
//


package com.thales.ntis.subscriber.datex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for JourneyTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="camera1" type="{http://www.thalesgroup.com/NTIS/Datex2Extensions/2.0}Guid"/>
 *         &lt;element name="camera2" type="{http://www.thalesgroup.com/NTIS/Datex2Extensions/2.0}Guid"/>
 *         &lt;element name="timeStamp" type="{http://datex2.eu/schema/2/2_0}DateTime"/>
 *         &lt;element name="travelTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="isSuspect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyTime", namespace = "http://www.thalesgroup.com/NTIS/Datex2Extensions/2.0", propOrder = {
    "camera1",
    "camera2",
    "timeStamp",
    "travelTime",
    "isSuspect"
})
public class JourneyTime {

    @XmlElement(namespace = "", required = true)
    protected String camera1;
    @XmlElement(namespace = "", required = true)
    protected String camera2;
    @XmlElement(namespace = "", required = true)
    protected XMLGregorianCalendar timeStamp;
    @XmlElement(namespace = "")
    @XmlSchemaType(name = "unsignedInt")
    protected long travelTime;
    @XmlElement(namespace = "")
    protected boolean isSuspect;

    /**
     * Gets the value of the camera1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamera1() {
        return camera1;
    }

    /**
     * Sets the value of the camera1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamera1(String value) {
        this.camera1 = value;
    }

    /**
     * Gets the value of the camera2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamera2() {
        return camera2;
    }

    /**
     * Sets the value of the camera2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamera2(String value) {
        this.camera2 = value;
    }

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the travelTime property.
     * 
     */
    public long getTravelTime() {
        return travelTime;
    }

    /**
     * Sets the value of the travelTime property.
     * 
     */
    public void setTravelTime(long value) {
        this.travelTime = value;
    }

    /**
     * Gets the value of the isSuspect property.
     * 
     */
    public boolean isIsSuspect() {
        return isSuspect;
    }

    /**
     * Sets the value of the isSuspect property.
     * 
     */
    public void setIsSuspect(boolean value) {
        this.isSuspect = value;
    }

}