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
 * <p>Java class for VeterinaryEventTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VeterinaryEventTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="UNDEFINED"/>
 *     &lt;enumeration value="UND"/>
 *     &lt;enumeration value="LBR"/>
 *     &lt;enumeration value="VSE"/>
 *     &lt;enumeration value="IMM"/>
 *     &lt;enumeration value="MED"/>
 *     &lt;enumeration value="QRT"/>
 *     &lt;enumeration value="VAC"/>
 *     &lt;enumeration value="AMA"/>
 *     &lt;enumeration value="AME"/>
 *     &lt;enumeration value="AIR"/>
 *     &lt;enumeration value="APS"/>
 *     &lt;enumeration value="ADS"/>
 *     &lt;enumeration value="AFS"/>
 *     &lt;enumeration value="DTH"/>
 *     &lt;enumeration value="LSS"/>
 *     &lt;enumeration value="RLS"/>
 *     &lt;enumeration value="EXP"/>
 *     &lt;enumeration value="IMP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VeterinaryEventTypeContentType", namespace = "http://api.vetrf.ru/schema/cdm/codelist/v2")
@XmlEnum
public enum VeterinaryEventTypeContentType {


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
     * �� ���������
     * 
     */
    UND,

    /**
     * ������������ ������������
     * 
     */
    LBR,

    /**
     * �����������-���������� ����������
     * 
     */
    VSE,

    /**
     * ����������� ������ ���������
     * 
     */
    IMM,

    /**
     * ��������� ������ ���������
     * 
     */
    MED,

    /**
     * ��������
     * 
     */
    QRT,

    /**
     * ���������� ������ ���������
     * 
     */
    VAC,

    /**
     * ���� ���������� ������������� ������� � ��������� ������ ���������
     * 
     */
    AMA,

    /**
     * ������������ ��������� ��� ������ �������� (��������� ����������)
     * 
     */
    AME,

    /**
     * ������� �������� ������������ ��� ��������� ��� ������ ��������
     * 
     */
    AIR,

    /**
     * �������� ���� ���������
     * 
     */
    APS,

    /**
     * ��������������� ���� ���������
     * 
     */
    ADS,

    /**
     * ����������� ���� ���������
     * 
     */
    AFS,

    /**
     * ���� ���������
     * 
     */
    DTH,

    /**
     * ������� ��������� (�������, �������� � �.�.)
     * 
     */
    LSS,

    /**
     * ������ ��������� � ����� �������� (������, �������, ����� � �.�.)
     * 
     */
    RLS,

    /**
     * ������� ���������
     * 
     */
    EXP,

    /**
     * ������ ���������
     * 
     */
    IMP;

    public String value() {
        return name();
    }

    public static VeterinaryEventTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
