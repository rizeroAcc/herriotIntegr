package org.example.filesFromXSD;

import org.example.filesFromXSD.herriot_applications_v1.AnimalRegistration;
import org.example.filesFromXSD.herriot_applications_v1.GetAnimalRegistrationHistoryRequest;
import org.example.filesFromXSD.herriot_applications_v1.TerminateAnimalRegistrationRequest;
import org.example.filesFromXSD.mercury_vet_document.AnimalLifecycleEvent;
import org.example.filesFromXSD.mercury_vet_document.User;

public class GetRegistrationHistoryRequestBuilder {
    private GetAnimalRegistrationHistoryRequest request;
    private boolean setTransactId, setInitiator, setGuid;
    public GetRegistrationHistoryRequestBuilder(){
        request = new GetAnimalRegistrationHistoryRequest();
        setTransactId = false;
        setInitiator = false;
        setGuid = false;
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
    public void setGuid(String GUID){
        request.setAnimalRegistrationGuid(GUID);
        setGuid = true;
    }

    public GetAnimalRegistrationHistoryRequest getRequest(){
        if (!setTransactId){
            throw new RuntimeException("Transaction id isn't set");
        }
        if (!setInitiator){
            throw new RuntimeException("Initiator isn't set");
        }
        if (!setGuid){
            throw new RuntimeException("Animal GUID isn't set");
        }
        return request;
    }
}
