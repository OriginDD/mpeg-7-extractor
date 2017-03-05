//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpegv.siv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.kowohl.mpeg.mpegv.iidl.SensedInfoBaseType;


/**
 * <p>Java class for MotionSensorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotionSensorType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-IIDL-NS}SensedInfoBaseType">
 *       &lt;sequence>
 *         &lt;element name="Position" type="{urn:mpeg:mpeg-v:2010:01-SIV-NS}PositionSensorType" minOccurs="0"/>
 *         &lt;element name="Orientation" type="{urn:mpeg:mpeg-v:2010:01-SIV-NS}OrientationSensorType" minOccurs="0"/>
 *         &lt;element name="Velocity" type="{urn:mpeg:mpeg-v:2010:01-SIV-NS}VelocitySensorType" minOccurs="0"/>
 *         &lt;element name="AngularVelocity" type="{urn:mpeg:mpeg-v:2010:01-SIV-NS}AngularVelocitySensorType" minOccurs="0"/>
 *         &lt;element name="Acceleration" type="{urn:mpeg:mpeg-v:2010:01-SIV-NS}AccelerationSensorType" minOccurs="0"/>
 *         &lt;element name="AngularAcceleration" type="{urn:mpeg:mpeg-v:2010:01-SIV-NS}AngularAccelerationSensorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotionSensorType", propOrder = {
    "position",
    "orientation",
    "velocity",
    "angularVelocity",
    "acceleration",
    "angularAcceleration"
})
public class MotionSensorType
    extends SensedInfoBaseType
{

    @XmlElement(name = "Position")
    protected PositionSensorType position;
    @XmlElement(name = "Orientation")
    protected OrientationSensorType orientation;
    @XmlElement(name = "Velocity")
    protected VelocitySensorType velocity;
    @XmlElement(name = "AngularVelocity")
    protected AngularVelocitySensorType angularVelocity;
    @XmlElement(name = "Acceleration")
    protected AccelerationSensorType acceleration;
    @XmlElement(name = "AngularAcceleration")
    protected AngularAccelerationSensorType angularAcceleration;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionSensorType }
     *     
     */
    public PositionSensorType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionSensorType }
     *     
     */
    public void setPosition(PositionSensorType value) {
        this.position = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationSensorType }
     *     
     */
    public OrientationSensorType getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationSensorType }
     *     
     */
    public void setOrientation(OrientationSensorType value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the velocity property.
     * 
     * @return
     *     possible object is
     *     {@link VelocitySensorType }
     *     
     */
    public VelocitySensorType getVelocity() {
        return velocity;
    }

    /**
     * Sets the value of the velocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link VelocitySensorType }
     *     
     */
    public void setVelocity(VelocitySensorType value) {
        this.velocity = value;
    }

    /**
     * Gets the value of the angularVelocity property.
     * 
     * @return
     *     possible object is
     *     {@link AngularVelocitySensorType }
     *     
     */
    public AngularVelocitySensorType getAngularVelocity() {
        return angularVelocity;
    }

    /**
     * Sets the value of the angularVelocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngularVelocitySensorType }
     *     
     */
    public void setAngularVelocity(AngularVelocitySensorType value) {
        this.angularVelocity = value;
    }

    /**
     * Gets the value of the acceleration property.
     * 
     * @return
     *     possible object is
     *     {@link AccelerationSensorType }
     *     
     */
    public AccelerationSensorType getAcceleration() {
        return acceleration;
    }

    /**
     * Sets the value of the acceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccelerationSensorType }
     *     
     */
    public void setAcceleration(AccelerationSensorType value) {
        this.acceleration = value;
    }

    /**
     * Gets the value of the angularAcceleration property.
     * 
     * @return
     *     possible object is
     *     {@link AngularAccelerationSensorType }
     *     
     */
    public AngularAccelerationSensorType getAngularAcceleration() {
        return angularAcceleration;
    }

    /**
     * Sets the value of the angularAcceleration property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngularAccelerationSensorType }
     *     
     */
    public void setAngularAcceleration(AngularAccelerationSensorType value) {
        this.angularAcceleration = value;
    }

}
