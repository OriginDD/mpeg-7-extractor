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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveTowardPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveTowardPreferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-SEPV-NS}MotionPreferenceBaseType">
 *       &lt;attribute name="maxMoveDistance" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="maxMoveSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxMoveAccel" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="distanceUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *       &lt;attribute name="speedUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *       &lt;attribute name="accelUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveTowardPreferenceType")
public class MoveTowardPreferenceType
    extends MotionPreferenceBaseType
{

    @XmlAttribute(name = "maxMoveDistance")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxMoveDistance;
    @XmlAttribute(name = "maxMoveSpeed")
    protected Float maxMoveSpeed;
    @XmlAttribute(name = "maxMoveAccel")
    protected Float maxMoveAccel;
    @XmlAttribute(name = "distanceUnit")
    protected String distanceUnit;
    @XmlAttribute(name = "speedUnit")
    protected String speedUnit;
    @XmlAttribute(name = "accelUnit")
    protected String accelUnit;

    /**
     * Gets the value of the maxMoveDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxMoveDistance() {
        return maxMoveDistance;
    }

    /**
     * Sets the value of the maxMoveDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxMoveDistance(Long value) {
        this.maxMoveDistance = value;
    }

    /**
     * Gets the value of the maxMoveSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxMoveSpeed() {
        return maxMoveSpeed;
    }

    /**
     * Sets the value of the maxMoveSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxMoveSpeed(Float value) {
        this.maxMoveSpeed = value;
    }

    /**
     * Gets the value of the maxMoveAccel property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxMoveAccel() {
        return maxMoveAccel;
    }

    /**
     * Sets the value of the maxMoveAccel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxMoveAccel(Float value) {
        this.maxMoveAccel = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
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

    /**
     * Gets the value of the accelUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccelUnit() {
        return accelUnit;
    }

    /**
     * Sets the value of the accelUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccelUnit(String value) {
        this.accelUnit = value;
    }

}
