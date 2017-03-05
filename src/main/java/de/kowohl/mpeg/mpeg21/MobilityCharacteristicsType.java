//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpeg21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MobilityCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MobilityCharacteristicsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}UserCharacteristicBaseType">
 *       &lt;sequence>
 *         &lt;element name="UpdateInterval" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}UpdateIntervalType" minOccurs="0"/>
 *         &lt;element name="Directivity" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}DirectivityType" minOccurs="0"/>
 *         &lt;element name="Erraticity" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}ErraticityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobilityCharacteristicsType", propOrder = {
    "updateInterval",
    "directivity",
    "erraticity"
})
public class MobilityCharacteristicsType
    extends UserCharacteristicBaseType
{

    @XmlElement(name = "UpdateInterval")
    protected UpdateIntervalType updateInterval;
    @XmlElement(name = "Directivity")
    protected DirectivityType directivity;
    @XmlElement(name = "Erraticity")
    protected ErraticityType erraticity;

    /**
     * Gets the value of the updateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateIntervalType }
     *     
     */
    public UpdateIntervalType getUpdateInterval() {
        return updateInterval;
    }

    /**
     * Sets the value of the updateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateIntervalType }
     *     
     */
    public void setUpdateInterval(UpdateIntervalType value) {
        this.updateInterval = value;
    }

    /**
     * Gets the value of the directivity property.
     * 
     * @return
     *     possible object is
     *     {@link DirectivityType }
     *     
     */
    public DirectivityType getDirectivity() {
        return directivity;
    }

    /**
     * Sets the value of the directivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectivityType }
     *     
     */
    public void setDirectivity(DirectivityType value) {
        this.directivity = value;
    }

    /**
     * Gets the value of the erraticity property.
     * 
     * @return
     *     possible object is
     *     {@link ErraticityType }
     *     
     */
    public ErraticityType getErraticity() {
        return erraticity;
    }

    /**
     * Sets the value of the erraticity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErraticityType }
     *     
     */
    public void setErraticity(ErraticityType value) {
        this.erraticity = value;
    }

}
