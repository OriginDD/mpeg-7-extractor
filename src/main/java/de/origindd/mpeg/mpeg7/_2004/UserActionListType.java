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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserActionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserActionListType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:mpeg:mpeg7:schema:2004}DSType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="ActionType" type="{urn:mpeg:mpeg7:schema:2004}TermUseType"/>
 *         &lt;element name="UserAction" type="{urn:mpeg:mpeg7:schema:2004}UserActionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="numOfInstances" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="totalDuration" type="{urn:mpeg:mpeg7:schema:2004}durationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserActionListType", propOrder = {
    "actionType",
    "userAction"
})
public class UserActionListType
    extends DSType
{

    @XmlElement(name = "ActionType")
    protected TermUseType actionType;
    @XmlElement(name = "UserAction")
    protected List<UserActionType> userAction;
    @XmlAttribute(name = "numOfInstances")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numOfInstances;
    @XmlAttribute(name = "totalDuration")
    protected String totalDuration;

    /**
     * Gets the value of the actionType property.
     * 
     * @return
     *     possible object is
     *     {@link TermUseType }
     *     
     */
    public TermUseType getActionType() {
        return actionType;
    }

    /**
     * Sets the value of the actionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermUseType }
     *     
     */
    public void setActionType(TermUseType value) {
        this.actionType = value;
    }

    /**
     * Gets the value of the userAction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userAction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserActionType }
     * 
     * 
     */
    public List<UserActionType> getUserAction() {
        if (userAction == null) {
            userAction = new ArrayList<UserActionType>();
        }
        return this.userAction;
    }

    /**
     * Gets the value of the numOfInstances property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfInstances() {
        return numOfInstances;
    }

    /**
     * Sets the value of the numOfInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfInstances(BigInteger value) {
        this.numOfInstances = value;
    }

    /**
     * Gets the value of the totalDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDuration() {
        return totalDuration;
    }

    /**
     * Sets the value of the totalDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDuration(String value) {
        this.totalDuration = value;
    }

}
