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
import javax.xml.bind.annotation.XmlType;


/**
 * A publication containing one or more journey times
 * 
 * <p>Java class for JourneyTimePublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyTimePublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="journeyTimes" type="{http://www.thalesgroup.com/NTIS/Datex2Extensions/2.0}JourneyTimes"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyTimePublication", namespace = "http://www.thalesgroup.com/NTIS/Datex2Extensions/2.0", propOrder = {
    "journeyTimes"
})
public class JourneyTimePublication
    extends PayloadPublication
{

    @XmlElement(namespace = "", required = true)
    protected JourneyTimes journeyTimes;

    /**
     * Gets the value of the journeyTimes property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyTimes }
     *     
     */
    public JourneyTimes getJourneyTimes() {
        return journeyTimes;
    }

    /**
     * Sets the value of the journeyTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyTimes }
     *     
     */
    public void setJourneyTimes(JourneyTimes value) {
        this.journeyTimes = value;
    }

}