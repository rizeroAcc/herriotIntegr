//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.herriot_applications_v1;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.*;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.example.filesFromXSD.base.GenericVersioningEntity;
import org.example.filesFromXSD.dictionary_v2.*;
import org.example.filesFromXSD.mercury_vet_document.*;

/**
 * �������� ����������� (������� ��������) ��������� ��� ������ ��������.
 * 
 * <p>Java class for AnimalRegistration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalRegistration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="identityType" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalIdentityType" minOccurs="0"/>
 *         &lt;element name="registrationNumber" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalID" minOccurs="0"/>
 *         &lt;element name="registrationStatus" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalRegistrationStatus" minOccurs="0"/>
 *         &lt;element name="initialIdentificationType" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalIdentificationEventType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="specifiedAnimal" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Animal" minOccurs="0"/>
 *           &lt;element name="specifiedAnimalGroup" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalGroup" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="specifiedAnimalIdentity" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalIdentity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specifiedGeneticPassport" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalGeneticPassport" minOccurs="0"/>
 *         &lt;element name="importDetails" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalImportDetails" minOccurs="0"/>
 *         &lt;element name="ownerParty" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *         &lt;element name="keepingDetails" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalKeepingDetails" minOccurs="0"/>
 *         &lt;element name="breedingValueType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalBreedingValueType" minOccurs="0"/>
 *         &lt;element name="specifiedProductivity" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalProductivity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="additionalAttribute" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}UnmeasuredAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pedigreeInfo" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalPedigreeInfo" minOccurs="0"/>
 *         &lt;element name="broodInfo" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalBroodInfo" minOccurs="0"/>
 *         &lt;element name="unitInfo" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalUnitInfo" minOccurs="0"/>
 *         &lt;element name="membershipInfo" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalGroupMembershipInfo" minOccurs="0"/>
 *         &lt;element name="referencedDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ReferencedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *         &lt;element name="lifecycleEventList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalLifecycleEventList" minOccurs="0"/>
 *         &lt;element name="medicationEventList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalMedicationEventList" minOccurs="0"/>
 *         &lt;element name="keepingEventList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalKeepingEventList" minOccurs="0"/>
 *         &lt;element name="movementEventList" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}AnimalMovementEventList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="qualifier" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2", name = "AnimalRegistration", propOrder = {
    "identityType",
    "registrationNumber",
    "registrationStatus",
    "initialIdentificationType",
    "specifiedAnimal",
    "specifiedAnimalGroup",
    "specifiedAnimalIdentity",
    "specifiedGeneticPassport",
    "importDetails",
    "ownerParty",
    "keepingDetails",
    "breedingValueType",
    "specifiedProductivity",
    "additionalAttribute",
    "pedigreeInfo",
    "broodInfo",
    "unitInfo",
    "membershipInfo",
    "referencedDocument",
    "notes",
    "lifecycleEventList",
    "medicationEventList",
    "keepingEventList",
    "movementEventList"
})
public class AnimalRegistration
    extends GenericVersioningEntity
{

    protected AnimalIdentityType identityType;
    protected AnimalID registrationNumber;
    protected AnimalRegistrationStatus registrationStatus;
    protected AnimalIdentificationEventType initialIdentificationType;
    protected Animal specifiedAnimal;
    protected AnimalGroup specifiedAnimalGroup;
    protected List<AnimalIdentity> specifiedAnimalIdentity;
    protected AnimalGeneticPassport specifiedGeneticPassport;
    protected AnimalImportDetails importDetails;
    protected BusinessEntity ownerParty;
    protected AnimalKeepingDetails keepingDetails;
    protected AnimalBreedingValueType breedingValueType;
    protected List<AnimalProductivity> specifiedProductivity;
    protected List<UnmeasuredAttribute> additionalAttribute;
    protected AnimalPedigreeInfo pedigreeInfo;
    protected AnimalBroodInfo broodInfo;
    protected AnimalUnitInfo unitInfo;
    protected AnimalGroupMembershipInfo membershipInfo;
    protected List<ReferencedDocument> referencedDocument;
    protected String notes;
    protected AnimalLifecycleEventList lifecycleEventList;
    protected AnimalMedicationEventList medicationEventList;
    protected AnimalKeepingEventList keepingEventList;
    protected AnimalMovementEventList movementEventList;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String qualifier;

    /**
     * Gets the value of the identityType property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalIdentityType }
     *     
     */
    public AnimalIdentityType getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalIdentityType }
     *     
     */
    public void setIdentityType(AnimalIdentityType value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalID }
     *     
     */
    public AnimalID getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalID }
     *     
     */
    public void setRegistrationNumber(AnimalID value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalRegistrationStatus }
     *     
     */
    public AnimalRegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalRegistrationStatus }
     *     
     */
    public void setRegistrationStatus(AnimalRegistrationStatus value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the initialIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalIdentificationEventType }
     *     
     */
    public AnimalIdentificationEventType getInitialIdentificationType() {
        return initialIdentificationType;
    }

    /**
     * Sets the value of the initialIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalIdentificationEventType }
     *     
     */
    public void setInitialIdentificationType(AnimalIdentificationEventType value) {
        this.initialIdentificationType = value;
    }

    /**
     * Gets the value of the specifiedAnimal property.
     * 
     * @return
     *     possible object is
     *     {@link Animal }
     *     
     */
    public Animal getSpecifiedAnimal() {
        return specifiedAnimal;
    }

    /**
     * Sets the value of the specifiedAnimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Animal }
     *     
     */
    public void setSpecifiedAnimal(Animal value) {
        this.specifiedAnimal = value;
    }

    /**
     * Gets the value of the specifiedAnimalGroup property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalGroup }
     *     
     */
    public AnimalGroup getSpecifiedAnimalGroup() {
        return specifiedAnimalGroup;
    }

    /**
     * Sets the value of the specifiedAnimalGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalGroup }
     *     
     */
    public void setSpecifiedAnimalGroup(AnimalGroup value) {
        this.specifiedAnimalGroup = value;
    }

    /**
     * Gets the value of the specifiedAnimalIdentity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedAnimalIdentity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedAnimalIdentity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalIdentity }
     * 
     * 
     */
    public List<AnimalIdentity> getSpecifiedAnimalIdentity() {
        if (specifiedAnimalIdentity == null) {
            specifiedAnimalIdentity = new ArrayList<AnimalIdentity>();
        }
        return this.specifiedAnimalIdentity;
    }

    public void addSpecifiedAnimalIdentity(AnimalIdentity animalIdentity){
        if (specifiedAnimalIdentity == null) {
            specifiedAnimalIdentity = new ArrayList<AnimalIdentity>();
        }
        specifiedAnimalIdentity.add(animalIdentity);
    }

    /**
     * Gets the value of the specifiedGeneticPassport property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalGeneticPassport }
     *     
     */
    public AnimalGeneticPassport getSpecifiedGeneticPassport() {
        return specifiedGeneticPassport;
    }

    /**
     * Sets the value of the specifiedGeneticPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalGeneticPassport }
     *     
     */
    public void setSpecifiedGeneticPassport(AnimalGeneticPassport value) {
        this.specifiedGeneticPassport = value;
    }

    /**
     * Gets the value of the importDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalImportDetails }
     *     
     */
    public AnimalImportDetails getImportDetails() {
        return importDetails;
    }

    /**
     * Sets the value of the importDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalImportDetails }
     *     
     */
    public void setImportDetails(AnimalImportDetails value) {
        this.importDetails = value;
    }

    /**
     * Gets the value of the ownerParty property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getOwnerParty() {
        return ownerParty;
    }

    /**
     * Sets the value of the ownerParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setOwnerParty(BusinessEntity value) {
        this.ownerParty = value;
    }

    /**
     * Gets the value of the keepingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalKeepingDetails }
     *     
     */
    public AnimalKeepingDetails getKeepingDetails() {
        return keepingDetails;
    }

    /**
     * Sets the value of the keepingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalKeepingDetails }
     *     
     */
    public void setKeepingDetails(AnimalKeepingDetails value) {
        this.keepingDetails = value;
    }

    /**
     * Gets the value of the breedingValueType property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalBreedingValueType }
     *     
     */
    public AnimalBreedingValueType getBreedingValueType() {
        return breedingValueType;
    }

    /**
     * Sets the value of the breedingValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalBreedingValueType }
     *     
     */
    public void setBreedingValueType(AnimalBreedingValueType value) {
        this.breedingValueType = value;
    }

    /**
     * Gets the value of the specifiedProductivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedProductivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedProductivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalProductivity }
     * 
     * 
     */
    public List<AnimalProductivity> getSpecifiedProductivity() {
        if (specifiedProductivity == null) {
            specifiedProductivity = new ArrayList<AnimalProductivity>();
        }
        return this.specifiedProductivity;
    }

    public void addAnimalProductivity (AnimalProductivity productivity){
        if (specifiedProductivity == null) {
            specifiedProductivity = new ArrayList<AnimalProductivity>();
        }
        specifiedProductivity.add(productivity);
    }

    /**
     * Gets the value of the additionalAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnmeasuredAttribute }
     * 
     * 
     */
    public List<UnmeasuredAttribute> getAdditionalAttribute() {
        if (additionalAttribute == null) {
            additionalAttribute = new ArrayList<UnmeasuredAttribute>();
        }
        return this.additionalAttribute;
    }

    /**
     * Gets the value of the pedigreeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalPedigreeInfo }
     *     
     */
    public AnimalPedigreeInfo getPedigreeInfo() {
        return pedigreeInfo;
    }

    /**
     * Sets the value of the pedigreeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalPedigreeInfo }
     *     
     */
    public void setPedigreeInfo(AnimalPedigreeInfo value) {
        this.pedigreeInfo = value;
    }

    /**
     * Gets the value of the broodInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalBroodInfo }
     *     
     */
    public AnimalBroodInfo getBroodInfo() {
        return broodInfo;
    }

    /**
     * Sets the value of the broodInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalBroodInfo }
     *     
     */
    public void setBroodInfo(AnimalBroodInfo value) {
        this.broodInfo = value;
    }

    /**
     * Gets the value of the unitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalUnitInfo }
     *     
     */
    public AnimalUnitInfo getUnitInfo() {
        return unitInfo;
    }

    /**
     * Sets the value of the unitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalUnitInfo }
     *     
     */
    public void setUnitInfo(AnimalUnitInfo value) {
        this.unitInfo = value;
    }

    /**
     * Gets the value of the membershipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalGroupMembershipInfo }
     *     
     */
    public AnimalGroupMembershipInfo getMembershipInfo() {
        return membershipInfo;
    }

    /**
     * Sets the value of the membershipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalGroupMembershipInfo }
     *     
     */
    public void setMembershipInfo(AnimalGroupMembershipInfo value) {
        this.membershipInfo = value;
    }

    /**
     * Gets the value of the referencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedDocument }
     * 
     * 
     */
    public List<ReferencedDocument> getReferencedDocument() {
        if (referencedDocument == null) {
            referencedDocument = new ArrayList<ReferencedDocument>();
        }
        return this.referencedDocument;
    }

    public void addReferencedDocument(ReferencedDocument document){
        if (referencedDocument == null) {
            referencedDocument = new ArrayList<ReferencedDocument>();
        }
        referencedDocument.add(document);
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the lifecycleEventList property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalLifecycleEventList }
     *     
     */
    public AnimalLifecycleEventList getLifecycleEventList() {
        return lifecycleEventList;
    }

    /**
     * Sets the value of the lifecycleEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalLifecycleEventList }
     *     
     */
    public void setLifecycleEventList(AnimalLifecycleEventList value) {
        this.lifecycleEventList = value;
    }

    /**
     * Gets the value of the medicationEventList property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalMedicationEventList }
     *     
     */
    public AnimalMedicationEventList getMedicationEventList() {
        return medicationEventList;
    }

    /**
     * Sets the value of the medicationEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalMedicationEventList }
     *     
     */
    public void setMedicationEventList(AnimalMedicationEventList value) {
        this.medicationEventList = value;
    }

    /**
     * Gets the value of the keepingEventList property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalKeepingEventList }
     *     
     */
    public AnimalKeepingEventList getKeepingEventList() {
        return keepingEventList;
    }

    /**
     * Sets the value of the keepingEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalKeepingEventList }
     *     
     */
    public void setKeepingEventList(AnimalKeepingEventList value) {
        this.keepingEventList = value;
    }

    /**
     * Gets the value of the movementEventList property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalMovementEventList }
     *     
     */
    public AnimalMovementEventList getMovementEventList() {
        return movementEventList;
    }

    /**
     * Sets the value of the movementEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalMovementEventList }
     *     
     */
    public void setMovementEventList(AnimalMovementEventList value) {
        this.movementEventList = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

}
