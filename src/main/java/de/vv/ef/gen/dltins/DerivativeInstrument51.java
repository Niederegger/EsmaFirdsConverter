//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.01 um 01:39:58 PM CET 
//


package de.vv.ef.gen.dltins;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für DerivativeInstrument5__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DerivativeInstrument5__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="PricMltplr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}NonNegativeDecimalNumber" minOccurs="0"/>
 *         &lt;element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FinancialInstrumentIdentification5Choice" minOccurs="0"/>
 *         &lt;element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}OptionType2Code" minOccurs="0"/>
 *         &lt;element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}SecuritiesTransactionPrice4Choice__1" minOccurs="0"/>
 *         &lt;element name="OptnExrcStyle" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}OptionStyle7Code" minOccurs="0"/>
 *         &lt;element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}PhysicalTransferType4Code" minOccurs="0"/>
 *         &lt;element name="AsstClssSpcfcAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClass2__1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrument5__1", propOrder = {
    "xpryDt",
    "pricMltplr",
    "undrlygInstrm",
    "optnTp",
    "strkPric",
    "optnExrcStyle",
    "dlvryTp",
    "asstClssSpcfcAttrbts"
})
public class DerivativeInstrument51 {

    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "PricMltplr")
    protected BigDecimal pricMltplr;
    @XmlElement(name = "UndrlygInstrm")
    protected FinancialInstrumentIdentification5Choice undrlygInstrm;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice4Choice1 strkPric;
    @XmlElement(name = "OptnExrcStyle")
    @XmlSchemaType(name = "string")
    protected OptionStyle7Code optnExrcStyle;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "AsstClssSpcfcAttrbts")
    protected AssetClass21 asstClssSpcfcAttrbts;

	public L2M getData(String s) {
		L2M l2m = new L2M();
		l2m.append(s+".XpryDt", xpryDt);
		l2m.append(s+".PricMltplr", pricMltplr);
    	if(undrlygInstrm!=null)
		l2m.append(undrlygInstrm.getData(s+".UndrlygInstrm"));
    	if(optnTp!=null)
		l2m.append(s+".OptnTp", optnTp.toString());
    	if(strkPric!=null)
		l2m.append(strkPric.getData(s+".StrkPric"));
    	if(optnExrcStyle!=null)
		l2m.append(s+".OptnExrcStyle", optnExrcStyle.toString());
    	if(dlvryTp!=null)
		l2m.append(s+".DlvryTp", dlvryTp.toString());
    	if(asstClssSpcfcAttrbts!=null)
		l2m.append(asstClssSpcfcAttrbts.getData(s+".ACSA"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der xpryDt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Legt den Wert der xpryDt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Ruft den Wert der pricMltplr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Legt den Wert der pricMltplr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricMltplr(BigDecimal value) {
        this.pricMltplr = value;
    }

    /**
     * Ruft den Wert der undrlygInstrm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification5Choice }
     *     
     */
    public FinancialInstrumentIdentification5Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Legt den Wert der undrlygInstrm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification5Choice }
     *     
     */
    public void setUndrlygInstrm(FinancialInstrumentIdentification5Choice value) {
        this.undrlygInstrm = value;
    }

    /**
     * Ruft den Wert der optnTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getOptnTp() {
        return optnTp;
    }

    /**
     * Legt den Wert der optnTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public void setOptnTp(OptionType2Code value) {
        this.optnTp = value;
    }

    /**
     * Ruft den Wert der strkPric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4Choice1 }
     *     
     */
    public SecuritiesTransactionPrice4Choice1 getStrkPric() {
        return strkPric;
    }

    /**
     * Legt den Wert der strkPric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4Choice1 }
     *     
     */
    public void setStrkPric(SecuritiesTransactionPrice4Choice1 value) {
        this.strkPric = value;
    }

    /**
     * Ruft den Wert der optnExrcStyle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle7Code }
     *     
     */
    public OptionStyle7Code getOptnExrcStyle() {
        return optnExrcStyle;
    }

    /**
     * Legt den Wert der optnExrcStyle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle7Code }
     *     
     */
    public void setOptnExrcStyle(OptionStyle7Code value) {
        this.optnExrcStyle = value;
    }

    /**
     * Ruft den Wert der dlvryTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Legt den Wert der dlvryTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public void setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
    }

    /**
     * Ruft den Wert der asstClssSpcfcAttrbts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClass21 }
     *     
     */
    public AssetClass21 getAsstClssSpcfcAttrbts() {
        return asstClssSpcfcAttrbts;
    }

    /**
     * Legt den Wert der asstClssSpcfcAttrbts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClass21 }
     *     
     */
    public void setAsstClssSpcfcAttrbts(AssetClass21 value) {
        this.asstClssSpcfcAttrbts = value;
    }

}
