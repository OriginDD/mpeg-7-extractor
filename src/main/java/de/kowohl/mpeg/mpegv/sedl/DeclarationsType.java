//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpegv.sedl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeclarationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationsType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}SEMBaseType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}GroupOfEffects"/>
 *         &lt;element ref="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}Effect"/>
 *         &lt;element ref="{urn:mpeg:mpeg-v:2010:01-SEDL-NS}Parameter"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationsType", propOrder = {
    "groupOfEffectsOrEffectOrParameter"
})
public class DeclarationsType
    extends SEMBaseType
{

    @XmlElements({
        @XmlElement(name = "GroupOfEffects", type = GroupOfEffectsType.class),
        @XmlElement(name = "Effect", type = EffectBaseType.class),
        @XmlElement(name = "Parameter", type = ParameterBaseType.class)
    })
    protected List<SEMBaseType> groupOfEffectsOrEffectOrParameter;

    /**
     * Gets the value of the groupOfEffectsOrEffectOrParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfEffectsOrEffectOrParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfEffectsOrEffectOrParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfEffectsType }
     * {@link EffectBaseType }
     * {@link ParameterBaseType }
     * 
     * 
     */
    public List<SEMBaseType> getGroupOfEffectsOrEffectOrParameter() {
        if (groupOfEffectsOrEffectOrParameter == null) {
            groupOfEffectsOrEffectOrParameter = new ArrayList<SEMBaseType>();
        }
        return this.groupOfEffectsOrEffectOrParameter;
    }

}
