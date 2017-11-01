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
 * <p>Java-Klasse für AssetClassCommodityEnergy1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityEnergy1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Elctrcty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityElectricity1"/>
 *         &lt;element name="NtrlGas" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityNaturalGas1"/>
 *         &lt;element name="Oil" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityOil1"/>
 *         &lt;element name="Coal" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityCoal1"/>
 *         &lt;element name="IntrNrgy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityInterEnergy1"/>
 *         &lt;element name="RnwblNrgy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityRenewableEnergy1"/>
 *         &lt;element name="LghtEnd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityLightEnd1"/>
 *         &lt;element name="Dstllts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}EnergyCommodityDistillates1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnergy1Choice", propOrder = {
    "elctrcty",
    "ntrlGas",
    "oil",
    "coal",
    "intrNrgy",
    "rnwblNrgy",
    "lghtEnd",
    "dstllts"
})
public class AssetClassCommodityEnergy1Choice {

    @XmlElement(name = "Elctrcty")
    protected EnergyCommodityElectricity1 elctrcty;
    @XmlElement(name = "NtrlGas")
    protected EnergyCommodityNaturalGas1 ntrlGas;
    @XmlElement(name = "Oil")
    protected EnergyCommodityOil1 oil;
    @XmlElement(name = "Coal")
    protected EnergyCommodityCoal1 coal;
    @XmlElement(name = "IntrNrgy")
    protected EnergyCommodityInterEnergy1 intrNrgy;
    @XmlElement(name = "RnwblNrgy")
    protected EnergyCommodityRenewableEnergy1 rnwblNrgy;
    @XmlElement(name = "LghtEnd")
    protected EnergyCommodityLightEnd1 lghtEnd;
    @XmlElement(name = "Dstllts")
    protected EnergyCommodityDistillates1 dstllts;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(elctrcty!=null)
		l2m.append(elctrcty.getData(s+".Elctrcty"));
    	if(ntrlGas!=null)
		l2m.append(ntrlGas.getData(s+".NtrlGas"));
    	if(oil!=null)
		l2m.append(oil.getData(s+".Oil"));
    	if(coal!=null)
		l2m.append(coal.getData(s+".Coal"));
    	if(intrNrgy!=null)
		l2m.append(intrNrgy.getData(s+".IntrNrgy"));
    	if(rnwblNrgy!=null)
		l2m.append(rnwblNrgy.getData(s+".RnwblNrgy"));
    	if(lghtEnd!=null)
		l2m.append(lghtEnd.getData(s+".LghtEnd"));
    	if(dstllts!=null)
		l2m.append(dstllts.getData(s+".Dstllts"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der elctrcty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityElectricity1 }
     *     
     */
    public EnergyCommodityElectricity1 getElctrcty() {
        return elctrcty;
    }

    /**
     * Legt den Wert der elctrcty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityElectricity1 }
     *     
     */
    public void setElctrcty(EnergyCommodityElectricity1 value) {
        this.elctrcty = value;
    }

    /**
     * Ruft den Wert der ntrlGas-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityNaturalGas1 }
     *     
     */
    public EnergyCommodityNaturalGas1 getNtrlGas() {
        return ntrlGas;
    }

    /**
     * Legt den Wert der ntrlGas-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityNaturalGas1 }
     *     
     */
    public void setNtrlGas(EnergyCommodityNaturalGas1 value) {
        this.ntrlGas = value;
    }

    /**
     * Ruft den Wert der oil-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityOil1 }
     *     
     */
    public EnergyCommodityOil1 getOil() {
        return oil;
    }

    /**
     * Legt den Wert der oil-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityOil1 }
     *     
     */
    public void setOil(EnergyCommodityOil1 value) {
        this.oil = value;
    }

    /**
     * Ruft den Wert der coal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityCoal1 }
     *     
     */
    public EnergyCommodityCoal1 getCoal() {
        return coal;
    }

    /**
     * Legt den Wert der coal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityCoal1 }
     *     
     */
    public void setCoal(EnergyCommodityCoal1 value) {
        this.coal = value;
    }

    /**
     * Ruft den Wert der intrNrgy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityInterEnergy1 }
     *     
     */
    public EnergyCommodityInterEnergy1 getIntrNrgy() {
        return intrNrgy;
    }

    /**
     * Legt den Wert der intrNrgy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityInterEnergy1 }
     *     
     */
    public void setIntrNrgy(EnergyCommodityInterEnergy1 value) {
        this.intrNrgy = value;
    }

    /**
     * Ruft den Wert der rnwblNrgy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityRenewableEnergy1 }
     *     
     */
    public EnergyCommodityRenewableEnergy1 getRnwblNrgy() {
        return rnwblNrgy;
    }

    /**
     * Legt den Wert der rnwblNrgy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityRenewableEnergy1 }
     *     
     */
    public void setRnwblNrgy(EnergyCommodityRenewableEnergy1 value) {
        this.rnwblNrgy = value;
    }

    /**
     * Ruft den Wert der lghtEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityLightEnd1 }
     *     
     */
    public EnergyCommodityLightEnd1 getLghtEnd() {
        return lghtEnd;
    }

    /**
     * Legt den Wert der lghtEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityLightEnd1 }
     *     
     */
    public void setLghtEnd(EnergyCommodityLightEnd1 value) {
        this.lghtEnd = value;
    }

    /**
     * Ruft den Wert der dstllts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityDistillates1 }
     *     
     */
    public EnergyCommodityDistillates1 getDstllts() {
        return dstllts;
    }

    /**
     * Legt den Wert der dstllts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityDistillates1 }
     *     
     */
    public void setDstllts(EnergyCommodityDistillates1 value) {
        this.dstllts = value;
    }

}
