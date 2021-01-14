
package net.codejava.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://codejava.net/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Hello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://codejava.net/Hello/bonjourRequest", output = "http://codejava.net/Hello/bonjourResponse")
    public String bonjour(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
