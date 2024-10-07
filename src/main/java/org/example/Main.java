package org.example;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.example.filesFromXSD.GetRegistrationHistoryRequestBuilder;
import org.example.filesFromXSD.RegisterAnimalMovementBuilder;
import org.example.filesFromXSD.application.Application;
import org.example.filesFromXSD.application.ApplicationDataWrapper;
import org.example.filesFromXSD.application.ApplicationResultWrapper;
import org.example.filesFromXSD.application.ApplicationStatus;
import org.example.filesFromXSD.application.ws_defenitions.ReceiveApplicationResultRequest;
import org.example.filesFromXSD.application.ws_defenitions.ReceiveApplicationResultResponse;
import org.example.filesFromXSD.application.ws_defenitions.SubmitApplicationRequest;
import org.example.filesFromXSD.application.ws_defenitions.SubmitApplicationResponse;
import org.example.filesFromXSD.base.ComplexDate;
import org.example.filesFromXSD.base.ComplexDatePeriod;
import org.example.filesFromXSD.codelist.*;
import org.example.filesFromXSD.dictionary_v2.*;
import org.example.filesFromXSD.herriot_applications_v1.*;
import org.example.filesFromXSD.mercury_vet_document.*;
import org.example.filesFromXSD.registry.*;
import org.xml.sax.InputSource;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static ComplexDate createComplexDate(int day,int month,int year){
        ComplexDate date = new ComplexDate();
        date.setYear(year);
        date.setMonth(month);
        date.setDay(day);
        return date;
    }
    public static AnimalKeepingLocation createBirthLocation(String supervisedObjectGUID){
        AnimalKeepingLocation birthLocation = new AnimalKeepingLocation();
        SupervisedObject supervisedObject = new SupervisedObject();
        supervisedObject.setGuid(supervisedObjectGUID);
        birthLocation.setSupervisedObject(supervisedObject);
        return birthLocation;
    }
    public static Animal createSpecifiedAnimal(String speciesGUID,
                                               String breedGUID,
                                               String color,
                                               AnimalGenderContentType gender,
                                               String name,
                                               double weightValue,
                                               String unitGUID,
                                               int year,
                                               int month,
                                               int day,
                                               String birthLocationGUID){
        AnimalBuilder animalBuilder = new AnimalBuilder();
        animalBuilder.setAnimalSpecies(speciesGUID);
        animalBuilder.setBreed(breedGUID);
        animalBuilder.setColor(color);
        animalBuilder.setGender(gender);
        animalBuilder.setName(name);
        animalBuilder.setWeight(unitGUID,weightValue);
        animalBuilder.setBirthDate(year,month,day);
        animalBuilder.setBirthLocation(birthLocationGUID);
        return animalBuilder.getAnimal();
    }
    public static AnimalID createAnimalID(AnimalIDFormatContentType idType, String id){
        AnimalID animalID = new AnimalID();
        animalID.setFormat(idType);
        animalID.setValue(id);
        return animalID;
    }
    public static AnimalLabelType createAnimalLabelType(AnimalLabelTypeContentType type){
        AnimalLabelType animalLabelType = new AnimalLabelType();
        animalLabelType.setValue(type);
        return animalLabelType;
    }
    public static AnimalMarkingLocation createAttachmentLocation(String GUID){
        AnimalMarkingLocation animalMarkingLocation = new AnimalMarkingLocation();
        animalMarkingLocation.setGuid(GUID);
        return animalMarkingLocation;
    }
    public static AnimalMarkingMeans createMarkingMeans(AnimalMarkingMeansTypeContentType type){
        AnimalMarkingMeans animalMarkingMeans = new AnimalMarkingMeans();
        AnimalMarkingMeansType animalMarkingMeansType = new AnimalMarkingMeansType();
        animalMarkingMeansType.setValue(type);
        animalMarkingMeans.setType(animalMarkingMeansType);
        return animalMarkingMeans;
    }
    public static AnimalLabel createAnimalLabel(AnimalIDFormatContentType idType,
                                                String id,
                                                AnimalLabelTypeContentType animalLabelType,
                                                String attachmentLocationGUID,
                                                AnimalMarkingMeansTypeContentType markingMeansType){
        AnimalLabel label = new AnimalLabel();
        label.setAnimalID(createAnimalID(idType,id));
        label.setType(createAnimalLabelType(animalLabelType));
        label.setAttachmentLocation(createAttachmentLocation(attachmentLocationGUID));
        label.setMarkingMeans(createMarkingMeans(markingMeansType));
        return label;
    }
    public static VeterinaryEventType createVeterinaryEventType(VeterinaryEventTypeContentType eventType){
        VeterinaryEventType type = new VeterinaryEventType();
        type.setValue(eventType);
        return type;
    }
    public static ComplexDatePeriod createActualDatePeriod(int day,int month,int year){
        ComplexDatePeriod datePeriod = new ComplexDatePeriod();
        datePeriod.setDate(createComplexDate(day,month,year));
        return datePeriod;
    }
    public static BusinessEntity createOperatorBE(String GUID){
        BusinessEntity businessEntity = new BusinessEntity();
        businessEntity.setGuid(GUID);
        return businessEntity;
    }
    public static AnimalMarkingEvent createAssociatedMarkingEvent(VeterinaryEventTypeContentType vetEventType,
                                                                  int day,
                                                                  int month,
                                                                  int year,
                                                                  String GUID){
        AnimalMarkingEvent animalMarkingEvent = new AnimalMarkingEvent();
        animalMarkingEvent.setType(createVeterinaryEventType(vetEventType));
        animalMarkingEvent.setActualDate(createActualDatePeriod(day,month,year));
        animalMarkingEvent.setOperatorBusinessEntity(createOperatorBE(GUID));
        return animalMarkingEvent;
    }
    public static AnimalIdentity createAnimalIdentity(AnimalLabel attachedLabel, AnimalMarkingEvent animalMarkingEvent){
        AnimalIdentity animalIdentity = new AnimalIdentity();
        animalIdentity.setAttachedLabel(attachedLabel);
        animalIdentity.addAssociatedMarkingEvent(animalMarkingEvent);
        return animalIdentity;
    }
    public static AnimalKeepingDetails createKeepingDetails(String supervisedObjectGUID,
                                                            String keepingTypeGUID,
                                                            String keepingPurposeGUID){
        AnimalKeepingDetails keepingDetails = new AnimalKeepingDetails();

        SupervisedObject supervisedObject = new SupervisedObject();
        supervisedObject.setGuid(supervisedObjectGUID);
        keepingDetails.setOperatorSupervisedObject(supervisedObject);

        AnimalKeepingType animalKeepingType = new AnimalKeepingType();
        animalKeepingType.setGuid(keepingTypeGUID);
        keepingDetails.setKeepingType(animalKeepingType);

        AnimalKeepingPurpose keepingPurpose = new AnimalKeepingPurpose();
        keepingPurpose.setGuid(keepingPurposeGUID);
        keepingDetails.addKeepingPurpose(keepingPurpose);

        return keepingDetails;
    }
    public static AnimalProductivity createAnimalProductivity(String subProductGUID, int outputValue, String unitGUID){
        AnimalProductivity productivity = new AnimalProductivity();

        SubProduct subProduct = new SubProduct();
        subProduct.setGuid(subProductGUID);
        productivity.setSubProduct(subProduct);

        ComplexMeasure output = new ComplexMeasure();
        output.setValue(BigDecimal.valueOf(outputValue));
        Unit unit = new Unit();
        unit.setGuid(unitGUID);
        output.setUnit(unit);

        productivity.setOutput(output);

        return productivity;
    }
    public static ReferencedDocument createReferencedDocument(String docUUID, int doctypeValue, int relationshipTypeValue){
        ReferencedDocument document = new ReferencedDocument();
        document.setUuid(docUUID);
        DocumentType documentType = new DocumentType();
        documentType.setValue(BigInteger.valueOf(doctypeValue));
        document.setType(documentType);
        ReferenceType refType = new ReferenceType();
        refType.setValue(BigInteger.valueOf(relationshipTypeValue));
        document.setRelationshipType(refType);
        return document;
    }

    public static AnimalRegistration createAnimalRegistration(){
        AnimalRegistrationBuilder animalRegistrationBuilder = new AnimalRegistrationBuilder();

        animalRegistrationBuilder.setIdentityType(AnimalIdentityTypeContentType.INDIVIDUAL);
        animalRegistrationBuilder.setAnimalRegistrationStatus(AnimalRegistrationStatusContentType.ACTIVE);
        animalRegistrationBuilder.setInitialIdentificationType(AnimalIdentificationEventTypeContentType.OTHER);

        AnimalBuilder animalBuilder = new AnimalBuilder();
        animalBuilder.setAnimalSpecies("c3783d29-f78d-4481-8510-deab8cbc8d23");
        animalBuilder.setBreed("45056575-62bb-4569-ae73-7eebabc008ae");
        animalBuilder.setColor("green");
        animalBuilder.setGender(AnimalGenderContentType.FEMALE);
        animalBuilder.setName("Korova");
        animalBuilder.setBirthDate(2022,8,8);


        animalRegistrationBuilder.setSpecifiedAnimal(animalBuilder.getAnimal());
        animalRegistrationBuilder.addSpecifiedAnimalIdentity(createAnimalIdentity(
                createAnimalLabel(
                        AnimalIDFormatContentType.OTHER,
                        "2213215",
                        AnimalLabelTypeContentType.ADDITIONAL,
                        "141fdac3-e2a1-5c8c-21a3-0b50065e50a1",
                        AnimalMarkingMeansTypeContentType.COLLAR
                ),
                createAssociatedMarkingEvent(
                        VeterinaryEventTypeContentType.AME,
                        10,
                        11,
                        2023,
                        "28312a61-ae25-4128-8fd1-beeebbe87bf9"
                )
        ));

        AnimalGeneticPassport passport = new AnimalGeneticPassport();
        passport.setConclusion("string");
        passport.setData("string");
        animalRegistrationBuilder.setSpecifiedGeneticPassport(passport);

        animalRegistrationBuilder.setKeepingDetails(createKeepingDetails(
                "e42a49c5-3d27-4b11-a64a-e4ea89aac978",
                "99e904cc-a48c-438f-86b4-3f5e28dbd07c",
                "74dcb936-460d-4eee-b803-aa40e7a88033"
        ));
        animalRegistrationBuilder.setBreedingValueType(AnimalBreedingValueTypeContentType.BREEDING);

        animalRegistrationBuilder.addReferencedDocumentCode55(createReferencedDocument(
                "ba5aed51-32d9-4c0f-8a04-c61acdc6d625",
                55,
                6
        ));

        return  animalRegistrationBuilder.getAnimalRegistrationForIndividualRequest();
    }
    public static AnimalRegistration createAnimalRegistrationForModify(){
        AnimalRegistrationBuilder animalRegistrationBuilder = new AnimalRegistrationBuilder();

        animalRegistrationBuilder.setUUID("8f58264b-1f2a-44d7-9941-56e1eaafe049");
        animalRegistrationBuilder.setIdentityType(AnimalIdentityTypeContentType.INDIVIDUAL);
        animalRegistrationBuilder.setAnimalRegistrationStatus(AnimalRegistrationStatusContentType.ACTIVE);
        animalRegistrationBuilder.setInitialIdentificationType(AnimalIdentificationEventTypeContentType.OTHER);

        AnimalBuilder animalBuilder = new AnimalBuilder();
        animalBuilder.setAnimalSpecies("c3783d29-f78d-4481-8510-deab8cbc8d23");
        animalBuilder.setBreed("45056575-62bb-4569-ae73-7eebabc008ae");
        animalBuilder.setColor("green");
        animalBuilder.setGender(AnimalGenderContentType.FEMALE);
        animalBuilder.setName("Korova 2");
        animalBuilder.setBirthDate(2022,8,8);


        animalRegistrationBuilder.setSpecifiedAnimal(animalBuilder.getAnimal());
        AnimalIdentity animalIdentity = createAnimalIdentity(
                createAnimalLabel(
                        AnimalIDFormatContentType.OTHER,
                        "2213215",
                        AnimalLabelTypeContentType.ADDITIONAL,
                        "141fdac3-e2a1-5c8c-21a3-0b50065e50a1",
                        AnimalMarkingMeansTypeContentType.COLLAR
                ),
                createAssociatedMarkingEvent(
                        VeterinaryEventTypeContentType.AME,
                        10,
                        11,
                        2023,
                        "28312a61-ae25-4128-8fd1-beeebbe87bf9"
                )
        );
        animalIdentity.setGuid("cd01aa21-0dcc-4cf8-bcc3-1904e4feb09f");
        animalRegistrationBuilder.addSpecifiedAnimalIdentity(animalIdentity);

        AnimalGeneticPassport passport = new AnimalGeneticPassport();
        passport.setConclusion("string");
        passport.setData("string");
        animalRegistrationBuilder.setSpecifiedGeneticPassport(passport);

        animalRegistrationBuilder.setKeepingDetails(createKeepingDetails(
                "e42a49c5-3d27-4b11-a64a-e4ea89aac978",
                "99e904cc-a48c-438f-86b4-3f5e28dbd07c",
                "74dcb936-460d-4eee-b803-aa40e7a88033"
        ));
        animalRegistrationBuilder.setBreedingValueType(AnimalBreedingValueTypeContentType.BREEDING);

        animalRegistrationBuilder.addReferencedDocumentCode55(createReferencedDocument(
                "ba5aed51-32d9-4c0f-8a04-c61acdc6d625",
                55,
                6
        ));

        return  animalRegistrationBuilder.getAnimalRegistrationForIndividualRequest();
    }
    public static Application createApplication(Object data,String issuerID){
        Application application = new Application();
        application.setServiceId("herriot.service:1.0");
        application.setIssuerId(issuerID);
        XMLGregorianCalendar date;
        try{
            date = DatatypeFactory.newInstance().newXMLGregorianCalendar("2024-01-16T10:07:41");
        }catch (DatatypeConfigurationException exception){
            throw new RuntimeException("Invalid date/time: " + exception.getMessage());
        }
        application.setIssueDate(date);
        ApplicationDataWrapper aplDw =  new ApplicationDataWrapper();
        aplDw.setData(data);
        application.setData(aplDw);
        return application;
    }

    public static SubmitApplicationRequest getModifyWrappedRequest(String APIKey, String issuerID, String login) throws DatatypeConfigurationException{
        SubmitApplicationRequest submitApplicationRequest = new SubmitApplicationRequest();

        ModifyRequestBuilder modifyRequestBuilder = new ModifyRequestBuilder();

        modifyRequestBuilder.setLocalTransactionId("a371c8a0-e1b5-4a98-8bf1-cb1afc31f112");
        modifyRequestBuilder.setInitiator(login);
        modifyRequestBuilder.addAnimalRegistration(createAnimalRegistrationForModify());
        ModifyAnimalRegistrationRequest registerAnimalRequest = modifyRequestBuilder.getRequest();

        Application application = createApplication(registerAnimalRequest,issuerID);

        submitApplicationRequest.setApplication(application);
        submitApplicationRequest.setApiKey(APIKey);
        return submitApplicationRequest;
    }

    public static SubmitApplicationRequest getTerminateWrappedRequest(String APIKey, String issuerID, String login){
        SubmitApplicationRequest submitApplicationRequest = new SubmitApplicationRequest();

        TerminateRegistrationRequestBuilder terminateRegistrationBuilder = new TerminateRegistrationRequestBuilder();
        terminateRegistrationBuilder.setLocalTransactionId("a371c8a0-e1b5-4a98-8bf1-cb1afc31f112");
        terminateRegistrationBuilder.setInitiator(login);

        AnimalLifecycleEvent lifecycleEvent = new AnimalLifecycleEvent();
        VeterinaryEventType type = new VeterinaryEventType();
        type.setValue(VeterinaryEventTypeContentType.APS);
        lifecycleEvent.setType(type);
        ComplexDatePeriod datePeriod = new ComplexDatePeriod();
        ComplexDate date = new ComplexDate();
        date.setYear(2024);
        date.setMonth(9);
        date.setDay(25);
        datePeriod.setDate(date);
        lifecycleEvent.setActualDate(datePeriod);

        terminateRegistrationBuilder.setLifecycleEvent(lifecycleEvent);
        terminateRegistrationBuilder.addRegistrationRef("c3533a62-b1d1-4177-87ce-a696f47d2555");

        TerminateAnimalRegistrationRequest terminateAnimalRequest = terminateRegistrationBuilder.getRequest();
        Application application = createApplication(terminateAnimalRequest,issuerID);
        submitApplicationRequest.setApplication(application);
        submitApplicationRequest.setApiKey(APIKey);
        return submitApplicationRequest;
    }

    public static SubmitApplicationRequest getSubmitRequest(String APIKey, String issuerID, String login) throws DatatypeConfigurationException {
        SubmitApplicationRequest submitApplicationRequest = new SubmitApplicationRequest();

        RegisterRequestBuilder registerRequestBuilder = new RegisterRequestBuilder();
        registerRequestBuilder.setLocalTransactionId("a371c8a0-e1b5-4a98-8bf1-cb1afc31f112");
        registerRequestBuilder.setInitiator(login);
        registerRequestBuilder.addAnimalRegistration(createAnimalRegistration());
        RegisterAnimalRequest registerAnimalRequest = registerRequestBuilder.getRequest();

        Application application = createApplication(registerAnimalRequest,issuerID);

        submitApplicationRequest.setApplication(application);
        submitApplicationRequest.setApiKey(APIKey);
        return submitApplicationRequest;
    }

    public static SubmitApplicationRequest getRegistrationHistoryRequest(String APIKey, String issuerID, String login){
        SubmitApplicationRequest submitApplicationRequest = new SubmitApplicationRequest();

        GetRegistrationHistoryRequestBuilder builder = new GetRegistrationHistoryRequestBuilder();

        builder.setLocalTransactionId("a371c8a0-e1b5-4a98-8bf1-cb1afc31f112");
        builder.setInitiator(login);
        builder.setGuid("9f0c6db6-1ecd-46c4-bf80-8f1a620bef6c");
        GetAnimalRegistrationHistoryRequest request = builder.getRequest();

        Application application = createApplication(request,issuerID);

        submitApplicationRequest.setApplication(application);
        submitApplicationRequest.setApiKey(APIKey);
        return submitApplicationRequest;
    }

    public static SubmitApplicationRequest getRegistrationChangesListRequest(String APIKey, String issuerID, String login) throws DatatypeConfigurationException {
        SubmitApplicationRequest submitApplicationRequest = new SubmitApplicationRequest();

        GetAnimalRegistrationChangesListBuilder builder = new GetAnimalRegistrationChangesListBuilder();

        builder.setLocalTransactionId("a371c8a0-e1b5-4a98-8bf1-cb1afc31f112");
        builder.setInitiator(login);
        builder.setRegion("639efe9d-3fc8-4438-8e70-ec4f2321f2a7");
        builder.addOperator("e42a49c5-3d27-4b11-a64a-e4ea89aac978");

        Application application = createApplication(builder.getRequest(),issuerID);

        submitApplicationRequest.setApplication(application);
        submitApplicationRequest.setApiKey(APIKey);
        return submitApplicationRequest;
    }

    public static SubmitApplicationRequest getMovementRequest(String APIKey, String issuerID, String login){
        SubmitApplicationRequest submitApplicationRequest = new SubmitApplicationRequest();

        RegisterAnimalMovementBuilder builder = new RegisterAnimalMovementBuilder();

        builder.setLocalTransactionId("a371c8a0-e1b5-4a98-8bf1-cb1afc31f112");
        builder.setInitiator(login);
        builder.addAnimalRegistration("9f0c6db6-1ecd-46c4-bf80-8f1a620bef6c");

        AnimalMovementEvent movementEvent = new AnimalMovementEvent();
        ComplexDatePeriod datePeriod = new ComplexDatePeriod();
        ComplexDate date = new ComplexDate();
        date.setYear(2024);
        date.setMonth(9);
        date.setDay(25);
        datePeriod.setDate(date);
        movementEvent.setActualDate(datePeriod);
        SupervisedObject supervisedObject = new SupervisedObject();
        supervisedObject.setGuid("e42a49c5-3d27-4b11-a64a-e4ea89aac978");

        movementEvent.setConsignor(supervisedObject);
        movementEvent.setConsignee(supervisedObject);
        AnimalKeepingPurpose purpose = new AnimalKeepingPurpose();
        purpose.setGuid("a3f609d7-89f1-4e11-86e2-6e842d584b5e");
        movementEvent.setPurpose(purpose);

        builder.setReferencedMovementEvent(movementEvent);

        RegisterAnimalMovementEventRequest request = builder.getRequest();

        Application application = createApplication(request,issuerID);

        submitApplicationRequest.setApplication(application);
        submitApplicationRequest.setApiKey(APIKey);
        return submitApplicationRequest;
    }
    public static org.w3c.dom.Document getDocument(String xmlData) throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        dbFactory.setNamespaceAware(true);
        dbFactory.setIgnoringComments(true);
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        InputSource ips = new org.xml.sax.InputSource(new StringReader(xmlData));
        org.w3c.dom.Document doc = dBuilder.parse(ips);
        return doc;
    }

    public static Marshaller createMarshaller(Class classToConvert) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(classToConvert);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        return mar;
    }

    public static SOAPMessage createMessage(String xmlBody, String SOAPAction, String auth){
        MessageFactory messageFactory;
        SOAPMessage soapMessage;
        SOAPEnvelope soapEnvelope;
        SOAPBody soapBody;
        try{
            messageFactory = MessageFactory.newInstance();
            soapMessage = messageFactory.createMessage();
            soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
            soapBody = soapMessage.getSOAPBody();
        }catch (SOAPException exception){
            throw new RuntimeException("Unable to init message: " + exception.getMessage());
        }
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", SOAPAction);
        headers.addHeader("Authorization",auth);

        try{
            soapBody.addDocument(getDocument(xmlBody));
        }catch (Exception ex){
            throw new RuntimeException("Unable to convert stringXML to soap document: " + ex.getMessage());
        }

        try{
            soapMessage.saveChanges();
        }catch (SOAPException exception){
            throw new RuntimeException("Unable to save soap message: " + exception.getMessage());
        }
        return soapMessage;
    }

    public static void testRegisterAnimalMovement(String APIKey,
                                             String IssuerId,
                                             String login,
                                             String addrManagementService,
                                             String auth,
                                             String loginRequest,
                                             String SOAPActionReq,
                                             String SOAPActionResp) throws SOAPException, IOException {
        SubmitApplicationRequest apl = getMovementRequest(APIKey, IssuerId, loginRequest);
        SOAPMessage soapResponse = sendRequest(apl,addrManagementService,auth,SOAPActionReq);
        SubmitApplicationResponse response = processResponse(soapResponse,SubmitApplicationResponse.class);
        String aplId = response.getApplication().getApplicationId();
        System.out.println(response.getApplication().getStatus());
        System.out.println(aplId);

        printTestApplicationResult(APIKey,aplId,IssuerId,addrManagementService,auth,SOAPActionResp);
    }

    public static Application testGetHistoryRequest(String APIKey,
                                             String IssuerId,
                                             String login,
                                             String addrManagementService,
                                             String auth,
                                             String loginRequest,
                                             String SOAPActionReq,
                                             String SOAPActionResp) throws SOAPException, IOException {
        SubmitApplicationRequest apl = getRegistrationHistoryRequest(APIKey, IssuerId, loginRequest);
        SOAPMessage soapResponse = sendRequest(apl,addrManagementService,auth,SOAPActionReq);
        SubmitApplicationResponse response = processResponse(soapResponse,SubmitApplicationResponse.class);
        String aplId = response.getApplication().getApplicationId();
        System.out.println(response.getApplication().getStatus());
        System.out.println(aplId);

        Application application = printTestApplicationResult(APIKey,aplId,IssuerId,addrManagementService,auth,SOAPActionResp);
        return application;
    }
    public static void testGetBERequest(String addrEnterprise, String auth,String SOAPAction){
        GetBusinessEntityListRequest getBErequest = new GetBusinessEntityListRequest();
        SOAPMessage getBEResponse = sendRequest(getBErequest,addrEnterprise,auth,SOAPAction);
        //getBEResponse.writeTo(System.out);
        GetBusinessEntityListResponse response = processResponse(getBEResponse,GetBusinessEntityListResponse.class);
        List<BusinessEntity> BEList = response.getBusinessEntityList().getBusinessEntity();
        for (BusinessEntity entity: BEList
        ) {
            if (entity.getGuid() != null)
                System.out.println(entity.getGuid());
        }
    }
    public static void testGetMarkingLocationsList(String addrEnterprise, String auth,String SOAPAction) throws SOAPException, IOException {
        GetAnimalMarkingLocationListRequest getBErequest = new GetAnimalMarkingLocationListRequest();
        SOAPMessage getResponse = sendRequest(getBErequest,addrEnterprise,auth,SOAPAction);
        //getBEResponse.writeTo(System.out);
        GetAnimalMarkingLocationListResponse response = processResponse(getResponse, GetAnimalMarkingLocationListResponse.class);
        AnimalMarkingLocationList ListWrap = response.getAnimalMarkingLocationList();
        List<AnimalMarkingLocation> locations = ListWrap.getAnimalMarkingLocation();
        for (AnimalMarkingLocation location: locations){
            System.out.println(location.getName());
        }
    }
    public static void testGetKeepingPurposeList(String addrEnterprise, String auth,String SOAPAction) throws SOAPException, IOException {
        GetAnimalKeepingPurposeListRequest getBErequest = new GetAnimalKeepingPurposeListRequest();
        SOAPMessage getResponse = sendRequest(getBErequest,addrEnterprise,auth,SOAPAction);
        //getBEResponse.writeTo(System.out);
        GetAnimalKeepingPurposeListResponse response = processResponse(getResponse, GetAnimalKeepingPurposeListResponse.class);
        AnimalKeepingPurposeList ListWrap = response.getAnimalKeepingPurposeList();
        List<AnimalKeepingPurpose> locations = ListWrap.getAnimalKeepingPurpose();
        for (AnimalKeepingPurpose purpose: locations){
            System.out.println(purpose.getName());
        }
    }
    public static void testGetKeepingTypeList(String addrEnterprise, String auth,String SOAPAction) throws SOAPException, IOException {
        GetAnimalKeepingTypeListRequest getBErequest = new GetAnimalKeepingTypeListRequest();
        SOAPMessage getResponse = sendRequest(getBErequest,addrEnterprise,auth,SOAPAction);
        //getBEResponse.writeTo(System.out);
        GetAnimalKeepingTypeListResponse response = processResponse(getResponse, GetAnimalKeepingTypeListResponse.class);
        AnimalKeepingTypeList ListWrap = response.getAnimalKeepingTypeList();
        List<AnimalKeepingType> locations = ListWrap.getAnimalKeepingType();
        for (AnimalKeepingType type: locations){
            System.out.println(type.getName());
        }
    }
    public static void testRegisterRequest(String APIKey,
                                           String IssuerId,
                                           String login,
                                           String addrManagementService,
                                           String auth,
                                           String loginRequest,
                                           String SOAPActionReq,
                                           String SOAPActionResp) throws DatatypeConfigurationException, SOAPException, IOException {
        //todo получить корректный логин и обработать ответ
        SubmitApplicationRequest apl = getSubmitRequest(APIKey, IssuerId, loginRequest);
        SOAPMessage soapResponse = sendRequest(apl,addrManagementService,auth,SOAPActionReq);
        SubmitApplicationResponse response = processResponse(soapResponse,SubmitApplicationResponse.class);
        String aplId = response.getApplication().getApplicationId();
        System.out.println(response.getApplication().getStatus());
        System.out.println(aplId);

        printTestApplicationResult(APIKey,aplId,IssuerId,addrManagementService,auth,SOAPActionResp);
    }
    public static void testGetRegistrationChangesRequest(String APIKey,
                                           String IssuerId,
                                           String login,
                                           String addrManagementService,
                                           String auth,
                                           String loginRequest,
                                           String SOAPActionReq,
                                           String SOAPActionResp) throws DatatypeConfigurationException, SOAPException, IOException {
        //todo получить корректный логин и обработать ответ
        SubmitApplicationRequest apl = getRegistrationChangesListRequest(APIKey, IssuerId, loginRequest);
        SOAPMessage soapResponse = sendRequest(apl,addrManagementService,auth,SOAPActionReq);
        SubmitApplicationResponse response = processResponse(soapResponse,SubmitApplicationResponse.class);
        String aplId = response.getApplication().getApplicationId();
        System.out.println(response.getApplication().getStatus());
        System.out.println(aplId);

        printTestApplicationResult(APIKey,aplId,IssuerId,addrManagementService,auth,SOAPActionResp);
    }


    public static void testModifyRequest(String APIKey,
                                           String IssuerId,
                                           String login,
                                           String addrManagementService,
                                           String auth,
                                           String loginRequest,
                                           String SOAPActionReq,
                                           String SOAPActionResp) throws DatatypeConfigurationException, SOAPException, IOException {
        //todo получить корректный логин и обработать ответ
        SubmitApplicationRequest apl = getModifyWrappedRequest(APIKey, IssuerId, loginRequest);
        SOAPMessage soapResponse = sendRequest(apl,addrManagementService,auth,SOAPActionReq);
        SubmitApplicationResponse response = processResponse(soapResponse,SubmitApplicationResponse.class);
        String aplId = response.getApplication().getApplicationId();

        printTestApplicationResult(APIKey,aplId,IssuerId,addrManagementService,auth,SOAPActionResp);

    }

    public static void testTerminateRequest(String APIKey,
                                         String IssuerId,
                                         String login,
                                         String addrManagementService,
                                         String auth,
                                         String loginRequest,
                                         String SOAPActionReq,
                                         String SOAPActionResp) throws DatatypeConfigurationException, SOAPException, IOException {
        //todo получить корректный логин и обработать ответ
        SubmitApplicationRequest apl = getTerminateWrappedRequest(APIKey, IssuerId, loginRequest);
        SOAPMessage soapResponse = sendRequest(apl,addrManagementService,auth,SOAPActionReq);
        //soapResponse.writeTo(System.out);
        SubmitApplicationResponse response = processResponse(soapResponse,SubmitApplicationResponse.class);
        String aplId = response.getApplication().getApplicationId();

        printTestApplicationResult(APIKey,aplId,IssuerId,addrManagementService,auth,SOAPActionResp);

    }

    public static Application printTestApplicationResult(String APIKey,String aplId,String IssuerId,String endPoint,String auth,String action) throws SOAPException, IOException {
        ReceiveApplicationResultRequest receiveApplicationResultRequest = new ReceiveApplicationResultRequest();
        receiveApplicationResultRequest.setApiKey(APIKey);
        receiveApplicationResultRequest.setApplicationId(aplId);
        receiveApplicationResultRequest.setIssuerId(IssuerId);
        SOAPMessage SOAPresponseAPL;
        ReceiveApplicationResultResponse response;
        do {
            SOAPresponseAPL = sendRequest(receiveApplicationResultRequest,endPoint,auth,action);
            response = processResponse(SOAPresponseAPL, ReceiveApplicationResultResponse.class);
            System.out.println(response.getApplication().getStatus());
        }while (response.getApplication().getStatus() == ApplicationStatus.IN_PROCESS);
        SOAPresponseAPL.writeTo(System.out);
        return response.getApplication();
    }
    public static <T> T processResponse(SOAPMessage soapResponse, Class<T> responceClass) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            if (soapResponse.getSOAPBody().hasFault()) {
                throw new RuntimeException("Soap request has fault: " + soapResponse.getSOAPBody().getFault().getFaultString());
            }
            soapResponse.writeTo(out);
        } catch (SOAPException | IOException ex) {
            throw new RuntimeException("Something wrong with soapResponse:" + ex.getMessage());
        }

        String strMsg = out.toString();
        InputStream is = new ByteArrayInputStream(strMsg.getBytes());
        XMLInputFactory xif = XMLInputFactory.newFactory();
        XMLStreamReader xsr;
        try {
            xsr = xif.createXMLStreamReader(is);
            xsr.nextTag();
            xsr.nextTag();
            xsr.nextTag();
        } catch (XMLStreamException exception) {
            throw new RuntimeException("Unable to get xml body: " + exception.getMessage());
        }
        T response;
        try {
            JAXBContext contextResp = JAXBContext.newInstance(responceClass);
            Unmarshaller jaxbUnmarshaller = contextResp.createUnmarshaller();
            //noinspection unchecked
            response = (T) jaxbUnmarshaller.unmarshal(xsr);
        } catch (JAXBException ex) {
            throw new RuntimeException("Unable to unmarshall: " + ex.toString());
        }

        return response;
    }

    public static <T> SOAPMessage sendRequest(T request, String endPoint, String auth, String SOAPAction) {
        StringWriter stringWriter = new StringWriter();
        Marshaller marshaller;
        try {
            marshaller = createMarshaller(request.getClass());
            marshaller.marshal(request, stringWriter);
        } catch (JAXBException ex) {
            throw new RuntimeException("Unable to marshall: " + ex.getMessage());
        }
        SOAPConnection soapConnection = SOAPConnectionHolder.getConnection();
        SOAPMessage message = createMessage(stringWriter.toString(),
                SOAPAction,
                auth);
        SOAPMessage result;
        try {
            result = soapConnection.call(message, endPoint);
        } catch (SOAPException exception) {
            throw new RuntimeException("Unable to send message: " + exception.getMessage());
        }
        return result;
    }

    public static void main(String[] args) throws Exception {

        String addrDS = "https://api2.vetrf.ru:8002/platform/herriot/services/1.0/DictionaryService";
        String addrAplManagementService = "https://api2.vetrf.ru:8002/platform/services/2.1/ApplicationManagementService";
        String addrEnterpriseService = "https://api2.vetrf.ru:8002/platform/herriot/services/1.0/EnterpriseService";
        String APIKey,IssuerId,login,auth,loginRequest;
        File authInfo = new File("C:\\auth.txt");
        Scanner sc = new Scanner(authInfo);
        APIKey = sc.nextLine();
        IssuerId = sc.nextLine();
        login = sc.nextLine();
        auth = sc.nextLine();
        loginRequest = sc.nextLine();

        //testRegisterRequest(APIKey, IssuerId, login, addrAplManagementService, auth,loginRequest,"registerAnimalRequest","receiveApplicationResult");
        //testGetBERequest(addrEnterpriseService,auth,"GetBusinessEntityList");
        //testModifyRequest(APIKey, IssuerId, login, addrAplManagementService, auth,loginRequest,"registerAnimalRequest","receiveApplicationResult");
        //testTerminateRequest(APIKey,IssuerId,login,addrAplManagementService,auth,loginRequest,"terminateAnimalRegistrationRequest","receiveApplicationResult");
        //testGetHistoryRequest(APIKey,IssuerId,login,addrAplManagementService,auth,loginRequest,"getAnimalRegistrationHistoryRequest","receiveApplicationResult");
        //testRegisterAnimalMovement(APIKey,IssuerId,login,addrAplManagementService,auth,loginRequest,"registerAnimalMovementEventRequest","receiveApplicationResult");
        //testGetRegistrationChangesRequest(APIKey,IssuerId,login,addrAplManagementService,auth,loginRequest,"getAnimalRegistrationChangesListRequest","receiveApplicationResult");
        //testGetMarkingLocationsList(addrDS,auth,"GetAnimalMarkingLocationList");
        //testGetKeepingPurposeList(addrDS,auth,"GetAnimalKeepingPurposeList");
        testGetKeepingTypeList(addrDS,auth,"GetAnimalKeepingTypeList");
    }
}