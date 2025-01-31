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
import org.example.filesFromXSD.dictionary_v2.BusinessEntity;
import org.example.filesFromXSD.dictionary_v2.Enterprise;
import org.example.filesFromXSD.dictionary_v2.VeterinaryLaboratory;


/**
 * ��� ������ ����.
 * 
 * <p>Java class for SamplingReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SamplingReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Document">
 *       &lt;sequence>
 *         &lt;element name="samplingReportStatus" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}SamplingReportStatus" minOccurs="0"/>
 *         &lt;element name="issuerLaboratoryResearchParty" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}VeterinaryLaboratory" minOccurs="0"/>
 *         &lt;element name="issuerSamplingSpecialist" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User" minOccurs="0"/>
 *         &lt;element name="contractSenderParty" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="samplingLocation" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise" minOccurs="0"/>
 *         &lt;element name="personPresentAtSampling" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="laboratoryResearchSample" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Sample" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SamplingReport", propOrder = {
    "samplingReportStatus",
    "issuerLaboratoryResearchParty",
    "issuerSamplingSpecialist",
    "contractSenderParty",
    "samplingLocation",
    "personPresentAtSampling",
    "laboratoryResearchSample"
})
public class SamplingReport
    extends Document
{

    protected SamplingReportStatus samplingReportStatus;
    protected VeterinaryLaboratory issuerLaboratoryResearchParty;
    protected User issuerSamplingSpecialist;
    protected BusinessEntity contractSenderParty;
    protected Enterprise samplingLocation;
    protected List<User> personPresentAtSampling;
    protected Sample laboratoryResearchSample;

    /**
     * Gets the value of the samplingReportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingReportStatus }
     *     
     */
    public SamplingReportStatus getSamplingReportStatus() {
        return samplingReportStatus;
    }

    /**
     * Sets the value of the samplingReportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingReportStatus }
     *     
     */
    public void setSamplingReportStatus(SamplingReportStatus value) {
        this.samplingReportStatus = value;
    }

    /**
     * Gets the value of the issuerLaboratoryResearchParty property.
     * 
     * @return
     *     possible object is
     *     {@link VeterinaryLaboratory }
     *     
     */
    public VeterinaryLaboratory getIssuerLaboratoryResearchParty() {
        return issuerLaboratoryResearchParty;
    }

    /**
     * Sets the value of the issuerLaboratoryResearchParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinaryLaboratory }
     *     
     */
    public void setIssuerLaboratoryResearchParty(VeterinaryLaboratory value) {
        this.issuerLaboratoryResearchParty = value;
    }

    /**
     * Gets the value of the issuerSamplingSpecialist property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getIssuerSamplingSpecialist() {
        return issuerSamplingSpecialist;
    }

    /**
     * Sets the value of the issuerSamplingSpecialist property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setIssuerSamplingSpecialist(User value) {
        this.issuerSamplingSpecialist = value;
    }

    /**
     * Gets the value of the contractSenderParty property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getContractSenderParty() {
        return contractSenderParty;
    }

    /**
     * Sets the value of the contractSenderParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setContractSenderParty(BusinessEntity value) {
        this.contractSenderParty = value;
    }

    /**
     * Gets the value of the samplingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Enterprise }
     *     
     */
    public Enterprise getSamplingLocation() {
        return samplingLocation;
    }

    /**
     * Sets the value of the samplingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enterprise }
     *     
     */
    public void setSamplingLocation(Enterprise value) {
        this.samplingLocation = value;
    }

    /**
     * Gets the value of the personPresentAtSampling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPresentAtSampling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPresentAtSampling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link User }
     * 
     * 
     */
    public List<User> getPersonPresentAtSampling() {
        if (personPresentAtSampling == null) {
            personPresentAtSampling = new ArrayList<User>();
        }
        return this.personPresentAtSampling;
    }

    /**
     * Gets the value of the laboratoryResearchSample property.
     * 
     * @return
     *     possible object is
     *     {@link Sample }
     *     
     */
    public Sample getLaboratoryResearchSample() {
        return laboratoryResearchSample;
    }

    /**
     * Sets the value of the laboratoryResearchSample property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sample }
     *     
     */
    public void setLaboratoryResearchSample(Sample value) {
        this.laboratoryResearchSample = value;
    }

}
