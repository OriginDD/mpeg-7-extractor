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
 * <p>Java class for TimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}NaturalEnvironmentCharacteristicBaseType">
 *       &lt;sequence>
 *         &lt;element name="Time" type="{urn:mpeg:mpeg7:schema:2001}TimeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", propOrder = {
    "time"
})
public class TimeType
    extends NaturalEnvironmentCharacteristicBaseType
{

    @XmlElement(name = "Time", required = true)
    protected de.kowohl.mpeg.mpeg7._2001.TimeType time;

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link de.kowohl.mpeg.mpeg7._2001.TimeType }
     *     
     */
    public de.kowohl.mpeg.mpeg7._2001.TimeType getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link de.kowohl.mpeg.mpeg7._2001.TimeType }
     *     
     */
    public void setTime(de.kowohl.mpeg.mpeg7._2001.TimeType value) {
        this.time = value;
    }

}
