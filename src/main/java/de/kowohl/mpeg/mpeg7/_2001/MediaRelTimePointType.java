//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MediaRelTimePointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaRelTimePointType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2001>mediaTimeOffsetType">
 *       &lt;attribute name="mediaTimeBase" type="{urn:mpeg:mpeg7:schema:2001}xPathRefType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaRelTimePointType", propOrder = {
    "value"
})
public class MediaRelTimePointType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "mediaTimeBase")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaTimeBase;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the mediaTimeBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTimeBase() {
        return mediaTimeBase;
    }

    /**
     * Sets the value of the mediaTimeBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTimeBase(String value) {
        this.mediaTimeBase = value;
    }

}
