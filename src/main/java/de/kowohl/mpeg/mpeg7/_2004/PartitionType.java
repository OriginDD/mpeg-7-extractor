//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Origin" type="{urn:mpeg:mpeg7:schema:2004}SignalPlaneOriginType" minOccurs="0"/>
 *         &lt;element name="Start" type="{urn:mpeg:mpeg7:schema:2004}SignalPlaneType"/>
 *         &lt;choice>
 *           &lt;element name="End" type="{urn:mpeg:mpeg7:schema:2004}SignalPlaneType"/>
 *           &lt;element name="Extent" type="{urn:mpeg:mpeg7:schema:2004}SignalPlaneType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="dim">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *             &lt;maxInclusive value="4"/>
 *           &lt;/restriction>
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
@XmlType(name = "PartitionType", propOrder = {
    "origin",
    "start",
    "end",
    "extent"
})
public class PartitionType {

    @XmlElement(name = "Origin")
    protected SignalPlaneOriginType origin;
    @XmlElement(name = "Start", required = true)
    protected SignalPlaneType start;
    @XmlElement(name = "End")
    protected SignalPlaneType end;
    @XmlElement(name = "Extent")
    protected SignalPlaneType extent;
    @XmlAttribute(name = "dim")
    protected Integer dim;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link SignalPlaneOriginType }
     *     
     */
    public SignalPlaneOriginType getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalPlaneOriginType }
     *     
     */
    public void setOrigin(SignalPlaneOriginType value) {
        this.origin = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link SignalPlaneType }
     *     
     */
    public SignalPlaneType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalPlaneType }
     *     
     */
    public void setStart(SignalPlaneType value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link SignalPlaneType }
     *     
     */
    public SignalPlaneType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalPlaneType }
     *     
     */
    public void setEnd(SignalPlaneType value) {
        this.end = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link SignalPlaneType }
     *     
     */
    public SignalPlaneType getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignalPlaneType }
     *     
     */
    public void setExtent(SignalPlaneType value) {
        this.extent = value;
    }

    /**
     * Gets the value of the dim property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDim() {
        return dim;
    }

    /**
     * Sets the value of the dim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDim(Integer value) {
        this.dim = value;
    }

}