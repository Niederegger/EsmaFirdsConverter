//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.10.25 um 01:29:30 PM CEST 
//


package de.vv.ef.gen.bah;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vv.ef.gen.bah package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AppHdr_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "AppHdr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vv.ef.gen.bah
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessApplicationHeaderV01 }
     * 
     */
    public BusinessApplicationHeaderV01 createBusinessApplicationHeaderV01() {
        return new BusinessApplicationHeaderV01();
    }

    /**
     * Create an instance of {@link OrganisationIdentificationSchemeName1Choice }
     * 
     */
    public OrganisationIdentificationSchemeName1Choice createOrganisationIdentificationSchemeName1Choice() {
        return new OrganisationIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification421 }
     * 
     */
    public PartyIdentification421 createPartyIdentification421() {
        return new PartyIdentification421();
    }

    /**
     * Create an instance of {@link Party9Choice1 }
     * 
     */
    public Party9Choice1 createParty9Choice1() {
        return new Party9Choice1();
    }

    /**
     * Create an instance of {@link GenericOrganisationIdentification11 }
     * 
     */
    public GenericOrganisationIdentification11 createGenericOrganisationIdentification11() {
        return new GenericOrganisationIdentification11();
    }

    /**
     * Create an instance of {@link BusinessApplicationHeader11 }
     * 
     */
    public BusinessApplicationHeader11 createBusinessApplicationHeader11() {
        return new BusinessApplicationHeader11();
    }

    /**
     * Create an instance of {@link OrganisationIdentification71 }
     * 
     */
    public OrganisationIdentification71 createOrganisationIdentification71() {
        return new OrganisationIdentification71();
    }

    /**
     * Create an instance of {@link Party10Choice1 }
     * 
     */
    public Party10Choice1 createParty10Choice1() {
        return new Party10Choice1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessApplicationHeaderV01 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "AppHdr")
    public JAXBElement<BusinessApplicationHeaderV01> createAppHdr(BusinessApplicationHeaderV01 value) {
        return new JAXBElement<BusinessApplicationHeaderV01>(_AppHdr_QNAME, BusinessApplicationHeaderV01 .class, null, value);
    }

}
