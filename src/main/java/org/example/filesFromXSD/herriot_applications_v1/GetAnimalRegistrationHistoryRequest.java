//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.02 at 04:09:00 PM MSK 
//


package org.example.filesFromXSD.herriot_applications_v1;

import jakarta.xml.bind.annotation.*;


/**
 * 
 *                 ������: ��������� ���� ������� ��������� ��������
 *                 � ����������� ��������� ��� ������ �������� �� ����������� ��������������
 *             
 * 
 * <p>Java class for GetAnimalRegistrationHistoryRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAnimalRegistrationHistoryRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/herriot/applications/v1}HerriotApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="animalRegistrationGuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAnimalRegistrationHistoryRequest", propOrder = {
    "animalRegistrationGuid"
})
public class GetAnimalRegistrationHistoryRequest
    extends HerriotApplicationRequest
{

    @XmlElement(required = true)
    protected String animalRegistrationGuid;

    /**
     * Gets the value of the animalRegistrationGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalRegistrationGuid() {
        return animalRegistrationGuid;
    }

    /**
     * Sets the value of the animalRegistrationGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalRegistrationGuid(String value) {
        this.animalRegistrationGuid = value;
    }

}
