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
 * <p>Java-Klasse für RecordTechnicalData3__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RecordTechnicalData3__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IncnsstncyInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="LastUpd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISODateTime" minOccurs="0"/>
 *         &lt;element name="RlvntCmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}CountryCode" minOccurs="0"/>
 *         &lt;element name="PblctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}Period4Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTechnicalData3__1", propOrder = {
    "incnsstncyInd",
    "lastUpd",
    "rlvntCmptntAuthrty",
    "pblctnPrd"
})
public class RecordTechnicalData31 {

    @XmlElement(name = "IncnsstncyInd")
    protected Boolean incnsstncyInd;
    @XmlElement(name = "LastUpd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpd;
    @XmlElement(name = "RlvntCmptntAuthrty")
    protected String rlvntCmptntAuthrty;
    @XmlElement(name = "PblctnPrd")
    protected Period4Choice pblctnPrd;

	public L2M getData(String s) {
		L2M l2m = new L2M();
		l2m.append(s+".IncnsstncyInd", incnsstncyInd);
		l2m.append(s+".LastUpd", lastUpd);
		l2m.append(s+".RlvntCmptntAuthrty", rlvntCmptntAuthrty);
    	if(pblctnPrd!=null)
		l2m.append(pblctnPrd.getData(s+".PblctnPrd"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der incnsstncyInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncnsstncyInd() {
        return incnsstncyInd;
    }

    /**
     * Legt den Wert der incnsstncyInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncnsstncyInd(Boolean value) {
        this.incnsstncyInd = value;
    }

    /**
     * Ruft den Wert der lastUpd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpd() {
        return lastUpd;
    }

    /**
     * Legt den Wert der lastUpd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpd(XMLGregorianCalendar value) {
        this.lastUpd = value;
    }

    /**
     * Ruft den Wert der rlvntCmptntAuthrty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRlvntCmptntAuthrty() {
        return rlvntCmptntAuthrty;
    }

    /**
     * Legt den Wert der rlvntCmptntAuthrty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRlvntCmptntAuthrty(String value) {
        this.rlvntCmptntAuthrty = value;
    }

    /**
     * Ruft den Wert der pblctnPrd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getPblctnPrd() {
        return pblctnPrd;
    }

    /**
     * Legt den Wert der pblctnPrd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setPblctnPrd(Period4Choice value) {
        this.pblctnPrd = value;
    }

}
