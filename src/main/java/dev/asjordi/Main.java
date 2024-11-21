package dev.asjordi;

public class Main {
    public static void main(String[] args) {
        // Mapeo de User a UserDTO y UserRecord

        User user = new User(1L, "John Doe", "jonh@gmail.com");
        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);
        UserRecord userRecord = UserMapper.INSTANCE.userToUserRecord(user);

        System.out.println("User: " + user); // User: User(id=1, name=John Doe, email=jonh@gmail.com)
        System.out.println("UserDTO: " + userDTO); // UserDTO: UserDTO(name=John Doe, email=jonh@gmail.com)
        System.out.println("UserRecord: " + userRecord); // UserRecord: UserRecord[name=John Doe, email=jonh@gmail.com]

        // Mapeo inverso de UserDTO a User y UserRecord a User

        User userFromDTO = UserMapper.INSTANCE.userDTOToUser(userDTO);
        User userFromRecord = UserMapper.INSTANCE.userRecordToUser(userRecord);

        System.out.println("User from DTO: " + userFromDTO); // User from DTO: User(id=null, name=John Doe, email=jonh@gmail.com)
        System.out.println("User from Record: " + userFromRecord); // User from Record: User(id=null, name=John Doe, email=jonh@gmail.com)
    }
}
