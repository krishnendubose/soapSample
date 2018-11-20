
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _HelloMsg_QNAME = new QName("http://test/", "helloMsg");
    private final static QName _HelloMsgResponse_QNAME = new QName("http://test/", "helloMsgResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloMsgResponse }
     * 
     */
    public HelloMsgResponse createHelloMsgResponse() {
        return new HelloMsgResponse();
    }

    /**
     * Create an instance of {@link HelloMsg }
     * 
     */
    public HelloMsg createHelloMsg() {
        return new HelloMsg();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "helloMsg")
    public JAXBElement<HelloMsg> createHelloMsg(HelloMsg value) {
        return new JAXBElement<HelloMsg>(_HelloMsg_QNAME, HelloMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://test/", name = "helloMsgResponse")
    public JAXBElement<HelloMsgResponse> createHelloMsgResponse(HelloMsgResponse value) {
        return new JAXBElement<HelloMsgResponse>(_HelloMsgResponse_QNAME, HelloMsgResponse.class, null, value);
    }

}
