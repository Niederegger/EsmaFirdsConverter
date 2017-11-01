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
 * <p>Java-Klasse für FinancialInstrumentIdentification5Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentIdentification5Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Sngl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FinancialInstrument48Choice"/>
 *         &lt;element name="Bskt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FinancialInstrument53"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification5Choice", propOrder = {
    "sngl",
    "bskt"
})
public class FinancialInstrumentIdentification5Choice {

    @XmlElement(name = "Sngl")
    protected FinancialInstrument48Choice sngl;
    @XmlElement(name = "Bskt")
    protected FinancialInstrument53 bskt;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(sngl!=null)
		l2m.append(sngl.getData(s+".Sngl"));
    	if(bskt!=null)
		l2m.append(bskt.getData(s+".Bskt"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der sngl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument48Choice }
     *     
     */
    public FinancialInstrument48Choice getSngl() {
        return sngl;
    }

    /**
     * Legt den Wert der sngl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument48Choice }
     *     
     */
    public void setSngl(FinancialInstrument48Choice value) {
        this.sngl = value;
    }

    /**
     * Ruft den Wert der bskt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument53 }
     *     
     */
    public FinancialInstrument53 getBskt() {
        return bskt;
    }

    /**
     * Legt den Wert der bskt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument53 }
     *     
     */
    public void setBskt(FinancialInstrument53 value) {
        this.bskt = value;
    }

}
