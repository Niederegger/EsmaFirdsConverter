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
 * <p>Java-Klasse für AssetClassDetailedSubProductType8Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassDetailedSubProductType8Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CERE"/>
 *     &lt;enumeration value="ERUE"/>
 *     &lt;enumeration value="EUAE"/>
 *     &lt;enumeration value="EUAA"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetClassDetailedSubProductType8Code")
@XmlEnum
public enum AssetClassDetailedSubProductType8Code {

    CERE,
    ERUE,
    EUAE,
    EUAA,
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassDetailedSubProductType8Code fromValue(String v) {
        return valueOf(v);
    }

}
