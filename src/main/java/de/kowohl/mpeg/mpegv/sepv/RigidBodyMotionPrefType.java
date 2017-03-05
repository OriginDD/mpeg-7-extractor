//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.kowohl.mpeg.mpegv.sepv;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.kowohl.mpeg.mpegv.cidl.UserSensoryPreferenceBaseType;


/**
 * <p>Java class for RigidBodyMotionPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RigidBodyMotionPrefType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg-v:2010:01-CIDL-NS}UserSensoryPreferenceBaseType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="MotionPreference" type="{urn:mpeg:mpeg-v:2010:01-SEPV-NS}MotionPreferenceBaseType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RigidBodyMotionPrefType", propOrder = {
    "motionPreference"
})
public class RigidBodyMotionPrefType
    extends UserSensoryPreferenceBaseType
{

    @XmlElement(name = "MotionPreference", required = true)
    protected List<MotionPreferenceBaseType> motionPreference;

    /**
     * Gets the value of the motionPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the motionPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMotionPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MotionPreferenceBaseType }
     * 
     * 
     */
    public List<MotionPreferenceBaseType> getMotionPreference() {
        if (motionPreference == null) {
            motionPreference = new ArrayList<MotionPreferenceBaseType>();
        }
        return this.motionPreference;
    }

}
