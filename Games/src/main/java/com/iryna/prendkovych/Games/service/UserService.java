package com.iryna.prendkovych.Games.service;

import com.iryna.prendkovych.Games.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(UserDTO userDTO);
    void deleteUserById(Long id);
}