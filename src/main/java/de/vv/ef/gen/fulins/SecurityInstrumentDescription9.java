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
 * <p>Java-Klasse für SecurityInstrumentDescription9 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecurityInstrumentDescription9">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISINOct2015Identifier"/>
 *         &lt;element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}Max350Text"/>
 *         &lt;element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}Max35Text" minOccurs="0"/>
 *         &lt;element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}CFIOct2015Identifier"/>
 *         &lt;element name="NtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ActiveOrHistoricCurrencyCode"/>
 *         &lt;element name="CmmdtyDerivInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}TrueFalseIndicator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInstrumentDescription9", propOrder = {
    "id",
    "fullNm",
    "shrtNm",
    "clssfctnTp",
    "ntnlCcy",
    "cmmdtyDerivInd"
})
public class SecurityInstrumentDescription9 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FullNm", required = true)
    protected String fullNm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "ClssfctnTp", required = true)
    protected String clssfctnTp;
    @XmlElement(name = "NtnlCcy", required = true)
    protected String ntnlCcy;
    @XmlElement(name = "CmmdtyDerivInd")
    protected boolean cmmdtyDerivInd;

    public L2M getData(String s){
    	L2M l2m = new L2M();
    	l2m.append(s+".FullNm", getFullNm());
    	l2m.append(s+".ShrtNm", getShrtNm());
    	l2m.append(s+".ClssfctnTp", getClssfctnTp());
    	l2m.append(s+".NtnlCcy", getNtnlCcy());
    	l2m.append(s+".CmmdtyDerivInd", isCmmdtyDerivInd());
    	return l2m;
    }
    
    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der fullNm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Legt den Wert der fullNm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNm(String value) {
        this.fullNm = value;
    }

    /**
     * Ruft den Wert der shrtNm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Legt den Wert der shrtNm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
    }

    /**
     * Ruft den Wert der clssfctnTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Legt den Wert der clssfctnTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnTp(String value) {
        this.clssfctnTp = value;
    }

    /**
     * Ruft den Wert der ntnlCcy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Legt den Wert der ntnlCcy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy(String value) {
        this.ntnlCcy = value;
    }

    /**
     * Ruft den Wert der cmmdtyDerivInd-Eigenschaft ab.
     * 
     */
    public boolean isCmmdtyDerivInd() {
        return cmmdtyDerivInd;
    }

    /**
     * Legt den Wert der cmmdtyDerivInd-Eigenschaft fest.
     * 
     */
    public void setCmmdtyDerivInd(boolean value) {
        this.cmmdtyDerivInd = value;
    }

}
