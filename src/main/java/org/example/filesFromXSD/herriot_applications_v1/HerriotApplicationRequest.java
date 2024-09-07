//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.herriot_applications_v1;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.example.filesFromXSD.mercury_vet_document.User;
import org.example.filesFromXSD.application.ApplicationData;
import org.example.filesFromXSD.mercury_vet_document.User;


/**
 * <p>Java class for HerriotApplicationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HerriotApplicationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/application}ApplicationData">
 *       &lt;sequence>
 *         &lt;element name="localTransactionId" type="{http://api.vetrf.ru/schema/cdm/base}UUID"/>
 *         &lt;element name="initiator" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User"/>
 *         &lt;element name="sessionToken" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}OTPToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HerriotApplicationRequest", propOrder = {
    "localTransactionId",
    "initiator",
    "sessionToken"
})
@XmlSeeAlso({
    RegisterAnimalRequest.class
})
public class HerriotApplicationRequest
    extends ApplicationData
{

    @XmlElement(required = true)
    protected String localTransactionId;
    @XmlElement(required = true)
    protected User initiator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sessionToken;

    /**
     * Gets the value of the localTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTransactionId() {
        return localTransactionId;
    }

    /**
     * Sets the value of the localTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTransactionId(String value) {
        this.localTransactionId = value;
    }

    /**
     * Gets the value of the initiator property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getInitiator() {
        return initiator;
    }

    /**
     * Sets the value of the initiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setInitiator(User value) {
        this.initiator = value;
    }

    /**
     * Gets the value of the sessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionToken() {
        return sessionToken;
    }

    /**
     * Sets the value of the sessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionToken(String value) {
        this.sessionToken = value;
    }

}
