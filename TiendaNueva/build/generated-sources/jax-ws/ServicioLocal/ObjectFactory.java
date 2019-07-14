
package ServicioLocal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ServicioLocal package. 
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

    private final static QName _AgregarClienteResponse_QNAME = new QName("http://Servicio/", "AgregarClienteResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://Servicio/", "helloResponse");
    private final static QName _AgregarCategoria_QNAME = new QName("http://Servicio/", "AgregarCategoria");
    private final static QName _AgregarCliente_QNAME = new QName("http://Servicio/", "AgregarCliente");
    private final static QName _AgregarCategoriaResponse_QNAME = new QName("http://Servicio/", "AgregarCategoriaResponse");
    private final static QName _Hello_QNAME = new QName("http://Servicio/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ServicioLocal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarClienteResponse }
     * 
     */
    public AgregarClienteResponse createAgregarClienteResponse() {
        return new AgregarClienteResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link AgregarCategoria }
     * 
     */
    public AgregarCategoria createAgregarCategoria() {
        return new AgregarCategoria();
    }

    /**
     * Create an instance of {@link AgregarCliente }
     * 
     */
    public AgregarCliente createAgregarCliente() {
        return new AgregarCliente();
    }

    /**
     * Create an instance of {@link AgregarCategoriaResponse }
     * 
     */
    public AgregarCategoriaResponse createAgregarCategoriaResponse() {
        return new AgregarCategoriaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarClienteResponse")
    public JAXBElement<AgregarClienteResponse> createAgregarClienteResponse(AgregarClienteResponse value) {
        return new JAXBElement<AgregarClienteResponse>(_AgregarClienteResponse_QNAME, AgregarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarCategoria")
    public JAXBElement<AgregarCategoria> createAgregarCategoria(AgregarCategoria value) {
        return new JAXBElement<AgregarCategoria>(_AgregarCategoria_QNAME, AgregarCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarCliente")
    public JAXBElement<AgregarCliente> createAgregarCliente(AgregarCliente value) {
        return new JAXBElement<AgregarCliente>(_AgregarCliente_QNAME, AgregarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "AgregarCategoriaResponse")
    public JAXBElement<AgregarCategoriaResponse> createAgregarCategoriaResponse(AgregarCategoriaResponse value) {
        return new JAXBElement<AgregarCategoriaResponse>(_AgregarCategoriaResponse_QNAME, AgregarCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
