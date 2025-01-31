//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.dictionary_v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ������������ ������.
 * 
 * <p>Java class for SupervisedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupervisedObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessMember">
 *       &lt;sequence>
 *         &lt;element name="approvalNumber" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="approvedName" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="approvedNameEn" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="authentication" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ProducerAuthentication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="objectType" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}SupervisedObjectType" minOccurs="0"/>
 *         &lt;element name="activity" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}SupervisedObjectActivity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="registryStatus" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}SupervisedObjectStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupervisedObject", propOrder = {
    "approvalNumber",
    "approvedName",
    "approvedNameEn",
    "authentication",
    "objectType",
    "activity",
    "registryStatus"
})
@XmlSeeAlso({
    CertifiedProducer.class
})
public class SupervisedObject
    extends BusinessMember
{

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String approvalNumber;
    protected String approvedName;
    protected String approvedNameEn;
    protected List<ProducerAuthentication> authentication;
    protected SupervisedObjectType objectType;
    protected List<SupervisedObjectActivity> activity;
    protected SupervisedObjectStatus registryStatus;

    /**
     * Gets the value of the approvalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /**
     * Sets the value of the approvalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalNumber(String value) {
        this.approvalNumber = value;
    }

    /**
     * Gets the value of the approvedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedName() {
        return approvedName;
    }

    /**
     * Sets the value of the approvedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedName(String value) {
        this.approvedName = value;
    }

    /**
     * Gets the value of the approvedNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovedNameEn() {
        return approvedNameEn;
    }

    /**
     * Sets the value of the approvedNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovedNameEn(String value) {
        this.approvedNameEn = value;
    }

    /**
     * Gets the value of the authentication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authentication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthentication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProducerAuthentication }
     * 
     * 
     */
    public List<ProducerAuthentication> getAuthentication() {
        if (authentication == null) {
            authentication = new ArrayList<ProducerAuthentication>();
        }
        return this.authentication;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisedObjectType }
     *     
     */
    public SupervisedObjectType getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisedObjectType }
     *     
     */
    public void setObjectType(SupervisedObjectType value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupervisedObjectActivity }
     * 
     * 
     */
    public List<SupervisedObjectActivity> getActivity() {
        if (activity == null) {
            activity = new ArrayList<SupervisedObjectActivity>();
        }
        return this.activity;
    }

    /**
     * Gets the value of the registryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisedObjectStatus }
     *     
     */
    public SupervisedObjectStatus getRegistryStatus() {
        return registryStatus;
    }

    /**
     * Sets the value of the registryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisedObjectStatus }
     *     
     */
    public void setRegistryStatus(SupervisedObjectStatus value) {
        this.registryStatus = value;
    }

}
