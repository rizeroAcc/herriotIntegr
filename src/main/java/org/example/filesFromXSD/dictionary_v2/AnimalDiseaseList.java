//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.dictionary_v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.base.EntityList;

/**
 * ���, ����������� ������ �����������.
 * 
 * <p>Java class for AnimalDiseaseList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalDiseaseList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}EntityList">
 *       &lt;sequence>
 *         &lt;element name="disease" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalDisease" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalDiseaseList", propOrder = {
    "disease"
})
public class AnimalDiseaseList
    extends EntityList
{

    protected List<AnimalDisease> disease;

    /**
     * Gets the value of the disease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalDisease }
     * 
     * 
     */
    public List<AnimalDisease> getDisease() {
        if (disease == null) {
            disease = new ArrayList<AnimalDisease>();
        }
        return this.disease;
    }

}
