//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.mercury_vet_document;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.base.EntityList;

/**
 * ������ �������
 * 
 * <p>Java class for AnimalLifecycleEventList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalLifecycleEventList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}EntityList">
 *       &lt;sequence>
 *         &lt;element name="animalLifecycleEvent" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalLifecycleEvent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalLifecycleEventList", propOrder = {
    "animalLifecycleEvent"
})
public class AnimalLifecycleEventList
    extends EntityList
{

    protected List<AnimalLifecycleEvent> animalLifecycleEvent;

    /**
     * Gets the value of the animalLifecycleEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalLifecycleEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalLifecycleEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalLifecycleEvent }
     * 
     * 
     */
    public List<AnimalLifecycleEvent> getAnimalLifecycleEvent() {
        if (animalLifecycleEvent == null) {
            animalLifecycleEvent = new ArrayList<AnimalLifecycleEvent>();
        }
        return this.animalLifecycleEvent;
    }

}
