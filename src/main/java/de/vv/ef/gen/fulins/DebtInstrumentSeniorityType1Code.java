//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:24:58 PM CEST 
//


package de.vv.ef.gen.fulins;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

import de.vv.ef.consumer.L2M;


/**
 * <p>Java-Klasse für DebtInstrumentSeniorityType1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DebtInstrumentSeniorityType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SBOD"/>
 *     &lt;enumeration value="SNDB"/>
 *     &lt;enumeration value="MZZD"/>
 *     &lt;enumeration value="JUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DebtInstrumentSeniorityType1Code")
@XmlEnum
public enum DebtInstrumentSeniorityType1Code {

    SBOD,
    SNDB,
    MZZD,
    JUND;

    public String value() {
        return name();
    }

    public static DebtInstrumentSeniorityType1Code fromValue(String v) {
        return valueOf(v);
    }

}
