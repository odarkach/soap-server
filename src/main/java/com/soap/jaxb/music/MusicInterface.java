package com.soap.jaxb.music;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public interface MusicInterface {

    @WebMethod
    @WebResult(name = "Music")
    Music getMusic (int id);
}


