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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkCapabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkCapabilityType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}NetworkCharacteristicBaseType">
 *       &lt;attribute name="maxCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="minGuaranteed" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="inSequenceDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="errorDelivery" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="errorCorrection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="maxPacketSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkCapabilityType")
public class NetworkCapabilityType
    extends NetworkCharacteristicBaseType
{

    @XmlAttribute(name = "maxCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxCapacity;
    @XmlAttribute(name = "minGuaranteed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minGuaranteed;
    @XmlAttribute(name = "inSequenceDelivery")
    protected Boolean inSequenceDelivery;
    @XmlAttribute(name = "errorDelivery")
    protected Boolean errorDelivery;
    @XmlAttribute(name = "errorCorrection")
    protected Boolean errorCorrection;
    @XmlAttribute(name = "maxPacketSize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxPacketSize;

    /**
     * Gets the value of the maxCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets the value of the maxCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxCapacity(BigInteger value) {
        this.maxCapacity = value;
    }

    /**
     * Gets the value of the minGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinGuaranteed() {
        return minGuaranteed;
    }

    /**
     * Sets the value of the minGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinGuaranteed(BigInteger value) {
        this.minGuaranteed = value;
    }

    /**
     * Gets the value of the inSequenceDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInSequenceDelivery() {
        return inSequenceDelivery;
    }

    /**
     * Sets the value of the inSequenceDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInSequenceDelivery(Boolean value) {
        this.inSequenceDelivery = value;
    }

    /**
     * Gets the value of the errorDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorDelivery() {
        return errorDelivery;
    }

    /**
     * Sets the value of the errorDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorDelivery(Boolean value) {
        this.errorDelivery = value;
    }

    /**
     * Gets the value of the errorCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErrorCorrection() {
        return errorCorrection;
    }

    /**
     * Sets the value of the errorCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErrorCorrection(Boolean value) {
        this.errorCorrection = value;
    }

    /**
     * Gets the value of the maxPacketSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPacketSize() {
        return maxPacketSize;
    }

    /**
     * Sets the value of the maxPacketSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPacketSize(BigInteger value) {
        this.maxPacketSize = value;
    }

}