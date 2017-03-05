//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpegv.sedl;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for ReferenceEffectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceEffectType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}SEMBaseType">
 *       &lt;attGroup ref="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}SEMBaseAttributes"/>
 *       &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceEffectType")
public class ReferenceEffectType
    extends SEMBaseType
{

    @XmlAttribute(name = "uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "activate")
    protected Boolean activate;
    @XmlAttribute(name = "duration")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger duration;
    @XmlAttribute(name = "fade")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fade;
    @XmlAttribute(name = "alt")
    @XmlSchemaType(name = "anyURI")
    protected String alt;
    @XmlAttribute(name = "priority")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger priority;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "adaptType")
    protected AdaptTypeType adaptType;
    @XmlAttribute(name = "adaptRange")
    protected Long adaptRange;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the activate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivate() {
        return activate;
    }

    /**
     * Sets the value of the activate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivate(Boolean value) {
        this.activate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the fade property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFade() {
        return fade;
    }

    /**
     * Sets the value of the fade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFade(BigInteger value) {
        this.fade = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt(String value) {
        this.alt = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the adaptType property.
     * 
     * @return
     *     possible object is
     *     {@link AdaptTypeType }
     *     
     */
    public AdaptTypeType getAdaptType() {
        return adaptType;
    }

    /**
     * Sets the value of the adaptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptTypeType }
     *     
     */
    public void setAdaptType(AdaptTypeType value) {
        this.adaptType = value;
    }

    /**
     * Gets the value of the adaptRange property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getAdaptRange() {
        if (adaptRange == null) {
            return  10L;
        } else {
            return adaptRange;
        }
    }

    /**
     * Sets the value of the adaptRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdaptRange(Long value) {
        this.adaptRange = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
