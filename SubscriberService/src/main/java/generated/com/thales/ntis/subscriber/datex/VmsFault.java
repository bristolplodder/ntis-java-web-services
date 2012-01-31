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
 * Details of the fault which is being reported for the specified variable message sign panel.
 * 
 * <p>Java class for VmsFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Fault">
 *       &lt;sequence>
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/2/2_0}VmsFaultEnum"/>
 *         &lt;element name="vmsFaultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsFault", propOrder = {
    "vmsFault",
    "vmsFaultExtension"
})
public class VmsFault
    extends Fault
{

    @XmlElement(required = true)
    protected VmsFaultEnum vmsFault;
    protected ExtensionType vmsFaultExtension;

    /**
     * Gets the value of the vmsFault property.
     * 
     * @return
     *     possible object is
     *     {@link VmsFaultEnum }
     *     
     */
    public VmsFaultEnum getVmsFault() {
        return vmsFault;
    }

    /**
     * Sets the value of the vmsFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsFaultEnum }
     *     
     */
    public void setVmsFault(VmsFaultEnum value) {
        this.vmsFault = value;
    }

    /**
     * Gets the value of the vmsFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsFaultExtension() {
        return vmsFaultExtension;
    }

    /**
     * Sets the value of the vmsFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsFaultExtension(ExtensionType value) {
        this.vmsFaultExtension = value;
    }

}