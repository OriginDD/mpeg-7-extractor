//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.origindd.mpeg.mpegv.sev;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import de.origindd.mpeg.mpeg7._2004.FloatMatrixType;
import de.origindd.mpeg.mpegv.sedl.EffectBaseType;


/**
 * <p>Java class for PassiveKinestheticForceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassiveKinestheticForceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}EffectBaseType">
 *       &lt;sequence>
 *         &lt;element name="PassiveKinestheticForce" type="{urn:mpeg:mpeg7:schema:2004}FloatMatrixType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timeSamples" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassiveKinestheticForceType", propOrder = {
    "passiveKinestheticForce"
})
public class PassiveKinestheticForceType
    extends EffectBaseType
{

    @XmlElement(name = "PassiveKinestheticForce", required = true)
    protected FloatMatrixType passiveKinestheticForce;
    @XmlAttribute(name = "timeSamples", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger timeSamples;

    /**
     * Gets the value of the passiveKinestheticForce property.
     * 
     * @return
     *     possible object is
     *     {@link FloatMatrixType }
     *     
     */
    public FloatMatrixType getPassiveKinestheticForce() {
        return passiveKinestheticForce;
    }

    /**
     * Sets the value of the passiveKinestheticForce property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatMatrixType }
     *     
     */
    public void setPassiveKinestheticForce(FloatMatrixType value) {
        this.passiveKinestheticForce = value;
    }

    /**
     * Gets the value of the timeSamples property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeSamples() {
        return timeSamples;
    }

    /**
     * Sets the value of the timeSamples property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeSamples(BigInteger value) {
        this.timeSamples = value;
    }

}
