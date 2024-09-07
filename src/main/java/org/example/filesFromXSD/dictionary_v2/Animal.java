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
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.base.ComplexDate;
import org.example.filesFromXSD.base.File;

import javax.xml.datatype.Duration;



/**
 * ��������
 * 
 * <p>Java class for Animal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Animal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="species" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalSpecies" minOccurs="0"/>
 *         &lt;element name="breed" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalBreed" minOccurs="0"/>
 *         &lt;element name="colour" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalColour" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalGender" minOccurs="0"/>
 *         &lt;element name="name" type="{http://api.vetrf.ru/schema/cdm/base}String255" minOccurs="0"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}Measure" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://api.vetrf.ru/schema/cdm/base}ComplexDate" minOccurs="0"/>
 *         &lt;element name="deathDate" type="{http://api.vetrf.ru/schema/cdm/base}ComplexDate" minOccurs="0"/>
 *         &lt;element name="birthLocation" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalKeepingLocation" minOccurs="0"/>
 *         &lt;element name="specifiedAnimalLabel" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}AnimalLabel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}ClassificationAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attribute" type="{http://api.vetrf.ru/schema/cdm/dictionary/v2}MeasuredAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="photo" type="{http://api.vetrf.ru/schema/cdm/base}File" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Animal", propOrder = {
    "species",
    "breed",
    "colour",
    "gender",
    "name",
    "age",
    "weight",
    "birthDate",
    "deathDate",
    "birthLocation",
    "specifiedAnimalLabel",
    "classification",
    "attribute",
    "photo"
})
public class Animal {

    protected AnimalSpecies species;
    protected AnimalBreed breed;
    protected AnimalColour colour;
    protected AnimalGender gender;
    protected String name;
    protected Duration age;
    protected Measure weight;
    protected ComplexDate birthDate;
    protected ComplexDate deathDate;
    protected AnimalKeepingLocation birthLocation;
    protected List<AnimalLabel> specifiedAnimalLabel;
    protected List<ClassificationAttribute> classification;
    protected List<MeasuredAttribute> attribute;
    protected File photo;

    /**
     * Gets the value of the species property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalSpecies }
     *     
     */
    public AnimalSpecies getSpecies() {
        return species;
    }

    /**
     * Sets the value of the species property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalSpecies }
     *     
     */
    public void setSpecies(AnimalSpecies value) {
        this.species = value;
    }

    /**
     * Gets the value of the breed property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalBreed }
     *     
     */
    public AnimalBreed getBreed() {
        return breed;
    }

    /**
     * Sets the value of the breed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalBreed }
     *     
     */
    public void setBreed(AnimalBreed value) {
        this.breed = value;
    }

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalColour }
     *     
     */
    public AnimalColour getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalColour }
     *     
     */
    public void setColour(AnimalColour value) {
        this.colour = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalGender }
     *     
     */
    public AnimalGender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalGender }
     *     
     */
    public void setGender(AnimalGender value) {
        this.gender = value;
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
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAge(Duration value) {
        this.age = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setWeight(Measure value) {
        this.weight = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexDate }
     *     
     */
    public ComplexDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexDate }
     *     
     */
    public void setBirthDate(ComplexDate value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexDate }
     *     
     */
    public ComplexDate getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexDate }
     *     
     */
    public void setDeathDate(ComplexDate value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the birthLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalKeepingLocation }
     *     
     */
    public AnimalKeepingLocation getBirthLocation() {
        return birthLocation;
    }

    /**
     * Sets the value of the birthLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalKeepingLocation }
     *     
     */
    public void setBirthLocation(AnimalKeepingLocation value) {
        this.birthLocation = value;
    }

    /**
     * Gets the value of the specifiedAnimalLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedAnimalLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedAnimalLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnimalLabel }
     * 
     * 
     */
    public List<AnimalLabel> getSpecifiedAnimalLabel() {
        if (specifiedAnimalLabel == null) {
            specifiedAnimalLabel = new ArrayList<AnimalLabel>();
        }
        return this.specifiedAnimalLabel;
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
     * Gets the value of the photo property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getPhoto() {
        return photo;
    }

    /**
     * Sets the value of the photo property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setPhoto(File value) {
        this.photo = value;
    }

}
