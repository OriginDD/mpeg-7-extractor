//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.origindd.mpeg.mpeg21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PerceptualParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerceptualParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="SourcePresence" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SourceWarmth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SourceBrilliance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="RoomPresence" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="RunningReverberance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Envelopment" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="LateReverberance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Heavyness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Liveness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="RefDistance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="FreqLow" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="FreqHigh" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="TimeLimit1" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="TimeLimit2" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="TimeLimit3" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerceptualParametersType", propOrder = {
    "sourcePresence",
    "sourceWarmth",
    "sourceBrilliance",
    "roomPresence",
    "runningReverberance",
    "envelopment",
    "lateReverberance",
    "heavyness",
    "liveness",
    "refDistance",
    "freqLow",
    "freqHigh",
    "timeLimit1",
    "timeLimit2",
    "timeLimit3"
})
public class PerceptualParametersType
    extends DIABaseType
{

    @XmlElement(name = "SourcePresence")
    protected Float sourcePresence;
    @XmlElement(name = "SourceWarmth")
    protected Float sourceWarmth;
    @XmlElement(name = "SourceBrilliance")
    protected Float sourceBrilliance;
    @XmlElement(name = "RoomPresence")
    protected Float roomPresence;
    @XmlElement(name = "RunningReverberance")
    protected Float runningReverberance;
    @XmlElement(name = "Envelopment")
    protected Float envelopment;
    @XmlElement(name = "LateReverberance")
    protected Float lateReverberance;
    @XmlElement(name = "Heavyness")
    protected Float heavyness;
    @XmlElement(name = "Liveness")
    protected Float liveness;
    @XmlElement(name = "RefDistance")
    protected Float refDistance;
    @XmlElement(name = "FreqLow")
    protected Float freqLow;
    @XmlElement(name = "FreqHigh")
    protected Float freqHigh;
    @XmlElement(name = "TimeLimit1")
    protected Float timeLimit1;
    @XmlElement(name = "TimeLimit2")
    protected Float timeLimit2;
    @XmlElement(name = "TimeLimit3")
    protected Float timeLimit3;

    /**
     * Gets the value of the sourcePresence property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSourcePresence() {
        return sourcePresence;
    }

    /**
     * Sets the value of the sourcePresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSourcePresence(Float value) {
        this.sourcePresence = value;
    }

    /**
     * Gets the value of the sourceWarmth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSourceWarmth() {
        return sourceWarmth;
    }

    /**
     * Sets the value of the sourceWarmth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSourceWarmth(Float value) {
        this.sourceWarmth = value;
    }

    /**
     * Gets the value of the sourceBrilliance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSourceBrilliance() {
        return sourceBrilliance;
    }

    /**
     * Sets the value of the sourceBrilliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSourceBrilliance(Float value) {
        this.sourceBrilliance = value;
    }

    /**
     * Gets the value of the roomPresence property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoomPresence() {
        return roomPresence;
    }

    /**
     * Sets the value of the roomPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoomPresence(Float value) {
        this.roomPresence = value;
    }

    /**
     * Gets the value of the runningReverberance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRunningReverberance() {
        return runningReverberance;
    }

    /**
     * Sets the value of the runningReverberance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRunningReverberance(Float value) {
        this.runningReverberance = value;
    }

    /**
     * Gets the value of the envelopment property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEnvelopment() {
        return envelopment;
    }

    /**
     * Sets the value of the envelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEnvelopment(Float value) {
        this.envelopment = value;
    }

    /**
     * Gets the value of the lateReverberance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLateReverberance() {
        return lateReverberance;
    }

    /**
     * Sets the value of the lateReverberance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLateReverberance(Float value) {
        this.lateReverberance = value;
    }

    /**
     * Gets the value of the heavyness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeavyness() {
        return heavyness;
    }

    /**
     * Sets the value of the heavyness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeavyness(Float value) {
        this.heavyness = value;
    }

    /**
     * Gets the value of the liveness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLiveness() {
        return liveness;
    }

    /**
     * Sets the value of the liveness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLiveness(Float value) {
        this.liveness = value;
    }

    /**
     * Gets the value of the refDistance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRefDistance() {
        return refDistance;
    }

    /**
     * Sets the value of the refDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRefDistance(Float value) {
        this.refDistance = value;
    }

    /**
     * Gets the value of the freqLow property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreqLow() {
        return freqLow;
    }

    /**
     * Sets the value of the freqLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreqLow(Float value) {
        this.freqLow = value;
    }

    /**
     * Gets the value of the freqHigh property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreqHigh() {
        return freqHigh;
    }

    /**
     * Sets the value of the freqHigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreqHigh(Float value) {
        this.freqHigh = value;
    }

    /**
     * Gets the value of the timeLimit1 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeLimit1() {
        return timeLimit1;
    }

    /**
     * Sets the value of the timeLimit1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeLimit1(Float value) {
        this.timeLimit1 = value;
    }

    /**
     * Gets the value of the timeLimit2 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeLimit2() {
        return timeLimit2;
    }

    /**
     * Sets the value of the timeLimit2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeLimit2(Float value) {
        this.timeLimit2 = value;
    }

    /**
     * Gets the value of the timeLimit3 property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeLimit3() {
        return timeLimit3;
    }

    /**
     * Sets the value of the timeLimit3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeLimit3(Float value) {
        this.timeLimit3 = value;
    }

}
