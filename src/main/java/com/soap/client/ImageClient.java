package com.soap.client;

import com.soap.attachement.ImageServer;

import javax.swing.*;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.awt.*;
import java.net.URL;

public class ImageClient {

    public static void main(String[] args) throws Exception {

        URL url = new URL("http://localhost:9999/ws/image?wsdl");
        QName qname = new QName("http://attachement.soap.com/", "ImageServerImplService");

        Service service = Service.create(url, qname);
        ImageServer imageServer = service.getPort(ImageServer.class);

        /************  test download  ***************/
        Image image = imageServer.downloadImage("soap.png");

        //display it in frame
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        JLabel label = new JLabel(new ImageIcon(image));
        frame.add(label);
        frame.setVisible(true);

        System.out.println("imageServer.downloadImage() : Download Successful!");

    }

}