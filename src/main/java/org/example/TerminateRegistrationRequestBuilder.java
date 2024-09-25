package org.example;

import org.example.filesFromXSD.herriot_applications_v1.AnimalRegistration;
import org.example.filesFromXSD.herriot_applications_v1.ModifyAnimalRegistrationRequest;
import org.example.filesFromXSD.herriot_applications_v1.TerminateAnimalRegistrationRequest;
import org.example.filesFromXSD.mercury_vet_document.AnimalLifecycleEvent;
import org.example.filesFromXSD.mercury_vet_document.User;

public class TerminateRegistrationRequestBuilder {
    private TerminateAnimalRegistrationRequest request;
    private boolean setTransactId, setInitiator, setLifecycleEvent, setRegistrationRef;
    public TerminateRegistrationRequestBuilder(){
        request = new TerminateAnimalRegistrationRequest();
        setTransactId = false;
        setInitiator = false;
        setLifecycleEvent = false;
        setRegistrationRef = false;
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
    public void addRegistrationRef(String registrationRefUUID){
        AnimalRegistration registration = new AnimalRegistration();
        registration.setUuid(registrationRefUUID);
        request.addAnimalRegistrationRef(registration);
        setRegistrationRef = true;
    }
    public void addRegistrationRef(AnimalRegistration registrationRef){
        request.addAnimalRegistrationRef(registrationRef);
        setRegistrationRef = true;
    }
    public void setLifecycleEvent(AnimalLifecycleEvent referencedLifecycleEvent){
        request.setReferencedLifecycleEvent(referencedLifecycleEvent);
        setLifecycleEvent = true;
    }

    public TerminateAnimalRegistrationRequest getRequest(){
        if (!setTransactId){
            throw new RuntimeException("Transaction id isn't set");
        }
        if (!setInitiator){
            throw new RuntimeException("Initiator isn't set");
        }
        if (!setLifecycleEvent){
            throw new RuntimeException("LifecycleEvent isn't set");
        }
        if (!setRegistrationRef){
            throw new RuntimeException("Registration ref isn't set");
        }
        return request;
    }
}
