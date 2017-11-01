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
 * <p>Java-Klasse für DerivativeForeignExchange3 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DerivativeForeignExchange3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FxTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AssetFXSubProductType1Code" minOccurs="0"/>
 *         &lt;element name="OthrNtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeForeignExchange3", propOrder = {
    "fxTp",
    "othrNtnlCcy"
})
public class DerivativeForeignExchange3 {

    @XmlElement(name = "FxTp")
    @XmlSchemaType(name = "string")
    protected AssetFXSubProductType1Code fxTp;
    @XmlElement(name = "OthrNtnlCcy")
    protected String othrNtnlCcy;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(fxTp!=null)
		l2m.append(s+".FxTp",fxTp.toString());
		l2m.append(s+".OthrNtnlCcy",othrNtnlCcy);
		return l2m;
	}
    
    /**
     * Ruft den Wert der fxTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetFXSubProductType1Code }
     *     
     */
    public AssetFXSubProductType1Code getFxTp() {
        return fxTp;
    }

    /**
     * Legt den Wert der fxTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetFXSubProductType1Code }
     *     
     */
    public void setFxTp(AssetFXSubProductType1Code value) {
        this.fxTp = value;
    }

    /**
     * Ruft den Wert der othrNtnlCcy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtnlCcy() {
        return othrNtnlCcy;
    }

    /**
     * Legt den Wert der othrNtnlCcy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrNtnlCcy(String value) {
        this.othrNtnlCcy = value;
    }

}
