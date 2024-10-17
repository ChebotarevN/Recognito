package com.app;

import com.bitsinharmony.recognito.MatchResult;
import com.bitsinharmony.recognito.Recognito;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Identification {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException {
        // Create a new Recognito instance defining the audio sample rate to be used
        Recognito<String> recognito = new Recognito<>(48000.0f);

        People nekit = new People("Никита", new File());
        recognito.createVoicePrint(nekit.getName(), nekit.getAudio());

        //Сравнение
        List<MatchResult<String>> matches = recognito.identify(new File());
        MatchResult<String> match = matches.get(0);
        System.out.println(match.getKey() + " is back !!! " + match.getLikelihoodRatio() + "% positive about it...");
    }
}
