//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpeg21;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}DIABaseType">
 *       &lt;sequence>
 *         &lt;element name="NetworkCharacteristic" type="{urn:mpeg:mpeg21:2003:01-DIA-NS}NetworkCharacteristicBaseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkType", propOrder = {
    "networkCharacteristic"
})
public class NetworkType
    extends DIABaseType
{

    @XmlElement(name = "NetworkCharacteristic")
    protected List<NetworkCharacteristicBaseType> networkCharacteristic;

    /**
     * Gets the value of the networkCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkCharacteristicBaseType }
     * 
     * 
     */
    public List<NetworkCharacteristicBaseType> getNetworkCharacteristic() {
        if (networkCharacteristic == null) {
            networkCharacteristic = new ArrayList<NetworkCharacteristicBaseType>();
        }
        return this.networkCharacteristic;
    }

}
