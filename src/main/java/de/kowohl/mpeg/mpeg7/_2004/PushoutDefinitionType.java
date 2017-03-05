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
 * <p>Java class for PushoutDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PushoutDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}GraphicalRuleDefinitionType">
 *       &lt;sequence>
 *         &lt;element name="LHSGraph" type="{urn:mpeg:mpeg7:schema:2004}GraphType"/>
 *         &lt;element name="RHSGraph" type="{urn:mpeg:mpeg7:schema:2004}GraphType"/>
 *         &lt;element name="MorphismGraph" type="{urn:mpeg:mpeg7:schema:2004}MorphismGraphType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushoutDefinitionType", propOrder = {
    "lhsGraph",
    "rhsGraph",
    "morphismGraph"
})
public class PushoutDefinitionType
    extends GraphicalRuleDefinitionType
{

    @XmlElement(name = "LHSGraph", required = true)
    protected GraphType lhsGraph;
    @XmlElement(name = "RHSGraph", required = true)
    protected GraphType rhsGraph;
    @XmlElement(name = "MorphismGraph", required = true)
    protected MorphismGraphType morphismGraph;

    /**
     * Gets the value of the lhsGraph property.
     * 
     * @return
     *     possible object is
     *     {@link GraphType }
     *     
     */
    public GraphType getLHSGraph() {
        return lhsGraph;
    }

    /**
     * Sets the value of the lhsGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphType }
     *     
     */
    public void setLHSGraph(GraphType value) {
        this.lhsGraph = value;
    }

    /**
     * Gets the value of the rhsGraph property.
     * 
     * @return
     *     possible object is
     *     {@link GraphType }
     *     
     */
    public GraphType getRHSGraph() {
        return rhsGraph;
    }

    /**
     * Sets the value of the rhsGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link GraphType }
     *     
     */
    public void setRHSGraph(GraphType value) {
        this.rhsGraph = value;
    }

    /**
     * Gets the value of the morphismGraph property.
     * 
     * @return
     *     possible object is
     *     {@link MorphismGraphType }
     *     
     */
    public MorphismGraphType getMorphismGraph() {
        return morphismGraph;
    }

    /**
     * Sets the value of the morphismGraph property.
     * 
     * @param value
     *     allowed object is
     *     {@link MorphismGraphType }
     *     
     */
    public void setMorphismGraph(MorphismGraphType value) {
        this.morphismGraph = value;
    }

}
