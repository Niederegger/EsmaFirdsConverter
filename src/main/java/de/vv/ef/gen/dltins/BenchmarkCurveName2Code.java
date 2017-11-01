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
 * <p>Java-Klasse für BenchmarkCurveName2Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="BenchmarkCurveName2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WIBO"/>
 *     &lt;enumeration value="TREA"/>
 *     &lt;enumeration value="TIBO"/>
 *     &lt;enumeration value="TLBO"/>
 *     &lt;enumeration value="SWAP"/>
 *     &lt;enumeration value="STBO"/>
 *     &lt;enumeration value="PRBO"/>
 *     &lt;enumeration value="PFAN"/>
 *     &lt;enumeration value="NIBO"/>
 *     &lt;enumeration value="MAAA"/>
 *     &lt;enumeration value="MOSP"/>
 *     &lt;enumeration value="LIBO"/>
 *     &lt;enumeration value="LIBI"/>
 *     &lt;enumeration value="JIBA"/>
 *     &lt;enumeration value="ISDA"/>
 *     &lt;enumeration value="GCFR"/>
 *     &lt;enumeration value="FUSW"/>
 *     &lt;enumeration value="EUCH"/>
 *     &lt;enumeration value="EUUS"/>
 *     &lt;enumeration value="EURI"/>
 *     &lt;enumeration value="EONS"/>
 *     &lt;enumeration value="EONA"/>
 *     &lt;enumeration value="CIBO"/>
 *     &lt;enumeration value="CDOR"/>
 *     &lt;enumeration value="BUBO"/>
 *     &lt;enumeration value="BBSW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName2Code")
@XmlEnum
public enum BenchmarkCurveName2Code {

    WIBO,
    TREA,
    TIBO,
    TLBO,
    SWAP,
    STBO,
    PRBO,
    PFAN,
    NIBO,
    MAAA,
    MOSP,
    LIBO,
    LIBI,
    JIBA,
    ISDA,
    GCFR,
    FUSW,
    EUCH,
    EUUS,
    EURI,
    EONS,
    EONA,
    CIBO,
    CDOR,
    BUBO,
    BBSW;

    public String value() {
        return name();
    }

    public static BenchmarkCurveName2Code fromValue(String v) {
        return valueOf(v);
    }

}
