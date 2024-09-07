//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.dictionary_v2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnterpriseRoleContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnterpriseRoleContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="PRODUCER"/>
 *     &lt;enumeration value="SLAUGHTER_HOUSE"/>
 *     &lt;enumeration value="CUTTING_PLANT"/>
 *     &lt;enumeration value="COLD_STORE"/>
 *     &lt;enumeration value="PACKAGING_PLANT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnterpriseRoleContentType", namespace = "http://api.vetrf.ru/schema/cdm/codelist/v2")
@XmlEnum
public enum EnterpriseRoleContentType {


    /**
     * ����������� ����.
     * 
     */
    UNKNOWN,

    /**
     * ���� �� ����������.
     * 
     */
    UNDEFINED,

    /**
     * �������� �������������� ��������� (� ��� ����� �����������).
     * 
     */
    PRODUCER,

    /**
     * ����� (������������).
     * 
     */
    SLAUGHTER_HOUSE,

    /**
     * ����������� �����������.
     * 
     */
    CUTTING_PLANT,

    /**
     * �����������.
     * 
     */
    COLD_STORE,

    /**
     * ����������� �����������.
     * 
     */
    PACKAGING_PLANT;

    public String value() {
        return name();
    }

    public static EnterpriseRoleContentType fromValue(String v) {
        return valueOf(v);
    }

}
