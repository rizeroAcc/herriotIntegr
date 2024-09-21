package org.example;

import org.example.filesFromXSD.codelist.AnimalBreedingValueTypeContentType;
import org.example.filesFromXSD.codelist.AnimalIdentificationEventTypeContentType;
import org.example.filesFromXSD.codelist.AnimalIdentityTypeContentType;
import org.example.filesFromXSD.codelist.AnimalRegistrationStatusContentType;
import org.example.filesFromXSD.dictionary_v2.*;
import org.example.filesFromXSD.herriot_applications_v1.AnimalRegistration;
import org.example.filesFromXSD.mercury_vet_document.*;

import java.math.BigInteger;
import java.util.List;

public class AnimalRegistrationBuilder {
    private AnimalRegistration registration;
    private boolean isIdentityTypeSet;
    private boolean isAnimalRegistrationStatusSet;
    private boolean isInitialIdentificationTypeSet;
    private boolean isSpecifiedAnimalSet;
    private boolean isKeepingDetailsSet;
    private boolean isBreedingValueTypeSet;
    private boolean isReferencedDocumentCode55Set;
    public AnimalRegistrationBuilder(){
        registration = new AnimalRegistration();
        isIdentityTypeSet = false;
        isAnimalRegistrationStatusSet = false;
        isInitialIdentificationTypeSet = false;
        isSpecifiedAnimalSet = false;
        isKeepingDetailsSet = false;
        isBreedingValueTypeSet = false;
        isReferencedDocumentCode55Set = false;
    }
    public void setRegistrationNumber(AnimalID registrationNumber){
        registration.setRegistrationNumber(registrationNumber);
    }
    public void setOwnerParty(BusinessEntity owner){
        registration.setOwnerParty(owner);
    }
    public void setBroodInfo(AnimalBroodInfo broodInfo){
        registration.setBroodInfo(broodInfo);
    }
    public void setNotes(String notes){
        registration.setNotes(notes);
    }
    public void setAnimalMedicationEventList(AnimalMedicationEventList medicationEventList){
        registration.setMedicationEventList(medicationEventList);
    }
    public void setAnimalKeepingEventList(AnimalKeepingEventList keepingEventList){
        registration.setKeepingEventList(keepingEventList);
    }
    public void setAnimalMovementEventList(AnimalMovementEventList animalMovementEventList){
        registration.setMovementEventList(animalMovementEventList);
    }
    public void setLifecycleEventList(AnimalLifecycleEventList lifecycleEventList){
        registration.setLifecycleEventList(lifecycleEventList);
    }
    public void setQualifier(String qualifier){
        registration.setQualifier(qualifier);
    }
    public void setIdentityType(AnimalIdentityType identityType) {
        registration.setIdentityType(identityType);
        isIdentityTypeSet = true;
    }
    public void setIdentityType(AnimalIdentityTypeContentType identityType){
        AnimalIdentityType type = new AnimalIdentityType();
        type.setValue(identityType);
        registration.setIdentityType(type);
        isIdentityTypeSet = true;
    }
    public void setAnimalRegistrationStatus(AnimalRegistrationStatus status){
        registration.setRegistrationStatus(status);
        isAnimalRegistrationStatusSet = true;
    }
    public void setAnimalRegistrationStatus(AnimalRegistrationStatusContentType status){
        AnimalRegistrationStatus registrationStatus = new AnimalRegistrationStatus();
        registrationStatus.setValue(status);
        registration.setRegistrationStatus(registrationStatus);
        isAnimalRegistrationStatusSet = true;
    }
    public void setInitialIdentificationType(AnimalIdentificationEventType identificationType){
        registration.setInitialIdentificationType(identificationType);
        isInitialIdentificationTypeSet = true;
    }
    public void setInitialIdentificationType(AnimalIdentificationEventTypeContentType identificationType){
        AnimalIdentificationEventType type = new AnimalIdentificationEventType();
        type.setValue(identificationType);
        registration.setInitialIdentificationType(type);
        isInitialIdentificationTypeSet = true;
    }
    public void setSpecifiedAnimal(Animal specifiedAnimal){
        registration.setSpecifiedAnimal(specifiedAnimal);
        isSpecifiedAnimalSet = true;
    }
    public void addSpecifiedAnimalIdentity(AnimalIdentity animalIdentity){
        registration.addSpecifiedAnimalIdentity(animalIdentity);
    }
    public void setSpecifiedGeneticPassport(AnimalGeneticPassport specifiedGeneticPassport){
        registration.setSpecifiedGeneticPassport(specifiedGeneticPassport);
    }
    public void setImportDetails(AnimalImportDetails importDetails){
        registration.setImportDetails(importDetails);
    }
    public void setKeepingDetails(AnimalKeepingDetails keepingDetails){
        registration.setKeepingDetails(keepingDetails);
        isKeepingDetailsSet = true;
    }
    public void setBreedingValueType(AnimalBreedingValueType breedingValueType){
        registration.setBreedingValueType(breedingValueType);
        isBreedingValueTypeSet = true;
    }
    public void setBreedingValueType(AnimalBreedingValueTypeContentType breedingValueType){
        AnimalBreedingValueType type = new AnimalBreedingValueType();
        type.setValue(breedingValueType);
        registration.setBreedingValueType(type);
        isBreedingValueTypeSet = true;
    }
    public void addSpecifiedProductivity(AnimalProductivity specifiedProductivity){
        registration.addAnimalProductivity(specifiedProductivity);
    }
    public void addAdditionalAttribute(UnmeasuredAttribute additionalAttribute){
        registration.addAdditionalAttribute(additionalAttribute);
    }
    public void addAdditionalAttribute(List<String> attrValue, String attrID){
        UnmeasuredAttribute additionalAttribute = new UnmeasuredAttribute();
        additionalAttribute.setAttrID(attrID);
        for (String value:
             attrValue) {
            additionalAttribute.addAttrValue(value);
        }
        registration.addAdditionalAttribute(additionalAttribute);
    }
    public void addAdditionalAttribute(String attrValue, String attrID){
        UnmeasuredAttribute additionalAttribute = new UnmeasuredAttribute();
        additionalAttribute.setAttrID(attrID);
        additionalAttribute.addAttrValue(attrValue);
        registration.addAdditionalAttribute(additionalAttribute);
    }
    public void setPedigreeInfo(AnimalPedigreeInfo pedigreeInfo){
        registration.setPedigreeInfo(pedigreeInfo);
    }
    public void setUnitInfo(AnimalUnitInfo unitInfo){
        registration.setUnitInfo(unitInfo);
    }
    public void setMembershipInfo(AnimalGroupMembershipInfo membershipInfo){
        registration.setMembershipInfo(membershipInfo);
    }
    public void addReferencedDocumentCode55(ReferencedDocument referencedDocument){
        registration.addReferencedDocument(referencedDocument);
        isReferencedDocumentCode55Set = true;
    }
    public void addReferencedDocumentCode55(String UUID,int relType){
        ReferencedDocument referencedDocument = new ReferencedDocument();
        referencedDocument.setUuid(UUID);
        ReferenceType relationshipType = new ReferenceType();
        relationshipType.setValue(BigInteger.valueOf(relType));
        referencedDocument.setRelationshipType(relationshipType);
        DocumentType documentType = new DocumentType();
        documentType.setValue(BigInteger.valueOf(55));
        referencedDocument.setType(documentType);
        registration.addReferencedDocument(referencedDocument);
        isReferencedDocumentCode55Set = true;
    }
    public void addReferencedDocumentCode56(ReferencedDocument referencedDocument){
        registration.addReferencedDocument(referencedDocument);
    }
    public void addReferencedDocumentCode56(String issueNumber,int relType){
        ReferencedDocument referencedDocument = new ReferencedDocument();
        DocumentType documentType = new DocumentType();
        documentType.setValue(BigInteger.valueOf(56));
        referencedDocument.setType(documentType);
        referencedDocument.setIssueNumber(issueNumber);
        ReferenceType relationshipType = new ReferenceType();
        relationshipType.setValue(BigInteger.valueOf(relType));
        referencedDocument.setRelationshipType(relationshipType);
        registration.addReferencedDocument(referencedDocument);
    }
    public void setUUID(String UUID){
        registration.setUuid(UUID);
    }
    public AnimalRegistration getAnimalRegistrationForIndividualRequest(){
        if (!isIdentityTypeSet){
            throw new RuntimeException("Identity isn't set");
        }
        if (!isAnimalRegistrationStatusSet){
            throw new RuntimeException("Registration status isn't set");
        }
        if (!isInitialIdentificationTypeSet){
            throw new RuntimeException("Initial identification type isn't set");
        }
        if (!isSpecifiedAnimalSet){
            throw new RuntimeException("Animal isn't set");
        }
        if (!isKeepingDetailsSet){
            throw new RuntimeException("Keeping details isn't set");
        }
        if (!isBreedingValueTypeSet){
            throw new RuntimeException("Breeding value isn't set");
        }
        if (!isReferencedDocumentCode55Set){
            throw new RuntimeException("Referenced document with code 55 isn't set");
        }
        return registration;
    }
    public AnimalRegistration getRegistration(){
        return registration;
    }
}
