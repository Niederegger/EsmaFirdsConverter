//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:29:30 PM CEST 
//


package de.vv.ef.gen.bah;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für BusinessApplicationHeaderV01 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BusinessApplicationHeaderV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Party9Choice__1"/>
 *         &lt;element name="To" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Party9Choice__1"/>
 *         &lt;element name="BizMsgIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Max35Text"/>
 *         &lt;element name="MsgDefIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Max35Text"/>
 *         &lt;element name="CreDt" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}ISONormalisedDateTime"/>
 *         &lt;element name="Rltd" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}BusinessApplicationHeader1__1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessApplicationHeaderV01", propOrder = {
    "fr",
    "to",
    "bizMsgIdr",
    "msgDefIdr",
    "creDt",
    "rltd"
})
public class BusinessApplicationHeaderV01 {

    @XmlElement(name = "Fr", required = true)
    protected Party9Choice1 fr;
    @XmlElement(name = "To", required = true)
    protected Party9Choice1 to;
    @XmlElement(name = "BizMsgIdr", required = true)
    protected String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr", required = true)
    protected String msgDefIdr;
    @XmlElement(name = "CreDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "Rltd")
    protected BusinessApplicationHeader11 rltd;

    /**
     * Ruft den Wert der fr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice1 }
     *     
     */
    public Party9Choice1 getFr() {
        return fr;
    }

    /**
     * Legt den Wert der fr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice1 }
     *     
     */
    public void setFr(Party9Choice1 value) {
        this.fr = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice1 }
     *     
     */
    public Party9Choice1 getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice1 }
     *     
     */
    public void setTo(Party9Choice1 value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der bizMsgIdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    /**
     * Legt den Wert der bizMsgIdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizMsgIdr(String value) {
        this.bizMsgIdr = value;
    }

    /**
     * Ruft den Wert der msgDefIdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    /**
     * Legt den Wert der msgDefIdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDefIdr(String value) {
        this.msgDefIdr = value;
    }

    /**
     * Ruft den Wert der creDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDt() {
        return creDt;
    }

    /**
     * Legt den Wert der creDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
    }

    /**
     * Ruft den Wert der rltd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeader11 }
     *     
     */
    public BusinessApplicationHeader11 getRltd() {
        return rltd;
    }

    /**
     * Legt den Wert der rltd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeader11 }
     *     
     */
    public void setRltd(BusinessApplicationHeader11 value) {
        this.rltd = value;
    }

}
