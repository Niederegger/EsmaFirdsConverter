//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:24:58 PM CEST 
//


package de.vv.ef.gen.fulins;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Document complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstrmRptgRefDataRpt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}FinancialInstrumentReportingReferenceDataReportV01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgRefDataRpt"
})
public class Document {

    @XmlElement(name = "FinInstrmRptgRefDataRpt", required = true)
    protected FinancialInstrumentReportingReferenceDataReportV01 finInstrmRptgRefDataRpt;

    /**
     * Ruft den Wert der finInstrmRptgRefDataRpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingReferenceDataReportV01 }
     *     
     */
    public FinancialInstrumentReportingReferenceDataReportV01 getFinInstrmRptgRefDataRpt() {
        return finInstrmRptgRefDataRpt;
    }

    /**
     * Legt den Wert der finInstrmRptgRefDataRpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingReferenceDataReportV01 }
     *     
     */
    public void setFinInstrmRptgRefDataRpt(FinancialInstrumentReportingReferenceDataReportV01 value) {
        this.finInstrmRptgRefDataRpt = value;
    }

}
