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
 * <p>Java-Klasse für SecuritiesTransactionPrice4Choice__1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice4Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}SecuritiesTransactionPrice2Choice"/>
 *         &lt;element name="NoPric" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT13auth.017.001.01}SecuritiesTransactionPrice1__1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice4Choice__1", propOrder = {
    "pric",
    "noPric"
})
public class SecuritiesTransactionPrice4Choice1 {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice2Choice pric;
    @XmlElement(name = "NoPric")
    protected SecuritiesTransactionPrice11 noPric;

	public L2M getData(String s) {
		L2M l2m = new L2M();
    	if(pric!=null)
		l2m.append(pric.getData(s+".Pric"));
    	if(noPric!=null)
		l2m.append(noPric.getData(s+".NoPric"));
		return l2m;
	}
    
    /**
     * Ruft den Wert der pric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPric() {
        return pric;
    }

    /**
     * Legt den Wert der pric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice2Choice value) {
        this.pric = value;
    }

    /**
     * Ruft den Wert der noPric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice11 }
     *     
     */
    public SecuritiesTransactionPrice11 getNoPric() {
        return noPric;
    }

    /**
     * Legt den Wert der noPric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice11 }
     *     
     */
    public void setNoPric(SecuritiesTransactionPrice11 value) {
        this.noPric = value;
    }

}
