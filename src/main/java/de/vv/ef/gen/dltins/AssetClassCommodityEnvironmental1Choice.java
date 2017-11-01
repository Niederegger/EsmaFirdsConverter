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
 * <p>Java-Klasse für AssetClassCommodityEnvironmental1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityEnvironmental1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Emssns" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnvironmentalCommodityEmission1"/>
 *         &lt;element name="Wthr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnvironmentalCommodityWeather1"/>
 *         &lt;element name="CrbnRltd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnvironmentalCommodityCarbonRelated1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnvironmental1Choice", propOrder = {
    "emssns",
    "wthr",
    "crbnRltd"
})
public class AssetClassCommodityEnvironmental1Choice {

    @XmlElement(name = "Emssns")
    protected EnvironmentalCommodityEmission1 emssns;
    @XmlElement(name = "Wthr")
    protected EnvironmentalCommodityWeather1 wthr;
    @XmlElement(name = "CrbnRltd")
    protected EnvironmentalCommodityCarbonRelated1 crbnRltd;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(emssns!=null)
		l2m.append(emssns.getData(s+".Emssns"));
    	if(wthr!=null)
		l2m.append(wthr.getData(s+".Wthr"));
    	if(crbnRltd!=null)
		l2m.append(crbnRltd.getData(s+".CrbnRltd"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der emssns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityEmission1 }
     *     
     */
    public EnvironmentalCommodityEmission1 getEmssns() {
        return emssns;
    }

    /**
     * Legt den Wert der emssns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityEmission1 }
     *     
     */
    public void setEmssns(EnvironmentalCommodityEmission1 value) {
        this.emssns = value;
    }

    /**
     * Ruft den Wert der wthr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityWeather1 }
     *     
     */
    public EnvironmentalCommodityWeather1 getWthr() {
        return wthr;
    }

    /**
     * Legt den Wert der wthr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityWeather1 }
     *     
     */
    public void setWthr(EnvironmentalCommodityWeather1 value) {
        this.wthr = value;
    }

    /**
     * Ruft den Wert der crbnRltd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalCommodityCarbonRelated1 }
     *     
     */
    public EnvironmentalCommodityCarbonRelated1 getCrbnRltd() {
        return crbnRltd;
    }

    /**
     * Legt den Wert der crbnRltd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalCommodityCarbonRelated1 }
     *     
     */
    public void setCrbnRltd(EnvironmentalCommodityCarbonRelated1 value) {
        this.crbnRltd = value;
    }

}
