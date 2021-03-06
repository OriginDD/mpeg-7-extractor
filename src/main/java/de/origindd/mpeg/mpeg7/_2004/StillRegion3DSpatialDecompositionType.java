//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StillRegion3DSpatialDecompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StillRegion3DSpatialDecompositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}SpatialSegmentDecompositionType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="StillRegion" type="{urn:mpeg:mpeg7:schema:2004}StillRegionType"/>
 *         &lt;element name="StillRegionRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *         &lt;element name="StillRegion3D" type="{urn:mpeg:mpeg7:schema:2004}StillRegion3DType"/>
 *         &lt;element name="StillRegion3DRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StillRegion3DSpatialDecompositionType", propOrder = {
    "stillRegionOrStillRegionRefOrStillRegion3D"
})
public class StillRegion3DSpatialDecompositionType
    extends SpatialSegmentDecompositionType
{

    @XmlElementRefs({
        @XmlElementRef(name = "StillRegionRef", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StillRegion", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StillRegion3DRef", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StillRegion3D", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> stillRegionOrStillRegionRefOrStillRegion3D;

    /**
     * Gets the value of the stillRegionOrStillRegionRefOrStillRegion3D property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stillRegionOrStillRegionRefOrStillRegion3D property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStillRegionOrStillRegionRefOrStillRegion3D().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link StillRegionType }{@code >}
     * {@link JAXBElement }{@code <}{@link StillRegion3DType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getStillRegionOrStillRegionRefOrStillRegion3D() {
        if (stillRegionOrStillRegionRefOrStillRegion3D == null) {
            stillRegionOrStillRegionRefOrStillRegion3D = new ArrayList<JAXBElement<?>>();
        }
        return this.stillRegionOrStillRegionRefOrStillRegion3D;
    }

}
