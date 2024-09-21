package org.example;

import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;

public class SOAPConnectionHolder {
    private static SOAPConnection soapConnection = null;
    public static SOAPConnection getConnection(){
        if (soapConnection == null){
            SOAPConnectionFactory soapConnectionFactory;
            try {
                soapConnectionFactory = SOAPConnectionFactory.newInstance();
                soapConnection = soapConnectionFactory.createConnection();
            } catch (SOAPException exception) {
                throw new RuntimeException("Unable to create connection: " + exception.getMessage());
            }
        }
        return soapConnection;
    }
}
