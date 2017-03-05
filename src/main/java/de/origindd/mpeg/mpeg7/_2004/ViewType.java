//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ViewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ViewType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence>
 *         &lt;element name="Target" type="{urn:mpeg:mpeg7:schema:2004}SignalType"/>
 *         &lt;element name="Source" type="{urn:mpeg:mpeg7:schema:2004}SignalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewType", propOrder = {
    "target",
    "source"
})
@XmlSeeAlso({
    FrequencyViewType.class,
    SpaceResolutionViewType.class,
    ResolutionViewType.class,
    SpaceViewType.class,
    SpaceFrequencyViewType.class
})
public abstract class ViewType
    extends DSType
{

    @XmlElement(name = "Target", required = true)
    protected SignalType target;
    @XmlElement(name = "Source")
    protected SignalType source;

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link SignalType }
     *     
     */
    public SignalType getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalType }
     *     
     */
    public void setTarget(SignalType value) {
        this.target = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SignalType }
     *     
     */
    public SignalType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalType }
     *     
     */
    public void setSource(SignalType value) {
        this.source = value;
    }

}