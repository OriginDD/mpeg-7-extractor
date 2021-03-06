//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.origindd.mpeg.mpegv.cidl;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import de.origindd.mpeg.mpeg21.TerminalCapabilityBaseType;
import de.origindd.mpeg.mpegv.dcdv.ColorCorrectionCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.CoolingCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.FogCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.HeatingCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.KinestheticCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.RigidBodyMotionCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.ScentCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.SprayerCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.TactileCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.VibrationCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.WindCapabilityType;
import de.origindd.mpeg.mpegv.dcdv.LightCapabilityType;


/**
 * <p>Java class for SensoryDeviceCapabilityBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensoryDeviceCapabilityBaseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}TerminalCapabilityBaseType">
 *       &lt;attGroup ref="{urn:mpeg:mpeg-v:2010:01-CIDL-NS}sensoryDeviceCapabilityAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensoryDeviceCapabilityBaseType")
@XmlSeeAlso({
    TactileCapabilityType.class,
    ColorCorrectionCapabilityType.class,
    LightCapabilityType.class,
    WindCapabilityType.class,
    RigidBodyMotionCapabilityType.class,
    HeatingCapabilityType.class,
    ScentCapabilityType.class,
    VibrationCapabilityType.class,
    SprayerCapabilityType.class,
    CoolingCapabilityType.class,
    KinestheticCapabilityType.class,
    FogCapabilityType.class
})
public abstract class SensoryDeviceCapabilityBaseType
    extends TerminalCapabilityBaseType
{

    @XmlAttribute(name = "zerothOrderDelayTime")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger zerothOrderDelayTime;
    @XmlAttribute(name = "firstOrderDelayTime")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger firstOrderDelayTime;
    @XmlAttribute(name = "locator")
    protected String locator;

    /**
     * Gets the value of the zerothOrderDelayTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZerothOrderDelayTime() {
        return zerothOrderDelayTime;
    }

    /**
     * Sets the value of the zerothOrderDelayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZerothOrderDelayTime(BigInteger value) {
        this.zerothOrderDelayTime = value;
    }

    /**
     * Gets the value of the firstOrderDelayTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstOrderDelayTime() {
        return firstOrderDelayTime;
    }

    /**
     * Sets the value of the firstOrderDelayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstOrderDelayTime(BigInteger value) {
        this.firstOrderDelayTime = value;
    }

    /**
     * Gets the value of the locator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocator() {
        return locator;
    }

    /**
     * Sets the value of the locator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocator(String value) {
        this.locator = value;
    }

}
