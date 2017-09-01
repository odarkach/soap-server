package com.soap.jaxb;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ProductInterface {

    @WebMethod
    @WebResult(name = "Product")
    Product getProduct();
}
