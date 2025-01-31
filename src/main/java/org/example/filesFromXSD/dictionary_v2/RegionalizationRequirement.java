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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ���������� � ����������� ������ � ��������� � ������������� �����������.
 *          
 * 
 * <p>Java class for RegionalizationRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalizationRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatedDisease" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalDisease" minOccurs="0"/>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationDecision"/>
 *         &lt;element name="conditionGroup" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}RegionalizationConditionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalizationRequirement", propOrder = {
    "relatedDisease",
    "type",
    "conditionGroup"
})
public class RegionalizationRequirement {

    protected AnimalDisease relatedDisease;
    @XmlElement(required = true)
    protected RegionalizationDecision type;
    protected List<RegionalizationConditionGroup> conditionGroup;

    /**
     * Gets the value of the relatedDisease property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalDisease }
     *     
     */
    public AnimalDisease getRelatedDisease() {
        return relatedDisease;
    }

    /**
     * Sets the value of the relatedDisease property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalDisease }
     *     
     */
    public void setRelatedDisease(AnimalDisease value) {
        this.relatedDisease = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalizationDecision }
     *     
     */
    public RegionalizationDecision getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalizationDecision }
     *     
     */
    public void setType(RegionalizationDecision value) {
        this.type = value;
    }

    /**
     * Gets the value of the conditionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegionalizationConditionGroup }
     * 
     * 
     */
    public List<RegionalizationConditionGroup> getConditionGroup() {
        if (conditionGroup == null) {
            conditionGroup = new ArrayList<RegionalizationConditionGroup>();
        }
        return this.conditionGroup;
    }

}
