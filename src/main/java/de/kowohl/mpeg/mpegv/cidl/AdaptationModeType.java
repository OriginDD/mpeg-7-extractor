//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.12 at 06:12:40 PM BRST 
//


package de.kowohl.mpeg.mpegv.cidl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adaptationModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="adaptationModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="strict"/>
 *     &lt;enumeration value="scalable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "adaptationModeType")
@XmlEnum
public enum AdaptationModeType {

    @XmlEnumValue("strict")
    STRICT("strict"),
    @XmlEnumValue("scalable")
    SCALABLE("scalable");
    private final String value;

    AdaptationModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdaptationModeType fromValue(String v) {
        for (AdaptationModeType c: AdaptationModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
