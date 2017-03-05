//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolutionViewType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}ViewType">
 *       &lt;sequence>
 *         &lt;element name="FrequencyPartition" type="{urn:mpeg:mpeg7:schema:2004}PartitionType" minOccurs="0"/>
 *         &lt;element name="Filtering" type="{urn:mpeg:mpeg7:schema:2004}FilteringType" minOccurs="0"/>
 *         &lt;element name="DownSamplingFactor" type="{urn:mpeg:mpeg7:schema:2004}SignalPlaneSampleType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionViewType", propOrder = {
    "frequencyPartition",
    "filtering",
    "downSamplingFactor"
})
public class ResolutionViewType
    extends ViewType
{

    @XmlElement(name = "FrequencyPartition")
    protected PartitionType frequencyPartition;
    @XmlElement(name = "Filtering")
    protected FilteringType filtering;
    @XmlElement(name = "DownSamplingFactor", required = true)
    protected SignalPlaneSampleType downSamplingFactor;

    /**
     * Gets the value of the frequencyPartition property.
     * 
     * @return
     *     possible object is
     *     {@link PartitionType }
     *     
     */
    public PartitionType getFrequencyPartition() {
        return frequencyPartition;
    }

    /**
     * Sets the value of the frequencyPartition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartitionType }
     *     
     */
    public void setFrequencyPartition(PartitionType value) {
        this.frequencyPartition = value;
    }

    /**
     * Gets the value of the filtering property.
     * 
     * @return
     *     possible object is
     *     {@link FilteringType }
     *     
     */
    public FilteringType getFiltering() {
        return filtering;
    }

    /**
     * Sets the value of the filtering property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilteringType }
     *     
     */
    public void setFiltering(FilteringType value) {
        this.filtering = value;
    }

    /**
     * Gets the value of the downSamplingFactor property.
     * 
     * @return
     *     possible object is
     *     {@link SignalPlaneSampleType }
     *     
     */
    public SignalPlaneSampleType getDownSamplingFactor() {
        return downSamplingFactor;
    }

    /**
     * Sets the value of the downSamplingFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalPlaneSampleType }
     *     
     */
    public void setDownSamplingFactor(SignalPlaneSampleType value) {
        this.downSamplingFactor = value;
    }

}