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
import jakarta.xml.bind.annotation.XmlType;


/**
 * �������� � ��������� ��������� (������������ ������������).
 * 
 * <p>Java class for LaboratoryResearchReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaboratoryResearchReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}Document">
 *       &lt;sequence>
 *         &lt;element name="sample" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}LaboratoryResearchSample" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="samplingReport" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}SamplingReport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaboratoryResearchReport", propOrder = {
    "sample",
    "samplingReport"
})
public class LaboratoryResearchReport
    extends Document
{

    protected List<LaboratoryResearchSample> sample;
    protected SamplingReport samplingReport;

    /**
     * Gets the value of the sample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaboratoryResearchSample }
     * 
     * 
     */
    public List<LaboratoryResearchSample> getSample() {
        if (sample == null) {
            sample = new ArrayList<LaboratoryResearchSample>();
        }
        return this.sample;
    }

    /**
     * Gets the value of the samplingReport property.
     * 
     * @return
     *     possible object is
     *     {@link SamplingReport }
     *     
     */
    public SamplingReport getSamplingReport() {
        return samplingReport;
    }

    /**
     * Sets the value of the samplingReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SamplingReport }
     *     
     */
    public void setSamplingReport(SamplingReport value) {
        this.samplingReport = value;
    }

}
