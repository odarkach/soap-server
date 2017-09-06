package com.soap.endpoint;

import com.soap.jaxb.music.MusicImpl;
import javax.xml.ws.Endpoint;

public class MusicPublisher {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9990/api/ws/music", new MusicImpl());

        System.out.println("Server is published!");
    }
}
