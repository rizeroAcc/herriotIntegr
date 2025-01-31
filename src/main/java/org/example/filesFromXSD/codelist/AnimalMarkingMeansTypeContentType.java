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
 * <p>Java class for AnimalMarkingMeansTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnimalMarkingMeansTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="LABEL"/>
 *     &lt;enumeration value="MICROCHIP"/>
 *     &lt;enumeration value="BRAND"/>
 *     &lt;enumeration value="TATTOO"/>
 *     &lt;enumeration value="RING"/>
 *     &lt;enumeration value="ELECTRONIC_RING"/>
 *     &lt;enumeration value="ELECTRONIC_COLLAR"/>
 *     &lt;enumeration value="COLLAR"/>
 *     &lt;enumeration value="RESPONDER"/>
 *     &lt;enumeration value="TRANSPONDER"/>
 *     &lt;enumeration value="BOLUS"/>
 *     &lt;enumeration value="NAMEPLATE"/>
 *     &lt;enumeration value="WING_TAG"/>
 *     &lt;enumeration value="ELECTRONIC_WING_TAG"/>
 *     &lt;enumeration value="ELECTRONIC_TAG"/>
 *     &lt;enumeration value="TISSUE_SECTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnimalMarkingMeansTypeContentType", namespace = "http://api.vetrf.ru/schema/cdm/codelist/v2")
@XmlEnum
public enum AnimalMarkingMeansTypeContentType {


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
     * �����
     * 
     */
    LABEL,

    /**
     * ���������� ��������
     * 
     */
    MICROCHIP,

    /**
     * �����/������
     * 
     */
    BRAND,

    /**
     * ����������
     * 
     */
    TATTOO,

    /**
     * ������
     * 
     */
    RING,

    /**
     * ����������� ������
     * 
     */
    ELECTRONIC_RING,

    /**
     * ����������� �������
     * 
     */
    ELECTRONIC_COLLAR,

    /**
     * �������
     * 
     */
    COLLAR,

    /**
     * ���������
     * 
     */
    RESPONDER,

    /**
     * �����������
     * 
     */
    TRANSPONDER,

    /**
     * �����
     * 
     */
    BOLUS,

    /**
     * �����
     * 
     */
    NAMEPLATE,

    /**
     * �����-�����
     * 
     */
    WING_TAG,

    /**
     * ����������� �����-�����
     * 
     */
    ELECTRONIC_WING_TAG,

    /**
     * ����������� �����
     * 
     */
    ELECTRONIC_TAG,

    /**
     * ����� ������
     * 
     */
    TISSUE_SECTION;

    public String value() {
        return name();
    }

    public static AnimalMarkingMeansTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
