package com.soap.attachement;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;
import java.awt.*;
import java.io.File;
import java.io.IOException;

//Service Implementation Bean
@MTOM
@WebService(endpointInterface = "com.soap.attachement.ImageServer")
public class ImageServerImpl implements ImageServer{

    @Override
    public Image downloadImage(String name) {

        try {

            File image = new File("D:\\Java\\Web_Services\\SOAP\\soap\\src\\main\\resources\\" + name);
            return ImageIO.read(image);

        } catch (IOException e) {

            e.printStackTrace();
            return null;

        }
    }

    @Override
    public String uploadImage(Image data) {

        if(data!=null){
            //store somewhere
            return "Upload Successful";
        }

        throw new WebServiceException("Upload Failed!");

    }

}
