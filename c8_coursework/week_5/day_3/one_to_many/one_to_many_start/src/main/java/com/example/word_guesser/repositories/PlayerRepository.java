package com.example.word_guesser.repositories;

import com.example.word_guesser.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
