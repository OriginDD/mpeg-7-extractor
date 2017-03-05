//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.kowohl.mpeg.mpeg7._2001;

import de.kowohl.mpeg.mpeg21.GenrePrioritiesType;
import de.kowohl.mpeg.mpeg21.ModalityPrioritiesType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlledTermUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlledTermUseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2001}InlineTermDefinitionType">
 *       &lt;attribute name="href" use="required" type="{urn:mpeg:mpeg7:schema:2001}termReferenceType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlledTermUseType")
@XmlSeeAlso({
    GenrePrioritiesType.Genre.class,
    ModalityPrioritiesType.Modality.class,
    PersonGroupType.NameTerm.class,
    MediaFormatType.VisualCoding.Format.class,
    OrganizationType.NameTerm.class
})
public class ControlledTermUseType
    extends InlineTermDefinitionType
{

    @XmlAttribute(name = "href", required = true)
    protected String href;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

}
