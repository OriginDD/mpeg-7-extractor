//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:38:19 PM BRST 
//


package de.origindd.mpeg.mpeg21;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DIABaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DIABaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIABaseType")
@XmlSeeAlso({
    DescriptionMetadataType.ClassificationSchemeAlias.class,
    DescriptionMetadataType.class,
    GenericMouseType.class,
    ResolutionType.class,
    FontType.class,
    GenrePrioritiesType.class,
    StorageType.class,
    ResourceConversionType.class,
    SpecificResourceConversionsType.class,
    DataIOCharacteristicBaseType.class,
    UpdateIntervalType.class,
    BenchmarkType.class,
    NetworkType.class,
    BaseParameterType.class,
    GenericPenType.class,
    AudioModeType.class,
    NaturalEnvironmentType.class,
    DisplayCapabilityBaseType.class,
    GeneralResourcePrioritiesType.class,
    PerceptualParametersType.class,
    AudioOutputType.class,
    DirectivityType.class,
    LowVisionImpairmentType.class,
    ChromaticityType.class,
    AudiogramType.class,
    CodecParameterBaseType.class,
    UserInteractionInputType.class,
    DisplayType.class,
    UserType.class,
    NetworkCharacteristicBaseType.class,
    ColorVisionDeficiencyType.class,
    ImpulseResponseType.class,
    ConversionType.class,
    TextFocusOfAttentionType.class,
    ModalityPrioritiesType.class,
    StorageCharacteristicBaseType.class,
    DataIOType.class,
    VisualImpairmentDegreeType.class,
    ColorPreferenceType.class,
    SpecificResourcePrioritiesType.class,
    StereoscopicVideoConversionType.class,
    RELCapabilityType.class,
    UserInteractionInputSupportBaseType.class,
    TerminalCapabilityBaseType.class,
    CodecCapabilityBaseType.class,
    NaturalEnvironmentCharacteristicBaseType.class,
    DIADescriptionType.class,
    TerminalType.class,
    DeviceBenchmarkBaseType.class,
    UserCharacteristicBaseType.class,
    ErraticityType.class,
    AudioOutputCapabilityBaseType.class,
    SoundfieldType.class
})
public abstract class DIABaseType {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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

}
