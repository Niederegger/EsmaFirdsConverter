//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:29:14 PM CEST 
//


package de.vv.ef.gen.bizdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BusinessDataHeaderV01 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BusinessDataHeaderV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:head.003.001.01}BusinessApplicationHeaderEnvelope"/>
 *         &lt;element name="Pyld" type="{urn:iso:std:iso:20022:tech:xsd:head.003.001.01}StrictPayload"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDataHeaderV01", propOrder = {
    "hdr",
    "pyld"
})
public class BusinessDataHeaderV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessApplicationHeaderEnvelope hdr;
    @XmlElement(name = "Pyld", required = true)
    protected StrictPayload pyld;

    /**
     * Ruft den Wert der hdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeaderEnvelope }
     *     
     */
    public BusinessApplicationHeaderEnvelope getHdr() {
        return hdr;
    }

    /**
     * Legt den Wert der hdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeaderEnvelope }
     *     
     */
    public void setHdr(BusinessApplicationHeaderEnvelope value) {
        this.hdr = value;
    }

    /**
     * Ruft den Wert der pyld-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StrictPayload }
     *     
     */
    public StrictPayload getPyld() {
        return pyld;
    }

    /**
     * Legt den Wert der pyld-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StrictPayload }
     *     
     */
    public void setPyld(StrictPayload value) {
        this.pyld = value;
    }

}
