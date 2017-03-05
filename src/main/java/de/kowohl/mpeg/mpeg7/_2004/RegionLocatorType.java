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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegionLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionLocatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoordRef" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *                 &lt;attribute name="spatialRef" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Box" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>BoxListType">
 *                 &lt;attribute name="unlocatedRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Polygon" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Coords" type="{urn:mpeg:mpeg7:schema:2004}IntegerMatrixType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="unlocatedRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
@XmlType(name = "RegionLocatorType", propOrder = {
    "coordRef",
    "box",
    "polygon"
})
public class RegionLocatorType {

    @XmlElement(name = "CoordRef")
    protected CoordRef coordRef;
    @XmlElement(name = "Box")
    protected List<Box> box;
    @XmlElement(name = "Polygon")
    protected List<Polygon> polygon;

    /**
     * Gets the value of the coordRef property.
     * 
     * @return
     *     possible object is
     *     {@link CoordRef }
     *     
     */
    public CoordRef getCoordRef() {
        return coordRef;
    }

    /**
     * Sets the value of the coordRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordRef }
     *     
     */
    public void setCoordRef(CoordRef value) {
        this.coordRef = value;
    }

    /**
     * Gets the value of the box property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the box property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBox().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Box }
     * 
     * 
     */
    public List<Box> getBox() {
        if (box == null) {
            box = new ArrayList<Box>();
        }
        return this.box;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Polygon }
     * 
     * 
     */
    public List<Polygon> getPolygon() {
        if (polygon == null) {
            polygon = new ArrayList<Polygon>();
        }
        return this.polygon;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:mpeg:mpeg7:schema:2004>BoxListType">
     *       &lt;attribute name="unlocatedRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Box
        extends BoxListType
    {

        @XmlAttribute(name = "unlocatedRegion")
        protected Boolean unlocatedRegion;

        /**
         * Gets the value of the unlocatedRegion property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isUnlocatedRegion() {
            if (unlocatedRegion == null) {
                return false;
            } else {
                return unlocatedRegion;
            }
        }

        /**
         * Sets the value of the unlocatedRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUnlocatedRegion(Boolean value) {
            this.unlocatedRegion = value;
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
     *       &lt;attribute name="ref" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="spatialRef" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoordRef {

        @XmlAttribute(name = "ref", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object ref;
        @XmlAttribute(name = "spatialRef")
        protected Boolean spatialRef;

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRef(Object value) {
            this.ref = value;
        }

        /**
         * Gets the value of the spatialRef property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isSpatialRef() {
            if (spatialRef == null) {
                return false;
            } else {
                return spatialRef;
            }
        }

        /**
         * Sets the value of the spatialRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSpatialRef(Boolean value) {
            this.spatialRef = value;
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
     *       &lt;sequence>
     *         &lt;element name="Coords" type="{urn:mpeg:mpeg7:schema:2004}IntegerMatrixType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="unlocatedRegion" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "coords"
    })
    public static class Polygon {

        @XmlElement(name = "Coords", required = true)
        protected IntegerMatrixType coords;
        @XmlAttribute(name = "unlocatedRegion")
        protected Boolean unlocatedRegion;

        /**
         * Gets the value of the coords property.
         * 
         * @return
         *     possible object is
         *     {@link IntegerMatrixType }
         *     
         */
        public IntegerMatrixType getCoords() {
            return coords;
        }

        /**
         * Sets the value of the coords property.
         * 
         * @param value
         *     allowed object is
         *     {@link IntegerMatrixType }
         *     
         */
        public void setCoords(IntegerMatrixType value) {
            this.coords = value;
        }

        /**
         * Gets the value of the unlocatedRegion property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isUnlocatedRegion() {
            if (unlocatedRegion == null) {
                return false;
            } else {
                return unlocatedRegion;
            }
        }

        /**
         * Sets the value of the unlocatedRegion property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUnlocatedRegion(Boolean value) {
            this.unlocatedRegion = value;
        }

    }

}
