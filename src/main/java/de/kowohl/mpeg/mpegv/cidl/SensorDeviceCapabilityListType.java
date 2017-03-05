//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.kowohl.mpeg.mpegv.cidl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SensorDeviceCapabilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SensorDeviceCapabilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SensorDeviceCapability" type="{urn:mpeg:mpeg-v:2010:01-CIDL-NS}SensorCapabilityBaseType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SensorDeviceCapabilityListType", propOrder = {
    "sensorDeviceCapability"
})
public class SensorDeviceCapabilityListType {

    @XmlElement(name = "SensorDeviceCapability", required = true)
    protected List<SensorCapabilityBaseType> sensorDeviceCapability;

    /**
     * Gets the value of the sensorDeviceCapability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sensorDeviceCapability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSensorDeviceCapability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SensorCapabilityBaseType }
     * 
     * 
     */
    public List<SensorCapabilityBaseType> getSensorDeviceCapability() {
        if (sensorDeviceCapability == null) {
            sensorDeviceCapability = new ArrayList<SensorCapabilityBaseType>();
        }
        return this.sensorDeviceCapability;
    }

}
