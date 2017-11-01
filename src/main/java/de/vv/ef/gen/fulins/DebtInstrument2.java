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
import javax.xml.datatype.XMLGregorianCalendar;

import de.vv.ef.consumer.L2M;

/**
 * <p>
 * Java-Klasse für DebtInstrument2 complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser
 * Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DebtInstrument2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TtlIssdNmnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="NmnlValPerUnit" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         &lt;element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}InterestRate6Choice"/>
 *         &lt;element name="DebtSnrty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}DebtInstrumentSeniorityType1Code" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtInstrument2", propOrder = { "ttlIssdNmnlAmt", "mtrtyDt", "nmnlValPerUnit", "intrstRate",
		"debtSnrty" })
public class DebtInstrument2 {

	@XmlElement(name = "TtlIssdNmnlAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount ttlIssdNmnlAmt;
	@XmlElement(name = "MtrtyDt")
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar mtrtyDt;
	@XmlElement(name = "NmnlValPerUnit", required = true)
	protected ActiveOrHistoricCurrencyAndAmount nmnlValPerUnit;
	@XmlElement(name = "IntrstRate", required = true)
	protected InterestRate6Choice intrstRate;
	@XmlElement(name = "DebtSnrty")
	@XmlSchemaType(name = "string")
	protected DebtInstrumentSeniorityType1Code debtSnrty;

	public L2M getData(String s) {
		L2M l2m = new L2M();
		if (ttlIssdNmnlAmt != null)
			l2m.append(ttlIssdNmnlAmt.getData(s + ".TtlIssdNmnlAmt"));
		l2m.append(s + ".MtrtyDt", mtrtyDt);
		if (nmnlValPerUnit != null)
			l2m.append(nmnlValPerUnit.getData(s + ".NmnlValPerUnit"));
		if (intrstRate != null)
			l2m.append(intrstRate.getData(s + ".IntrstRate"));
		if (debtSnrty != null)
			l2m.append(s + ".DebtSnrty", debtSnrty.toString());
		return l2m;
	}

	/**
	 * Ruft den Wert der ttlIssdNmnlAmt-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ActiveOrHistoricCurrencyAndAmount }
	 * 
	 */
	public ActiveOrHistoricCurrencyAndAmount getTtlIssdNmnlAmt() {
		return ttlIssdNmnlAmt;
	}

	/**
	 * Legt den Wert der ttlIssdNmnlAmt-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ActiveOrHistoricCurrencyAndAmount }
	 * 
	 */
	public void setTtlIssdNmnlAmt(ActiveOrHistoricCurrencyAndAmount value) {
		this.ttlIssdNmnlAmt = value;
	}

	/**
	 * Ruft den Wert der mtrtyDt-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getMtrtyDt() {
		return mtrtyDt;
	}

	/**
	 * Legt den Wert der mtrtyDt-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setMtrtyDt(XMLGregorianCalendar value) {
		this.mtrtyDt = value;
	}

	/**
	 * Ruft den Wert der nmnlValPerUnit-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ActiveOrHistoricCurrencyAndAmount }
	 * 
	 */
	public ActiveOrHistoricCurrencyAndAmount getNmnlValPerUnit() {
		return nmnlValPerUnit;
	}

	/**
	 * Legt den Wert der nmnlValPerUnit-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ActiveOrHistoricCurrencyAndAmount }
	 * 
	 */
	public void setNmnlValPerUnit(ActiveOrHistoricCurrencyAndAmount value) {
		this.nmnlValPerUnit = value;
	}

	/**
	 * Ruft den Wert der intrstRate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link InterestRate6Choice }
	 * 
	 */
	public InterestRate6Choice getIntrstRate() {
		return intrstRate;
	}

	/**
	 * Legt den Wert der intrstRate-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link InterestRate6Choice }
	 * 
	 */
	public void setIntrstRate(InterestRate6Choice value) {
		this.intrstRate = value;
	}

	/**
	 * Ruft den Wert der debtSnrty-Eigenschaft ab.
	 * 
	 * @return possible object is {@link DebtInstrumentSeniorityType1Code }
	 * 
	 */
	public DebtInstrumentSeniorityType1Code getDebtSnrty() {
		return debtSnrty;
	}

	/**
	 * Legt den Wert der debtSnrty-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link DebtInstrumentSeniorityType1Code }
	 * 
	 */
	public void setDebtSnrty(DebtInstrumentSeniorityType1Code value) {
		this.debtSnrty = value;
	}

}
