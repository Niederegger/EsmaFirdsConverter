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
 * <p>Java-Klasse für AssetClassCommodityOther1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityOther1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BasePdct" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AssetClassProductType15Code"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityOther1", propOrder = {
    "basePdct"
})
public class AssetClassCommodityOther1 {

    @XmlElement(name = "BasePdct", required = true)
    @XmlSchemaType(name = "string")
    protected AssetClassProductType15Code basePdct;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(basePdct!=null)
		l2m.append(s+".BasePdct",basePdct.toString());
		return l2m;
	}
    
    /**
     * Ruft den Wert der basePdct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassProductType15Code }
     *     
     */
    public AssetClassProductType15Code getBasePdct() {
        return basePdct;
    }

    /**
     * Legt den Wert der basePdct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassProductType15Code }
     *     
     */
    public void setBasePdct(AssetClassProductType15Code value) {
        this.basePdct = value;
    }

}
