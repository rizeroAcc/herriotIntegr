//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.dictionary_v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * �������������� �������������� �������/��������
 * 
 * <p>Java class for AdditionalAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attrID" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="attrCode" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}CodeType" minOccurs="0"/>
 *         &lt;element name="attrName" type="{http://api.vetrf.ru/schema/cdm/base}NText" minOccurs="0"/>
 *         &lt;element name="description" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAttribute", propOrder = {
    "attrID",
    "attrCode",
    "attrName",
    "description"
})
@XmlSeeAlso({
    ClassificationAttribute.class,
    MeasuredAttribute.class,
    UnmeasuredAttribute.class
})
public abstract class AdditionalAttribute {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attrID;
    protected CodeType attrCode;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attrName;
    protected String description;

    /**
     * Gets the value of the attrID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrID() {
        return attrID;
    }

    /**
     * Sets the value of the attrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrID(String value) {
        this.attrID = value;
    }

    /**
     * Gets the value of the attrCode property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getAttrCode() {
        return attrCode;
    }

    /**
     * Sets the value of the attrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setAttrCode(CodeType value) {
        this.attrCode = value;
    }

    /**
     * Gets the value of the attrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * Sets the value of the attrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
