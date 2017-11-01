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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für DerivativeCommodity2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DerivativeCommodity2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pdct" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodity3Choice"/>
 *         &lt;element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassTransactionType1Code" minOccurs="0"/>
 *         &lt;element name="FnlPricTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetPriceType1Code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeCommodity2", propOrder = {
    "pdct",
    "txTp",
    "fnlPricTp"
})
public class DerivativeCommodity2 {

    @XmlElement(name = "Pdct", required = true)
    protected AssetClassCommodity3Choice pdct;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected AssetClassTransactionType1Code txTp;
    @XmlElement(name = "FnlPricTp")
    @XmlSchemaType(name = "string")
    protected AssetPriceType1Code fnlPricTp;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(pdct!=null)
		l2m.append(pdct.getData(s+".Pdct"));
    	if(txTp!=null)
		l2m.append(s+".TxTp",txTp.toString());
    	if(fnlPricTp!=null)
		l2m.append(s+".FnlPricTp",fnlPricTp.toString());
		return l2m;
	}
    
    /**
     * Ruft den Wert der pdct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodity3Choice }
     *     
     */
    public AssetClassCommodity3Choice getPdct() {
        return pdct;
    }

    /**
     * Legt den Wert der pdct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodity3Choice }
     *     
     */
    public void setPdct(AssetClassCommodity3Choice value) {
        this.pdct = value;
    }

    /**
     * Ruft den Wert der txTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassTransactionType1Code }
     *     
     */
    public AssetClassTransactionType1Code getTxTp() {
        return txTp;
    }

    /**
     * Legt den Wert der txTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassTransactionType1Code }
     *     
     */
    public void setTxTp(AssetClassTransactionType1Code value) {
        this.txTp = value;
    }

    /**
     * Ruft den Wert der fnlPricTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetPriceType1Code }
     *     
     */
    public AssetPriceType1Code getFnlPricTp() {
        return fnlPricTp;
    }

    /**
     * Legt den Wert der fnlPricTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetPriceType1Code }
     *     
     */
    public void setFnlPricTp(AssetPriceType1Code value) {
        this.fnlPricTp = value;
    }

}
