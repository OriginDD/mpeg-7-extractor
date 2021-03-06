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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AnalyticEditedVideoSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnalyticEditedVideoSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}VideoSegmentType">
 *       &lt;sequence>
 *         &lt;element name="AnalyticEditionAreaDecomposition" type="{urn:mpeg:mpeg7:schema:2004}AnalyticEditedVideoSegmentSpatioTemporalDecompositionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="locationReliability" type="{urn:mpeg:mpeg7:schema:2004}zeroToOneType" />
 *       &lt;attribute name="editingLevelReliability" type="{urn:mpeg:mpeg7:schema:2004}zeroToOneType" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="simple"/>
 *             &lt;enumeration value="composite"/>
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
@XmlType(name = "AnalyticEditedVideoSegmentType", propOrder = {
    "analyticEditionAreaDecomposition"
})
@XmlSeeAlso({
    EditedVideoType.class,
    AnalyticClipType.class,
    AnalyticTransitionType.class
})
public abstract class AnalyticEditedVideoSegmentType
    extends VideoSegmentType
{

    @XmlElement(name = "AnalyticEditionAreaDecomposition")
    protected List<AnalyticEditedVideoSegmentSpatioTemporalDecompositionType> analyticEditionAreaDecomposition;
    @XmlAttribute(name = "locationReliability")
    protected Float locationReliability;
    @XmlAttribute(name = "editingLevelReliability")
    protected Float editingLevelReliability;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the analyticEditionAreaDecomposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analyticEditionAreaDecomposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalyticEditionAreaDecomposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalyticEditedVideoSegmentSpatioTemporalDecompositionType }
     * 
     * 
     */
    public List<AnalyticEditedVideoSegmentSpatioTemporalDecompositionType> getAnalyticEditionAreaDecomposition() {
        if (analyticEditionAreaDecomposition == null) {
            analyticEditionAreaDecomposition = new ArrayList<AnalyticEditedVideoSegmentSpatioTemporalDecompositionType>();
        }
        return this.analyticEditionAreaDecomposition;
    }

    /**
     * Gets the value of the locationReliability property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLocationReliability() {
        return locationReliability;
    }

    /**
     * Sets the value of the locationReliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLocationReliability(Float value) {
        this.locationReliability = value;
    }

    /**
     * Gets the value of the editingLevelReliability property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEditingLevelReliability() {
        return editingLevelReliability;
    }

    /**
     * Sets the value of the editingLevelReliability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEditingLevelReliability(Float value) {
        this.editingLevelReliability = value;
    }

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
