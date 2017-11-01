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
 * <p>Java-Klasse für AssetClassCommodityPaper1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AssetClassCommodityPaper1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CntnrBrd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}PaperCommodityContainerBoard1"/>
 *         &lt;element name="Nwsprnt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}PaperCommodityNewsprint1"/>
 *         &lt;element name="Pulp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}PaperCommodityPulp1"/>
 *         &lt;element name="RcvrdPpr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}PaperCommodityRecoveredPaper1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityPaper1Choice", propOrder = {
    "cntnrBrd",
    "nwsprnt",
    "pulp",
    "rcvrdPpr"
})
public class AssetClassCommodityPaper1Choice {

    @XmlElement(name = "CntnrBrd")
    protected PaperCommodityContainerBoard1 cntnrBrd;
    @XmlElement(name = "Nwsprnt")
    protected PaperCommodityNewsprint1 nwsprnt;
    @XmlElement(name = "Pulp")
    protected PaperCommodityPulp1 pulp;
    @XmlElement(name = "RcvrdPpr")
    protected PaperCommodityRecoveredPaper1 rcvrdPpr;

    public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(cntnrBrd!=null)
		l2m.append(cntnrBrd.getData(s+".CntnrBrd"));
    	if(nwsprnt!=null)
		l2m.append(nwsprnt.getData(s+".Nwsprnt"));
    	if(pulp!=null)
		l2m.append(pulp.getData(s+".Pulp"));
    	if(rcvrdPpr!=null)
		l2m.append(rcvrdPpr.getData(s+".RcvrdPpr"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der cntnrBrd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityContainerBoard1 }
     *     
     */
    public PaperCommodityContainerBoard1 getCntnrBrd() {
        return cntnrBrd;
    }

    /**
     * Legt den Wert der cntnrBrd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityContainerBoard1 }
     *     
     */
    public void setCntnrBrd(PaperCommodityContainerBoard1 value) {
        this.cntnrBrd = value;
    }

    /**
     * Ruft den Wert der nwsprnt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityNewsprint1 }
     *     
     */
    public PaperCommodityNewsprint1 getNwsprnt() {
        return nwsprnt;
    }

    /**
     * Legt den Wert der nwsprnt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityNewsprint1 }
     *     
     */
    public void setNwsprnt(PaperCommodityNewsprint1 value) {
        this.nwsprnt = value;
    }

    /**
     * Ruft den Wert der pulp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityPulp1 }
     *     
     */
    public PaperCommodityPulp1 getPulp() {
        return pulp;
    }

    /**
     * Legt den Wert der pulp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityPulp1 }
     *     
     */
    public void setPulp(PaperCommodityPulp1 value) {
        this.pulp = value;
    }

    /**
     * Ruft den Wert der rcvrdPpr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityRecoveredPaper1 }
     *     
     */
    public PaperCommodityRecoveredPaper1 getRcvrdPpr() {
        return rcvrdPpr;
    }

    /**
     * Legt den Wert der rcvrdPpr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityRecoveredPaper1 }
     *     
     */
    public void setRcvrdPpr(PaperCommodityRecoveredPaper1 value) {
        this.rcvrdPpr = value;
    }

}
