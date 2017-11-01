//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.01 um 01:39:58 PM CET 
//


package de.vv.ef.gen.dltins;

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
 *         &lt;element name="FinInstrmRptgRefDataDltaRpt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FinancialInstrumentReportingReferenceDataDeltaReportV01"/>
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
    "finInstrmRptgRefDataDltaRpt"
})
public class Document {

    @XmlElement(name = "FinInstrmRptgRefDataDltaRpt", required = true)
    protected FinancialInstrumentReportingReferenceDataDeltaReportV01 finInstrmRptgRefDataDltaRpt;

    /**
     * Ruft den Wert der finInstrmRptgRefDataDltaRpt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingReferenceDataDeltaReportV01 }
     *     
     */
    public FinancialInstrumentReportingReferenceDataDeltaReportV01 getFinInstrmRptgRefDataDltaRpt() {
        return finInstrmRptgRefDataDltaRpt;
    }

    /**
     * Legt den Wert der finInstrmRptgRefDataDltaRpt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingReferenceDataDeltaReportV01 }
     *     
     */
    public void setFinInstrmRptgRefDataDltaRpt(FinancialInstrumentReportingReferenceDataDeltaReportV01 value) {
        this.finInstrmRptgRefDataDltaRpt = value;
    }

}
