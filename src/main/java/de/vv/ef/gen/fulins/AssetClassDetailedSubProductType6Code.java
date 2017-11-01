//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:24:58 PM CEST 
//


package de.vv.ef.gen.fulins;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AssetClassDetailedSubProductType6Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType6Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GASP"/>
 *     &lt;enumeration value="LNGG"/>
 *     &lt;enumeration value="NCGG"/>
 *     &lt;enumeration value="TTFG"/>
 *     &lt;enumeration value="NBPG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType6Code")
@XmlEnum
public enum AssetClassDetailedSubProductType6Code {

    GASP,
    LNGG,
    NCGG,
    TTFG,
    NBPG;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType6Code fromValue(String v) {
        return valueOf(v);
    }

}
