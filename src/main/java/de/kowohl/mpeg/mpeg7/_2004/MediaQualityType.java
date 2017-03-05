//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MediaQualityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaQualityType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DType">
 *       &lt;sequence>
 *         &lt;element name="QualityRating" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:mpeg:mpeg7:schema:2004}RatingType">
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="subjective"/>
 *                       &lt;enumeration value="objective"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RatingSource" type="{urn:mpeg:mpeg7:schema:2004}AgentType" minOccurs="0"/>
 *         &lt;element name="RatingInformationLocator" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PerceptibleDefects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VisualDefects" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AudioDefects" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaQualityType", propOrder = {
    "qualityRating",
    "ratingSource",
    "ratingInformationLocator",
    "perceptibleDefects"
})
public class MediaQualityType
    extends DType
{

    @XmlElement(name = "QualityRating", required = true)
    protected List<QualityRating> qualityRating;
    @XmlElement(name = "RatingSource")
    protected AgentType ratingSource;
    @XmlElement(name = "RatingInformationLocator")
    protected List<ReferenceType> ratingInformationLocator;
    @XmlElement(name = "PerceptibleDefects")
    protected PerceptibleDefects perceptibleDefects;

    /**
     * Gets the value of the qualityRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityRating }
     * 
     * 
     */
    public List<QualityRating> getQualityRating() {
        if (qualityRating == null) {
            qualityRating = new ArrayList<QualityRating>();
        }
        return this.qualityRating;
    }

    /**
     * Gets the value of the ratingSource property.
     * 
     * @return
     *     possible object is
     *     {@link AgentType }
     *     
     */
    public AgentType getRatingSource() {
        return ratingSource;
    }

    /**
     * Sets the value of the ratingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentType }
     *     
     */
    public void setRatingSource(AgentType value) {
        this.ratingSource = value;
    }

    /**
     * Gets the value of the ratingInformationLocator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratingInformationLocator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatingInformationLocator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRatingInformationLocator() {
        if (ratingInformationLocator == null) {
            ratingInformationLocator = new ArrayList<ReferenceType>();
        }
        return this.ratingInformationLocator;
    }

    /**
     * Gets the value of the perceptibleDefects property.
     * 
     * @return
     *     possible object is
     *     {@link PerceptibleDefects }
     *     
     */
    public PerceptibleDefects getPerceptibleDefects() {
        return perceptibleDefects;
    }

    /**
     * Sets the value of the perceptibleDefects property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerceptibleDefects }
     *     
     */
    public void setPerceptibleDefects(PerceptibleDefects value) {
        this.perceptibleDefects = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="VisualDefects" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AudioDefects" type="{urn:mpeg:mpeg7:schema:2004}ControlledTermUseType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "visualDefects",
        "audioDefects"
    })
    public static class PerceptibleDefects {

        @XmlElement(name = "VisualDefects")
        protected List<ControlledTermUseType> visualDefects;
        @XmlElement(name = "AudioDefects")
        protected List<ControlledTermUseType> audioDefects;

        /**
         * Gets the value of the visualDefects property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the visualDefects property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVisualDefects().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ControlledTermUseType }
         * 
         * 
         */
        public List<ControlledTermUseType> getVisualDefects() {
            if (visualDefects == null) {
                visualDefects = new ArrayList<ControlledTermUseType>();
            }
            return this.visualDefects;
        }

        /**
         * Gets the value of the audioDefects property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the audioDefects property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAudioDefects().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ControlledTermUseType }
         * 
         * 
         */
        public List<ControlledTermUseType> getAudioDefects() {
            if (audioDefects == null) {
                audioDefects = new ArrayList<ControlledTermUseType>();
            }
            return this.audioDefects;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}RatingType">
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="subjective"/>
     *             &lt;enumeration value="objective"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class QualityRating
        extends RatingType
    {

        @XmlAttribute(name = "type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}