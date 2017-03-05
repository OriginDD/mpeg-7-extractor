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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StillRegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StillRegionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SegmentType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="SpatialLocator" type="{urn:mpeg:mpeg7:schema:2004}RegionLocatorType"/>
 *           &lt;element name="SpatialMask" type="{urn:mpeg:mpeg7:schema:2004}SpatialMaskType"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="MediaTimePoint" type="{urn:mpeg:mpeg7:schema:2004}mediaTimePointType"/>
 *           &lt;element name="MediaRelTimePoint" type="{urn:mpeg:mpeg7:schema:2004}MediaRelTimePointType"/>
 *           &lt;element name="MediaRelIncrTimePoint" type="{urn:mpeg:mpeg7:schema:2004}MediaRelIncrTimePointType"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="VisualDescriptor" type="{urn:mpeg:mpeg7:schema:2004}VisualDType"/>
 *           &lt;element name="VisualDescriptionScheme" type="{urn:mpeg:mpeg7:schema:2004}VisualDSType"/>
 *           &lt;element name="GridLayoutDescriptors" type="{urn:mpeg:mpeg7:schema:2004}GridLayoutType"/>
 *           &lt;element name="IlluminationInvariantColor" type="{urn:mpeg:mpeg7:schema:2004}IlluminationInvariantColorType"/>
 *         &lt;/choice>
 *         &lt;element name="MultipleView" type="{urn:mpeg:mpeg7:schema:2004}MultipleViewType" minOccurs="0"/>
 *         &lt;element name="SpatialDecomposition" type="{urn:mpeg:mpeg7:schema:2004}StillRegionSpatialDecompositionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StillRegionType", propOrder = {
    "spatialLocator",
    "spatialMask",
    "mediaTimePoint",
    "mediaRelTimePoint",
    "mediaRelIncrTimePoint",
    "visualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors",
    "multipleView",
    "spatialDecomposition"
})
@XmlSeeAlso({
    ImageTextType.class,
    MosaicType.class
})
public class StillRegionType
    extends SegmentType
{

    @XmlElement(name = "SpatialLocator")
    protected RegionLocatorType spatialLocator;
    @XmlElement(name = "SpatialMask")
    protected SpatialMaskType spatialMask;
    @XmlElement(name = "MediaTimePoint")
    protected String mediaTimePoint;
    @XmlElement(name = "MediaRelTimePoint")
    protected MediaRelTimePointType mediaRelTimePoint;
    @XmlElement(name = "MediaRelIncrTimePoint")
    protected MediaRelIncrTimePointType mediaRelIncrTimePoint;
    @XmlElements({
        @XmlElement(name = "VisualDescriptor", type = VisualDType.class),
        @XmlElement(name = "VisualDescriptionScheme", type = VisualDSType.class),
        @XmlElement(name = "GridLayoutDescriptors", type = GridLayoutType.class),
        @XmlElement(name = "IlluminationInvariantColor", type = IlluminationInvariantColorType.class)
    })
    protected List<Object> visualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors;
    @XmlElement(name = "MultipleView")
    protected MultipleViewType multipleView;
    @XmlElement(name = "SpatialDecomposition")
    protected List<StillRegionSpatialDecompositionType> spatialDecomposition;

    /**
     * Gets the value of the spatialLocator property.
     * 
     * @return
     *     possible object is
     *     {@link RegionLocatorType }
     *     
     */
    public RegionLocatorType getSpatialLocator() {
        return spatialLocator;
    }

    /**
     * Sets the value of the spatialLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionLocatorType }
     *     
     */
    public void setSpatialLocator(RegionLocatorType value) {
        this.spatialLocator = value;
    }

    /**
     * Gets the value of the spatialMask property.
     * 
     * @return
     *     possible object is
     *     {@link SpatialMaskType }
     *     
     */
    public SpatialMaskType getSpatialMask() {
        return spatialMask;
    }

    /**
     * Sets the value of the spatialMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpatialMaskType }
     *     
     */
    public void setSpatialMask(SpatialMaskType value) {
        this.spatialMask = value;
    }

    /**
     * Gets the value of the mediaTimePoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTimePoint() {
        return mediaTimePoint;
    }

    /**
     * Sets the value of the mediaTimePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTimePoint(String value) {
        this.mediaTimePoint = value;
    }

    /**
     * Gets the value of the mediaRelTimePoint property.
     * 
     * @return
     *     possible object is
     *     {@link MediaRelTimePointType }
     *     
     */
    public MediaRelTimePointType getMediaRelTimePoint() {
        return mediaRelTimePoint;
    }

    /**
     * Sets the value of the mediaRelTimePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaRelTimePointType }
     *     
     */
    public void setMediaRelTimePoint(MediaRelTimePointType value) {
        this.mediaRelTimePoint = value;
    }

    /**
     * Gets the value of the mediaRelIncrTimePoint property.
     * 
     * @return
     *     possible object is
     *     {@link MediaRelIncrTimePointType }
     *     
     */
    public MediaRelIncrTimePointType getMediaRelIncrTimePoint() {
        return mediaRelIncrTimePoint;
    }

    /**
     * Sets the value of the mediaRelIncrTimePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaRelIncrTimePointType }
     *     
     */
    public void setMediaRelIncrTimePoint(MediaRelIncrTimePointType value) {
        this.mediaRelIncrTimePoint = value;
    }

    /**
     * Gets the value of the visualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualDType }
     * {@link VisualDSType }
     * {@link GridLayoutType }
     * {@link IlluminationInvariantColorType }
     * 
     * 
     */
    public List<Object> getVisualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors() {
        if (visualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors == null) {
            visualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors = new ArrayList<Object>();
        }
        return this.visualDescriptorOrVisualDescriptionSchemeOrGridLayoutDescriptors;
    }

    /**
     * Gets the value of the multipleView property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleViewType }
     *     
     */
    public MultipleViewType getMultipleView() {
        return multipleView;
    }

    /**
     * Sets the value of the multipleView property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleViewType }
     *     
     */
    public void setMultipleView(MultipleViewType value) {
        this.multipleView = value;
    }

    /**
     * Gets the value of the spatialDecomposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialDecomposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialDecomposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StillRegionSpatialDecompositionType }
     * 
     * 
     */
    public List<StillRegionSpatialDecompositionType> getSpatialDecomposition() {
        if (spatialDecomposition == null) {
            spatialDecomposition = new ArrayList<StillRegionSpatialDecompositionType>();
        }
        return this.spatialDecomposition;
    }

}
