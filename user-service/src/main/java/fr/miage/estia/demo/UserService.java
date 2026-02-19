package fr.miage.estia.demo;

import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    // POST, PUT, PATCH
    UserDTO saveUser(UserDTO userDTO);
    void deleteUserById(Long id);
}
