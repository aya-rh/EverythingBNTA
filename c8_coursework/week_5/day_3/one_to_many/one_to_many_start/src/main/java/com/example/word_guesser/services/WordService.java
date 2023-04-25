package com.example.word_guesser.services;

import com.example.word_guesser.repositories.WordList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WordService {

    @Autowired
    WordList wordList;

    public String getRandomWord(){
        return wordList.getRandomWord();
    }

}
