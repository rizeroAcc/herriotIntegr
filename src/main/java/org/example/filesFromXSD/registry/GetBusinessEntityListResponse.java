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
import org.example.filesFromXSD.dictionary_v2.BusinessEntityList;


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
 *         &lt;element ref="{http://api.vetrf.ru/schema/cdm/dictionary/v2}businessEntityList"/>
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
    "businessEntityList"
})
@XmlRootElement(name = "getBusinessEntityListResponse")
public class GetBusinessEntityListResponse {

    @XmlElement(namespace = "http://api.vetrf.ru/schema/cdm/dictionary/v2", required = true)
    protected BusinessEntityList businessEntityList;

    /**
     * ������ ��.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntityList }
     *     
     */
    public BusinessEntityList getBusinessEntityList() {
        return businessEntityList;
    }

    /**
     * Sets the value of the businessEntityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntityList }
     *     
     */
    public void setBusinessEntityList(BusinessEntityList value) {
        this.businessEntityList = value;
    }

}
