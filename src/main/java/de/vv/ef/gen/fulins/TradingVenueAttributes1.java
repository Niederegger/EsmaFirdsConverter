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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für TradingVenueAttributes1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TradingVenueAttributes1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}MICIdentifier"/>
 *         &lt;element name="IssrReq" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}TrueFalseIndicator"/>
 *         &lt;element name="AdmssnApprvlDtByIssr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISODateTime" minOccurs="0"/>
 *         &lt;element name="ReqForAdmssnDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISODateTime" minOccurs="0"/>
 *         &lt;element name="FrstTradDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISODateTime" minOccurs="0"/>
 *         &lt;element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISODateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueAttributes1", propOrder = {
    "id",
    "issrReq",
    "admssnApprvlDtByIssr",
    "reqForAdmssnDt",
    "frstTradDt",
    "termntnDt"
})
public class TradingVenueAttributes1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IssrReq")
    protected boolean issrReq;
    @XmlElement(name = "AdmssnApprvlDtByIssr")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admssnApprvlDtByIssr;
    @XmlElement(name = "ReqForAdmssnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqForAdmssnDt;
    @XmlElement(name = "FrstTradDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frstTradDt;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termntnDt;

	public L2M getData(String s) {
		L2M l2m = new L2M();
		l2m.append(s+".IssrReq", issrReq);
		l2m.append(s+".AdmssnApprvlDtByIssr", admssnApprvlDtByIssr);
		l2m.append(s+".ReqForAdmssnDt", reqForAdmssnDt);
		l2m.append(s+".FrstTradDt", frstTradDt);
		l2m.append(s+".TermntnDt", termntnDt);
		return l2m;
	}
    
    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der issrReq-Eigenschaft ab.
     * 
     */
    public boolean isIssrReq() {
        return issrReq;
    }

    /**
     * Legt den Wert der issrReq-Eigenschaft fest.
     * 
     */
    public void setIssrReq(boolean value) {
        this.issrReq = value;
    }

    /**
     * Ruft den Wert der admssnApprvlDtByIssr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmssnApprvlDtByIssr() {
        return admssnApprvlDtByIssr;
    }

    /**
     * Legt den Wert der admssnApprvlDtByIssr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmssnApprvlDtByIssr(XMLGregorianCalendar value) {
        this.admssnApprvlDtByIssr = value;
    }

    /**
     * Ruft den Wert der reqForAdmssnDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqForAdmssnDt() {
        return reqForAdmssnDt;
    }

    /**
     * Legt den Wert der reqForAdmssnDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqForAdmssnDt(XMLGregorianCalendar value) {
        this.reqForAdmssnDt = value;
    }

    /**
     * Ruft den Wert der frstTradDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstTradDt() {
        return frstTradDt;
    }

    /**
     * Legt den Wert der frstTradDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstTradDt(XMLGregorianCalendar value) {
        this.frstTradDt = value;
    }

    /**
     * Ruft den Wert der termntnDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Legt den Wert der termntnDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
    }

}
