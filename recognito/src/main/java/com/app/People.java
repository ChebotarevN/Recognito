package com.app;

import java.io.File;

public class People {
    private String name;
    private File audio;

    public People(String name, File audio) {
        this.name = name;
        this.audio = audio;
    }

    public String getName() {
        return name;
    }

    public File getAudio() {
        return audio;
    }
}