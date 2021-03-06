//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.origindd.mpeg.mpeg21;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import de.origindd.mpeg.mpeg7._2001.ControlledTermUseType;


/**
 * <p>Java class for ConversionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="From" type="{urn:mpeg:mpeg7:schema:2001}ControlledTermUseType" minOccurs="0"/>
 *         &lt;element name="To" type="{urn:mpeg:mpeg7:schema:2001}ControlledTermUseType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="weight" type="{urn:mpeg:mpeg7:schema:2001}nonNegativeReal" default="1.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionType", propOrder = {
    "from",
    "to"
})
public class ConversionType
    extends DIABaseType
{

    @XmlElement(name = "From")
    protected ControlledTermUseType from;
    @XmlElement(name = "To", required = true)
    protected ControlledTermUseType to;
    @XmlAttribute(name = "order", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger order;
    @XmlAttribute(name = "weight")
    protected Double weight;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledTermUseType }
     *     
     */
    public ControlledTermUseType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledTermUseType }
     *     
     */
    public void setFrom(ControlledTermUseType value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link ControlledTermUseType }
     *     
     */
    public ControlledTermUseType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlledTermUseType }
     *     
     */
    public void setTo(ControlledTermUseType value) {
        this.to = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getWeight() {
        if (weight == null) {
            return  1.0D;
        } else {
            return weight;
        }
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

}
