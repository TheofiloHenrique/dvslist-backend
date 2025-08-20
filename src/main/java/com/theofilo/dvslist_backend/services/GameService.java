package com.theofilo.dvslist_backend.services;

import com.theofilo.dvslist_backend.dto.GameMinDTO;
import com.theofilo.dvslist_backend.entities.Game;
import com.theofilo.dvslist_backend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
