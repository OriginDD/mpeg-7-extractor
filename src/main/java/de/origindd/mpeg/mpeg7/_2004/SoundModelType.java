//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoundModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoundModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}ContinuousHiddenMarkovModelType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="SoundClassLabel" type="{urn:mpeg:mpeg7:schema:2004}TermUseType"/>
 *         &lt;element name="SpectrumBasis" type="{urn:mpeg:mpeg7:schema:2004}AudioSpectrumBasisType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SoundModelRef" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundModelType", propOrder = {
    "soundClassLabel",
    "spectrumBasis"
})
public class SoundModelType
    extends ContinuousHiddenMarkovModelType
{

    @XmlElement(name = "SoundClassLabel")
    protected TermUseType soundClassLabel;
    @XmlElement(name = "SpectrumBasis")
    protected AudioSpectrumBasisType spectrumBasis;
    @XmlAttribute(name = "SoundModelRef")
    @XmlSchemaType(name = "anyURI")
    protected String soundModelRef;

    /**
     * Gets the value of the soundClassLabel property.
     * 
     * @return
     *     possible object is
     *     {@link TermUseType }
     *     
     */
    public TermUseType getSoundClassLabel() {
        return soundClassLabel;
    }

    /**
     * Sets the value of the soundClassLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUseType }
     *     
     */
    public void setSoundClassLabel(TermUseType value) {
        this.soundClassLabel = value;
    }

    /**
     * Gets the value of the spectrumBasis property.
     * 
     * @return
     *     possible object is
     *     {@link AudioSpectrumBasisType }
     *     
     */
    public AudioSpectrumBasisType getSpectrumBasis() {
        return spectrumBasis;
    }

    /**
     * Sets the value of the spectrumBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioSpectrumBasisType }
     *     
     */
    public void setSpectrumBasis(AudioSpectrumBasisType value) {
        this.spectrumBasis = value;
    }

    /**
     * Gets the value of the soundModelRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoundModelRef() {
        return soundModelRef;
    }

    /**
     * Sets the value of the soundModelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoundModelRef(String value) {
        this.soundModelRef = value;
    }

}
