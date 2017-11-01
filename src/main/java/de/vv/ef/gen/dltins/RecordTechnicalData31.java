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
 * <p>Java-Klasse für RecordTechnicalData3__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RecordTechnicalData3__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RlvntCmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}CountryCode" minOccurs="0"/>
 *         &lt;element name="PblctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}Period4Choice" minOccurs="0"/>
 *         &lt;element name="NvrPblshd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}TrueFalseIndicator" minOccurs="0"/>
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
    "rlvntCmptntAuthrty",
    "pblctnPrd",
    "nvrPblshd"
})
public class RecordTechnicalData31 {

    @XmlElement(name = "RlvntCmptntAuthrty")
    protected String rlvntCmptntAuthrty;
    @XmlElement(name = "PblctnPrd")
    protected Period4Choice pblctnPrd;
    @XmlElement(name = "NvrPblshd")
    protected Boolean nvrPblshd;

	public L2M getData(String s) {
		L2M l2m = new L2M();
		l2m.append(s+".RlvntCmptntAuthrty", rlvntCmptntAuthrty);
    	if(pblctnPrd!=null)
		l2m.append(pblctnPrd.getData(s+".PblctnPrd"));
		l2m.append(s+".NvrPblshd", nvrPblshd);
		return l2m;
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

    /**
     * Ruft den Wert der nvrPblshd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNvrPblshd() {
        return nvrPblshd;
    }

    /**
     * Legt den Wert der nvrPblshd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNvrPblshd(Boolean value) {
        this.nvrPblshd = value;
    }

}
