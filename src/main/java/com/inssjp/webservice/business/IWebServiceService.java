
package com.inssjp.webservice.business;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.FieldPosition;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IWebServiceService", targetNamespace = "http://business.webservice.inssjp.com/", wsdlLocation = "https://servicios.pami.org.ar/trazaprodmed.WebService?wsdl")
public class IWebServiceService
    extends Service
{

    private final static URL IWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException IWEBSERVICESERVICE_EXCEPTION;
    private final static QName IWEBSERVICESERVICE_QNAME = new QName("http://business.webservice.inssjp.com/", "IWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
        	url = new File("trazaprodmed.WebService_wsdl.wsdl").toURL();
            url = new URL("https://servicios.pami.org.ar/trazaprodmed.WebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IWEBSERVICESERVICE_WSDL_LOCATION = url;
        IWEBSERVICESERVICE_EXCEPTION = e;
    }

    public IWebServiceService() {
        super(__getWsdlLocation(), IWEBSERVICESERVICE_QNAME);
    }

    public IWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IWEBSERVICESERVICE_QNAME, features);
    }

    public IWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, IWEBSERVICESERVICE_QNAME);
    }

    public IWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IWEBSERVICESERVICE_QNAME, features);
    }

    public IWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IWebService
     */
    @WebEndpoint(name = "IWebServicePort")
    public IWebService getIWebServicePort() {
        return super.getPort(new QName("http://business.webservice.inssjp.com/", "IWebServicePort"), IWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWebService
     */
    @WebEndpoint(name = "IWebServicePort")
    public IWebService getIWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://business.webservice.inssjp.com/", "IWebServicePort"), IWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IWEBSERVICESERVICE_EXCEPTION!= null) {
            throw IWEBSERVICESERVICE_EXCEPTION;
        }
        return IWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
