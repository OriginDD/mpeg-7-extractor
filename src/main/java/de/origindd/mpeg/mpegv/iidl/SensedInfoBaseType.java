//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpegv.iidl;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import de.origindd.mpeg.mpegv.ct.TimeStampType;
import de.origindd.mpeg.mpegv.siv.AmbientNoiseSensorType;
import de.origindd.mpeg.mpegv.siv.AtmosphericPressureSensorType;
import de.origindd.mpeg.mpegv.siv.HumiditySensorType;
import de.origindd.mpeg.mpegv.siv.IntelligentCameraType;
import de.origindd.mpeg.mpegv.siv.MotionSensorType;
import de.origindd.mpeg.mpegv.siv.PositionSensorType;
import de.origindd.mpeg.mpegv.siv.PressureSensorType;
import de.origindd.mpeg.mpegv.siv.VelocitySensorType;
import de.origindd.mpeg.mpegv.siv.AccelerationSensorType;
import de.origindd.mpeg.mpegv.siv.AngularAccelerationSensorType;
import de.origindd.mpeg.mpegv.siv.AngularVelocitySensorType;
import de.origindd.mpeg.mpegv.siv.DistanceSensorType;
import de.origindd.mpeg.mpegv.siv.ForceSensorType;
import de.origindd.mpeg.mpegv.siv.LightSensorType;
import de.origindd.mpeg.mpegv.siv.OrientationSensorType;
import de.origindd.mpeg.mpegv.siv.TemperatureSensorType;
import de.origindd.mpeg.mpegv.siv.TorqueSensorType;


/**
 * <p>Java class for SensedInfoBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensedInfoBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeStamp" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}TimeStampType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:mpeg:mpeg-v:2010:01-IIDL-NS}sensedInfoBaseAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensedInfoBaseType", propOrder = {
    "timeStamp"
})
@XmlSeeAlso({
    IntelligentCameraType.class,
    VelocitySensorType.class,
    ForceSensorType.class,
    MotionSensorType.class,
    AtmosphericPressureSensorType.class,
    AngularAccelerationSensorType.class,
    PressureSensorType.class,
    TemperatureSensorType.class,
    LightSensorType.class,
    OrientationSensorType.class,
    AmbientNoiseSensorType.class,
    PositionSensorType.class,
    AngularVelocitySensorType.class,
    HumiditySensorType.class,
    AccelerationSensorType.class,
    TorqueSensorType.class,
    DistanceSensorType.class
})
public abstract class SensedInfoBaseType {

    @XmlElement(name = "TimeStamp")
    protected TimeStampType timeStamp;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "sensorIdRef")
    @XmlSchemaType(name = "anyURI")
    protected String sensorIdRef;
    @XmlAttribute(name = "linkedlist")
    @XmlSchemaType(name = "anyURI")
    protected String linkedlist;
    @XmlAttribute(name = "groupID")
    @XmlSchemaType(name = "anyURI")
    protected String groupID;
    @XmlAttribute(name = "activate")
    protected Boolean activate;
    @XmlAttribute(name = "priority")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger priority;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link TimeStampType }
     *     
     */
    public TimeStampType getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeStampType }
     *     
     */
    public void setTimeStamp(TimeStampType value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sensorIdRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorIdRef() {
        return sensorIdRef;
    }

    /**
     * Sets the value of the sensorIdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorIdRef(String value) {
        this.sensorIdRef = value;
    }

    /**
     * Gets the value of the linkedlist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedlist() {
        return linkedlist;
    }

    /**
     * Sets the value of the linkedlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedlist(String value) {
        this.linkedlist = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the activate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivate() {
        return activate;
    }

    /**
     * Sets the value of the activate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivate(Boolean value) {
        this.activate = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        if (priority == null) {
            return new BigInteger("0");
        } else {
            return priority;
        }
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

}
