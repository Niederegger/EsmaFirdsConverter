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


/**
 * <p>Java-Klasse für TradingVenueIdentification1Choice__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TradingVenueIdentification1Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="NtlCmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}CountryCode"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueIdentification1Choice__1", propOrder = {
    "ntlCmptntAuthrty"
})
public class TradingVenueIdentification1Choice1 {

    @XmlElement(name = "NtlCmptntAuthrty")
    protected String ntlCmptntAuthrty;

    /**
     * Ruft den Wert der ntlCmptntAuthrty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlCmptntAuthrty() {
        return ntlCmptntAuthrty;
    }

    /**
     * Legt den Wert der ntlCmptntAuthrty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlCmptntAuthrty(String value) {
        this.ntlCmptntAuthrty = value;
    }

}
