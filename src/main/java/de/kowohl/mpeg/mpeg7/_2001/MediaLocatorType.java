//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2001;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaLocatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="MediaUri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="InlineMedia" type="{urn:mpeg:mpeg7:schema:2001}InlineMediaType"/>
 *         &lt;/choice>
 *         &lt;element name="StreamID" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaLocatorType", propOrder = {
    "mediaUri",
    "inlineMedia",
    "streamID"
})
@XmlSeeAlso({
    ImageLocatorType.class,
    TemporalSegmentLocatorType.class
})
public class MediaLocatorType {

    @XmlElement(name = "MediaUri")
    @XmlSchemaType(name = "anyURI")
    protected String mediaUri;
    @XmlElement(name = "InlineMedia")
    protected InlineMediaType inlineMedia;
    @XmlElement(name = "StreamID")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger streamID;

    /**
     * Gets the value of the mediaUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaUri() {
        return mediaUri;
    }

    /**
     * Sets the value of the mediaUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaUri(String value) {
        this.mediaUri = value;
    }

    /**
     * Gets the value of the inlineMedia property.
     * 
     * @return
     *     possible object is
     *     {@link InlineMediaType }
     *     
     */
    public InlineMediaType getInlineMedia() {
        return inlineMedia;
    }

    /**
     * Sets the value of the inlineMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link InlineMediaType }
     *     
     */
    public void setInlineMedia(InlineMediaType value) {
        this.inlineMedia = value;
    }

    /**
     * Gets the value of the streamID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStreamID() {
        return streamID;
    }

    /**
     * Sets the value of the streamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStreamID(BigInteger value) {
        this.streamID = value;
    }

}
