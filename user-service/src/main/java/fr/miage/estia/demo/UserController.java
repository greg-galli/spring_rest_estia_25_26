package fr.miage.estia.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // GET & POST sur la collection
    // GET / PUT / PATCH / DELETE sur le singleton

    @GetMapping("/api/users")
    public List<UserDTO> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("/api/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO createUser(@RequestBody UserDTO userDTO)
    {
        return userService.saveUser(userDTO);
    }

    @GetMapping("/api/user/{id}")
    public UserDTO getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }

    @DeleteMapping("/api/user/{id}")
    public void deleteUserById(@PathVariable Long id)
    {
        userService.deleteUserById(id);
    }

    @PutMapping("/api/user/{id}")
    public UserDTO updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO)
    {
        // Logique d'update de l'entité
        return null;
    }

    @PatchMapping("/api/user/{id}")
    public UserDTO updatePartialUser(@PathVariable Long id, @RequestBody UserDTO userDTO)
    {
        // Logique d'update de l'entité
        return null;
    }
}
