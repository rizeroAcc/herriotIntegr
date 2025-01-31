//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.mercury_vet_document;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.example.filesFromXSD.base.ComplexDatePeriod;
import org.example.filesFromXSD.base.GenericVersioningEntity;
import org.example.filesFromXSD.dictionary_v2.*;

import javax.xml.datatype.XMLGregorianCalendar;



/**
 * ����� ������� ��� �����������, ��������������� � ������� ��������� (��� ��).
 *             ��������, ������������ ������������, ���, ������������� ��������� ��� ����������� ��������� � �.�.
 *          
 * 
 * <p>Java class for VeterinaryEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VeterinaryEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/base}GenericVersioningEntity">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://api.vetrf.ru/schema/cdm/base}Identifier" minOccurs="0"/>
 *         &lt;element name="name" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="type" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEventType" minOccurs="0"/>
 *         &lt;element name="eventStatus" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}VeterinaryEventStatus" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="actualDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *           &lt;element name="actualDate" type="{http://api.vetrf.ru/schema/cdm/base}ComplexDatePeriod" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="location" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Location" minOccurs="0"/>
 *           &lt;element name="enterprise" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Enterprise" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="operator" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Organization" minOccurs="0"/>
 *           &lt;element name="operatorBusinessEntity" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}BusinessEntity" minOccurs="0"/>
 *           &lt;element name="operatorSupervisedObject" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}SupervisedObject" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="authorizedPerson" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}User" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ClassificationAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}MeasuredAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="referencedDocument" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}ReferencedDocument" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://api.vetrf.ru/schema/cdm/base}Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VeterinaryEvent", propOrder = {
    "id",
    "name",
    "type",
    "eventStatus",
    "actualDateTime",
    "actualDate",
    "location",
    "enterprise",
    "operator",
    "operatorBusinessEntity",
    "operatorSupervisedObject",
    "authorizedPerson",
    "classification",
    "attribute",
    "referencedDocument",
    "notes"
})
@XmlSeeAlso({
    AnimalMarkingEvent.class,
    QuarantineEvent.class,
    AnimalLifecycleEvent.class,
    AnimalMedicationEvent.class,
    AnimalMovementEvent.class,
    LaboratoryResearchEvent.class,
    AnimalKeepingEvent.class
})
public class VeterinaryEvent
    extends GenericVersioningEntity
{

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    protected String name;
    protected VeterinaryEventType type;
    protected VeterinaryEventStatus eventStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDateTime;
    protected ComplexDatePeriod actualDate;
    protected Location location;
    protected Enterprise enterprise;
    protected Organization operator;
    protected BusinessEntity operatorBusinessEntity;
    protected SupervisedObject operatorSupervisedObject;
    protected User authorizedPerson;
    protected List<ClassificationAttribute> classification;
    protected List<MeasuredAttribute> attribute;
    protected List<ReferencedDocument> referencedDocument;
    protected String notes;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link VeterinaryEventType }
     *     
     */
    public VeterinaryEventType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinaryEventType }
     *     
     */
    public void setType(VeterinaryEventType value) {
        this.type = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VeterinaryEventStatus }
     *     
     */
    public VeterinaryEventStatus getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VeterinaryEventStatus }
     *     
     */
    public void setEventStatus(VeterinaryEventStatus value) {
        this.eventStatus = value;
    }

    /**
     * Gets the value of the actualDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDateTime() {
        return actualDateTime;
    }

    /**
     * Sets the value of the actualDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDateTime(XMLGregorianCalendar value) {
        this.actualDateTime = value;
    }

    /**
     * Gets the value of the actualDate property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexDatePeriod }
     *     
     */
    public ComplexDatePeriod getActualDate() {
        return actualDate;
    }

    /**
     * Sets the value of the actualDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexDatePeriod }
     *     
     */
    public void setActualDate(ComplexDatePeriod value) {
        this.actualDate = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the enterprise property.
     * 
     * @return
     *     possible object is
     *     {@link Enterprise }
     *     
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Sets the value of the enterprise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enterprise }
     *     
     */
    public void setEnterprise(Enterprise value) {
        this.enterprise = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOperator(Organization value) {
        this.operator = value;
    }

    /**
     * Gets the value of the operatorBusinessEntity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntity }
     *     
     */
    public BusinessEntity getOperatorBusinessEntity() {
        return operatorBusinessEntity;
    }

    /**
     * Sets the value of the operatorBusinessEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntity }
     *     
     */
    public void setOperatorBusinessEntity(BusinessEntity value) {
        this.operatorBusinessEntity = value;
    }

    /**
     * Gets the value of the operatorSupervisedObject property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisedObject }
     *     
     */
    public SupervisedObject getOperatorSupervisedObject() {
        return operatorSupervisedObject;
    }

    /**
     * Sets the value of the operatorSupervisedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisedObject }
     *     
     */
    public void setOperatorSupervisedObject(SupervisedObject value) {
        this.operatorSupervisedObject = value;
    }

    /**
     * Gets the value of the authorizedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAuthorizedPerson() {
        return authorizedPerson;
    }

    /**
     * Sets the value of the authorizedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAuthorizedPerson(User value) {
        this.authorizedPerson = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationAttribute }
     * 
     * 
     */
    public List<ClassificationAttribute> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationAttribute>();
        }
        return this.classification;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasuredAttribute }
     * 
     * 
     */
    public List<MeasuredAttribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<MeasuredAttribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the referencedDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencedDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencedDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencedDocument }
     * 
     * 
     */
    public List<ReferencedDocument> getReferencedDocument() {
        if (referencedDocument == null) {
            referencedDocument = new ArrayList<ReferencedDocument>();
        }
        return this.referencedDocument;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}
