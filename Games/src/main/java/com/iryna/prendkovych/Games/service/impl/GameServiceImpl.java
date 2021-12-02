package com.iryna.prendkovych.Games.service.impl;

import com.iryna.prendkovych.Games.dto.GameDTO;
import com.iryna.prendkovych.Games.exception.ServiceException;
import com.iryna.prendkovych.Games.mapper.GameToGameDTOMapper;
import com.iryna.prendkovych.Games.repository.GameRepository;
import com.iryna.prendkovych.Games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameToGameDTOMapper gameMapper;


    @Override
    public GameDTO getGameById(Long id) {
        return gameMapper.toDTO(gameRepository.getGameById(id));
    }

    @Override
    public List<GameDTO> getAllGame() {
        return gameRepository.getAllGames().stream()
                .map(e -> gameMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public GameDTO createGame(GameDTO gameDTO) {
        if(gameDTO.getId() != null){
            throw new ServiceException(400, "Game shouldn't have an id ", null);
        }

        return gameMapper.toDTO(gameRepository.createGame(gameMapper.toEntity(gameDTO)));
    }

    @Override
    public GameDTO updateGame(GameDTO gameDTO) {
        if(gameDTO.getId() == null){
            throw new ServiceException(400, "Game have an id ", null);
        }

        return gameMapper.toDTO(gameRepository.updateGame(gameMapper.toEntity(gameDTO)));
    }

    @Override
    public void deleteGameById(Long id) {
        gameRepository.deleteGameById(id);
    }

}
