
package net.codejava.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.codejava.test package. 
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

    private final static QName _GetPrice_QNAME = new QName("http://codejava.net/", "getPrice");
    private final static QName _SellResponse_QNAME = new QName("http://codejava.net/", "sellResponse");
    private final static QName _GetName_QNAME = new QName("http://codejava.net/", "getName");
    private final static QName _GetNameResponse_QNAME = new QName("http://codejava.net/", "getNameResponse");
    private final static QName _GetPriceResponse_QNAME = new QName("http://codejava.net/", "getPriceResponse");
    private final static QName _Sell_QNAME = new QName("http://codejava.net/", "sell");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.codejava.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SellResponse }
     * 
     */
    public SellResponse createSellResponse() {
        return new SellResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetPriceResponse }
     * 
     */
    public GetPriceResponse createGetPriceResponse() {
        return new GetPriceResponse();
    }

    /**
     * Create an instance of {@link Sell }
     * 
     */
    public Sell createSell() {
        return new Sell();
    }

    /**
     * Create an instance of {@link GetPrice }
     * 
     */
    public GetPrice createGetPrice() {
        return new GetPrice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codejava.net/", name = "getPrice")
    public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
        return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SellResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codejava.net/", name = "sellResponse")
    public JAXBElement<SellResponse> createSellResponse(SellResponse value) {
        return new JAXBElement<SellResponse>(_SellResponse_QNAME, SellResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codejava.net/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codejava.net/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codejava.net/", name = "getPriceResponse")
    public JAXBElement<GetPriceResponse> createGetPriceResponse(GetPriceResponse value) {
        return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME, GetPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sell }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://codejava.net/", name = "sell")
    public JAXBElement<Sell> createSell(Sell value) {
        return new JAXBElement<Sell>(_Sell_QNAME, Sell.class, null, value);
    }

}
