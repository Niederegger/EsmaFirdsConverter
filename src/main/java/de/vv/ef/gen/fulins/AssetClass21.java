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
 * <p>Java-Klasse für AssetClass2__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClass2__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}DerivativeCommodity2" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}DerivativeInterest3__1" minOccurs="0"/>
 *         &lt;element name="FX" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}DerivativeForeignExchange3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClass2__1", propOrder = {
    "cmmdty",
    "intrst",
    "fx"
})
public class AssetClass21 {

    @XmlElement(name = "Cmmdty")
    protected DerivativeCommodity2 cmmdty;
    @XmlElement(name = "Intrst")
    protected DerivativeInterest31 intrst;
    @XmlElement(name = "FX")
    protected DerivativeForeignExchange3 fx;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(cmmdty!=null)
		l2m.append(cmmdty.getData(s+".Cmmdty"));
    	if(intrst!=null)
		l2m.append(intrst.getData(s+".Intrst"));
    	if(fx!=null)
		l2m.append(fx.getData(s+".FX"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der cmmdty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeCommodity2 }
     *     
     */
    public DerivativeCommodity2 getCmmdty() {
        return cmmdty;
    }

    /**
     * Legt den Wert der cmmdty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeCommodity2 }
     *     
     */
    public void setCmmdty(DerivativeCommodity2 value) {
        this.cmmdty = value;
    }

    /**
     * Ruft den Wert der intrst-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInterest31 }
     *     
     */
    public DerivativeInterest31 getIntrst() {
        return intrst;
    }

    /**
     * Legt den Wert der intrst-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInterest31 }
     *     
     */
    public void setIntrst(DerivativeInterest31 value) {
        this.intrst = value;
    }

    /**
     * Ruft den Wert der fx-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeForeignExchange3 }
     *     
     */
    public DerivativeForeignExchange3 getFX() {
        return fx;
    }

    /**
     * Legt den Wert der fx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeForeignExchange3 }
     *     
     */
    public void setFX(DerivativeForeignExchange3 value) {
        this.fx = value;
    }

}
