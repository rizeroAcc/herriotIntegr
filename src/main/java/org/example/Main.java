package org.example;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.example.filesFromXSD.application.Application;
import org.example.filesFromXSD.application.ApplicationDataWrapper;
import org.example.filesFromXSD.application.ws_defenitions.ReceiveApplicationResultRequest;
import org.example.filesFromXSD.application.ws_defenitions.ReceiveApplicationResultResponse;
import org.example.filesFromXSD.application.ws_defenitions.SubmitApplicationRequest;
import org.example.filesFromXSD.application.ws_defenitions.SubmitApplicationResponse;
import org.example.filesFromXSD.base.ComplexDate;
import org.example.filesFromXSD.base.ComplexDatePeriod;
import org.example.filesFromXSD.codelist.*;
import org.example.filesFromXSD.dictionary_v2.*;
import org.example.filesFromXSD.herriot_applications_v1.AnimalRegistration;
import org.example.filesFromXSD.herriot_applications_v1.RegisterAnimalRequest;
import org.example.filesFromXSD.mercury_vet_document.*;
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
import java.util.Scanner;


public class Main {
    public static AnimalSpecies createAnimalSpecies(String guid){
        AnimalSpecies species = new AnimalSpecies();
        species.setGuid(guid);
        return species;
    }
    public static AnimalBreed createAnimalBreed(String guid){
        AnimalBreed breed = new AnimalBreed();
        breed.setGuid(guid);
        return breed;
    }
    public static AnimalColour createAnimalColor(String color){
        AnimalColour colour = new AnimalColour();
        colour.setName("string");
        return colour;
    }
    public static AnimalGender createGender(AnimalGenderContentType type){
        AnimalGender gender = new AnimalGender();
        gender.setValue(type);
        return gender;
    }
    public static Measure createWeight(int value,String guid){
        Measure weight = new Measure();
        weight.setValue(BigDecimal.valueOf(value));
        Unit unit =  new Unit();
        unit.setGuid(guid);
        weight.setUnit(unit);
        return weight;
    }
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
                                               int weightValue,
                                               String unitGUID,
                                               int year,
                                               int month,
                                               int day,
                                               String birthLocationGUID){
        Animal animal = new Animal();

        animal.setSpecies(createAnimalSpecies(speciesGUID));
        animal.setBreed(createAnimalBreed(breedGUID));
        animal.setColour(createAnimalColor(color));
        animal.setGender(createGender(gender));
        animal.setName(name);
        animal.setWeight(createWeight(weightValue,unitGUID));
        animal.setBirthDate(createComplexDate(day,month,year));
        animal.setBirthLocation(createBirthLocation(birthLocationGUID));
        return animal;
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
    public static AnimalIdentityType createAnimalIdentityType(AnimalIdentityTypeContentType type){
        AnimalIdentityType identityType = new AnimalIdentityType();
        identityType.setValue(type);
        return identityType;
    }
    public static AnimalRegistrationStatus createAnimalRegistrationStatus(AnimalRegistrationStatusContentType statusType){
        AnimalRegistrationStatus registrationStatus = new AnimalRegistrationStatus();
        registrationStatus.setValue(statusType);
        return registrationStatus;
    }
    public static AnimalIdentificationEventType createIdentEventType(AnimalIdentificationEventTypeContentType type){
        AnimalIdentificationEventType identificationEventType = new AnimalIdentificationEventType();
        identificationEventType.setValue(type);
        return identificationEventType;
    }
    public static AnimalRegistration createAnimalRegistration(){
        AnimalRegistration animalRegistration = new AnimalRegistration();
        animalRegistration.setIdentityType(createAnimalIdentityType(AnimalIdentityTypeContentType.INDIVIDUAL));
        animalRegistration.setRegistrationStatus(createAnimalRegistrationStatus(AnimalRegistrationStatusContentType.ACTIVE));
        animalRegistration.setInitialIdentificationType(createIdentEventType(AnimalIdentificationEventTypeContentType.OTHER));
        animalRegistration.setSpecifiedAnimal(createSpecifiedAnimal(
                "c3783d29-f78d-4481-8510-deab8cbc8d23",
                "45056575-62bb-4569-ae73-7eebabc008ae",
                "green",
                AnimalGenderContentType.FEMALE,
                "Name",
                10,
                "091ad7ad-7d01-4677-bc04-e23be78ae102",
                2022,
                8,8,
                "e637ee59-66e2-4b31-b882-4e2515120ebe"
        ));

        animalRegistration.addSpecifiedAnimalIdentity(createAnimalIdentity(
                createAnimalLabel(
                        AnimalIDFormatContentType.UNMM,
                        "RU131838311",
                        AnimalLabelTypeContentType.MAIN,
                        "141fdac3-e2a1-5c8c-21a3-0b50065e50a1",
                        AnimalMarkingMeansTypeContentType.LABEL
                ),
                createAssociatedMarkingEvent(
                        VeterinaryEventTypeContentType.AME,
                        1,
                        10,
                        2023,
                        "8531a1e1-8365-4611-8f9f-722402e4953d"
                )
        ));
        animalRegistration.addSpecifiedAnimalIdentity(createAnimalIdentity(
                createAnimalLabel(
                        AnimalIDFormatContentType.OTHER,
                        "2213211",
                        AnimalLabelTypeContentType.ADDITIONAL,
                        "141fdac3-e2a1-5c8c-21a3-0b50065e50a1",
                        AnimalMarkingMeansTypeContentType.COLLAR
                ),
                createAssociatedMarkingEvent(
                        VeterinaryEventTypeContentType.AME,
                        10,
                        11,
                        2023,
                        "8531a1e1-8365-4611-8f9f-722402e4953d"
                )
        ));

        AnimalGeneticPassport passport = new AnimalGeneticPassport();
        passport.setConclusion("string");
        passport.setData("string");
        animalRegistration.setSpecifiedGeneticPassport(passport);

        animalRegistration.setKeepingDetails(createKeepingDetails(
                "c6c79e9e-6018-4855-b623-97c3e2e81b72",
                "99e904cc-a48c-438f-86b4-3f5e28dbd07c",
                "74dcb936-460d-4eee-b803-aa40e7a88033"
        ));
        AnimalBreedingValueType breedingValueType = new AnimalBreedingValueType();
        breedingValueType.setValue(AnimalBreedingValueTypeContentType.BREEDING);
        animalRegistration.setBreedingValueType(breedingValueType);

        animalRegistration.addAnimalProductivity(createAnimalProductivity(
                "12c91586-9dea-47a1-bfd1-a7262965eb80",
                20,
                "3ab3ed81-f394-47ac-9c2e-84b187d4f363"
        ));

        animalRegistration.addReferencedDocument(createReferencedDocument(
                "ba5aed51-32d9-4c0f-8a04-c61acdc6d621",
                55,
                6
        ));
        return  animalRegistration;
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

    public static SubmitApplicationRequest getSubmitRequest(String APIKey, String issuerID, String login) throws DatatypeConfigurationException {
        SubmitApplicationRequest submitApplicationRequest = new SubmitApplicationRequest();

        RegisterAnimalRequest registerAnimalRequest = new RegisterAnimalRequest();
        registerAnimalRequest.setLocalTransactionId("a371c8a0-e1b5-4a98-8bf1-cb1afc31f111");
        User initiator = new User();
        initiator.setLogin(login);
        registerAnimalRequest.setInitiator(initiator);
        AnimalRegistration animalRegistration = createAnimalRegistration();
        registerAnimalRequest.addAnimalRegistration(animalRegistration);

        Application application = createApplication(registerAnimalRequest,issuerID);

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

    public static SOAPMessage sendReceiveAplRequest(ReceiveApplicationResultRequest request, String endPoint, String auth){
        StringWriter stringWriter = new StringWriter();
        Marshaller marshaller;
        try{
            marshaller = createMarshaller(ReceiveApplicationResultRequest.class);
            marshaller.marshal(request,stringWriter);
        }catch (JAXBException ex){
            throw new RuntimeException("Unable to marshall: " + ex.getMessage());
        }
        SOAPConnectionFactory soapConnectionFactory;
        SOAPConnection soapConnection;
        try {
            soapConnectionFactory = SOAPConnectionFactory.newInstance();
            soapConnection = soapConnectionFactory.createConnection();
        }catch (SOAPException exception){
            throw new RuntimeException("Unable to create connection: " + exception.getMessage());
        }
        SOAPMessage message = createMessage(stringWriter.toString(),
                "receiveApplicationResult",
                auth);
        SOAPMessage result;
        try {
            result = soapConnection.call(message, endPoint);
        }catch (SOAPException exception){
            throw new RuntimeException("Unaable to send message: " + exception.getMessage());
        }
        return result;
    }
    public static SOAPMessage sendSubmitRequest(SubmitApplicationRequest request, String endPoint,String auth){
        StringWriter stringWriter = new StringWriter();
        Marshaller marshaller;
        try{
            marshaller = createMarshaller(SubmitApplicationRequest.class);
            marshaller.marshal(request,stringWriter);
        }catch (JAXBException ex){
            throw new RuntimeException("Unable to marshall: " + ex.getMessage());
        }
        SOAPConnectionFactory soapConnectionFactory;
        SOAPConnection soapConnection;
        try {
            soapConnectionFactory = SOAPConnectionFactory.newInstance();
            soapConnection = soapConnectionFactory.createConnection();
        }catch (SOAPException exception){
            throw new RuntimeException("Unable to create connection: " + exception.getMessage());
        }
        SOAPMessage message = createMessage(stringWriter.toString(),
                "registerAnimalRequest",
                auth);
        SOAPMessage result;
        try {
            result = soapConnection.call(message, endPoint);
        }catch (SOAPException exception){
            throw new RuntimeException("Unaable to send message: " + exception.getMessage());
        }
        return result;
    }

    public static SubmitApplicationResponse processSubmitSOAPResponse(SOAPMessage soapResponse){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try{
            if (soapResponse.getSOAPBody().hasFault()){
                throw new RuntimeException("Soap request has fault: " + soapResponse.getSOAPBody().getFault().getFaultString());
            }
            soapResponse.writeTo(out);
        }catch (SOAPException | IOException ex){
            throw new RuntimeException("Something wrong with soapResponse:" + ex.getMessage() );
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
        }catch (XMLStreamException exception){
            throw new RuntimeException("Unable to get xml body: " + exception.getMessage());
        }
        SubmitApplicationResponse response;
        try{
            JAXBContext contextResp = JAXBContext.newInstance(SubmitApplicationResponse.class);
            Unmarshaller jaxbUnmarshaller = contextResp.createUnmarshaller();
            response = (SubmitApplicationResponse) jaxbUnmarshaller.unmarshal(xsr);
        }catch (JAXBException ex){
            throw new RuntimeException("Unable to unmarshall: " + ex.getMessage());
        }

        return response;
    }
    public static ReceiveApplicationResultResponse processReceiveAplResponse(SOAPMessage soapResponse){
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try{
            if (soapResponse.getSOAPBody().hasFault()){
                throw new RuntimeException("Soap request has fault: " + soapResponse.getSOAPBody().getFault().getFaultString());
            }
            soapResponse.writeTo(out);
        }catch (SOAPException | IOException ex){
            throw new RuntimeException("Something wrong with soapResponse:" + ex.getMessage() );
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
        }catch (XMLStreamException exception){
            throw new RuntimeException("Unable to get xml body: " + exception.getMessage());
        }
        ReceiveApplicationResultResponse response;
        try{
            JAXBContext contextResp = JAXBContext.newInstance(ReceiveApplicationResultResponse.class);
            Unmarshaller jaxbUnmarshaller = contextResp.createUnmarshaller();
            response = (ReceiveApplicationResultResponse) jaxbUnmarshaller.unmarshal(xsr);
        }catch (JAXBException ex){
            throw new RuntimeException("Unable to unmarshall: " + ex.getMessage());
        }

        return response;
    }

    public static void main(String[] args) throws Exception {

        String addr = "https://api2.vetrf.ru:8002/platform/services/2.1/ApplicationManagementService";
        String APIKey,IssuerId,login,auth;
        File authInfo = new File("C:\\auth.txt");
        Scanner sc = new Scanner(authInfo);
        APIKey = sc.nextLine();
        IssuerId = sc.nextLine();
        login = sc.nextLine();
        auth = sc.nextLine();
        SubmitApplicationRequest apl = getSubmitRequest(APIKey, IssuerId, login);
        SOAPMessage soapResponse = sendSubmitRequest(apl,addr,auth);
        SubmitApplicationResponse response = processSubmitSOAPResponse(soapResponse);
        String aplId = response.getApplication().getApplicationId();
        System.out.println(response.getApplication().getStatus());
        System.out.println(aplId);

        ReceiveApplicationResultRequest receiveApplicationResultRequest = new ReceiveApplicationResultRequest();
        receiveApplicationResultRequest.setApiKey("MGE5MmFiMzktZWY5Ni00NWNkLWFlODgtMWNjMmIxYTdjMzRjMjgzMTJhNjEtYWUyNS00MTI4LThmZDEtYmVlZWJiZTg3YmY5");
        receiveApplicationResultRequest.setApplicationId(aplId);
        receiveApplicationResultRequest.setIssuerId("28312a61-ae25-4128-8fd1-beeebbe87bf9");

        SOAPMessage responseAPL = sendReceiveAplRequest(receiveApplicationResultRequest,addr,auth);
        ReceiveApplicationResultResponse receiveApplicationResultResponse = processReceiveAplResponse(responseAPL);
        System.out.println(receiveApplicationResultResponse.getApplication().getStatus().value());
        /*String addr = "https://api2.vetrf.ru:8002/platform/herriot/services/1.0/EnterpriseService";
        GetBusinessEntityListRequest getBusinessEntityListRequest = new GetBusinessEntityListRequest();
        JAXBContext context = JAXBContext.newInstance(GetBusinessEntityListRequest.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter stringWriter = new StringWriter();
        mar.marshal(getBusinessEntityListRequest,stringWriter);

        String soapBodyStr = stringWriter.toString();
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        MessageFactory messageFactory = MessageFactory.newInstance();

        SOAPMessage soapMessage = messageFactory.createMessage();
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", "GetBusinessEntityList");
        headers.addHeader("Authorization","Basic aW5mb2Jpb25pa2EtMjQwODA4OjN2VVQ0cUQ4ZkM=");

        SOAPEnvelope soapEnvelope = soapMessage.getSOAPPart().getEnvelope();
        SOAPBody soapBody = soapMessage.getSOAPBody();
        soapBody.addDocument(getDocument(soapBodyStr));
        soapMessage.saveChanges();
        soapMessage.writeTo(System.out);
        SOAPMessage soapResponse = soapConnection.call(soapMessage,addr);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        soapResponse.writeTo(out);
        soapResponse.writeTo(System.out);
        String strMsg = new String(out.toByteArray());
        InputStream is = new ByteArrayInputStream(strMsg.getBytes());
        XMLInputFactory xif = XMLInputFactory.newFactory();
        XMLStreamReader xsr = xif.createXMLStreamReader(is);
        xsr.nextTag();
        xsr.nextTag();
        xsr.nextTag();
        JAXBContext contextResp = JAXBContext.newInstance(GetBusinessEntityListResponse.class);
        Unmarshaller jaxbUnmarshaller = contextResp.createUnmarshaller();
        GetBusinessEntityListResponse response = (GetBusinessEntityListResponse) jaxbUnmarshaller.unmarshal(xsr);
        BusinessEntityList BEList = response.getBusinessEntityList();
        List<BusinessEntity> list = BEList.getBusinessEntity();
        System.out.println(list.get(0).getInn());
        */

    }
}