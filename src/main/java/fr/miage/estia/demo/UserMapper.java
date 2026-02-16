package fr.miage.estia.demo;

import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface UserMapper {
    User userDTOToUserEntity(UserDTO userDTO);
    UserDTO userEntityToUserDTO(User user);
    List<User> userDTOListToUserEntityList(List<UserDTO> userDTOList);
    List<UserDTO> userEntityListToUserDTOList(List<User> userList);
}
