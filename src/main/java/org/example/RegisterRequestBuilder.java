package org.example;

import org.example.filesFromXSD.herriot_applications_v1.AnimalRegistration;
import org.example.filesFromXSD.herriot_applications_v1.RegisterAnimalRequest;
import org.example.filesFromXSD.mercury_vet_document.User;

public class RegisterRequestBuilder {
    private RegisterAnimalRequest request;
    private boolean setTransactId, setInitiator, setAnimalRegistration;
    public RegisterRequestBuilder(){
        request = new RegisterAnimalRequest();
        setTransactId = false;
        setInitiator = false;
        setAnimalRegistration = false;
    }
    public RegisterAnimalRequest getRequest(){
        if (!setTransactId){
            throw new RuntimeException("Transaction id isn't set");
        }
        if (!setInitiator){
            throw new RuntimeException("Initiator isn't set");
        }
        if (!setAnimalRegistration){
            throw new RuntimeException("AnimalRegistration isn't set");
        }
        return  request;
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
    public void addAnimalRegistration(AnimalRegistration registration){
        request.addAnimalRegistration(registration);
        setAnimalRegistration = true;
    }
}
