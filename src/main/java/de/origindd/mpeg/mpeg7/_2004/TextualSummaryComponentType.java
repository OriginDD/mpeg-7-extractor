//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextualSummaryComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextualSummaryComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DType">
 *       &lt;sequence>
 *         &lt;element name="AudioVisualSourceID" type="{urn:mpeg:mpeg7:schema:2004}UniqueIDType" minOccurs="0"/>
 *         &lt;element name="AudioVisualSourceLocator" type="{urn:mpeg:mpeg7:schema:2004}TemporalSegmentLocatorType" minOccurs="0"/>
 *         &lt;element name="ComponentSourceTime" type="{urn:mpeg:mpeg7:schema:2004}MediaTimeType" minOccurs="0"/>
 *         &lt;element name="FreeText" type="{urn:mpeg:mpeg7:schema:2004}TextualType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SyncTime" type="{urn:mpeg:mpeg7:schema:2004}MediaTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextualSummaryComponentType", propOrder = {
    "audioVisualSourceID",
    "audioVisualSourceLocator",
    "componentSourceTime",
    "freeText",
    "syncTime"
})
public class TextualSummaryComponentType
    extends DType
{

    @XmlElement(name = "AudioVisualSourceID")
    protected UniqueIDType audioVisualSourceID;
    @XmlElement(name = "AudioVisualSourceLocator")
    protected TemporalSegmentLocatorType audioVisualSourceLocator;
    @XmlElement(name = "ComponentSourceTime")
    protected MediaTimeType componentSourceTime;
    @XmlElement(name = "FreeText")
    protected List<TextualType> freeText;
    @XmlElement(name = "SyncTime")
    protected MediaTimeType syncTime;

    /**
     * Gets the value of the audioVisualSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getAudioVisualSourceID() {
        return audioVisualSourceID;
    }

    /**
     * Sets the value of the audioVisualSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setAudioVisualSourceID(UniqueIDType value) {
        this.audioVisualSourceID = value;
    }

    /**
     * Gets the value of the audioVisualSourceLocator property.
     * 
     * @return
     *     possible object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public TemporalSegmentLocatorType getAudioVisualSourceLocator() {
        return audioVisualSourceLocator;
    }

    /**
     * Sets the value of the audioVisualSourceLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporalSegmentLocatorType }
     *     
     */
    public void setAudioVisualSourceLocator(TemporalSegmentLocatorType value) {
        this.audioVisualSourceLocator = value;
    }

    /**
     * Gets the value of the componentSourceTime property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTimeType }
     *     
     */
    public MediaTimeType getComponentSourceTime() {
        return componentSourceTime;
    }

    /**
     * Sets the value of the componentSourceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTimeType }
     *     
     */
    public void setComponentSourceTime(MediaTimeType value) {
        this.componentSourceTime = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextualType }
     * 
     * 
     */
    public List<TextualType> getFreeText() {
        if (freeText == null) {
            freeText = new ArrayList<TextualType>();
        }
        return this.freeText;
    }

    /**
     * Gets the value of the syncTime property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTimeType }
     *     
     */
    public MediaTimeType getSyncTime() {
        return syncTime;
    }

    /**
     * Sets the value of the syncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTimeType }
     *     
     */
    public void setSyncTime(MediaTimeType value) {
        this.syncTime = value;
    }

}