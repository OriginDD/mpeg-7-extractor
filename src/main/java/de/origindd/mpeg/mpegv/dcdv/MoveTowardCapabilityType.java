//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.origindd.mpeg.mpegv.dcdv;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveTowardCapabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveTowardCapabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="maxXDistance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxYDistance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxZDistance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="distanceUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *       &lt;attribute name="maxXSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxYSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxZSpeed" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="speedUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *       &lt;attribute name="maxXAccel" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxYAccel" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxZAccel" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="accelUnit" type="{urn:mpeg:mpeg-v:2010:01-CT-NS}unitType" />
 *       &lt;attribute name="xDistanceLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="yDistanceLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="zDistanceLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="xSpeedLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="ySpeedLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="zSpeedLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="xAccelLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="yAccelLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="zAccelLevels" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveTowardCapabilityType")
public class MoveTowardCapabilityType {

    @XmlAttribute(name = "maxXDistance")
    protected Float maxXDistance;
    @XmlAttribute(name = "maxYDistance")
    protected Float maxYDistance;
    @XmlAttribute(name = "maxZDistance")
    protected Float maxZDistance;
    @XmlAttribute(name = "distanceUnit")
    protected String distanceUnit;
    @XmlAttribute(name = "maxXSpeed")
    protected Float maxXSpeed;
    @XmlAttribute(name = "maxYSpeed")
    protected Float maxYSpeed;
    @XmlAttribute(name = "maxZSpeed")
    protected Float maxZSpeed;
    @XmlAttribute(name = "speedUnit")
    protected String speedUnit;
    @XmlAttribute(name = "maxXAccel")
    protected Float maxXAccel;
    @XmlAttribute(name = "maxYAccel")
    protected Float maxYAccel;
    @XmlAttribute(name = "maxZAccel")
    protected Float maxZAccel;
    @XmlAttribute(name = "accelUnit")
    protected String accelUnit;
    @XmlAttribute(name = "xDistanceLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger xDistanceLevels;
    @XmlAttribute(name = "yDistanceLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger yDistanceLevels;
    @XmlAttribute(name = "zDistanceLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger zDistanceLevels;
    @XmlAttribute(name = "xSpeedLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger xSpeedLevels;
    @XmlAttribute(name = "ySpeedLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger ySpeedLevels;
    @XmlAttribute(name = "zSpeedLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger zSpeedLevels;
    @XmlAttribute(name = "xAccelLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger xAccelLevels;
    @XmlAttribute(name = "yAccelLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger yAccelLevels;
    @XmlAttribute(name = "zAccelLevels")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger zAccelLevels;

    /**
     * Gets the value of the maxXDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxXDistance() {
        return maxXDistance;
    }

    /**
     * Sets the value of the maxXDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxXDistance(Float value) {
        this.maxXDistance = value;
    }

    /**
     * Gets the value of the maxYDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxYDistance() {
        return maxYDistance;
    }

    /**
     * Sets the value of the maxYDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxYDistance(Float value) {
        this.maxYDistance = value;
    }

    /**
     * Gets the value of the maxZDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxZDistance() {
        return maxZDistance;
    }

    /**
     * Sets the value of the maxZDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxZDistance(Float value) {
        this.maxZDistance = value;
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
     * Gets the value of the maxXSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxXSpeed() {
        return maxXSpeed;
    }

    /**
     * Sets the value of the maxXSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxXSpeed(Float value) {
        this.maxXSpeed = value;
    }

    /**
     * Gets the value of the maxYSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxYSpeed() {
        return maxYSpeed;
    }

    /**
     * Sets the value of the maxYSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxYSpeed(Float value) {
        this.maxYSpeed = value;
    }

    /**
     * Gets the value of the maxZSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxZSpeed() {
        return maxZSpeed;
    }

    /**
     * Sets the value of the maxZSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxZSpeed(Float value) {
        this.maxZSpeed = value;
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
     * Gets the value of the maxXAccel property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxXAccel() {
        return maxXAccel;
    }

    /**
     * Sets the value of the maxXAccel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxXAccel(Float value) {
        this.maxXAccel = value;
    }

    /**
     * Gets the value of the maxYAccel property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxYAccel() {
        return maxYAccel;
    }

    /**
     * Sets the value of the maxYAccel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxYAccel(Float value) {
        this.maxYAccel = value;
    }

    /**
     * Gets the value of the maxZAccel property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxZAccel() {
        return maxZAccel;
    }

    /**
     * Sets the value of the maxZAccel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxZAccel(Float value) {
        this.maxZAccel = value;
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

    /**
     * Gets the value of the xDistanceLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXDistanceLevels() {
        return xDistanceLevels;
    }

    /**
     * Sets the value of the xDistanceLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXDistanceLevels(BigInteger value) {
        this.xDistanceLevels = value;
    }

    /**
     * Gets the value of the yDistanceLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYDistanceLevels() {
        return yDistanceLevels;
    }

    /**
     * Sets the value of the yDistanceLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYDistanceLevels(BigInteger value) {
        this.yDistanceLevels = value;
    }

    /**
     * Gets the value of the zDistanceLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZDistanceLevels() {
        return zDistanceLevels;
    }

    /**
     * Sets the value of the zDistanceLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZDistanceLevels(BigInteger value) {
        this.zDistanceLevels = value;
    }

    /**
     * Gets the value of the xSpeedLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXSpeedLevels() {
        return xSpeedLevels;
    }

    /**
     * Sets the value of the xSpeedLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXSpeedLevels(BigInteger value) {
        this.xSpeedLevels = value;
    }

    /**
     * Gets the value of the ySpeedLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYSpeedLevels() {
        return ySpeedLevels;
    }

    /**
     * Sets the value of the ySpeedLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYSpeedLevels(BigInteger value) {
        this.ySpeedLevels = value;
    }

    /**
     * Gets the value of the zSpeedLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZSpeedLevels() {
        return zSpeedLevels;
    }

    /**
     * Sets the value of the zSpeedLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZSpeedLevels(BigInteger value) {
        this.zSpeedLevels = value;
    }

    /**
     * Gets the value of the xAccelLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXAccelLevels() {
        return xAccelLevels;
    }

    /**
     * Sets the value of the xAccelLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXAccelLevels(BigInteger value) {
        this.xAccelLevels = value;
    }

    /**
     * Gets the value of the yAccelLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYAccelLevels() {
        return yAccelLevels;
    }

    /**
     * Sets the value of the yAccelLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYAccelLevels(BigInteger value) {
        this.yAccelLevels = value;
    }

    /**
     * Gets the value of the zAccelLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZAccelLevels() {
        return zAccelLevels;
    }

    /**
     * Sets the value of the zAccelLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZAccelLevels(BigInteger value) {
        this.zAccelLevels = value;
    }

}