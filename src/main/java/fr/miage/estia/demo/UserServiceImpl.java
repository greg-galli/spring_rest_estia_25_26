package fr.miage.estia.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userMapper.userEntityListToUserDTOList(userList);
    }

    @Override
    public UserDTO getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent())
            return userMapper.userEntityToUserDTO(userOptional.get());
        return null;
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = userMapper.userDTOToUserEntity(userDTO);
        userRepository.save(user);
        return userMapper.userEntityToUserDTO(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
