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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.example.filesFromXSD.base.GenericVersioningEntity;


/**
 * ������� ��������������, ����������� ��� ��������� �����
 * 
 * <p>Java class for RegionalizationCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegionalizationCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="referenceNumber" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="text" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *         &lt;element name="strict" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="relatedDisease" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalDisease" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegionalizationCondition", propOrder = {
    "referenceNumber",
    "text",
    "strict",
    "relatedDisease"
})
public class RegionalizationCondition
    extends GenericVersioningEntity
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referenceNumber;
    protected String text;
    protected Boolean strict;
    protected List<AnimalDisease> relatedDisease;

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the strict property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrict() {
        return strict;
    }

    /**
     * Sets the value of the strict property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrict(Boolean value) {
        this.strict = value;
    }

    /**
     * Gets the value of the relatedDisease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedDisease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedDisease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalDisease }
     * 
     * 
     */
    public List<AnimalDisease> getRelatedDisease() {
        if (relatedDisease == null) {
            relatedDisease = new ArrayList<AnimalDisease>();
        }
        return this.relatedDisease;
    }

}
