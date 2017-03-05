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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StillRegion3DType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StillRegion3DType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SegmentType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="VisualDescriptor" type="{urn:mpeg:mpeg7:schema:2004}VisualDType"/>
 *           &lt;element name="VisualDescriptionScheme" type="{urn:mpeg:mpeg7:schema:2004}VisualDSType"/>
 *         &lt;/choice>
 *         &lt;element name="MultipleView" type="{urn:mpeg:mpeg7:schema:2004}MultipleViewType" minOccurs="0"/>
 *         &lt;element name="SpatialDecomposition" type="{urn:mpeg:mpeg7:schema:2004}StillRegion3DSpatialDecompositionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StillRegion3DType", propOrder = {
    "visualDescriptorOrVisualDescriptionScheme",
    "multipleView",
    "spatialDecomposition"
})
public class StillRegion3DType
    extends SegmentType
{

    @XmlElements({
        @XmlElement(name = "VisualDescriptor", type = VisualDType.class),
        @XmlElement(name = "VisualDescriptionScheme", type = VisualDSType.class)
    })
    protected List<Mpeg7BaseType> visualDescriptorOrVisualDescriptionScheme;
    @XmlElement(name = "MultipleView")
    protected MultipleViewType multipleView;
    @XmlElement(name = "SpatialDecomposition")
    protected List<StillRegion3DSpatialDecompositionType> spatialDecomposition;

    /**
     * Gets the value of the visualDescriptorOrVisualDescriptionScheme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visualDescriptorOrVisualDescriptionScheme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisualDescriptorOrVisualDescriptionScheme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisualDType }
     * {@link VisualDSType }
     * 
     * 
     */
    public List<Mpeg7BaseType> getVisualDescriptorOrVisualDescriptionScheme() {
        if (visualDescriptorOrVisualDescriptionScheme == null) {
            visualDescriptorOrVisualDescriptionScheme = new ArrayList<Mpeg7BaseType>();
        }
        return this.visualDescriptorOrVisualDescriptionScheme;
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
     * {@link StillRegion3DSpatialDecompositionType }
     * 
     * 
     */
    public List<StillRegion3DSpatialDecompositionType> getSpatialDecomposition() {
        if (spatialDecomposition == null) {
            spatialDecomposition = new ArrayList<StillRegion3DSpatialDecompositionType>();
        }
        return this.spatialDecomposition;
    }

}