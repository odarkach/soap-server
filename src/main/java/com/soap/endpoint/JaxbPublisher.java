package com.soap.endpoint;

import com.soap.jaxb.ProductInterfaceImpl;

import javax.xml.ws.Endpoint;

public class JaxbPublisher {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9999/ws/product", new ProductInterfaceImpl());

        System.out.println("Server is published!");
    }
}
