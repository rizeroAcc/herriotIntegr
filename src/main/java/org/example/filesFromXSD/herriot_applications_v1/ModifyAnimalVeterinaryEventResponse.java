//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.02 at 04:09:00 PM MSK 
//


package org.example.filesFromXSD.herriot_applications_v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.mercury_vet_document.AnimalMedicationEvent;


/**
 * 
 *                 �����: �������������� �������� � ������������ ���������������� �����������
 *             
 * 
 * <p>Java class for ModifyAnimalVeterinaryEventResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModifyAnimalVeterinaryEventResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="medicationEvent" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalMedicationEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyAnimalVeterinaryEventResponse", propOrder = {
    "medicationEvent"
})
public class ModifyAnimalVeterinaryEventResponse
    extends ApplicationResultData
{

    protected List<AnimalMedicationEvent> medicationEvent;

    /**
     * Gets the value of the medicationEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medicationEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedicationEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalMedicationEvent }
     * 
     * 
     */
    public List<AnimalMedicationEvent> getMedicationEvent() {
        if (medicationEvent == null) {
            medicationEvent = new ArrayList<AnimalMedicationEvent>();
        }
        return this.medicationEvent;
    }

}
