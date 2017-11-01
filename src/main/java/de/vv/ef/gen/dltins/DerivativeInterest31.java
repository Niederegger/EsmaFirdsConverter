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
 * <p>Java-Klasse für DerivativeInterest3__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DerivativeInterest3__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FloatingInterestRate8"/>
 *         &lt;element name="FrstLegIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}InterestRate8Choice__1" minOccurs="0"/>
 *         &lt;element name="OthrNtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         &lt;element name="OthrLegIntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}InterestRate8Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInterest3__1", propOrder = {
    "intrstRate",
    "frstLegIntrstRate",
    "othrNtnlCcy",
    "othrLegIntrstRate"
})
public class DerivativeInterest31 {

    @XmlElement(name = "IntrstRate", required = true)
    protected FloatingInterestRate8 intrstRate;
    @XmlElement(name = "FrstLegIntrstRate")
    protected InterestRate8Choice1 frstLegIntrstRate;
    @XmlElement(name = "OthrNtnlCcy")
    protected String othrNtnlCcy;
    @XmlElement(name = "OthrLegIntrstRate")
    protected InterestRate8Choice othrLegIntrstRate;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(intrstRate!=null)
		l2m.append(intrstRate.getData(s+".IntrstRate"));
    	if(frstLegIntrstRate!=null)
		l2m.append(frstLegIntrstRate.getData(s+".FrstLegIntrstRate"));
		l2m.append(s+".OthrNtnlCcy", othrNtnlCcy);
    	if(othrLegIntrstRate!=null)
		l2m.append(othrLegIntrstRate.getData(s+".OLIR"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der intrstRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public FloatingInterestRate8 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Legt den Wert der intrstRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public void setIntrstRate(FloatingInterestRate8 value) {
        this.intrstRate = value;
    }

    /**
     * Ruft den Wert der frstLegIntrstRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate8Choice1 }
     *     
     */
    public InterestRate8Choice1 getFrstLegIntrstRate() {
        return frstLegIntrstRate;
    }

    /**
     * Legt den Wert der frstLegIntrstRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate8Choice1 }
     *     
     */
    public void setFrstLegIntrstRate(InterestRate8Choice1 value) {
        this.frstLegIntrstRate = value;
    }

    /**
     * Ruft den Wert der othrNtnlCcy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtnlCcy() {
        return othrNtnlCcy;
    }

    /**
     * Legt den Wert der othrNtnlCcy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrNtnlCcy(String value) {
        this.othrNtnlCcy = value;
    }

    /**
     * Ruft den Wert der othrLegIntrstRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestRate8Choice }
     *     
     */
    public InterestRate8Choice getOthrLegIntrstRate() {
        return othrLegIntrstRate;
    }

    /**
     * Legt den Wert der othrLegIntrstRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRate8Choice }
     *     
     */
    public void setOthrLegIntrstRate(InterestRate8Choice value) {
        this.othrLegIntrstRate = value;
    }

}
