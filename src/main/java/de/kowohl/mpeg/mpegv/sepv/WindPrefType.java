//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.kowohl.mpeg.mpegv.sepv;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import de.kowohl.mpeg.mpegv.cidl.UserSensoryPreferenceBaseType;


/**
 * <p>Java class for WindPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindPrefType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-CIDL-NS}UserSensoryPreferenceBaseType">
 *       &lt;attribute name="maxIntensity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="unit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindPrefType")
public class WindPrefType
    extends UserSensoryPreferenceBaseType
{

    @XmlAttribute(name = "maxIntensity")
    protected BigInteger maxIntensity;
    @XmlAttribute(name = "unit")
    protected String unit;

    /**
     * Gets the value of the maxIntensity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxIntensity() {
        return maxIntensity;
    }

    /**
     * Sets the value of the maxIntensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxIntensity(BigInteger value) {
        this.maxIntensity = value;
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
