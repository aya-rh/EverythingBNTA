package com.example.word_guesser.services;

import com.example.word_guesser.models.Game;
import com.example.word_guesser.models.Guess;
import com.example.word_guesser.models.LetterList;
import com.example.word_guesser.models.Reply;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GameService {

    private ArrayList<Game> games;
    private String currentWord;
    private ArrayList<String> guessedLetters;

    @Autowired
    WordService wordService;

    public GameService(){
        this.games = new ArrayList<>();
    }

    public void addGame(Game game){
        this.games.add(game);
    }

    public Reply startNewGame(){
        String targetWord = wordService.getRandomWord();
        Game game = new Game(targetWord);
        addGame(game);
        this.currentWord = Strings.repeat("*", targetWord.length());
        this.guessedLetters = new ArrayList<>();
        return new Reply(
                false,
                this.currentWord,
                "Started a new Game"
        );
    }

    public Reply getGameStatus(){
        if (this.games.isEmpty()) {
            return new Reply(
                    false,
                    this.currentWord,
                    String.format("Game has not been started"));
        } else {
            return new Reply(false, this.currentWord, "Game in progress.");
        }
    }

    public LetterList getPreviousGuesses(){
        return new LetterList(this.guessedLetters);
    }

    public Reply processGuess(Guess guess){
        // Check if game has started
        if (this.games.isEmpty()) {
            return new Reply(
                    false,
                    this.currentWord,
                    String.format("Game has not been started"));
        }

        // check if letter has already been guessed
        if (this.guessedLetters.contains(guess.getLetter())) {
            return new Reply(
                    false,
                    this.currentWord,
                    String.format("Already guessed %s", guess.getLetter()));
        }
        // add letter to previous guesses
        this.guessedLetters.add(guess.getLetter());
        // check for incorrect guess
        if (!games.get(0).getWord().contains(guess.getLetter())) {
            return new Reply(
                    false,
                    this.currentWord,
                    String.format("%s is not in the word", guess.getLetter()));
        }
        // process correct guess
        String runningResult = games.get(0).getWord();

        for (Character letter : games.get(0).getWord().toCharArray()) {
            if (!this.guessedLetters.contains(letter.toString())) {
                runningResult = runningResult.replace(letter, '*');
            }
        }

        this.currentWord = runningResult;

        // return result
        return new Reply(
                true,
                this.currentWord,
                String.format("%s is in the word", guess.getLetter()));
    }

}
