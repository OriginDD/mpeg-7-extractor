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


/**
 * <p>Java class for CodecParameterBitRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodecParameterBitRateType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}CodecParameterBaseType">
 *       &lt;sequence>
 *         &lt;element name="BitRate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="average" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="maximum" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodecParameterBitRateType", propOrder = {
    "bitRate"
})
public class CodecParameterBitRateType
    extends CodecParameterBaseType
{

    @XmlElement(name = "BitRate")
    protected BitRate bitRate;

    /**
     * Gets the value of the bitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BitRate }
     *     
     */
    public BitRate getBitRate() {
        return bitRate;
    }

    /**
     * Sets the value of the bitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BitRate }
     *     
     */
    public void setBitRate(BitRate value) {
        this.bitRate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="average" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="maximum" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BitRate {

        @XmlAttribute(name = "average")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger average;
        @XmlAttribute(name = "maximum")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maximum;

        /**
         * Gets the value of the average property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAverage() {
            return average;
        }

        /**
         * Sets the value of the average property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAverage(BigInteger value) {
            this.average = value;
        }

        /**
         * Gets the value of the maximum property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximum() {
            return maximum;
        }

        /**
         * Sets the value of the maximum property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximum(BigInteger value) {
            this.maximum = value;
        }

    }

}
