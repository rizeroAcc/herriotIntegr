//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.codelist;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VeterinaryEventStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VeterinaryEventStatusContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="WITHDRAWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VeterinaryEventStatusContentType", namespace = "http://api.vetrf.ru/schema/cdm/codelist/v2")
@XmlEnum
public enum VeterinaryEventStatusContentType {


    /**
     * ����������� ���
     * 
     */
    UNKNOWN,

    /**
     * ��� �� ���������
     * 
     */
    UNDEFINED,

    /**
     * �����������
     * 
     */
    ACTIVE,

    /**
     * ��������
     * 
     */
    DRAFT,

    /**
     * �����������
     * 
     */
    WITHDRAWN;

    public String value() {
        return name();
    }

    public static VeterinaryEventStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
