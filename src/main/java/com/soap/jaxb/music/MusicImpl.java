package com.soap.jaxb.music;

import javax.jws.WebService;

@WebService(name = "Music",
        portName = "MusicPort",
        serviceName = "MusicService",
        endpointInterface = "com.soap.jaxb.music.MusicInterface")


public class MusicImpl implements MusicInterface {

    @Override
    public Music getMusic(int id) {
        Music music = new Music();
        if (id == 1) {
            music.setId(id);
            music.setName("Prodigy");
        } else {
            music.setId(id);
            music.setName("Scorpions");
        }
        return music;
    }
}
