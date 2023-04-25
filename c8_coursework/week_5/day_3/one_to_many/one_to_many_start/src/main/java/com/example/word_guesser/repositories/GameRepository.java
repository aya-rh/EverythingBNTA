package com.example.word_guesser.repositories;

import com.example.word_guesser.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
