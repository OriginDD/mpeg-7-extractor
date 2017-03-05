//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpegv.sev;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

import de.kowohl.mpeg.mpegv.sedl.EffectBaseType;


/**
 * <p>Java class for ScentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}EffectBaseType">
 *       &lt;attribute name="scent" type="{urn:mpeg:mpeg7:schema:2004}termReferenceType" />
 *       &lt;attribute name="intensity-value" type="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}intensityValueType" />
 *       &lt;attribute name="intensity-range" type="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}intensityRangeType" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScentType")
public class ScentType
    extends EffectBaseType
{

    @XmlAttribute(name = "scent")
    protected String scent;
    @XmlAttribute(name = "intensity-value")
    protected Float intensityValue;
    @XmlAttribute(name = "intensity-range")
    protected List<Float> intensityRange;

    /**
     * Gets the value of the scent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScent() {
        return scent;
    }

    /**
     * Sets the value of the scent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScent(String value) {
        this.scent = value;
    }

    /**
     * Gets the value of the intensityValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIntensityValue() {
        return intensityValue;
    }

    /**
     * Sets the value of the intensityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIntensityValue(Float value) {
        this.intensityValue = value;
    }

    /**
     * Gets the value of the intensityRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intensityRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntensityRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getIntensityRange() {
        if (intensityRange == null) {
            intensityRange = new ArrayList<Float>();
        }
        return this.intensityRange;
    }

}
