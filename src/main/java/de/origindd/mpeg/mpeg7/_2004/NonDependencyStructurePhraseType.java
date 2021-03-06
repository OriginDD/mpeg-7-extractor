//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpeg7._2004;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NonDependencyStructurePhraseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonDependencyStructurePhraseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="2">
 *         &lt;element name="Quotation" type="{urn:mpeg:mpeg7:schema:2004}DependencyStructurePhraseType"/>
 *         &lt;element name="Phrase" type="{urn:mpeg:mpeg7:schema:2004}DependencyStructurePhraseType"/>
 *         &lt;element name="Word" type="{urn:mpeg:mpeg7:schema:2004}WordFormType"/>
 *         &lt;element name="NonDependencyPhrase" type="{urn:mpeg:mpeg7:schema:2004}NonDependencyStructurePhraseType"/>
 *       &lt;/choice>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="equal" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="synthesis" default="unspecified">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="unspecified"/>
 *             &lt;enumeration value="coordination"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDependencyStructurePhraseType", propOrder = {
    "quotationOrPhraseOrWord"
})
public class NonDependencyStructurePhraseType {

    @XmlElementRefs({
        @XmlElementRef(name = "Word", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Phrase", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NonDependencyPhrase", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Quotation", namespace = "urn:mpeg:mpeg7:schema:2004", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> quotationOrPhraseOrWord;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "equal")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object equal;
    @XmlAttribute(name = "synthesis")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String synthesis;

    /**
     * Gets the value of the quotationOrPhraseOrWord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quotationOrPhraseOrWord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotationOrPhraseOrWord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link DependencyStructurePhraseType }{@code >}
     * {@link JAXBElement }{@code <}{@link DependencyStructurePhraseType }{@code >}
     * {@link JAXBElement }{@code <}{@link NonDependencyStructurePhraseType }{@code >}
     * {@link JAXBElement }{@code <}{@link WordFormType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getQuotationOrPhraseOrWord() {
        if (quotationOrPhraseOrWord == null) {
            quotationOrPhraseOrWord = new ArrayList<JAXBElement<?>>();
        }
        return this.quotationOrPhraseOrWord;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the equal property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEqual() {
        return equal;
    }

    /**
     * Sets the value of the equal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEqual(Object value) {
        this.equal = value;
    }

    /**
     * Gets the value of the synthesis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynthesis() {
        if (synthesis == null) {
            return "unspecified";
        } else {
            return synthesis;
        }
    }

    /**
     * Sets the value of the synthesis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynthesis(String value) {
        this.synthesis = value;
    }

}
