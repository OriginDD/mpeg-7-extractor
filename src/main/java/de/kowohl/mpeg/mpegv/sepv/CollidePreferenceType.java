//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.kowohl.mpeg.mpegv.sepv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollidePreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollidePreferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-SEPV-NS}MotionPreferenceBaseType">
 *       &lt;attribute name="maxCollideSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="speedUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollidePreferenceType")
public class CollidePreferenceType
    extends MotionPreferenceBaseType
{

    @XmlAttribute(name = "maxCollideSpeed")
    protected Float maxCollideSpeed;
    @XmlAttribute(name = "speedUnit")
    protected String speedUnit;

    /**
     * Gets the value of the maxCollideSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxCollideSpeed() {
        return maxCollideSpeed;
    }

    /**
     * Sets the value of the maxCollideSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxCollideSpeed(Float value) {
        this.maxCollideSpeed = value;
    }

    /**
     * Gets the value of the speedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedUnit() {
        return speedUnit;
    }

    /**
     * Sets the value of the speedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedUnit(String value) {
        this.speedUnit = value;
    }

}
