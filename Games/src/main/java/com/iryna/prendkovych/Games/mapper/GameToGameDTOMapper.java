package com.iryna.prendkovych.Games.mapper;

import com.iryna.prendkovych.Games.dto.GameDTO;
import com.iryna.prendkovych.Games.entity.Game;
import org.springframework.stereotype.Component;

@Component
public class GameToGameDTOMapper {
    public Game toEntity(final GameDTO gameDTO){
        final Game game = new Game();

        game.setId(gameDTO.getId());
        game.setGameName(gameDTO.getGameName());
        game.setGenre(gameDTO.getGenre());
        game.setDevelopers(gameDTO.getDevelopers());
        game.setPublishers(gameDTO.getPublishers());
        game.setCountComments(gameDTO.getCountComments());

        return game;
    }

    public GameDTO toDTO(final Game game){
        final GameDTO gameDTO = new GameDTO();

        gameDTO.setId(game.getId());
        gameDTO.setGameName(game.getGameName());
        gameDTO.setGenre(game.getGenre());
        gameDTO.setDevelopers(game.getDevelopers());
        gameDTO.setPublishers(game.getPublishers());
        gameDTO.setCountComments(game.getCountComments());

        return gameDTO;
    }

}
