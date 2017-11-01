//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.11.01 um 01:39:58 PM CET 
//


package de.vv.ef.gen.dltins;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AssetClassDetailedSubProductType1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FWHT"/>
 *     &lt;enumeration value="SOYB"/>
 *     &lt;enumeration value="RPSD"/>
 *     &lt;enumeration value="OTHR"/>
 *     &lt;enumeration value="CORN"/>
 *     &lt;enumeration value="RICE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType1Code")
@XmlEnum
public enum AssetClassDetailedSubProductType1Code {

    FWHT,
    SOYB,
    RPSD,
    OTHR,
    CORN,
    RICE;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
