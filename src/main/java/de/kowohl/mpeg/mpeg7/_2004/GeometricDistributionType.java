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
 * <p>Java class for GeometricDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeometricDistributionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DiscreteDistributionType">
 *       &lt;sequence>
 *         &lt;element name="SuccessProbability" type="{urn:mpeg:mpeg7:schema:2004}DoubleMatrixType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeometricDistributionType", propOrder = {
    "successProbability"
})
public class GeometricDistributionType
    extends DiscreteDistributionType
{

    @XmlElement(name = "SuccessProbability", required = true)
    protected DoubleMatrixType successProbability;

    /**
     * Gets the value of the successProbability property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleMatrixType }
     *     
     */
    public DoubleMatrixType getSuccessProbability() {
        return successProbability;
    }

    /**
     * Sets the value of the successProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleMatrixType }
     *     
     */
    public void setSuccessProbability(DoubleMatrixType value) {
        this.successProbability = value;
    }

}
