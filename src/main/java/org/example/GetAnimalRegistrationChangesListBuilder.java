package org.example;

import org.example.filesFromXSD.base.DateInterval;
import org.example.filesFromXSD.base.ListOptions;
import org.example.filesFromXSD.dictionary_v2.AnimalSpecies;
import org.example.filesFromXSD.dictionary_v2.Region;
import org.example.filesFromXSD.dictionary_v2.SupervisedObject;
import org.example.filesFromXSD.herriot_applications_v1.AnimalRegistration;
import org.example.filesFromXSD.herriot_applications_v1.GetAnimalRegistrationChangesListRequest;
import org.example.filesFromXSD.herriot_applications_v1.ModifyAnimalRegistrationRequest;
import org.example.filesFromXSD.mercury_vet_document.User;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;

public class GetAnimalRegistrationChangesListBuilder {
    private GetAnimalRegistrationChangesListRequest request;
    private DatatypeFactory factory;
    private boolean setTransactId, setInitiator, setRegion;
    public GetAnimalRegistrationChangesListBuilder() throws DatatypeConfigurationException {
        request = new GetAnimalRegistrationChangesListRequest();
        setTransactId = false;
        setInitiator = false;
        setRegion = false;
        factory = DatatypeFactory.newInstance();
    }

    public GetAnimalRegistrationChangesListRequest getRequest(){
        if (!setTransactId){
            throw new RuntimeException("Transaction id isn't set");
        }
        if (!setInitiator){
            throw new RuntimeException("Initiator isn't set");
        }
        if (!setRegion){
            throw new RuntimeException("Region isn't set");
        }
        return request;
    }
    public void setInitiator(String login){
        User initiator = new User();
        initiator.setLogin(login);
        request.setInitiator(initiator);
        setInitiator = true;
    }
    public void setInitiator(User initiator){
        request.setInitiator(initiator);
        setInitiator = true;
    }
    public void setLocalTransactionId(String id){
        request.setLocalTransactionId(id);
        setTransactId = true;
    }
    public void setListOptions(ListOptions listOptions){
        request.setListOptions(listOptions);
    }
    public void setListOptions(int count){
        ListOptions listOptions = new ListOptions();
        listOptions.setCount(BigInteger.valueOf(count));
        request.setListOptions(listOptions);
    }
    public void setListOptions(int count,int offset){
        ListOptions listOptions = new ListOptions();
        listOptions.setCount(BigInteger.valueOf(count));
        listOptions.setOffset(BigInteger.valueOf(offset));
        request.setListOptions(listOptions);
    }
    public void setUpDateInterval(DateInterval interval){
        request.setUpdateDateInterval(interval);
    }
    public void setUpDateInterval(String beginDate, String endDate){
        DateInterval date = new DateInterval();
        date.setBeginDate(factory.newXMLGregorianCalendar(beginDate));
        date.setEndDate(factory.newXMLGregorianCalendar(endDate));
        request.setUpdateDateInterval(date);
    }
    public void setRegion(Region region){
        request.setRegion(region);
        setRegion = true;
    }
    public void setRegion(String GUID){
        Region region = new Region();
        region.setGuid(GUID);
        request.setRegion(region);
        setRegion = true;
    }
    public void addOperator(SupervisedObject operator){
        request.addOperator(operator);
    }
    public void addOperator(String GUID){
        SupervisedObject operator = new SupervisedObject();
        operator.setGuid(GUID);
        request.addOperator(operator);
    }
    public void addAnimalSpecies(AnimalSpecies species){
        request.addAnimalSpecies(species);
    }
    public void addAnimalSpecies(String GUID){
        AnimalSpecies species = new AnimalSpecies();
        species.setGuid(GUID);
        request.addAnimalSpecies(species);
    }
}
