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
 * <p>Java-Klasse für SecuritiesMarketReportHeader1__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesMarketReportHeader1__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}TradingVenueIdentification1Choice__1"/>
 *         &lt;element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}Period4Choice__1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMarketReportHeader1__1", propOrder = {
    "rptgNtty",
    "rptgPrd"
})
public class SecuritiesMarketReportHeader11 {

    @XmlElement(name = "RptgNtty", required = true)
    protected TradingVenueIdentification1Choice1 rptgNtty;
    @XmlElement(name = "RptgPrd", required = true)
    protected Period4Choice1 rptgPrd;

    /**
     * Ruft den Wert der rptgNtty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification1Choice1 }
     *     
     */
    public TradingVenueIdentification1Choice1 getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Legt den Wert der rptgNtty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification1Choice1 }
     *     
     */
    public void setRptgNtty(TradingVenueIdentification1Choice1 value) {
        this.rptgNtty = value;
    }

    /**
     * Ruft den Wert der rptgPrd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice1 }
     *     
     */
    public Period4Choice1 getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Legt den Wert der rptgPrd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice1 }
     *     
     */
    public void setRptgPrd(Period4Choice1 value) {
        this.rptgPrd = value;
    }

}
