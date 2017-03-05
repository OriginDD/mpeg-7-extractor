//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.origindd.mpeg.mpeg21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColorPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColorPreferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="BinNumber" type="{urn:mpeg:mpeg7:schema:2001}unsigned12"/>
 *         &lt;element name="Value" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PreferredValue" type="{urn:mpeg:mpeg7:schema:2001}unsigned12"/>
 *                   &lt;element name="ReferenceValue" type="{urn:mpeg:mpeg7:schema:2001}unsigned12"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColorPreferenceType", propOrder = {
    "binNumber",
    "value"
})
public class ColorPreferenceType
    extends DIABaseType
{

    @XmlElement(name = "BinNumber")
    protected int binNumber;
    @XmlElement(name = "Value")
    protected List<Value> value;

    /**
     * Gets the value of the binNumber property.
     * 
     */
    public int getBinNumber() {
        return binNumber;
    }

    /**
     * Sets the value of the binNumber property.
     * 
     */
    public void setBinNumber(int value) {
        this.binNumber = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Value }
     * 
     * 
     */
    public List<Value> getValue() {
        if (value == null) {
            value = new ArrayList<Value>();
        }
        return this.value;
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
     *         &lt;element name="PreferredValue" type="{urn:mpeg:mpeg7:schema:2001}unsigned12"/>
     *         &lt;element name="ReferenceValue" type="{urn:mpeg:mpeg7:schema:2001}unsigned12"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "preferredValue",
        "referenceValue"
    })
    public static class Value {

        @XmlElement(name = "PreferredValue")
        protected int preferredValue;
        @XmlElement(name = "ReferenceValue")
        protected int referenceValue;

        /**
         * Gets the value of the preferredValue property.
         * 
         */
        public int getPreferredValue() {
            return preferredValue;
        }

        /**
         * Sets the value of the preferredValue property.
         * 
         */
        public void setPreferredValue(int value) {
            this.preferredValue = value;
        }

        /**
         * Gets the value of the referenceValue property.
         * 
         */
        public int getReferenceValue() {
            return referenceValue;
        }

        /**
         * Sets the value of the referenceValue property.
         * 
         */
        public void setReferenceValue(int value) {
            this.referenceValue = value;
        }

    }

}