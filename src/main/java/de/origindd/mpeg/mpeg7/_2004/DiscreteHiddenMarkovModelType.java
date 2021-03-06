//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:39:36 PM BRST 
//


package de.origindd.mpeg.mpeg7._2004;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscreteHiddenMarkovModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscreteHiddenMarkovModelType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}StateTransitionModelType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="NumOfObservationsPerState" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Observation" type="{urn:mpeg:mpeg7:schema:2004}TextualType" maxOccurs="unbounded"/>
 *         &lt;element name="ObservationDistribution" type="{urn:mpeg:mpeg7:schema:2004}DiscreteDistributionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscreteHiddenMarkovModelType", propOrder = {
    "numOfObservationsPerStateAndObservationAndObservationDistribution"
})
public class DiscreteHiddenMarkovModelType
    extends StateTransitionModelType
{

    @XmlElements({
        @XmlElement(name = "NumOfObservationsPerState", required = true, type = BigInteger.class),
        @XmlElement(name = "Observation", required = true, type = TextualType.class),
        @XmlElement(name = "ObservationDistribution", required = true, type = DiscreteDistributionType.class)
    })
    protected List<Object> numOfObservationsPerStateAndObservationAndObservationDistribution;

    /**
     * Gets the value of the numOfObservationsPerStateAndObservationAndObservationDistribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numOfObservationsPerStateAndObservationAndObservationDistribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumOfObservationsPerStateAndObservationAndObservationDistribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * {@link TextualType }
     * {@link DiscreteDistributionType }
     * 
     * 
     */
    public List<Object> getNumOfObservationsPerStateAndObservationAndObservationDistribution() {
        if (numOfObservationsPerStateAndObservationAndObservationDistribution == null) {
            numOfObservationsPerStateAndObservationAndObservationDistribution = new ArrayList<Object>();
        }
        return this.numOfObservationsPerStateAndObservationAndObservationDistribution;
    }

}
