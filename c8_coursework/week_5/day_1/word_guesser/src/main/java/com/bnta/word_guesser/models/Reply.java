package com.bnta.word_guesser.models;

public class Reply {
// DTO set up
    // used for privacy, for moving around data from parts of the application (layer to layer), might not want to share all data
    // usually either in DTO subpackage or named "ReplyDTO" using this naming convention

    private String wordState;
    private String message;
    private boolean correct;

    public Reply(boolean correct, String wordState, String message){
        this.wordState = wordState;
        this.message = message;
        this.correct = correct;
    }

    public Reply (){}

    public String getWordState() {
        return wordState;
    }

    public void setWordState(String wordState) {
        this.wordState = wordState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
