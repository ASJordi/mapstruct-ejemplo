package dev.asjordi;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    UserDTO userToUserDTO(User user);
    UserRecord userToUserRecord(User user);
    User userDTOToUser(UserDTO userDTO);
    User userRecordToUser(UserRecord userRecord);
}
