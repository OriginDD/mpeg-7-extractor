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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraCompositionShotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntraCompositionShotType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}AnalyticClipType">
 *       &lt;sequence>
 *         &lt;element name="AnalyticEditingTemporalDecomposition" type="{urn:mpeg:mpeg7:schema:2004}IntraCompositionShotEditingTemporalDecompositionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraCompositionShotType", propOrder = {
    "analyticEditingTemporalDecomposition"
})
public class IntraCompositionShotType
    extends AnalyticClipType
{

    @XmlElement(name = "AnalyticEditingTemporalDecomposition")
    protected List<IntraCompositionShotEditingTemporalDecompositionType> analyticEditingTemporalDecomposition;

    /**
     * Gets the value of the analyticEditingTemporalDecomposition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analyticEditingTemporalDecomposition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalyticEditingTemporalDecomposition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraCompositionShotEditingTemporalDecompositionType }
     * 
     * 
     */
    public List<IntraCompositionShotEditingTemporalDecompositionType> getAnalyticEditingTemporalDecomposition() {
        if (analyticEditingTemporalDecomposition == null) {
            analyticEditingTemporalDecomposition = new ArrayList<IntraCompositionShotEditingTemporalDecompositionType>();
        }
        return this.analyticEditingTemporalDecomposition;
    }

}
