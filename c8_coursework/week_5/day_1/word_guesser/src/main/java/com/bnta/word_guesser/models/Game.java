package com.bnta.word_guesser.models;

public class Game {
// POJO set upp
    private String word;
    private int guesses;
    private boolean complete;

    public Game(String word) {
        this.word = word;
        this.guesses = 0;
        this.complete = false;
    }
    //always add a default (empty) constructor IF you have created a parameterised constructor, as above
    // and always add getters and setters, as below
    public Game(){}


    public String getWord(){
        return word;
    }
    public void setWord() {
        this.word = word;
    }

    public int getGuesses() {
        return guesses;
    }

    public void setGuesses(int guesses) {
        this.guesses = guesses;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

}
