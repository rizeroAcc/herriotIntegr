//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.27 at 03:54:43 PM MSK 
//


package org.example.filesFromXSD.registry;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.dictionary_v2.AnimalBreedList;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}animalBreedList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "animalBreedList"
})
@XmlRootElement(name = "getAnimalBreedListResponse")
public class GetAnimalBreedListResponse {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected AnimalBreedList animalBreedList;

    /**
     * ������ ����� ��������
     * 
     * @return
     *     possible object is
     *     {@link AnimalBreedList }
     *     
     */
    public AnimalBreedList getAnimalBreedList() {
        return animalBreedList;
    }

    /**
     * Sets the value of the animalBreedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalBreedList }
     *     
     */
    public void setAnimalBreedList(AnimalBreedList value) {
        this.animalBreedList = value;
    }

}
