//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpeg21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuditoryImpairmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditoryImpairmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}UserCharacteristicBaseType">
 *       &lt;sequence>
 *         &lt;element name="RightEar" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}AudiogramType"/>
 *         &lt;element name="LeftEar" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}AudiogramType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditoryImpairmentType", propOrder = {
    "rightEar",
    "leftEar"
})
public class AuditoryImpairmentType
    extends UserCharacteristicBaseType
{

    @XmlElement(name = "RightEar", required = true)
    protected AudiogramType rightEar;
    @XmlElement(name = "LeftEar", required = true)
    protected AudiogramType leftEar;

    /**
     * Gets the value of the rightEar property.
     * 
     * @return
     *     possible object is
     *     {@link AudiogramType }
     *     
     */
    public AudiogramType getRightEar() {
        return rightEar;
    }

    /**
     * Sets the value of the rightEar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudiogramType }
     *     
     */
    public void setRightEar(AudiogramType value) {
        this.rightEar = value;
    }

    /**
     * Gets the value of the leftEar property.
     * 
     * @return
     *     possible object is
     *     {@link AudiogramType }
     *     
     */
    public AudiogramType getLeftEar() {
        return leftEar;
    }

    /**
     * Sets the value of the leftEar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudiogramType }
     *     
     */
    public void setLeftEar(AudiogramType value) {
        this.leftEar = value;
    }

}
