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
 * <p>Java-Klasse für AssetClassCommodityFertilizer1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityFertilizer1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Ammn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FertilizerCommodityAmmonia1"/>
 *         &lt;element name="DmmnmPhspht" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FertilizerCommodityDiammoniumPhosphate1"/>
 *         &lt;element name="Ptsh" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FertilizerCommodityPotash1"/>
 *         &lt;element name="Slphr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FertilizerCommoditySulphur1"/>
 *         &lt;element name="Urea" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FertilizerCommodityUrea1"/>
 *         &lt;element name="UreaAndAmmnmNtrt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}FertilizerCommodityUreaAndAmmoniumNitrate1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFertilizer1Choice", propOrder = {
    "ammn",
    "dmmnmPhspht",
    "ptsh",
    "slphr",
    "urea",
    "ureaAndAmmnmNtrt"
})
public class AssetClassCommodityFertilizer1Choice {

    @XmlElement(name = "Ammn")
    protected FertilizerCommodityAmmonia1 ammn;
    @XmlElement(name = "DmmnmPhspht")
    protected FertilizerCommodityDiammoniumPhosphate1 dmmnmPhspht;
    @XmlElement(name = "Ptsh")
    protected FertilizerCommodityPotash1 ptsh;
    @XmlElement(name = "Slphr")
    protected FertilizerCommoditySulphur1 slphr;
    @XmlElement(name = "Urea")
    protected FertilizerCommodityUrea1 urea;
    @XmlElement(name = "UreaAndAmmnmNtrt")
    protected FertilizerCommodityUreaAndAmmoniumNitrate1 ureaAndAmmnmNtrt;
    
    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(ammn!=null)
		l2m.append(ammn.getData(s+".Ammn"));
    	if(dmmnmPhspht!=null)
		l2m.append(dmmnmPhspht.getData(s+".DmmnmPhspht"));
    	if(ptsh!=null)
		l2m.append(ptsh.getData(s+".Ptsh"));
    	if(slphr!=null)
		l2m.append(slphr.getData(s+".Slphr"));
    	if(urea!=null)
		l2m.append(urea.getData(s+".Urea"));
    	if(ureaAndAmmnmNtrt!=null)
		l2m.append(ureaAndAmmnmNtrt.getData(s+".UreaAndAmmnmNtrt"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der ammn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityAmmonia1 }
     *     
     */
    public FertilizerCommodityAmmonia1 getAmmn() {
        return ammn;
    }

    /**
     * Legt den Wert der ammn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityAmmonia1 }
     *     
     */
    public void setAmmn(FertilizerCommodityAmmonia1 value) {
        this.ammn = value;
    }

    /**
     * Ruft den Wert der dmmnmPhspht-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityDiammoniumPhosphate1 }
     *     
     */
    public FertilizerCommodityDiammoniumPhosphate1 getDmmnmPhspht() {
        return dmmnmPhspht;
    }

    /**
     * Legt den Wert der dmmnmPhspht-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityDiammoniumPhosphate1 }
     *     
     */
    public void setDmmnmPhspht(FertilizerCommodityDiammoniumPhosphate1 value) {
        this.dmmnmPhspht = value;
    }

    /**
     * Ruft den Wert der ptsh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityPotash1 }
     *     
     */
    public FertilizerCommodityPotash1 getPtsh() {
        return ptsh;
    }

    /**
     * Legt den Wert der ptsh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityPotash1 }
     *     
     */
    public void setPtsh(FertilizerCommodityPotash1 value) {
        this.ptsh = value;
    }

    /**
     * Ruft den Wert der slphr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommoditySulphur1 }
     *     
     */
    public FertilizerCommoditySulphur1 getSlphr() {
        return slphr;
    }

    /**
     * Legt den Wert der slphr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommoditySulphur1 }
     *     
     */
    public void setSlphr(FertilizerCommoditySulphur1 value) {
        this.slphr = value;
    }

    /**
     * Ruft den Wert der urea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUrea1 }
     *     
     */
    public FertilizerCommodityUrea1 getUrea() {
        return urea;
    }

    /**
     * Legt den Wert der urea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUrea1 }
     *     
     */
    public void setUrea(FertilizerCommodityUrea1 value) {
        this.urea = value;
    }

    /**
     * Ruft den Wert der ureaAndAmmnmNtrt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate1 }
     *     
     */
    public FertilizerCommodityUreaAndAmmoniumNitrate1 getUreaAndAmmnmNtrt() {
        return ureaAndAmmnmNtrt;
    }

    /**
     * Legt den Wert der ureaAndAmmnmNtrt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate1 }
     *     
     */
    public void setUreaAndAmmnmNtrt(FertilizerCommodityUreaAndAmmoniumNitrate1 value) {
        this.ureaAndAmmnmNtrt = value;
    }

}
