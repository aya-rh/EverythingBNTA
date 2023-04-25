package com.example.word_guesser.services;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class WordService {
    //service classes are the classes we test
    //but we dont test methods in which we have a random number method

    private List<String> words;
    public WordService (){
        this.words = Arrays.asList(
                "hello",
                "goodbye",
                "testing",
                "mystery",
                "games",
                "spring",
                "controller",
                "repository"
        );
    }

    public String getRandomWord(){
        Random random = new Random();
        int randomIndex = random.nextInt(this.words.size());
        return this.words.get(randomIndex);
    }
    //this won't return a word but a random number
}
