package com.soap.client;

import com.soap.jaxb.Product;
import com.soap.jaxb.ProductInterface;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class JaxBClient {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:9999/ws/product?wsdl");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://jaxb.soap.com/", "ProductService");

        Service service = Service.create(url, qname);

        ProductInterface product = service.getPort(ProductInterface.class);

        Product product1 =   product.getProduct();

        System.out.println(product1.getName());
    }
}
