package com.example.word_guesser.services;

import com.example.word_guesser.models.Player;
import com.example.word_guesser.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }

    public Optional<Player> getPlayerId(Long id){
        return playerRepository.findById(id);
    }

    public Player savePlayer(Player player){
        playerRepository.save(player);
        return player;
    }
}
