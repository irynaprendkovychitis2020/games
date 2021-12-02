package com.iryna.prendkovych.Games.resource;

import com.iryna.prendkovych.Games.service.UserService;
import com.iryna.prendkovych.Games.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public UserDTO getUserById(final @PathVariable Long id){return userService.getUserById(id);}


    //@GetMapping("/users")
    //public List<UserDTO> getAllUsers(){return userService.getAllUsers();}
    @GetMapping("/users")
    public UserDTO getAllUsers(){return new UserDTO(null,null,null,null,null,1,null);}

    @PostMapping("/users")
    public UserDTO createUser(final /*@Valid*/ @RequestBody UserDTO userDTO){
        return userService.createUser(userDTO);
    }

    @PutMapping("/users")
    public UserDTO getUserById(final @RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(final @PathVariable Long id){
        userService.deleteUserById(id);
    }


}
