//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpegv.siv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.kowohl.mpeg.mpegv.ct.Float3DVectorType;
import de.kowohl.mpeg.mpegv.iidl.SensedInfoBaseType;


/**
 * <p>Java class for TorqueSensorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TorqueSensorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-IIDL-NS}SensedInfoBaseType">
 *       &lt;sequence>
 *         &lt;element name="Torque" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}Float3DVectorType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="unit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TorqueSensorType", propOrder = {
    "torque"
})
public class TorqueSensorType
    extends SensedInfoBaseType
{

    @XmlElement(name = "Torque")
    protected Float3DVectorType torque;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the torque property.
     * 
     * @return
     *     possible object is
     *     {@link Float3DVectorType }
     *     
     */
    public Float3DVectorType getTorque() {
        return torque;
    }

    /**
     * Sets the value of the torque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float3DVectorType }
     *     
     */
    public void setTorque(Float3DVectorType value) {
        this.torque = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
