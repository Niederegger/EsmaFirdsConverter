//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.01 um 01:39:58 PM CET 
//


package de.vv.ef.gen.dltins;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für AssetClassCommodityMetal1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityMetal1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="NonPrcs" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}MetalCommodityNonPrecious1"/>
 *         &lt;element name="Prcs" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}MetalCommodityPrecious1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityMetal1Choice", propOrder = {
    "nonPrcs",
    "prcs"
})
public class AssetClassCommodityMetal1Choice {

    @XmlElement(name = "NonPrcs")
    protected MetalCommodityNonPrecious1 nonPrcs;
    @XmlElement(name = "Prcs")
    protected MetalCommodityPrecious1 prcs;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(nonPrcs!=null)
		l2m.append(nonPrcs.getData(s+".NonPrcs"));
    	if(prcs!=null)
		l2m.append(prcs.getData(s+".Prcs"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der nonPrcs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityNonPrecious1 }
     *     
     */
    public MetalCommodityNonPrecious1 getNonPrcs() {
        return nonPrcs;
    }

    /**
     * Legt den Wert der nonPrcs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityNonPrecious1 }
     *     
     */
    public void setNonPrcs(MetalCommodityNonPrecious1 value) {
        this.nonPrcs = value;
    }

    /**
     * Ruft den Wert der prcs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetalCommodityPrecious1 }
     *     
     */
    public MetalCommodityPrecious1 getPrcs() {
        return prcs;
    }

    /**
     * Legt den Wert der prcs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MetalCommodityPrecious1 }
     *     
     */
    public void setPrcs(MetalCommodityPrecious1 value) {
        this.prcs = value;
    }

}
