//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:24:58 PM CEST 
//


package de.vv.ef.gen.fulins;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für InterestRate6Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InterestRate6Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Fxd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}PercentageRate"/>
 *         &lt;element name="Fltg" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}FloatingInterestRate6"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRate6Choice", propOrder = {
    "fxd",
    "fltg"
})
public class InterestRate6Choice {

    @XmlElement(name = "Fxd")
    protected BigDecimal fxd;
    @XmlElement(name = "Fltg")
    protected FloatingInterestRate6 fltg;

	public L2M getData(String s) {
		L2M l2m = new L2M();
		l2m.append(s+".Fxd",fxd);
		if(fltg != null)
		l2m.append(fltg.getData(s+".Fltg"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der fxd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFxd() {
        return fxd;
    }

    /**
     * Legt den Wert der fxd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFxd(BigDecimal value) {
        this.fxd = value;
    }

    /**
     * Ruft den Wert der fltg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate6 }
     *     
     */
    public FloatingInterestRate6 getFltg() {
        return fltg;
    }

    /**
     * Legt den Wert der fltg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate6 }
     *     
     */
    public void setFltg(FloatingInterestRate6 value) {
        this.fltg = value;
    }

}
