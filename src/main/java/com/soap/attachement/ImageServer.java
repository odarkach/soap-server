package com.soap.attachement;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.awt.*;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface ImageServer{

    //download a image from server
    @WebMethod Image downloadImage(String name);

    //update image to server
    @WebMethod String uploadImage(Image data);

}