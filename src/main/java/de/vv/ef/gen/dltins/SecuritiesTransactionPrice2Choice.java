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
import javax.xml.bind.annotation.XmlType;

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für SecuritiesTransactionPrice2Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice2Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AmountAndDirection61"/>
 *         &lt;element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}PercentageRate"/>
 *         &lt;element name="Yld" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}PercentageRate"/>
 *         &lt;element name="BsisPts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}DecimalNumber"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice2Choice", propOrder = {
    "mntryVal",
    "pctg",
    "yld",
    "bsisPts"
})
public class SecuritiesTransactionPrice2Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection61 mntryVal;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "BsisPts")
    protected BigDecimal bsisPts;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(mntryVal!=null)
		l2m.append(mntryVal.getData(s+".MntryVal"));
		l2m.append(s+".Pctg",pctg);
		l2m.append(s+".Yld",yld);
		l2m.append(s+".BsisPts",bsisPts);
		return l2m;
	}
    
    /**
     * Ruft den Wert der mntryVal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public AmountAndDirection61 getMntryVal() {
        return mntryVal;
    }

    /**
     * Legt den Wert der mntryVal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public void setMntryVal(AmountAndDirection61 value) {
        this.mntryVal = value;
    }

    /**
     * Ruft den Wert der pctg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Legt den Wert der pctg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

    /**
     * Ruft den Wert der yld-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Legt den Wert der yld-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYld(BigDecimal value) {
        this.yld = value;
    }

    /**
     * Ruft den Wert der bsisPts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPts() {
        return bsisPts;
    }

    /**
     * Legt den Wert der bsisPts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPts(BigDecimal value) {
        this.bsisPts = value;
    }

}
