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
 * <p>Java-Klasse für AgriculturalCommoditySoft1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AgriculturalCommoditySoft1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasePdct" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AssetClassProductType1Code"/>
 *         &lt;element name="SubPdct" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AssetClassSubProductType2Code"/>
 *         &lt;element name="AddtlSubPdct" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AssetClassDetailedSubProductType2Code"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgriculturalCommoditySoft1", propOrder = {
    "basePdct",
    "subPdct",
    "addtlSubPdct"
})
public class AgriculturalCommoditySoft1 {

    @XmlElement(name = "BasePdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassProductType1Code basePdct;
    @XmlElement(name = "SubPdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassSubProductType2Code subPdct;
    @XmlElement(name = "AddtlSubPdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassDetailedSubProductType2Code addtlSubPdct;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(basePdct!=null)
		l2m.append(s+".BasePdct", basePdct.toString());
    	if(subPdct!=null)
		l2m.append(s+".SubPdct", subPdct.toString());
    	if(addtlSubPdct!=null)
		l2m.append(s+".AddtlSubPdct", addtlSubPdct.toString());
		return l2m;
	}
    
    /**
     * Ruft den Wert der basePdct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassProductType1Code }
     *     
     */
    public AssetClassProductType1Code getBasePdct() {
        return basePdct;
    }

    /**
     * Legt den Wert der basePdct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassProductType1Code }
     *     
     */
    public void setBasePdct(AssetClassProductType1Code value) {
        this.basePdct = value;
    }

    /**
     * Ruft den Wert der subPdct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassSubProductType2Code }
     *     
     */
    public AssetClassSubProductType2Code getSubPdct() {
        return subPdct;
    }

    /**
     * Legt den Wert der subPdct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassSubProductType2Code }
     *     
     */
    public void setSubPdct(AssetClassSubProductType2Code value) {
        this.subPdct = value;
    }

    /**
     * Ruft den Wert der addtlSubPdct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassDetailedSubProductType2Code }
     *     
     */
    public AssetClassDetailedSubProductType2Code getAddtlSubPdct() {
        return addtlSubPdct;
    }

    /**
     * Legt den Wert der addtlSubPdct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassDetailedSubProductType2Code }
     *     
     */
    public void setAddtlSubPdct(AssetClassDetailedSubProductType2Code value) {
        this.addtlSubPdct = value;
    }

}
