//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpegv.ct;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.kowohl.mpeg.mpeg7._2004.DoubleMatrixType;


/**
 * <p>Java class for InputDeviceColorGamutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InputDeviceColorGamutType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDCG_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDCG_Value" type="{urn:mpeg:mpeg7:schema:2004}DoubleMatrixType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputDeviceColorGamutType", propOrder = {
    "idcgType",
    "idcgValue"
})
public class InputDeviceColorGamutType {

    @XmlElement(name = "IDCG_Type", required = true)
    protected String idcgType;
    @XmlElement(name = "IDCG_Value", required = true)
    protected DoubleMatrixType idcgValue;

    /**
     * Gets the value of the idcgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCGType() {
        return idcgType;
    }

    /**
     * Sets the value of the idcgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCGType(String value) {
        this.idcgType = value;
    }

    /**
     * Gets the value of the idcgValue property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleMatrixType }
     *     
     */
    public DoubleMatrixType getIDCGValue() {
        return idcgValue;
    }

    /**
     * Sets the value of the idcgValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleMatrixType }
     *     
     */
    public void setIDCGValue(DoubleMatrixType value) {
        this.idcgValue = value;
    }

}