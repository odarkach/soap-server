package com.soap.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return name;
    }
}
