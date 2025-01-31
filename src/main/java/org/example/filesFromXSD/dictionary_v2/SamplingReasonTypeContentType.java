//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.dictionary_v2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamplingReasonTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamplingReasonTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="OWNER_APPLICATION"/>
 *     &lt;enumeration value="PRODUCTION_CONTROL"/>
 *     &lt;enumeration value="EXPORT_MONITORING"/>
 *     &lt;enumeration value="FOOD_MONITORING"/>
 *     &lt;enumeration value="EPIZOOTIC_MONITORING"/>
 *     &lt;enumeration value="SARS_COV2_TESTING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamplingReasonTypeContentType", namespace = "http://api.vetrf.ru/schema/cdm/codelist/v2")
@XmlEnum
public enum SamplingReasonTypeContentType {


    /**
     * ����������� ��� / ������
     * 
     */
    UNKNOWN("UNKNOWN"),

    /**
     * �� ���������� / �����������
     * 
     */
    UNDEFINED("UNDEFINED"),

    /**
     * O�������� ��������� ������������� (������������) �����
     * 
     */
    OWNER_APPLICATION("OWNER_APPLICATION"),

    /**
     * ���������������� ��������
     * 
     */
    PRODUCTION_CONTROL("PRODUCTION_CONTROL"),

    /**
     * � ������ ���.��������� "������� ���"
     * 
     */
    EXPORT_MONITORING("EXPORT_MONITORING"),

    /**
     * � ������ �������� �����������
     * 
     */
    FOOD_MONITORING("FOOD_MONITORING"),

    /**
     * � ������ ��������������� �����������
     * 
     */
    EPIZOOTIC_MONITORING("EPIZOOTIC_MONITORING"),

    /**
     * 
     *                         ������������ �������� �� ������� ������������� ��������� ������������ SARS-CoV-2
     *                     
     * 
     */
    @XmlEnumValue("SARS_COV2_TESTING")
    SARS_COV_2_TESTING("SARS_COV2_TESTING");
    private final String value;

    SamplingReasonTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamplingReasonTypeContentType fromValue(String v) {
        for (SamplingReasonTypeContentType c: SamplingReasonTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
