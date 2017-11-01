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
 * <p>Java-Klasse für AssetClassCommodityOtherC102Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityOtherC102Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Dlvrbl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}OtherC10CommodityDeliverable2"/>
 *         &lt;element name="NonDlvrbl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}OtherC10CommodityNonDeliverable2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityOtherC102Choice", propOrder = {
    "dlvrbl",
    "nonDlvrbl"
})
public class AssetClassCommodityOtherC102Choice {

    @XmlElement(name = "Dlvrbl")
    protected OtherC10CommodityDeliverable2 dlvrbl;
    @XmlElement(name = "NonDlvrbl")
    protected OtherC10CommodityNonDeliverable2 nonDlvrbl;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(nonDlvrbl!=null)
		l2m.append(nonDlvrbl.getData(s+".Dlvrbl"));
    	if(nonDlvrbl!=null)
		l2m.append(nonDlvrbl.getData(s+".NonDlvrbl"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der dlvrbl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OtherC10CommodityDeliverable2 }
     *     
     */
    public OtherC10CommodityDeliverable2 getDlvrbl() {
        return dlvrbl;
    }

    /**
     * Legt den Wert der dlvrbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherC10CommodityDeliverable2 }
     *     
     */
    public void setDlvrbl(OtherC10CommodityDeliverable2 value) {
        this.dlvrbl = value;
    }

    /**
     * Ruft den Wert der nonDlvrbl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OtherC10CommodityNonDeliverable2 }
     *     
     */
    public OtherC10CommodityNonDeliverable2 getNonDlvrbl() {
        return nonDlvrbl;
    }

    /**
     * Legt den Wert der nonDlvrbl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherC10CommodityNonDeliverable2 }
     *     
     */
    public void setNonDlvrbl(OtherC10CommodityNonDeliverable2 value) {
        this.nonDlvrbl = value;
    }

}
