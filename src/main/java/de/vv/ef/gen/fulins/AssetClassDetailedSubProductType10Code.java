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
 * <p>Java-Klasse für AssetClassDetailedSubProductType10Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType10Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALUM"/>
 *     &lt;enumeration value="ALUA"/>
 *     &lt;enumeration value="CBLT"/>
 *     &lt;enumeration value="COPR"/>
 *     &lt;enumeration value="IRON"/>
 *     &lt;enumeration value="MOLY"/>
 *     &lt;enumeration value="NASC"/>
 *     &lt;enumeration value="NICK"/>
 *     &lt;enumeration value="STEL"/>
 *     &lt;enumeration value="TINN"/>
 *     &lt;enumeration value="ZINC"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="LEAD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType10Code")
@XmlEnum
public enum AssetClassDetailedSubProductType10Code {

    ALUM,
    ALUA,
    CBLT,
    COPR,
    IRON,
    MOLY,
    NASC,
    NICK,
    STEL,
    TINN,
    ZINC,
    OTHR,
    LEAD;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType10Code fromValue(String v) {
        return valueOf(v);
    }

}
