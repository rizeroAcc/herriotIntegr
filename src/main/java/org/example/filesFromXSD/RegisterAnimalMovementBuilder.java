package org.example.filesFromXSD;

import org.example.filesFromXSD.herriot_applications_v1.AnimalRegistration;
import org.example.filesFromXSD.herriot_applications_v1.ModifyAnimalRegistrationRequest;
import org.example.filesFromXSD.herriot_applications_v1.RegisterAnimalMovementEventRequest;
import org.example.filesFromXSD.mercury_vet_document.AnimalMovementEvent;
import org.example.filesFromXSD.mercury_vet_document.AnimalRegistrationList;
import org.example.filesFromXSD.mercury_vet_document.User;

public class RegisterAnimalMovementBuilder {
    private RegisterAnimalMovementEventRequest request;
    private AnimalRegistrationList animalRegistrationList;
    private boolean setTransactId, setInitiator, setReferencedMovementEvent, setAnimalRegistration;
    public RegisterAnimalMovementBuilder(){
        request = new RegisterAnimalMovementEventRequest();
        animalRegistrationList = new AnimalRegistrationList();
        setTransactId = false;
        setInitiator = false;
        request.setMovementAnimalRegistrationList(animalRegistrationList);
    }

    public RegisterAnimalMovementEventRequest getRequest(){
        if (!setTransactId){
            throw new RuntimeException("Transaction id isn't set");
        }
        if (!setInitiator){
            throw new RuntimeException("Initiator isn't set");
        }
        if(!setAnimalRegistration){
            throw new RuntimeException("Animal registration isn't set");
        }
        if(!setReferencedMovementEvent){
            throw new RuntimeException("Movement event isn't set");
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
    public void setReferencedMovementEvent(AnimalMovementEvent referencedMovementEvent){
        request.setReferencedMovementEvent(referencedMovementEvent);
        setReferencedMovementEvent = true;
    }
    public void addAnimalRegistration(AnimalRegistration registration){
        animalRegistrationList.addAnimalRegistration(registration);
        setAnimalRegistration = true;
    }
    public void addAnimalRegistration(String GUID){
        AnimalRegistration registration = new AnimalRegistration();
        registration.setGuid(GUID);
        animalRegistrationList.addAnimalRegistration(registration);
        setAnimalRegistration = true;
    }
}
