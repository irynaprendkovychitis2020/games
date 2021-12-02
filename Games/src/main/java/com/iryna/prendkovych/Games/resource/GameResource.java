package com.iryna.prendkovych.Games.resource;

import com.iryna.prendkovych.Games.service.UserService;
import com.iryna.prendkovych.Games.dto.GameDTO;
import com.iryna.prendkovych.Games.dto.UserDTO;
import com.iryna.prendkovych.Games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameResource {

    @Autowired
    private GameService gameService;

    @GetMapping("/games/{id}")
    public GameDTO getGameById(final @PathVariable Long id){
        return gameService.getGameById(id);
    }

    @GetMapping("/games")
    public List<GameDTO> getAllGames(){
        return gameService.getAllGame();
    }

    @PostMapping("/games")
    public GameDTO createGame(final /*@Valid*/ @RequestBody GameDTO gameDTO){
        return gameService.createGame(gameDTO);
    }

    @PutMapping("/games")
    public GameDTO getGameById(final @RequestBody GameDTO gameDTO){
        return gameService.updateGame(gameDTO);
    }

    @DeleteMapping("/games/{id}")
    public void deleteGameById(final @PathVariable Long id){
        gameService.deleteGameById(id);
    }


}
