//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.kowohl.mpeg.mpegv.dcdv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkSpaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkSpaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Depth" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RotationX" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RotationY" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="RotationZ" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkSpaceType", propOrder = {
    "width",
    "height",
    "depth",
    "rotationX",
    "rotationY",
    "rotationZ"
})
public class WorkSpaceType {

    @XmlElement(name = "Width")
    protected float width;
    @XmlElement(name = "Height")
    protected float height;
    @XmlElement(name = "Depth")
    protected float depth;
    @XmlElement(name = "RotationX")
    protected float rotationX;
    @XmlElement(name = "RotationY")
    protected float rotationY;
    @XmlElement(name = "RotationZ")
    protected float rotationZ;

    /**
     * Gets the value of the width property.
     * 
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     */
    public void setWidth(float value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     */
    public float getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     */
    public void setDepth(float value) {
        this.depth = value;
    }

    /**
     * Gets the value of the rotationX property.
     * 
     */
    public float getRotationX() {
        return rotationX;
    }

    /**
     * Sets the value of the rotationX property.
     * 
     */
    public void setRotationX(float value) {
        this.rotationX = value;
    }

    /**
     * Gets the value of the rotationY property.
     * 
     */
    public float getRotationY() {
        return rotationY;
    }

    /**
     * Sets the value of the rotationY property.
     * 
     */
    public void setRotationY(float value) {
        this.rotationY = value;
    }

    /**
     * Gets the value of the rotationZ property.
     * 
     */
    public float getRotationZ() {
        return rotationZ;
    }

    /**
     * Sets the value of the rotationZ property.
     * 
     */
    public void setRotationZ(float value) {
        this.rotationZ = value;
    }

}
