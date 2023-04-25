package com.bnta.word_guesser.models;

public class Guess {
   // also POJO
    private String letter;

    public Guess(String letter) {
        this.letter = letter;
    }

    // default constructor
    public Guess(){}

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
