//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.02 at 04:09:00 PM MSK 
//


package org.example.filesFromXSD.herriot_applications_v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.mercury_vet_document.AnimalRegistrationList;


/**
 * 
 *                 �����: ����������� ����������� �������� �� ������������� (������ �������� ������������)
 *                 ������������������� ��������� ��� ������ ��������
 *             
 * 
 * <p>Java class for RemoveAnimalIdentityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoveAnimalIdentityResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationResultData">
 *       &lt;sequence>
 *         &lt;element name="animalRegistrationList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalRegistrationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAnimalIdentityResponse", propOrder = {
    "animalRegistrationList"
})
public class RemoveAnimalIdentityResponse
    extends ApplicationResultData
{

    protected AnimalRegistrationList animalRegistrationList;

    /**
     * Gets the value of the animalRegistrationList property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalRegistrationList }
     *     
     */
    public AnimalRegistrationList getAnimalRegistrationList() {
        return animalRegistrationList;
    }

    /**
     * Sets the value of the animalRegistrationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalRegistrationList }
     *     
     */
    public void setAnimalRegistrationList(AnimalRegistrationList value) {
        this.animalRegistrationList = value;
    }

}
