//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediaInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence>
 *         &lt;element name="MediaIdentification" type="{urn:mpeg:mpeg7:schema:2004}MediaIdentificationType" minOccurs="0"/>
 *         &lt;element name="MediaProfile" type="{urn:mpeg:mpeg7:schema:2004}MediaProfileType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaInformationType", propOrder = {
    "mediaIdentification",
    "mediaProfile"
})
public class MediaInformationType
    extends DSType
{

    @XmlElement(name = "MediaIdentification")
    protected MediaIdentificationType mediaIdentification;
    @XmlElement(name = "MediaProfile", required = true)
    protected List<MediaProfileType> mediaProfile;

    /**
     * Gets the value of the mediaIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link MediaIdentificationType }
     *     
     */
    public MediaIdentificationType getMediaIdentification() {
        return mediaIdentification;
    }

    /**
     * Sets the value of the mediaIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaIdentificationType }
     *     
     */
    public void setMediaIdentification(MediaIdentificationType value) {
        this.mediaIdentification = value;
    }

    /**
     * Gets the value of the mediaProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaProfileType }
     * 
     * 
     */
    public List<MediaProfileType> getMediaProfile() {
        if (mediaProfile == null) {
            mediaProfile = new ArrayList<MediaProfileType>();
        }
        return this.mediaProfile;
    }

}
