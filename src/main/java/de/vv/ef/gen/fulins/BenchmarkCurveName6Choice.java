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

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für BenchmarkCurveName6Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BenchmarkCurveName6Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ISINOct2015Identifier"/>
 *         &lt;element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}BenchmarkCurveName2Code"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}Max25Text"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenchmarkCurveName6Choice", propOrder = {
    "isin",
    "indx",
    "nm"
})
public class BenchmarkCurveName6Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Indx")
    @XmlSchemaType(name = "string")
    protected BenchmarkCurveName2Code indx;
    @XmlElement(name = "Nm")
    protected String nm;

	public L2M getData(String s) {
		L2M l2m = new L2M();
		l2m.append(s+".BmIsin",isin);
		if(indx!=null)
		l2m.append(s+".BmIndx",indx.toString());
		l2m.append(s+".BmkNm",nm);
		return l2m;
	}
    
    /**
     * Ruft den Wert der isin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Legt den Wert der isin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Ruft den Wert der indx-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName2Code }
     *     
     */
    public BenchmarkCurveName2Code getIndx() {
        return indx;
    }

    /**
     * Legt den Wert der indx-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName2Code }
     *     
     */
    public void setIndx(BenchmarkCurveName2Code value) {
        this.indx = value;
    }

    /**
     * Ruft den Wert der nm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Legt den Wert der nm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

}
