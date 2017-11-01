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
 * <p>Java-Klasse für AssetClassCommodityPolypropylene1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityPolypropylene1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Plstc" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}PolypropyleneCommodityPlastic1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityPolypropylene1Choice", propOrder = {
    "plstc"
})
public class AssetClassCommodityPolypropylene1Choice {

    @XmlElement(name = "Plstc")
    protected PolypropyleneCommodityPlastic1 plstc;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(plstc!=null)
		l2m.append(plstc.getData(s+".Plstc"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der plstc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolypropyleneCommodityPlastic1 }
     *     
     */
    public PolypropyleneCommodityPlastic1 getPlstc() {
        return plstc;
    }

    /**
     * Legt den Wert der plstc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolypropyleneCommodityPlastic1 }
     *     
     */
    public void setPlstc(PolypropyleneCommodityPlastic1 value) {
        this.plstc = value;
    }

}
