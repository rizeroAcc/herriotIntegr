//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.02 at 04:09:00 PM MSK 
//


package org.example.filesFromXSD.dictionary_v2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistryLookupScope.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegistryLookupScope">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="AVAILABLE"/>
 *     &lt;enumeration value="VALID"/>
 *     &lt;enumeration value="UNAVAILABLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegistryLookupScope")
@XmlEnum
public enum RegistryLookupScope {


    /**
     * �� ���������.
     * 
     */
    UNDEFINED,

    /**
     * ��� ������.
     * 
     */
    ALL,

    /**
     * ���������� ������.
     * 
     */
    AVAILABLE,

    /**
     * ����������� ������ (���������� � ������).
     * 
     */
    VALID,

    /**
     * ������������ ������.
     * 
     */
    UNAVAILABLE;

    public String value() {
        return name();
    }

    public static RegistryLookupScope fromValue(String v) {
        return valueOf(v);
    }

}
