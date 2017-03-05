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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColorSpaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorSpaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ColorTransMat" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{urn:mpeg:mpeg7:schema:2004}unsigned16" />
 *               &lt;/simpleType>
 *               &lt;length value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="colorReferenceFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="RGB"/>
 *             &lt;enumeration value="YCbCr"/>
 *             &lt;enumeration value="HSV"/>
 *             &lt;enumeration value="HMMD"/>
 *             &lt;enumeration value="LinearMatrix"/>
 *             &lt;enumeration value="Monochrome"/>
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
@XmlType(name = "ColorSpaceType", propOrder = {
    "colorTransMat"
})
public class ColorSpaceType {

    @XmlList
    @XmlElement(name = "ColorTransMat", type = Integer.class)
    protected List<Integer> colorTransMat;
    @XmlAttribute(name = "colorReferenceFlag")
    protected Boolean colorReferenceFlag;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the colorTransMat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colorTransMat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColorTransMat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getColorTransMat() {
        if (colorTransMat == null) {
            colorTransMat = new ArrayList<Integer>();
        }
        return this.colorTransMat;
    }

    /**
     * Gets the value of the colorReferenceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isColorReferenceFlag() {
        if (colorReferenceFlag == null) {
            return false;
        } else {
            return colorReferenceFlag;
        }
    }

    /**
     * Sets the value of the colorReferenceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setColorReferenceFlag(Boolean value) {
        this.colorReferenceFlag = value;
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
