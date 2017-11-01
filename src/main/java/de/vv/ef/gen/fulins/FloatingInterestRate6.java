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
 * <p>Java-Klasse für FloatingInterestRate6 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FloatingInterestRate6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefRate" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}BenchmarkCurveName6Choice"/>
 *         &lt;element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}InterestRateContractTerm2"/>
 *         &lt;element name="BsisPtSprd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}Max5Number"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate6", propOrder = {
    "refRate",
    "term",
    "bsisPtSprd"
})
public class FloatingInterestRate6 {

    @XmlElement(name = "RefRate", required = true)
    protected BenchmarkCurveName6Choice refRate;
    @XmlElement(name = "Term", required = true)
    protected InterestRateContractTerm2 term;
    @XmlElement(name = "BsisPtSprd", required = true)
    protected BigDecimal bsisPtSprd;

    public L2M getData(String s) {
		L2M l2m = new L2M();
		l2m.append(refRate.getData(s+".RefRate"));
		l2m.append(term.getData(s+".Term"));
		l2m.append(s+".BsisPtSprd",bsisPtSprd);
		return l2m;
	}
    
    /**
     * Ruft den Wert der refRate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName6Choice }
     *     
     */
    public BenchmarkCurveName6Choice getRefRate() {
        return refRate;
    }

    /**
     * Legt den Wert der refRate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName6Choice }
     *     
     */
    public void setRefRate(BenchmarkCurveName6Choice value) {
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

    /**
     * Ruft den Wert der bsisPtSprd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPtSprd() {
        return bsisPtSprd;
    }

    /**
     * Legt den Wert der bsisPtSprd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPtSprd(BigDecimal value) {
        this.bsisPtSprd = value;
    }

}
