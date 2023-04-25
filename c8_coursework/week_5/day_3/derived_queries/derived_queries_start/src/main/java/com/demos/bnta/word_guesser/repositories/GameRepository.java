package com.demos.bnta.word_guesser.repositories;

import com.demos.bnta.word_guesser.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer> {

//    @Query("SELECT * FROM games WHERE complete = t")
//    List<Game> getAllCompletedGames();
    // could do this

    //but can also write something that does exactly the same thing called a
    // DERIVED QUERY
    List<Game> findByCompleteTrue();
    List<Game> findByWord(String word);

    List<Game> findByPlayerId(long id);

    // have to update methods in GameService, and Request param + if statement in GameController



}
