//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.origindd.mpeg.mpeg21;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

import de.origindd.mpeg.mpeg7._2001.GeographicPointType;
import de.origindd.mpeg.mpeg7._2001.TimeType;


/**
 * <p>Java class for UpdateIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateIntervalType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="LastUpdatePoint" type="{urn:mpeg:mpeg7:schema:2001}GeographicPointType" minOccurs="0"/>
 *         &lt;element name="LastUpdateBinIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="LastUpdateTime" type="{urn:mpeg:mpeg7:schema:2001}TimeType" minOccurs="0"/>
 *         &lt;element name="Lmax" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="Values" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn:mpeg:mpeg7:schema:2001}probabilityVector">
 *               &lt;length value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="xRadius" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="yRadius" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIntervalType", propOrder = {
    "lastUpdatePoint",
    "lastUpdateBinIndex",
    "lastUpdateTime",
    "lmax",
    "values"
})
public class UpdateIntervalType
    extends DIABaseType
{

    @XmlElement(name = "LastUpdatePoint")
    protected GeographicPointType lastUpdatePoint;
    @XmlElement(name = "LastUpdateBinIndex")
    protected BigInteger lastUpdateBinIndex;
    @XmlElement(name = "LastUpdateTime")
    protected TimeType lastUpdateTime;
    @XmlElement(name = "Lmax")
    protected BigInteger lmax;
    @XmlList
    @XmlElement(name = "Values", type = Float.class)
    protected List<Float> values;
    @XmlAttribute(name = "xRadius")
    protected BigInteger xRadius;
    @XmlAttribute(name = "yRadius")
    protected BigInteger yRadius;

    /**
     * Gets the value of the lastUpdatePoint property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicPointType }
     *     
     */
    public GeographicPointType getLastUpdatePoint() {
        return lastUpdatePoint;
    }

    /**
     * Sets the value of the lastUpdatePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicPointType }
     *     
     */
    public void setLastUpdatePoint(GeographicPointType value) {
        this.lastUpdatePoint = value;
    }

    /**
     * Gets the value of the lastUpdateBinIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastUpdateBinIndex() {
        return lastUpdateBinIndex;
    }

    /**
     * Sets the value of the lastUpdateBinIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastUpdateBinIndex(BigInteger value) {
        this.lastUpdateBinIndex = value;
    }

    /**
     * Gets the value of the lastUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * Sets the value of the lastUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setLastUpdateTime(TimeType value) {
        this.lastUpdateTime = value;
    }

    /**
     * Gets the value of the lmax property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLmax() {
        return lmax;
    }

    /**
     * Sets the value of the lmax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLmax(BigInteger value) {
        this.lmax = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getValues() {
        if (values == null) {
            values = new ArrayList<Float>();
        }
        return this.values;
    }

    /**
     * Gets the value of the xRadius property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getXRadius() {
        return xRadius;
    }

    /**
     * Sets the value of the xRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setXRadius(BigInteger value) {
        this.xRadius = value;
    }

    /**
     * Gets the value of the yRadius property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYRadius() {
        return yRadius;
    }

    /**
     * Sets the value of the yRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYRadius(BigInteger value) {
        this.yRadius = value;
    }

}
