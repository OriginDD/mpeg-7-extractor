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
 * <p>Java class for UsageHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageHistoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg21:2003:01-DIA-NS}UserCharacteristicBaseType">
 *       &lt;sequence>
 *         &lt;element name="UsageHistory" type="{urn:mpeg:mpeg7:schema:2001}UsageHistoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageHistoryType", propOrder = {
    "usageHistory"
})
public class UsageHistoryType
    extends UserCharacteristicBaseType
{

    @XmlElement(name = "UsageHistory")
    protected List<de.origindd.mpeg.mpeg7._2001.UsageHistoryType> usageHistory;

    /**
     * Gets the value of the usageHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usageHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsageHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link de.origindd.mpeg.mpeg7._2001.UsageHistoryType }
     * 
     * 
     */
    public List<de.origindd.mpeg.mpeg7._2001.UsageHistoryType> getUsageHistory() {
        if (usageHistory == null) {
            usageHistory = new ArrayList<de.origindd.mpeg.mpeg7._2001.UsageHistoryType>();
        }
        return this.usageHistory;
    }

}
