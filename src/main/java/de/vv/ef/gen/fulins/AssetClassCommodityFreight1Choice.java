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
 * <p>Java-Klasse für AssetClassCommodityFreight1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityFreight1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Dry" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}FreightCommodityDry1"/>
 *         &lt;element name="Wet" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}FreightCommodityWet1"/>
 *         &lt;element name="CntnrShip" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}FreightCommodityContainerShip1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFreight1Choice", propOrder = {
    "dry",
    "wet",
    "cntnrShip"
})
public class AssetClassCommodityFreight1Choice {

    @XmlElement(name = "Dry")
    protected FreightCommodityDry1 dry;
    @XmlElement(name = "Wet")
    protected FreightCommodityWet1 wet;
    @XmlElement(name = "CntnrShip")
    protected FreightCommodityContainerShip1 cntnrShip;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(dry!=null)
		l2m.append(dry.getData(s+".Dry"));
    	if(wet!=null)
		l2m.append(wet.getData(s+".Wet"));
    	if(cntnrShip!=null)
		l2m.append(cntnrShip.getData(s+".CntnrShip"));
		return l2m;
	}

    /**
     * Ruft den Wert der dry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityDry1 }
     *     
     */
    public FreightCommodityDry1 getDry() {
        return dry;
    }

    /**
     * Legt den Wert der dry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityDry1 }
     *     
     */
    public void setDry(FreightCommodityDry1 value) {
        this.dry = value;
    }

    /**
     * Ruft den Wert der wet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityWet1 }
     *     
     */
    public FreightCommodityWet1 getWet() {
        return wet;
    }

    /**
     * Legt den Wert der wet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityWet1 }
     *     
     */
    public void setWet(FreightCommodityWet1 value) {
        this.wet = value;
    }

    /**
     * Ruft den Wert der cntnrShip-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FreightCommodityContainerShip1 }
     *     
     */
    public FreightCommodityContainerShip1 getCntnrShip() {
        return cntnrShip;
    }

    /**
     * Legt den Wert der cntnrShip-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightCommodityContainerShip1 }
     *     
     */
    public void setCntnrShip(FreightCommodityContainerShip1 value) {
        this.cntnrShip = value;
    }

}
