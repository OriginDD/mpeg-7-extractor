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
 * <p>Java class for MouseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MouseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}UserInteractionInputSupportBaseType">
 *       &lt;sequence>
 *         &lt;element name="Mouse" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}GenericMouseType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MouseType", propOrder = {
    "mouse"
})
public class MouseType
    extends UserInteractionInputSupportBaseType
{

    @XmlElement(name = "Mouse", required = true)
    protected GenericMouseType mouse;

    /**
     * Gets the value of the mouse property.
     * 
     * @return
     *     possible object is
     *     {@link GenericMouseType }
     *     
     */
    public GenericMouseType getMouse() {
        return mouse;
    }

    /**
     * Sets the value of the mouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericMouseType }
     *     
     */
    public void setMouse(GenericMouseType value) {
        this.mouse = value;
    }

}