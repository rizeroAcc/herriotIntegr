//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.base;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.dictionary_v2.*;
import org.example.filesFromXSD.mercury_vet_document.Document;
import org.example.filesFromXSD.mercury_vet_document.ShipmentRoutePoint;
import org.example.filesFromXSD.mercury_vet_document.User;
import org.example.filesFromXSD.mercury_vet_document.VetPermitCargoItem;


/**
 * ���, ������� ��� ����� �������� �������.
 *          
 * 
 * <p>Java class for GenericEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="uuid" type="{http://api.vetrf.ru/schema/cdm/base}UUID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericEntity", propOrder = {
    "uuid"
})
@XmlSeeAlso({
    SupervisedObjectActivity.class,
    SamplingReason.class,
    VeterinaryService.class,
    EnterpriseActivity.class,
    IncorporationForm.class,
    User.class,
    FMPRegistryProduct.class,
    Delivery.class,
    Document.class,
    ShipmentRoutePoint.class,
    GenericVersioningEntity.class,
    VetPermitCargoItem.class
})
public class GenericEntity {

    protected String uuid;

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
