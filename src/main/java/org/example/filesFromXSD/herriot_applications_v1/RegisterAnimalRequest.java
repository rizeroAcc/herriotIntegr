//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.herriot_applications_v1;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;


/**
 * 
 *                 ������: ����������� ��������� ��� ������ ��������
 *             
 * 
 * <p>Java class for RegisterAnimalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterAnimalRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/herriot/applications/v1}HerriotApplicationRequest">
 *       &lt;sequence>
 *         &lt;element name="animalRegistration" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalRegistration" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterAnimalRequest", propOrder = {
    "animalRegistration"
})
@XmlRootElement(name = "registerAnimalRequest")
public class RegisterAnimalRequest
    extends HerriotApplicationRequest
{

    @XmlElement(required = true)
    protected List<AnimalRegistration> animalRegistration;

    /**
     * Gets the value of the animalRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalRegistration }
     * 
     * 
     */
    public List<AnimalRegistration> getAnimalRegistration() {
        if (animalRegistration == null) {
            animalRegistration = new ArrayList<AnimalRegistration>();
        }
        return this.animalRegistration;
    }
    /**
    * {@link AnimalRegistration }
    * */
    public void addAnimalRegistration(AnimalRegistration registration){
        if (animalRegistration == null) {
            animalRegistration = new ArrayList<AnimalRegistration>();
        }
        animalRegistration.add(registration);
    }

}
