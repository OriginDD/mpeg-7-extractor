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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordingRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordingRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContentIdentifier" type="{urn:mpeg:mpeg7:schema:2004}UniqueIDType"/>
 *         &lt;element name="DisseminationSource" type="{urn:mpeg:mpeg7:schema:2004}TextualType" minOccurs="0"/>
 *         &lt;element name="Title" type="{urn:mpeg:mpeg7:schema:2004}TextualType" minOccurs="0"/>
 *         &lt;element name="RecordingPeriod">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="SpecificTimePeriod" type="{urn:mpeg:mpeg7:schema:2004}TimeType"/>
 *                   &lt;element name="EntireTimePeriod" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecordingLocationPreferences" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="RecordingSourceTypePreferences" maxOccurs="2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="OriginalContents" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Summary" type="{urn:mpeg:mpeg7:schema:2004}summaryComponentType" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecordAssociatedData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="type" use="required">
 *                   &lt;simpleType>
 *                     &lt;union>
 *                       &lt;simpleType>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                           &lt;enumeration value="none"/>
 *                           &lt;enumeration value="all"/>
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                       &lt;simpleType>
 *                         &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termAliasReferenceType">
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                       &lt;simpleType>
 *                         &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termURIReferenceType">
 *                         &lt;/restriction>
 *                       &lt;/simpleType>
 *                     &lt;/union>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingRequestType", propOrder = {
    "contentIdentifier",
    "disseminationSource",
    "title",
    "recordingPeriod",
    "recordingLocationPreferences",
    "recordingSourceTypePreferences",
    "recordAssociatedData"
})
public class RecordingRequestType {

    @XmlElement(name = "ContentIdentifier", required = true)
    protected UniqueIDType contentIdentifier;
    @XmlElement(name = "DisseminationSource")
    protected TextualType disseminationSource;
    @XmlElement(name = "Title")
    protected TextualType title;
    @XmlElement(name = "RecordingPeriod", required = true)
    protected RecordingPeriod recordingPeriod;
    @XmlElement(name = "RecordingLocationPreferences", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> recordingLocationPreferences;
    @XmlElement(name = "RecordingSourceTypePreferences", required = true)
    protected List<RecordingSourceTypePreferences> recordingSourceTypePreferences;
    @XmlElement(name = "RecordAssociatedData")
    protected RecordAssociatedData recordAssociatedData;

    /**
     * Gets the value of the contentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getContentIdentifier() {
        return contentIdentifier;
    }

    /**
     * Sets the value of the contentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setContentIdentifier(UniqueIDType value) {
        this.contentIdentifier = value;
    }

    /**
     * Gets the value of the disseminationSource property.
     * 
     * @return
     *     possible object is
     *     {@link TextualType }
     *     
     */
    public TextualType getDisseminationSource() {
        return disseminationSource;
    }

    /**
     * Sets the value of the disseminationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualType }
     *     
     */
    public void setDisseminationSource(TextualType value) {
        this.disseminationSource = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link TextualType }
     *     
     */
    public TextualType getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualType }
     *     
     */
    public void setTitle(TextualType value) {
        this.title = value;
    }

    /**
     * Gets the value of the recordingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordingPeriod }
     *     
     */
    public RecordingPeriod getRecordingPeriod() {
        return recordingPeriod;
    }

    /**
     * Sets the value of the recordingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordingPeriod }
     *     
     */
    public void setRecordingPeriod(RecordingPeriod value) {
        this.recordingPeriod = value;
    }

    /**
     * Gets the value of the recordingLocationPreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordingLocationPreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordingLocationPreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRecordingLocationPreferences() {
        if (recordingLocationPreferences == null) {
            recordingLocationPreferences = new ArrayList<String>();
        }
        return this.recordingLocationPreferences;
    }

    /**
     * Gets the value of the recordingSourceTypePreferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordingSourceTypePreferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordingSourceTypePreferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordingSourceTypePreferences }
     * 
     * 
     */
    public List<RecordingSourceTypePreferences> getRecordingSourceTypePreferences() {
        if (recordingSourceTypePreferences == null) {
            recordingSourceTypePreferences = new ArrayList<RecordingSourceTypePreferences>();
        }
        return this.recordingSourceTypePreferences;
    }

    /**
     * Gets the value of the recordAssociatedData property.
     * 
     * @return
     *     possible object is
     *     {@link RecordAssociatedData }
     *     
     */
    public RecordAssociatedData getRecordAssociatedData() {
        return recordAssociatedData;
    }

    /**
     * Sets the value of the recordAssociatedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordAssociatedData }
     *     
     */
    public void setRecordAssociatedData(RecordAssociatedData value) {
        this.recordAssociatedData = value;
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
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;union>
     *             &lt;simpleType>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                 &lt;enumeration value="none"/>
     *                 &lt;enumeration value="all"/>
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *             &lt;simpleType>
     *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termAliasReferenceType">
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *             &lt;simpleType>
     *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termURIReferenceType">
     *               &lt;/restriction>
     *             &lt;/simpleType>
     *           &lt;/union>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RecordAssociatedData {

        @XmlAttribute(name = "type", required = true)
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="SpecificTimePeriod" type="{urn:mpeg:mpeg7:schema:2004}TimeType"/>
     *         &lt;element name="EntireTimePeriod" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "specificTimePeriod",
        "entireTimePeriod"
    })
    public static class RecordingPeriod {

        @XmlElement(name = "SpecificTimePeriod")
        protected TimeType specificTimePeriod;
        @XmlElement(name = "EntireTimePeriod")
        protected Object entireTimePeriod;

        /**
         * Gets the value of the specificTimePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link TimeType }
         *     
         */
        public TimeType getSpecificTimePeriod() {
            return specificTimePeriod;
        }

        /**
         * Sets the value of the specificTimePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimeType }
         *     
         */
        public void setSpecificTimePeriod(TimeType value) {
            this.specificTimePeriod = value;
        }

        /**
         * Gets the value of the entireTimePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEntireTimePeriod() {
            return entireTimePeriod;
        }

        /**
         * Sets the value of the entireTimePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEntireTimePeriod(Object value) {
            this.entireTimePeriod = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="OriginalContents" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Summary" type="{urn:mpeg:mpeg7:schema:2004}summaryComponentType" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originalContents",
        "summary"
    })
    public static class RecordingSourceTypePreferences {

        @XmlElement(name = "OriginalContents")
        protected Object originalContents;
        @XmlElement(name = "Summary")
        protected List<String> summary;

        /**
         * Gets the value of the originalContents property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getOriginalContents() {
            return originalContents;
        }

        /**
         * Sets the value of the originalContents property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setOriginalContents(Object value) {
            this.originalContents = value;
        }

        /**
         * Gets the value of the summary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the summary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSummary() {
            if (summary == null) {
                summary = new ArrayList<String>();
            }
            return this.summary;
        }

    }

}
