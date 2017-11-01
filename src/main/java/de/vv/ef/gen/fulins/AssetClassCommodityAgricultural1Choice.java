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
 * <p>Java-Klasse für AssetClassCommodityAgricultural1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityAgricultural1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GrnOilSeed" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommodityOilSeed1"/>
 *         &lt;element name="Soft" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommoditySoft1"/>
 *         &lt;element name="Ptt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommodityPotato1"/>
 *         &lt;element name="OlvOil" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommodityOliveOil1"/>
 *         &lt;element name="Dairy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommodityDairy1"/>
 *         &lt;element name="Frstry" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommodityForestry1"/>
 *         &lt;element name="Sfd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommoditySeafood1"/>
 *         &lt;element name="LiveStock" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommodityLiveStock1"/>
 *         &lt;element name="Grn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}AgriculturalCommodityGrain1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityAgricultural1Choice", propOrder = {
    "grnOilSeed",
    "soft",
    "ptt",
    "olvOil",
    "dairy",
    "frstry",
    "sfd",
    "liveStock",
    "grn"
})
public class AssetClassCommodityAgricultural1Choice {

    @XmlElement(name = "GrnOilSeed")
    protected AgriculturalCommodityOilSeed1 grnOilSeed;
    @XmlElement(name = "Soft")
    protected AgriculturalCommoditySoft1 soft;
    @XmlElement(name = "Ptt")
    protected AgriculturalCommodityPotato1 ptt;
    @XmlElement(name = "OlvOil")
    protected AgriculturalCommodityOliveOil1 olvOil;
    @XmlElement(name = "Dairy")
    protected AgriculturalCommodityDairy1 dairy;
    @XmlElement(name = "Frstry")
    protected AgriculturalCommodityForestry1 frstry;
    @XmlElement(name = "Sfd")
    protected AgriculturalCommoditySeafood1 sfd;
    @XmlElement(name = "LiveStock")
    protected AgriculturalCommodityLiveStock1 liveStock;
    @XmlElement(name = "Grn")
    protected AgriculturalCommodityGrain1 grn;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(grnOilSeed!=null)
		l2m.append(grnOilSeed.getData(s+".GrnOilSeed"));
    	if(soft!=null)
		l2m.append(soft.getData(s+".Soft"));
    	if(ptt!=null)
		l2m.append(ptt.getData(s+".Ptt"));
    	if(olvOil!=null)
		l2m.append(olvOil.getData(s+".OlvOil"));
    	if(dairy!=null)
		l2m.append(dairy.getData(s+".Dairy"));
    	if(frstry!=null)
		l2m.append(frstry.getData(s+".Frstry"));
    	if(sfd!=null)
		l2m.append(sfd.getData(s+".Sfd"));
    	if(liveStock!=null)
		l2m.append(liveStock.getData(s+".LiveStock"));
    	if(grn!=null)
		l2m.append(grn.getData(s+".Grn"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der grnOilSeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOilSeed1 }
     *     
     */
    public AgriculturalCommodityOilSeed1 getGrnOilSeed() {
        return grnOilSeed;
    }

    /**
     * Legt den Wert der grnOilSeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOilSeed1 }
     *     
     */
    public void setGrnOilSeed(AgriculturalCommodityOilSeed1 value) {
        this.grnOilSeed = value;
    }

    /**
     * Ruft den Wert der soft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySoft1 }
     *     
     */
    public AgriculturalCommoditySoft1 getSoft() {
        return soft;
    }

    /**
     * Legt den Wert der soft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySoft1 }
     *     
     */
    public void setSoft(AgriculturalCommoditySoft1 value) {
        this.soft = value;
    }

    /**
     * Ruft den Wert der ptt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityPotato1 }
     *     
     */
    public AgriculturalCommodityPotato1 getPtt() {
        return ptt;
    }

    /**
     * Legt den Wert der ptt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityPotato1 }
     *     
     */
    public void setPtt(AgriculturalCommodityPotato1 value) {
        this.ptt = value;
    }

    /**
     * Ruft den Wert der olvOil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOliveOil1 }
     *     
     */
    public AgriculturalCommodityOliveOil1 getOlvOil() {
        return olvOil;
    }

    /**
     * Legt den Wert der olvOil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOliveOil1 }
     *     
     */
    public void setOlvOil(AgriculturalCommodityOliveOil1 value) {
        this.olvOil = value;
    }

    /**
     * Ruft den Wert der dairy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityDairy1 }
     *     
     */
    public AgriculturalCommodityDairy1 getDairy() {
        return dairy;
    }

    /**
     * Legt den Wert der dairy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityDairy1 }
     *     
     */
    public void setDairy(AgriculturalCommodityDairy1 value) {
        this.dairy = value;
    }

    /**
     * Ruft den Wert der frstry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityForestry1 }
     *     
     */
    public AgriculturalCommodityForestry1 getFrstry() {
        return frstry;
    }

    /**
     * Legt den Wert der frstry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityForestry1 }
     *     
     */
    public void setFrstry(AgriculturalCommodityForestry1 value) {
        this.frstry = value;
    }

    /**
     * Ruft den Wert der sfd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySeafood1 }
     *     
     */
    public AgriculturalCommoditySeafood1 getSfd() {
        return sfd;
    }

    /**
     * Legt den Wert der sfd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySeafood1 }
     *     
     */
    public void setSfd(AgriculturalCommoditySeafood1 value) {
        this.sfd = value;
    }

    /**
     * Ruft den Wert der liveStock-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityLiveStock1 }
     *     
     */
    public AgriculturalCommodityLiveStock1 getLiveStock() {
        return liveStock;
    }

    /**
     * Legt den Wert der liveStock-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityLiveStock1 }
     *     
     */
    public void setLiveStock(AgriculturalCommodityLiveStock1 value) {
        this.liveStock = value;
    }

    /**
     * Ruft den Wert der grn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityGrain1 }
     *     
     */
    public AgriculturalCommodityGrain1 getGrn() {
        return grn;
    }

    /**
     * Legt den Wert der grn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityGrain1 }
     *     
     */
    public void setGrn(AgriculturalCommodityGrain1 value) {
        this.grn = value;
    }

}
