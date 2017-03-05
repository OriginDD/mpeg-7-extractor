//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2004;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageTextType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}StillRegionType">
 *       &lt;sequence>
 *         &lt;element name="Text" type="{urn:mpeg:mpeg7:schema:2004}TextualType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="textType">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                 &lt;enumeration value="superimposed"/>
 *                 &lt;enumeration value="scene"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termAliasReferenceType">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{urn:mpeg:mpeg7:schema:2004}termURIReferenceType">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fontSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="fontType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageTextType", propOrder = {
    "text"
})
public class ImageTextType
    extends StillRegionType
{

    @XmlElement(name = "Text")
    protected TextualType text;
    @XmlAttribute(name = "textType")
    protected String textType;
    @XmlAttribute(name = "fontSize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fontSize;
    @XmlAttribute(name = "fontType")
    protected String fontType;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link TextualType }
     *     
     */
    public TextualType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualType }
     *     
     */
    public void setText(TextualType value) {
        this.text = value;
    }

    /**
     * Gets the value of the textType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextType() {
        return textType;
    }

    /**
     * Sets the value of the textType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextType(String value) {
        this.textType = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFontSize(BigInteger value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontType() {
        return fontType;
    }

    /**
     * Sets the value of the fontType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontType(String value) {
        this.fontType = value;
    }

}
