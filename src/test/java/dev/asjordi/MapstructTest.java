package dev.asjordi;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapstructTest {

    private static User user;

    @BeforeAll
    public static void setup() {
        user = new User(1L, "John Doe", "jonh@gmail.com");
    }

    @Test
    @DisplayName("Test User to UserDTO")
    void testUserToUserDTO() {
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);
        assertEquals(user.getName(), userDTO.getName());
        assertEquals(user.getEmail(), userDTO.getEmail());
    }

    @Test
    @DisplayName("Test User to UserRecord")
    void testUserToUserRecord() {
        UserRecord userRecord = UserMapper.INSTANCE.userToUserRecord(user);
        assertEquals(user.getName(), userRecord.name());
        assertEquals(user.getEmail(), userRecord.email());
    }

    @Test
    @DisplayName("Test UserDTO to User")
    void testUserDTOToUser() {
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);
        User userFromDTO = UserMapper.INSTANCE.userDTOToUser(userDTO);
        assertEquals(userDTO.getName(), userFromDTO.getName());
        assertEquals(userDTO.getEmail(), userFromDTO.getEmail());
    }

    @Test
    @DisplayName("Test UserRecord to User")
    void testUserRecordToUser() {
        UserRecord userRecord = UserMapper.INSTANCE.userToUserRecord(user);
        User userFromRecord = UserMapper.INSTANCE.userRecordToUser(userRecord);
        assertEquals(userRecord.name(), userFromRecord.getName());
        assertEquals(userRecord.email(), userFromRecord.getEmail());
    }

}
