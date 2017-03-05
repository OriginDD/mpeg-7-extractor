//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpegv.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClockTickTimeDeltaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClockTickTimeDeltaType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-CT-NS}TimeStampType">
 *       &lt;attribute name="timeScale" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="ptsDelta" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClockTickTimeDeltaType")
public class ClockTickTimeDeltaType
    extends TimeStampType
{

    @XmlAttribute(name = "timeScale")
    @XmlSchemaType(name = "unsignedInt")
    protected Long timeScale;
    @XmlAttribute(name = "ptsDelta")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ptsDelta;

    /**
     * Gets the value of the timeScale property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTimeScale() {
        return timeScale;
    }

    /**
     * Sets the value of the timeScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTimeScale(Long value) {
        this.timeScale = value;
    }

    /**
     * Gets the value of the ptsDelta property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPtsDelta() {
        return ptsDelta;
    }

    /**
     * Sets the value of the ptsDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPtsDelta(Long value) {
        this.ptsDelta = value;
    }

}