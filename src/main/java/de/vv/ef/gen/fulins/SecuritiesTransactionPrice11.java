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

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für SecuritiesTransactionPrice1__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice1__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}PriceStatus1Code__1"/>
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice1__1", propOrder = {
    "pdg",
    "ccy"
})
public class SecuritiesTransactionPrice11 {

    @XmlElement(name = "Pdg", required = true)
    @XmlSchemaType(name = "string")
    protected PriceStatus1Code1 pdg;
    @XmlElement(name = "Ccy")
    protected String ccy;
    
	public L2M getData(String s) {
		L2M l2m = new L2M();
		if(pdg!=null)
		l2m.append(s+".Pdg", pdg.toString());
		l2m.append(s+".Ccy", ccy);
		return l2m;
	}

    /**
     * Ruft den Wert der pdg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PriceStatus1Code1 }
     *     
     */
    public PriceStatus1Code1 getPdg() {
        return pdg;
    }

    /**
     * Legt den Wert der pdg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStatus1Code1 }
     *     
     */
    public void setPdg(PriceStatus1Code1 value) {
        this.pdg = value;
    }

    /**
     * Ruft den Wert der ccy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Legt den Wert der ccy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

}
