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
 * <p>Java class for MixtureCameraMotionSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MixtureCameraMotionSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}CameraMotionSegmentType">
 *       &lt;sequence>
 *         &lt;element name="FractionalPresence" type="{urn:mpeg:mpeg7:schema:2004}FractionalPresenceType"/>
 *         &lt;element name="AmountOfMotion" type="{urn:mpeg:mpeg7:schema:2004}MixtureAmountOfMotionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MixtureCameraMotionSegmentType", propOrder = {
    "fractionalPresence",
    "amountOfMotion"
})
public class MixtureCameraMotionSegmentType
    extends CameraMotionSegmentType
{

    @XmlElement(name = "FractionalPresence", required = true)
    protected FractionalPresenceType fractionalPresence;
    @XmlElement(name = "AmountOfMotion", required = true)
    protected MixtureAmountOfMotionType amountOfMotion;

    /**
     * Gets the value of the fractionalPresence property.
     * 
     * @return
     *     possible object is
     *     {@link FractionalPresenceType }
     *     
     */
    public FractionalPresenceType getFractionalPresence() {
        return fractionalPresence;
    }

    /**
     * Sets the value of the fractionalPresence property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionalPresenceType }
     *     
     */
    public void setFractionalPresence(FractionalPresenceType value) {
        this.fractionalPresence = value;
    }

    /**
     * Gets the value of the amountOfMotion property.
     * 
     * @return
     *     possible object is
     *     {@link MixtureAmountOfMotionType }
     *     
     */
    public MixtureAmountOfMotionType getAmountOfMotion() {
        return amountOfMotion;
    }

    /**
     * Sets the value of the amountOfMotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link MixtureAmountOfMotionType }
     *     
     */
    public void setAmountOfMotion(MixtureAmountOfMotionType value) {
        this.amountOfMotion = value;
    }

}