//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.02 at 04:09:00 PM MSK 
//


package org.example.filesFromXSD.herriot_applications_v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.mercury_vet_document.AnimalMedicationEventList;


/**
 * 
 *                 �����: ��������� ������ ��������� ��������
 *                 � ������������������ ������������ ���������������� ����������� �� ��������� ������ �������
 *             
 * 
 * <p>Java class for GetAnimalVeterinaryEventChangesListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAnimalVeterinaryEventChangesListResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="medicationEventList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalMedicationEventList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAnimalVeterinaryEventChangesListResponse", propOrder = {
    "medicationEventList"
})
public class GetAnimalVeterinaryEventChangesListResponse
    extends ApplicationResultData
{

    @XmlElement(required = true)
    protected AnimalMedicationEventList medicationEventList;

    /**
     * Gets the value of the medicationEventList property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalMedicationEventList }
     *     
     */
    public AnimalMedicationEventList getMedicationEventList() {
        return medicationEventList;
    }

    /**
     * Sets the value of the medicationEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalMedicationEventList }
     *     
     */
    public void setMedicationEventList(AnimalMedicationEventList value) {
        this.medicationEventList = value;
    }

}
