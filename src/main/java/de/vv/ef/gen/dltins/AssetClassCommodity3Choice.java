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
 * <p>Java-Klasse für AssetClassCommodity3Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodity3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Agrcltrl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityAgricultural1Choice"/>
 *         &lt;element name="Nrgy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityEnergy1Choice"/>
 *         &lt;element name="Envttl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityEnvironmental1Choice"/>
 *         &lt;element name="Frtlzr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityFertilizer1Choice"/>
 *         &lt;element name="Frght" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityFreight1Choice"/>
 *         &lt;element name="IndstrlPdct" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityIndustrialProduct1Choice"/>
 *         &lt;element name="Metl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityMetal1Choice"/>
 *         &lt;element name="OthrC10" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityOtherC102Choice"/>
 *         &lt;element name="Ppr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityPaper1Choice"/>
 *         &lt;element name="Plprpln" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityPolypropylene1Choice"/>
 *         &lt;element name="Infltn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityInflation1"/>
 *         &lt;element name="MultiCmmdtyExtc" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityMultiCommodityExotic1"/>
 *         &lt;element name="OffclEcnmcSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityOfficialEconomicStatistics1"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT6auth.036.001.01}AssetClassCommodityOther1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodity3Choice", propOrder = {
    "agrcltrl",
    "nrgy",
    "envttl",
    "frtlzr",
    "frght",
    "indstrlPdct",
    "metl",
    "othrC10",
    "ppr",
    "plprpln",
    "infltn",
    "multiCmmdtyExtc",
    "offclEcnmcSttstcs",
    "othr"
})
public class AssetClassCommodity3Choice {

