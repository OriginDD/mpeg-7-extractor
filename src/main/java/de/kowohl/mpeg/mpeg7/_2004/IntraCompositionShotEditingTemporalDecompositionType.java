//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraCompositionShotEditingTemporalDecompositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntraCompositionShotEditingTemporalDecompositionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}TemporalSegmentDecompositionType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;choice>
 *           &lt;choice>
 *             &lt;element name="IntraCompositionShot" type="{urn:mpeg:mpeg7:schema:2004}IntraCompositionShotType"/>
 *             &lt;element name="IntraCompositionShotRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *           &lt;/choice>
 *           &lt;choice>
 *             &lt;element name="InternalTransition" type="{urn:mpeg:mpeg7:schema:2004}InternalTransitionType"/>
 *             &lt;element name="InternalTransitionRef" type="{urn:mpeg:mpeg7:schema:2004}ReferenceType"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraCompositionShotEditingTemporalDecompositionType", propOrder = {
    "intraCompositionShotOrIntraCompositionShotRefOrInternalTransition"
})
public class IntraCompositionShotEditingTemporalDecompositionType
    extends TemporalSegmentDecompositionType
{

    @XmlElementRefs({
        @XmlElementRef(name = "InternalTransitionRef", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InternalTransition", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IntraCompositionShotRef", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IntraCompositionShot", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> intraCompositionShotOrIntraCompositionShotRefOrInternalTransition;

    /**
     * Gets the value of the intraCompositionShotOrIntraCompositionShotRefOrInternalTransition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intraCompositionShotOrIntraCompositionShotRefOrInternalTransition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraCompositionShotOrIntraCompositionShotRefOrInternalTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link InternalTransitionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}
     * {@link JAXBElement }{@code <}{@link IntraCompositionShotType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getIntraCompositionShotOrIntraCompositionShotRefOrInternalTransition() {
        if (intraCompositionShotOrIntraCompositionShotRefOrInternalTransition == null) {
            intraCompositionShotOrIntraCompositionShotRefOrInternalTransition = new ArrayList<JAXBElement<?>>();
        }
        return this.intraCompositionShotOrIntraCompositionShotRefOrInternalTransition;
    }

}
