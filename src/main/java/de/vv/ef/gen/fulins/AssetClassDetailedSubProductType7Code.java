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
 * <p>Java-Klasse für AssetClassDetailedSubProductType7Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType7Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BAKK"/>
 *     &lt;enumeration value="BDSL"/>
 *     &lt;enumeration value="BRNT"/>
 *     &lt;enumeration value="BRNX"/>
 *     &lt;enumeration value="CNDA"/>
 *     &lt;enumeration value="COND"/>
 *     &lt;enumeration value="DSEL"/>
 *     &lt;enumeration value="DUBA"/>
 *     &lt;enumeration value="ESPO"/>
 *     &lt;enumeration value="ETHA"/>
 *     &lt;enumeration value="FUEL"/>
 *     &lt;enumeration value="FOIL"/>
 *     &lt;enumeration value="GOIL"/>
 *     &lt;enumeration value="GSLN"/>
 *     &lt;enumeration value="HEAT"/>
 *     &lt;enumeration value="JTFL"/>
 *     &lt;enumeration value="KERO"/>
 *     &lt;enumeration value="LLSO"/>
 *     &lt;enumeration value="MARS"/>
 *     &lt;enumeration value="NAPH"/>
 *     &lt;enumeration value="NGLO"/>
 *     &lt;enumeration value="TAPI"/>
 *     &lt;enumeration value="WTIO"/>
 *     &lt;enumeration value="URAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType7Code")
@XmlEnum
public enum AssetClassDetailedSubProductType7Code {

    BAKK,
    BDSL,
    BRNT,
    BRNX,
    CNDA,
    COND,
    DSEL,
    DUBA,
    ESPO,
    ETHA,
    FUEL,
    FOIL,
    GOIL,
    GSLN,
    HEAT,
    JTFL,
    KERO,
    LLSO,
    MARS,
    NAPH,
    NGLO,
    TAPI,
    WTIO,
    URAL;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType7Code fromValue(String v) {
        return valueOf(v);
    }

}
