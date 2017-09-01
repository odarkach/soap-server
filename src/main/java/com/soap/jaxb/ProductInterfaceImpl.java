package com.soap.jaxb;

import javax.jws.WebService;

@WebService(name = "Product", portName = "ProductPort", serviceName = "ProductService", endpointInterface = "com.soap.jaxb.ProductInterface")
public class ProductInterfaceImpl implements ProductInterface {
    @Override
    public Product getProduct() {
        Product product = new Product();
        product.setName("Sony");
        product.setPrice("10000");
        product.setProduct("New");
        return product;
    }
}
