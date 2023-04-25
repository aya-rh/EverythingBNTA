package com.example.word_guesser.controllers;

import com.example.word_guesser.models.Game;
import com.example.word_guesser.models.Guess;
import com.example.word_guesser.models.LetterList;
import com.example.word_guesser.models.Reply;
import com.example.word_guesser.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController //makes it so that we don't have to instantiate classes in main - makes the rest of classes 'beans', spring does it for you
@RequestMapping(value = "/games")
public class GameController {

    private Game game;
    private String currentWord;
    private ArrayList<String> guessedLetters;

    @Autowired // need to include for services
    private GameService gameService;

    @PostMapping
    public ResponseEntity<Reply> newGame() {
        Reply reply = gameService.startNewGame();
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Reply> getGameStatus() {
        Reply reply = gameService.getGameStatus();
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @PatchMapping
    public ResponseEntity<Reply> handleGuess(@RequestBody Guess guess) {
        Reply reply = gameService.processGuess(guess);
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

    @GetMapping(value = "/guessed")
    public ResponseEntity<LetterList> checkGuesses() {
        LetterList letters = new LetterList(this.guessedLetters);
        return new ResponseEntity<>(letters, HttpStatus.OK);
    }
}
