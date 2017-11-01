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

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für SecuritiesReferenceDataReport5__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesReferenceDataReport5__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstrmGnlAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}SecurityInstrumentDescription9"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}LEIIdentifier"/>
 *         &lt;element name="TradgVnRltdAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}TradingVenueAttributes1"/>
 *         &lt;element name="DebtInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}DebtInstrument2" minOccurs="0"/>
 *         &lt;element name="DerivInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}DerivativeInstrument5__1" minOccurs="0"/>
 *         &lt;element name="TechAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}RecordTechnicalData3__1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReferenceDataReport5__1", propOrder = {
    "finInstrmGnlAttrbts",
    "issr",
    "tradgVnRltdAttrbts",
    "debtInstrmAttrbts",
    "derivInstrmAttrbts",
    "techAttrbts"
})
public class SecuritiesReferenceDataReport51 {

    @XmlElement(name = "FinInstrmGnlAttrbts", required = true)
    protected SecurityInstrumentDescription9 finInstrmGnlAttrbts;
    @XmlElement(name = "Issr", required = true)
    protected String issr;
    @XmlElement(name = "TradgVnRltdAttrbts", required = true)
    protected TradingVenueAttributes1 tradgVnRltdAttrbts;
    @XmlElement(name = "DebtInstrmAttrbts")
    protected DebtInstrument2 debtInstrmAttrbts;
    @XmlElement(name = "DerivInstrmAttrbts")
    protected DerivativeInstrument51 derivInstrmAttrbts;
    @XmlElement(name = "TechAttrbts")
    protected RecordTechnicalData31 techAttrbts;

    public L2M getData(){
    	L2M l2m = new L2M();
    	l2m.append(finInstrmGnlAttrbts.getData("FinInstrmGnlAttrbts"));	
    	l2m.append("Issr", issr);					
    	if(tradgVnRltdAttrbts!=null)
    	l2m.append(tradgVnRltdAttrbts.getData("TradgVnRltdAttrbts")); 
    	if(debtInstrmAttrbts!=null)
    	l2m.append(debtInstrmAttrbts.getData("DebtInstrmAttrbts"));	
    	if(derivInstrmAttrbts!=null)
    	l2m.append(derivInstrmAttrbts.getData("DIA"));
    	if(techAttrbts!=null)
    	l2m.append(techAttrbts.getData("TechAttrbts"));	
    	return l2m;
    }
    
    /**
     * Ruft den Wert der finInstrmGnlAttrbts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription9 }
     *     
     */
    public SecurityInstrumentDescription9 getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    /**
     * Legt den Wert der finInstrmGnlAttrbts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription9 }
     *     
     */
    public void setFinInstrmGnlAttrbts(SecurityInstrumentDescription9 value) {
        this.finInstrmGnlAttrbts = value;
    }

    /**
     * Ruft den Wert der issr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Legt den Wert der issr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Ruft den Wert der tradgVnRltdAttrbts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueAttributes1 }
     *     
     */
    public TradingVenueAttributes1 getTradgVnRltdAttrbts() {
        return tradgVnRltdAttrbts;
    }

    /**
     * Legt den Wert der tradgVnRltdAttrbts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueAttributes1 }
     *     
     */
    public void setTradgVnRltdAttrbts(TradingVenueAttributes1 value) {
        this.tradgVnRltdAttrbts = value;
    }

    /**
     * Ruft den Wert der debtInstrmAttrbts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument2 }
     *     
     */
    public DebtInstrument2 getDebtInstrmAttrbts() {
        return debtInstrmAttrbts;
    }

    /**
     * Legt den Wert der debtInstrmAttrbts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument2 }
     *     
     */
    public void setDebtInstrmAttrbts(DebtInstrument2 value) {
        this.debtInstrmAttrbts = value;
    }

    /**
     * Ruft den Wert der derivInstrmAttrbts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrument51 }
     *     
     */
    public DerivativeInstrument51 getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    /**
     * Legt den Wert der derivInstrmAttrbts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrument51 }
     *     
     */
    public void setDerivInstrmAttrbts(DerivativeInstrument51 value) {
        this.derivInstrmAttrbts = value;
    }

    /**
     * Ruft den Wert der techAttrbts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RecordTechnicalData31 }
     *     
     */
    public RecordTechnicalData31 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Legt den Wert der techAttrbts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTechnicalData31 }
     *     
     */
    public void setTechAttrbts(RecordTechnicalData31 value) {
        this.techAttrbts = value;
    }

}
