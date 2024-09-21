package org.example;

import org.example.filesFromXSD.base.ComplexDate;
import org.example.filesFromXSD.base.File;
import org.example.filesFromXSD.codelist.AnimalGenderContentType;
import org.example.filesFromXSD.dictionary_v2.*;

import javax.xml.datatype.Duration;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.Semaphore;

public class AnimalBuilder {
    private Animal animal;
    private boolean isAnimalSpeciesSet;
    private boolean isGenderSet;
    private boolean isBreedSet;
    private boolean isColorSet;
    private boolean isDead;
    public AnimalBuilder(){
        animal = new Animal();
        isAnimalSpeciesSet = false;
        isGenderSet = false;
        isBreedSet = false;
        isColorSet = false;
        isDead = false;
    }
    public void setAnimalSpecies(AnimalSpecies species){
        animal.setSpecies(species);
        isAnimalSpeciesSet = true;
    }
    public void setAnimalSpecies(String GUID){
        AnimalSpecies species = new AnimalSpecies();
        species.setGuid(GUID);
        animal.setSpecies(species);
        isAnimalSpeciesSet = true;
    }
    public void setGender(AnimalGender gender){
        animal.setGender(gender);
        isGenderSet = true;
    }
    public void setGender(AnimalGenderContentType genderType){
        AnimalGender gender = new AnimalGender();
        gender.setValue(genderType);
        animal.setGender(gender);
        isGenderSet = true;
    }
    public void setBreed(String GUID){
        AnimalBreed breed = new AnimalBreed();
        breed.setGuid(GUID);
        animal.setBreed(breed);
        isBreedSet = true;
    }
    public void setBreed(AnimalBreed breed){
        animal.setBreed(breed);
        isBreedSet = true;
    }
    public void setColor(String colorName){
        AnimalColour colour = new AnimalColour();
        colour.setName(colorName);
        animal.setColour(colour);
        isColorSet = true;
    }
    public void setColor(AnimalColour color){
        animal.setColour(color);
        isColorSet = true;
    }
    public void setName(String name){
        animal.setName(name);
    }
    public void setWeight(Measure weight){
        animal.setWeight(weight);
    }
    public void setWeight(String unitGUID, double value){
        Unit unit = new Unit();
        unit.setGuid(unitGUID);
        Measure weight = new Measure();
        weight.setUnit(unit);
        weight.setValue(BigDecimal.valueOf(value));
        animal.setWeight(weight);
    }
    public void setAge(Duration age){
        animal.setAge(age);
    }
    public void setBirthDate(ComplexDate birthDate){
        animal.setBirthDate(birthDate);
    }
    public void setBirthDate(int year,int month){
        ComplexDate birthDate = new ComplexDate();
        birthDate.setYear(year);
        birthDate.setMonth(month);
        animal.setBirthDate(birthDate);
    }
    public void setBirthDate(int year,int month, int day){
        ComplexDate birthDate = new ComplexDate();
        birthDate.setYear(year);
        birthDate.setMonth(month);
        birthDate.setDay(day);
        animal.setBirthDate(birthDate);
    }
    public void setDeathDate(ComplexDate deathDate){
        animal.setDeathDate(deathDate);
        isDead = true;
    }
    public void setDeathDate(int year,int month, int day){
        ComplexDate deathDate = new ComplexDate();
        deathDate.setYear(year);
        deathDate.setMonth(month);
        deathDate.setDay(day);
        animal.setDeathDate(deathDate);
        isDead = true;
    }
    public void setDeathDate(int year,int month){
        ComplexDate deathDate = new ComplexDate();
        deathDate.setYear(year);
        deathDate.setMonth(month);
        animal.setDeathDate(deathDate);
        isDead = true;
    }
    public void setBirthLocation(AnimalKeepingLocation keepingLocation){
        animal.setBirthLocation(keepingLocation);
    }
    public void setBirthLocation(String locationGUID){
        AnimalKeepingLocation birthLocation = new AnimalKeepingLocation();
        SupervisedObject supervisedObject = new SupervisedObject();
        supervisedObject.setGuid(locationGUID);
        birthLocation.setSupervisedObject(supervisedObject);
        animal.setBirthLocation(birthLocation);
    }
    public void addSpecifiedLabel(AnimalLabel label){
        animal.addSpecifiedAnimalLabel(label);
    }
    public void addClassification(ClassificationAttribute attribute){
        animal.addClassification(attribute);
    }
    public void addAttribute(MeasuredAttribute attribute){
        animal.addAttribute(attribute);
    }
    public void addAttribute(String attrID, ComplexMeasure attrValue){
        MeasuredAttribute attribute = new MeasuredAttribute();
        attribute.setAttrID(attrID);
        attribute.setAttrValue(attrValue);
        animal.addAttribute(attribute);
    }
    public void setPhoto(File photo){
        animal.setPhoto(photo);
    }

    public Animal getAnimal(){
        return animal;
    }
    public Animal getAnimalForRegistration(){
        if (!isAnimalSpeciesSet){
            throw new RuntimeException("Animal species isn't set");
        }
        if (!isGenderSet){
            throw new RuntimeException("Animal gender isn't set");
        }
        if (isDead){
            throw new RuntimeException("Animal is dead");
        }
        return animal;
    }
}
