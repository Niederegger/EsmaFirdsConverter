//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:24:58 PM CEST 
//


package de.vv.ef.gen.fulins;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FinancialInstrumentReportingReferenceDataReportV01 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentReportingReferenceDataReportV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RptHdr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}SecuritiesMarketReportHeader1__1"/>
 *         &lt;element name="RefData" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}SecuritiesReferenceDataReport5__1" maxOccurs="500000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentReportingReferenceDataReportV01", propOrder = {
    "rptHdr",
    "refData"
})
public class FinancialInstrumentReportingReferenceDataReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SecuritiesMarketReportHeader11 rptHdr;
    @XmlElement(name = "RefData", required = true)
    protected List<SecuritiesReferenceDataReport51> refData;

    /**
     * Ruft den Wert der rptHdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMarketReportHeader11 }
     *     
     */
    public SecuritiesMarketReportHeader11 getRptHdr() {
        return rptHdr;
    }

    /**
     * Legt den Wert der rptHdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMarketReportHeader11 }
     *     
     */
    public void setRptHdr(SecuritiesMarketReportHeader11 value) {
        this.rptHdr = value;
    }

    /**
     * Gets the value of the refData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesReferenceDataReport51 }
     * 
     * 
     */
    public List<SecuritiesReferenceDataReport51> getRefData() {
        if (refData == null) {
            refData = new ArrayList<SecuritiesReferenceDataReport51>();
        }
        return this.refData;
    }

}
