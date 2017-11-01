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


/**
 * <p>Java-Klasse für SecuritiesReferenceDeltaStatusReport2Choice__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesReferenceDeltaStatusReport2Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ModfdRcrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}SecuritiesReferenceDataReport5__1"/>
 *         &lt;element name="NewRcrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}SecuritiesReferenceDataReport5__1"/>
 *         &lt;element name="TermntdRcrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}SecuritiesReferenceDataReport5__1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReferenceDeltaStatusReport2Choice__1", propOrder = {
    "modfdRcrd",
    "newRcrd",
    "termntdRcrd"
})
public class SecuritiesReferenceDeltaStatusReport2Choice1 {

    @XmlElement(name = "ModfdRcrd")
    protected SecuritiesReferenceDataReport51 modfdRcrd;
    @XmlElement(name = "NewRcrd")
    protected SecuritiesReferenceDataReport51 newRcrd;
    @XmlElement(name = "TermntdRcrd")
    protected SecuritiesReferenceDataReport51 termntdRcrd;

    /**
     * Ruft den Wert der modfdRcrd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport51 }
     *     
     */
    public SecuritiesReferenceDataReport51 getModfdRcrd() {
        return modfdRcrd;
    }

    /**
     * Legt den Wert der modfdRcrd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport51 }
     *     
     */
    public void setModfdRcrd(SecuritiesReferenceDataReport51 value) {
        this.modfdRcrd = value;
    }

    /**
     * Ruft den Wert der newRcrd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport51 }
     *     
     */
    public SecuritiesReferenceDataReport51 getNewRcrd() {
        return newRcrd;
    }

    /**
     * Legt den Wert der newRcrd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport51 }
     *     
     */
    public void setNewRcrd(SecuritiesReferenceDataReport51 value) {
        this.newRcrd = value;
    }

    /**
     * Ruft den Wert der termntdRcrd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport51 }
     *     
     */
    public SecuritiesReferenceDataReport51 getTermntdRcrd() {
        return termntdRcrd;
    }

    /**
     * Legt den Wert der termntdRcrd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport51 }
     *     
     */
    public void setTermntdRcrd(SecuritiesReferenceDataReport51 value) {
        this.termntdRcrd = value;
    }

}
