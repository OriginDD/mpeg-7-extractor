//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterSeparableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterSeparableType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}FilterType">
 *       &lt;sequence>
 *         &lt;element name="Filter1D" type="{urn:mpeg:mpeg7:schema:2004}Filter1DType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterSeparableType", propOrder = {
    "filter1D"
})
public class FilterSeparableType
    extends FilterType
{

    @XmlElement(name = "Filter1D", required = true)
    protected List<Filter1DType> filter1D;

    /**
     * Gets the value of the filter1D property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filter1D property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilter1D().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Filter1DType }
     * 
     * 
     */
    public List<Filter1DType> getFilter1D() {
        if (filter1D == null) {
            filter1D = new ArrayList<Filter1DType>();
        }
        return this.filter1D;
    }

}
