//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.kowohl.mpeg.mpegv.scdv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.kowohl.mpeg.mpegv.cidl.SensorCapabilityBaseType;
import de.kowohl.mpeg.mpegv.ct.Float3DVectorType;


/**
 * <p>Java class for AmbientNoiseSensorCapabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmbientNoiseSensorCapabilityType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-CIDL-NS}SensorCapabilityBaseType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}Float3DVectorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmbientNoiseSensorCapabilityType", propOrder = {
    "location"
})
public class AmbientNoiseSensorCapabilityType
    extends SensorCapabilityBaseType
{

    @XmlElement(name = "Location")
    protected Float3DVectorType location;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Float3DVectorType }
     *     
     */
    public Float3DVectorType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float3DVectorType }
     *     
     */
    public void setLocation(Float3DVectorType value) {
        this.location = value;
    }

}
