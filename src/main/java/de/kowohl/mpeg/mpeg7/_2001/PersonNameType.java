//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="GivenName" type="{urn:mpeg:mpeg7:schema:2001}NameComponentType"/>
 *           &lt;element name="FamilyName" type="{urn:mpeg:mpeg7:schema:2001}NameComponentType" minOccurs="0"/>
 *           &lt;element name="Title" type="{urn:mpeg:mpeg7:schema:2001}NameComponentType" minOccurs="0"/>
 *           &lt;element name="Numeration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="dateFrom" type="{urn:mpeg:mpeg7:schema:2001}timePointType" />
 *       &lt;attribute name="dateTo" type="{urn:mpeg:mpeg7:schema:2001}timePointType" />
 *       &lt;attribute name="type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="former"/>
 *             &lt;enumeration value="variant"/>
 *             &lt;enumeration value="main"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}langt"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "givenNameOrFamilyNameOrTitle"
})
public class PersonNameType {

    @XmlElementRefs({
        @XmlElementRef(name = "Title", namespace = "urn:mpeg:mpeg7:schema:2001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Numeration", namespace = "urn:mpeg:mpeg7:schema:2001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FamilyName", namespace = "urn:mpeg:mpeg7:schema:2001", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GivenName", namespace = "urn:mpeg:mpeg7:schema:2001", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> givenNameOrFamilyNameOrTitle;
    @XmlAttribute(name = "dateFrom")
    protected String dateFrom;
    @XmlAttribute(name = "dateTo")
    protected String dateTo;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "langt", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String langt;

    /**
     * Gets the value of the givenNameOrFamilyNameOrTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenNameOrFamilyNameOrTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenNameOrFamilyNameOrTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link NameComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link NameComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link NameComponentType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getGivenNameOrFamilyNameOrTitle() {
        if (givenNameOrFamilyNameOrTitle == null) {
            givenNameOrFamilyNameOrTitle = new ArrayList<JAXBElement<?>>();
        }
        return this.givenNameOrFamilyNameOrTitle;
    }

    /**
     * Gets the value of the dateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the value of the dateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFrom(String value) {
        this.dateFrom = value;
    }

    /**
     * Gets the value of the dateTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTo() {
        return dateTo;
    }

    /**
     * Sets the value of the dateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTo(String value) {
        this.dateTo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the langt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangt() {
        return langt;
    }

    /**
     * Sets the value of the langt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangt(String value) {
        this.langt = value;
    }

}
