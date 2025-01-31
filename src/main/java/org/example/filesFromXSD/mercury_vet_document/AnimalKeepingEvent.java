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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.dictionary_v2.AnimalKeepingLocation;
import org.example.filesFromXSD.dictionary_v2.AnimalKeepingPurpose;
import org.example.filesFromXSD.dictionary_v2.AnimalKeepingType;


/**
 * �������� � ���������� ��������� (������ ��������)
 * 
 * <p>Java class for AnimalKeepingEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalKeepingEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEvent">
 *       &lt;sequence>
 *         &lt;element name="keepingType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalKeepingType" minOccurs="0"/>
 *         &lt;element name="keepingPurpose" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalKeepingPurpose" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="keepingLocation" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalKeepingLocation" minOccurs="0"/>
 *         &lt;element name="facilityDescription" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalKeepingEvent", propOrder = {
    "keepingType",
    "keepingPurpose",
    "keepingLocation",
    "facilityDescription"
})
@XmlSeeAlso({
    AnimalKeepingDetails.class
})
public class AnimalKeepingEvent
    extends VeterinaryEvent
{

    protected AnimalKeepingType keepingType;
    protected List<AnimalKeepingPurpose> keepingPurpose;
    protected AnimalKeepingLocation keepingLocation;
    protected String facilityDescription;

    /**
     * Gets the value of the keepingType property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalKeepingType }
     *     
     */
    public AnimalKeepingType getKeepingType() {
        return keepingType;
    }

    /**
     * Sets the value of the keepingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalKeepingType }
     *     
     */
    public void setKeepingType(AnimalKeepingType value) {
        this.keepingType = value;
    }

    /**
     * Gets the value of the keepingPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keepingPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeepingPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalKeepingPurpose }
     * 
     * 
     */
    public List<AnimalKeepingPurpose> getKeepingPurpose() {
        if (keepingPurpose == null) {
            keepingPurpose = new ArrayList<AnimalKeepingPurpose>();
        }
        return this.keepingPurpose;
    }

    public void addKeepingPurpose(AnimalKeepingPurpose purpose){
        if (keepingPurpose == null) {
            keepingPurpose = new ArrayList<AnimalKeepingPurpose>();
        }
        keepingPurpose.add(purpose);
    }

    /**
     * Gets the value of the keepingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalKeepingLocation }
     *     
     */
    public AnimalKeepingLocation getKeepingLocation() {
        return keepingLocation;
    }

    /**
     * Sets the value of the keepingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalKeepingLocation }
     *     
     */
    public void setKeepingLocation(AnimalKeepingLocation value) {
        this.keepingLocation = value;
    }

    /**
     * Gets the value of the facilityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityDescription() {
        return facilityDescription;
    }

    /**
     * Sets the value of the facilityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityDescription(String value) {
        this.facilityDescription = value;
    }

}
