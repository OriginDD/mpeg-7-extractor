//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpegv.dcv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InclineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="pitchAngle" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}InclineAngleType" />
 *       &lt;attribute name="yawAngle" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}InclineAngleType" />
 *       &lt;attribute name="rollAngle" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}InclineAngleType" />
 *       &lt;attribute name="pitchSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="yawSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="rollSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pitchAcceleration" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="yawAcceleration" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="rollAcceleration" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InclineType")
public class InclineType {

    @XmlAttribute(name = "pitchAngle")
    protected Integer pitchAngle;
    @XmlAttribute(name = "yawAngle")
    protected Integer yawAngle;
    @XmlAttribute(name = "rollAngle")
    protected Integer rollAngle;
    @XmlAttribute(name = "pitchSpeed")
    protected Float pitchSpeed;
    @XmlAttribute(name = "yawSpeed")
    protected Float yawSpeed;
    @XmlAttribute(name = "rollSpeed")
    protected Float rollSpeed;
    @XmlAttribute(name = "pitchAcceleration")
    protected Float pitchAcceleration;
    @XmlAttribute(name = "yawAcceleration")
    protected Float yawAcceleration;
    @XmlAttribute(name = "rollAcceleration")
    protected Float rollAcceleration;

    /**
     * Gets the value of the pitchAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPitchAngle() {
        return pitchAngle;
    }

    /**
     * Sets the value of the pitchAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPitchAngle(Integer value) {
        this.pitchAngle = value;
    }

    /**
     * Gets the value of the yawAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYawAngle() {
        return yawAngle;
    }

    /**
     * Sets the value of the yawAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYawAngle(Integer value) {
        this.yawAngle = value;
    }

    /**
     * Gets the value of the rollAngle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRollAngle() {
        return rollAngle;
    }

    /**
     * Sets the value of the rollAngle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRollAngle(Integer value) {
        this.rollAngle = value;
    }

    /**
     * Gets the value of the pitchSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPitchSpeed() {
        return pitchSpeed;
    }

    /**
     * Sets the value of the pitchSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPitchSpeed(Float value) {
        this.pitchSpeed = value;
    }

    /**
     * Gets the value of the yawSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYawSpeed() {
        return yawSpeed;
    }

    /**
     * Sets the value of the yawSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYawSpeed(Float value) {
        this.yawSpeed = value;
    }

    /**
     * Gets the value of the rollSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRollSpeed() {
        return rollSpeed;
    }

    /**
     * Sets the value of the rollSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRollSpeed(Float value) {
        this.rollSpeed = value;
    }

    /**
     * Gets the value of the pitchAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPitchAcceleration() {
        return pitchAcceleration;
    }

    /**
     * Sets the value of the pitchAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPitchAcceleration(Float value) {
        this.pitchAcceleration = value;
    }

    /**
     * Gets the value of the yawAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getYawAcceleration() {
        return yawAcceleration;
    }

    /**
     * Sets the value of the yawAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setYawAcceleration(Float value) {
        this.yawAcceleration = value;
    }

    /**
     * Gets the value of the rollAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRollAcceleration() {
        return rollAcceleration;
    }

    /**
     * Sets the value of the rollAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRollAcceleration(Float value) {
        this.rollAcceleration = value;
    }

}
