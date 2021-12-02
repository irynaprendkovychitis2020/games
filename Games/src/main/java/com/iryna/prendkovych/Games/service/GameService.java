package com.iryna.prendkovych.Games.service;

import com.iryna.prendkovych.Games.dto.GameDTO;
import java.util.List;

public interface GameService {
    GameDTO getGameById(Long id);
    List<GameDTO> getAllGame();
    GameDTO createGame(GameDTO gameDTO);
    GameDTO updateGame(GameDTO gameDTO);
    void deleteGameById(Long id);
}