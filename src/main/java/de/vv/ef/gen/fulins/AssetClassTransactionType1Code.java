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
 * <p>Java-Klasse für AssetClassTransactionType1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AssetClassTransactionType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRCK"/>
 *     &lt;enumeration value="DIFF"/>
 *     &lt;enumeration value="FUTR"/>
 *     &lt;enumeration value="MINI"/>
 *     &lt;enumeration value="OPTN"/>
 *     &lt;enumeration value="OTCT"/>
 *     &lt;enumeration value="ORIT"/>
 *     &lt;enumeration value="SWAP"/>
 *     &lt;enumeration value="TAPO"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssetClassTransactionType1Code")
@XmlEnum
public enum AssetClassTransactionType1Code {

    CRCK,
    DIFF,
    FUTR,
    MINI,
    OPTN,
    OTCT,
    ORIT,
    SWAP,
    TAPO,
    OTHR;

    public String value() {
        return name();
    }

    public static AssetClassTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
