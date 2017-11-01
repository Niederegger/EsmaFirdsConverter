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

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für AssetClassCommodityIndustrialProduct1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityIndustrialProduct1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Cnstrctn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}IndustrialProductCommodityConstruction1"/>
 *         &lt;element name="Manfctg" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}IndustrialProductCommodityManufacturing1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityIndustrialProduct1Choice", propOrder = {
    "cnstrctn",
    "manfctg"
})
public class AssetClassCommodityIndustrialProduct1Choice {

    @XmlElement(name = "Cnstrctn")
    protected IndustrialProductCommodityConstruction1 cnstrctn;
    @XmlElement(name = "Manfctg")
    protected IndustrialProductCommodityManufacturing1 manfctg;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(cnstrctn!=null)
		l2m.append(cnstrctn.getData(s+".Cnstrctn"));
    	if(manfctg!=null)
		l2m.append(manfctg.getData(s+".Manfctg"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der cnstrctn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialProductCommodityConstruction1 }
     *     
     */
    public IndustrialProductCommodityConstruction1 getCnstrctn() {
        return cnstrctn;
    }

    /**
     * Legt den Wert der cnstrctn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialProductCommodityConstruction1 }
     *     
     */
    public void setCnstrctn(IndustrialProductCommodityConstruction1 value) {
        this.cnstrctn = value;
    }

    /**
     * Ruft den Wert der manfctg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialProductCommodityManufacturing1 }
     *     
     */
    public IndustrialProductCommodityManufacturing1 getManfctg() {
        return manfctg;
    }

    /**
     * Legt den Wert der manfctg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialProductCommodityManufacturing1 }
     *     
     */
    public void setManfctg(IndustrialProductCommodityManufacturing1 value) {
        this.manfctg = value;
    }

}
