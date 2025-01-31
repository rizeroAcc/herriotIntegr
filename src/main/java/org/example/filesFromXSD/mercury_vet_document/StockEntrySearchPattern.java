//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.08.30 at 05:14:34 PM MSK 
//


package org.example.filesFromXSD.mercury_vet_document;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.example.filesFromXSD.base.DateInterval;


/**
 * <p>Java class for StockEntrySearchPattern complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockEntrySearchPattern">
 *   &lt;complexContent>
 *     &lt;extension base="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntry">
 *       &lt;sequence>
 *         &lt;element name="blankFilter" type="{http://api.vetrf.ru/schema/cdm/mercury/vet-document/v2}StockEntryBlankFilter" minOccurs="0"/>
 *         &lt;element name="receiptDateInterval" type="{http://api.vetrf.ru/schema/cdm/base}DateInterval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockEntrySearchPattern", propOrder = {
    "blankFilter",
    "receiptDateInterval"
})
public class StockEntrySearchPattern
    extends StockEntry
{

    protected StockEntryBlankFilter blankFilter;
    protected DateInterval receiptDateInterval;

    /**
     * Gets the value of the blankFilter property.
     * 
     * @return
     *     possible object is
     *     {@link StockEntryBlankFilter }
     *     
     */
    public StockEntryBlankFilter getBlankFilter() {
        return blankFilter;
    }

    /**
     * Sets the value of the blankFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEntryBlankFilter }
     *     
     */
    public void setBlankFilter(StockEntryBlankFilter value) {
        this.blankFilter = value;
    }

    /**
     * Gets the value of the receiptDateInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DateInterval }
     *     
     */
    public DateInterval getReceiptDateInterval() {
        return receiptDateInterval;
    }

    /**
     * Sets the value of the receiptDateInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInterval }
     *     
     */
    public void setReceiptDateInterval(DateInterval value) {
        this.receiptDateInterval = value;
    }

}
