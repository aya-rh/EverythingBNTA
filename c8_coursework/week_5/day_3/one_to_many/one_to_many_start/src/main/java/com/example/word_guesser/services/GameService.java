package com.example.word_guesser.services;

import com.example.word_guesser.models.*;
import com.example.word_guesser.repositories.GameRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    private String currentWord;
    private ArrayList<String> guessedLetters;

    @Autowired
    WordService wordService;
    @Autowired
    PlayerService playerService;

    public GameService() {

    }

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }

    public Game getGameById(int id){
        return gameRepository.findById(id).get();
    }

    public Reply startNewGame(long playerId){
        String targetWord = wordService.getRandomWord();
        Player player = playerService.getPlayerId(playerId).get();
        Game game = new Game(targetWord,player);
        gameRepository.save(game);
        this.currentWord = Strings.repeat("*", targetWord.length());
        this.guessedLetters = new ArrayList<>();
        return new Reply(
                false,
                this.currentWord,
                "Started new game"
        );
    }


    public LetterList getPreviousGuesses(){
        return new LetterList(this.guessedLetters);
    }

    private boolean checkWinCondition(Game game){
        return game.getWord().equals(this.currentWord);
    }

    private void incrementGuesses(Game game){
        game.setGuesses(game.getGuesses() + 1);
        gameRepository.save(game);
    }

    public Reply processGuess(Guess guess, int id){

        Game game = getGameById(id);


        // Check if game already complete
        if (game.isComplete()){
            return new Reply(
                    false,
                    game.getWord(),
                    String.format("Already finished game %s", game.getId())
            );
        }

        // check if letter has already been guessed
        if (this.guessedLetters.contains(guess.getLetter())) {
            return new Reply(
                    false,
                    this.currentWord,
                    String.format("Already guessed %s", guess.getLetter()));
        }

        // add letter to previous guesses and increment guess count
        this.guessedLetters.add(guess.getLetter());
        incrementGuesses(game);
        gameRepository.save(game);

        // check for incorrect guess
        if (!game.getWord().contains(guess.getLetter())) {
            return new Reply(
                    false,
                    this.currentWord,
                    String.format("%s is not in the word", guess.getLetter()));
        }
        // process correct guess
        String runningResult = game.getWord();

        for (Character letter : game.getWord().toCharArray()) {
            if (!this.guessedLetters.contains(letter.toString())) {
                runningResult = runningResult.replace(letter, '*');
            }
        }

        this.currentWord = runningResult;

        if (checkWinCondition(game)){
            game.setComplete(true);
            gameRepository.save(game);
            return new Reply(
                    true,
                    this.currentWord,
                    "You win!"
            );
        } else {
            return new Reply(
                    true,
                    this.currentWord,
                    String.format("%s is in the word", guess.getLetter()));
        }
    }
}