    @XmlElement(name = "Agrcltrl")
    protected AssetClassCommodityAgricultural1Choice agrcltrl;
    @XmlElement(name = "Nrgy")
    protected AssetClassCommodityEnergy1Choice nrgy;
    @XmlElement(name = "Envttl")
    protected AssetClassCommodityEnvironmental1Choice envttl;
    @XmlElement(name = "Frtlzr")
    protected AssetClassCommodityFertilizer1Choice frtlzr;
    @XmlElement(name = "Frght")
    protected AssetClassCommodityFreight1Choice frght;
    @XmlElement(name = "IndstrlPdct")
    protected AssetClassCommodityIndustrialProduct1Choice indstrlPdct;
    @XmlElement(name = "Metl")
    protected AssetClassCommodityMetal1Choice metl;
    @XmlElement(name = "OthrC10")
    protected AssetClassCommodityOtherC102Choice othrC10;
    @XmlElement(name = "Ppr")
    protected AssetClassCommodityPaper1Choice ppr;
    @XmlElement(name = "Plprpln")
    protected AssetClassCommodityPolypropylene1Choice plprpln;
    @XmlElement(name = "Infltn")
    protected AssetClassCommodityInflation1 infltn;
    @XmlElement(name = "MultiCmmdtyExtc")
    protected AssetClassCommodityMultiCommodityExotic1 multiCmmdtyExtc;
    @XmlElement(name = "OffclEcnmcSttstcs")
    protected AssetClassCommodityOfficialEconomicStatistics1 offclEcnmcSttstcs;
    @XmlElement(name = "Othr")
    protected AssetClassCommodityOther1 othr;
    
	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(agrcltrl!=null)
		l2m.append(agrcltrl.getData(s+".Agrcltrl"));
    	if(nrgy!=null)
		l2m.append(nrgy.getData(s+".Nrgy"));
    	if(envttl!=null)
		l2m.append(envttl.getData(s+".Envttl"));
    	if(frtlzr!=null)
		l2m.append(frtlzr.getData(s+".Frtlzr"));
    	if(frght!=null)
		l2m.append(frght.getData(s+".Frght"));
    	if(indstrlPdct!=null)
		l2m.append(indstrlPdct.getData(s+".IndstrlPdct"));
    	if(metl!=null)
		l2m.append(metl.getData(s+".Metl"));
    	if(othrC10!=null)
		l2m.append(othrC10.getData(s+".OthrC10"));
    	if(ppr!=null)
		l2m.append(ppr.getData(s+".Ppr"));
    	if(plprpln!=null)
		l2m.append(plprpln.getData(s+".Plprpln"));
    	if(infltn!=null)
		l2m.append(infltn.getData(s+".Infltn"));
    	if(multiCmmdtyExtc!=null)
		l2m.append(multiCmmdtyExtc.getData(s+".MultiCmmdtyExtc"));
    	if(offclEcnmcSttstcs!=null)
		l2m.append(offclEcnmcSttstcs.getData(s+".OffclEcnmcSttstcs"));
    	if(othr!=null)
		l2m.append(othr.getData(s+".Othr"));
		return l2m;
	}

    /**
     * Ruft den Wert der agrcltrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityAgricultural1Choice }
     *     
     */
    public AssetClassCommodityAgricultural1Choice getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Legt den Wert der agrcltrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityAgricultural1Choice }
     *     
     */
    public void setAgrcltrl(AssetClassCommodityAgricultural1Choice value) {
        this.agrcltrl = value;
    }

    /**
     * Ruft den Wert der nrgy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnergy1Choice }
     *     
     */
    public AssetClassCommodityEnergy1Choice getNrgy() {
        return nrgy;
    }

    /**
     * Legt den Wert der nrgy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnergy1Choice }
     *     
     */
    public void setNrgy(AssetClassCommodityEnergy1Choice value) {
        this.nrgy = value;
    }

    /**
     * Ruft den Wert der envttl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnvironmental1Choice }
     *     
     */
    public AssetClassCommodityEnvironmental1Choice getEnvttl() {
        return envttl;
    }

    /**
     * Legt den Wert der envttl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnvironmental1Choice }
     *     
     */
    public void setEnvttl(AssetClassCommodityEnvironmental1Choice value) {
        this.envttl = value;
    }

    /**
     * Ruft den Wert der frtlzr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFertilizer1Choice }
     *     
     */
    public AssetClassCommodityFertilizer1Choice getFrtlzr() {
        return frtlzr;
    }

    /**
     * Legt den Wert der frtlzr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFertilizer1Choice }
     *     
     */
    public void setFrtlzr(AssetClassCommodityFertilizer1Choice value) {
        this.frtlzr = value;
    }

    /**
     * Ruft den Wert der frght-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFreight1Choice }
     *     
     */
    public AssetClassCommodityFreight1Choice getFrght() {
        return frght;
    }

    /**
     * Legt den Wert der frght-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFreight1Choice }
     *     
     */
    public void setFrght(AssetClassCommodityFreight1Choice value) {
        this.frght = value;
    }

    /**
     * Ruft den Wert der indstrlPdct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityIndustrialProduct1Choice }
     *     
     */
    public AssetClassCommodityIndustrialProduct1Choice getIndstrlPdct() {
        return indstrlPdct;
    }

    /**
     * Legt den Wert der indstrlPdct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityIndustrialProduct1Choice }
     *     
     */
    public void setIndstrlPdct(AssetClassCommodityIndustrialProduct1Choice value) {
        this.indstrlPdct = value;
    }

    /**
     * Ruft den Wert der metl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMetal1Choice }
     *     
     */
    public AssetClassCommodityMetal1Choice getMetl() {
        return metl;
    }

    /**
     * Legt den Wert der metl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMetal1Choice }
     *     
     */
    public void setMetl(AssetClassCommodityMetal1Choice value) {
        this.metl = value;
    }

    /**
     * Ruft den Wert der othrC10-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOtherC102Choice }
     *     
     */
    public AssetClassCommodityOtherC102Choice getOthrC10() {
        return othrC10;
    }

    /**
     * Legt den Wert der othrC10-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOtherC102Choice }
     *     
     */
    public void setOthrC10(AssetClassCommodityOtherC102Choice value) {
        this.othrC10 = value;
    }

    /**
     * Ruft den Wert der ppr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPaper1Choice }
     *     
     */
    public AssetClassCommodityPaper1Choice getPpr() {
        return ppr;
    }

    /**
     * Legt den Wert der ppr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPaper1Choice }
     *     
     */
    public void setPpr(AssetClassCommodityPaper1Choice value) {
        this.ppr = value;
    }

    /**
     * Ruft den Wert der plprpln-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPolypropylene1Choice }
     *     
     */
    public AssetClassCommodityPolypropylene1Choice getPlprpln() {
        return plprpln;
    }

    /**
     * Legt den Wert der plprpln-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPolypropylene1Choice }
     *     
     */
    public void setPlprpln(AssetClassCommodityPolypropylene1Choice value) {
        this.plprpln = value;
    }

    /**
     * Ruft den Wert der infltn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityInflation1 }
     *     
     */
    public AssetClassCommodityInflation1 getInfltn() {
        return infltn;
    }

    /**
     * Legt den Wert der infltn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityInflation1 }
     *     
     */
    public void setInfltn(AssetClassCommodityInflation1 value) {
        this.infltn = value;
    }

    /**
     * Ruft den Wert der multiCmmdtyExtc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMultiCommodityExotic1 }
     *     
     */
    public AssetClassCommodityMultiCommodityExotic1 getMultiCmmdtyExtc() {
        return multiCmmdtyExtc;
    }

    /**
     * Legt den Wert der multiCmmdtyExtc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMultiCommodityExotic1 }
     *     
     */
    public void setMultiCmmdtyExtc(AssetClassCommodityMultiCommodityExotic1 value) {
        this.multiCmmdtyExtc = value;
    }

    /**
     * Ruft den Wert der offclEcnmcSttstcs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOfficialEconomicStatistics1 }
     *     
     */
    public AssetClassCommodityOfficialEconomicStatistics1 getOffclEcnmcSttstcs() {
        return offclEcnmcSttstcs;
    }

    /**
     * Legt den Wert der offclEcnmcSttstcs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOfficialEconomicStatistics1 }
     *     
     */
    public void setOffclEcnmcSttstcs(AssetClassCommodityOfficialEconomicStatistics1 value) {
        this.offclEcnmcSttstcs = value;
    }

    /**
     * Ruft den Wert der othr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOther1 }
     *     
     */
    public AssetClassCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Legt den Wert der othr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOther1 }
     *     
     */
    public void setOthr(AssetClassCommodityOther1 value) {
        this.othr = value;
    }

}
