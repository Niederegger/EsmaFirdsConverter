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

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für FloatingInterestRate8 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FloatingInterestRate8">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefRate" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}BenchmarkCurveName5Choice"/>
 *         &lt;element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}InterestRateContractTerm2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate8", propOrder = {
    "refRate",
    "term"
})
public class FloatingInterestRate8 {

    @XmlElement(name = "RefRate", required = true)
    protected BenchmarkCurveName5Choice refRate;
    @XmlElement(name = "Term")
    protected InterestRateContractTerm2 term;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(refRate!=null)
		l2m.append(refRate.getData(s+".RefRate"));
    	if(term!=null)
		l2m.append(term.getData(s+".Term"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der refRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName5Choice }
     *     
     */
    public BenchmarkCurveName5Choice getRefRate() {
        return refRate;
    }

    /**
     * Legt den Wert der refRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName5Choice }
     *     
     */
    public void setRefRate(BenchmarkCurveName5Choice value) {
        this.refRate = value;
    }

    /**
     * Ruft den Wert der term-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getTerm() {
        return term;
    }

    /**
     * Legt den Wert der term-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public void setTerm(InterestRateContractTerm2 value) {
        this.term = value;
    }

}
