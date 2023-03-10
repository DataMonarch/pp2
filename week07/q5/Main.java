import java.util.Arrays;
import java.util.List;

// class InvalidRolesArgumentException extends Exception {
//     public InvalidRolesArgumentException(String message) {
//         super(message);
//     }
// }

// class InvalidUsernameException extends Exception {
//     public InvalidUsernameException(String message) {
//         super(message);
//     }
// }

// class InvalidPasswordException extends Exception {
//     public InvalidPasswordException(String message) {
//         super(message);
//     }
// }

public class Main {
    public static void main(String[] args) {
        
        String username = "johndoe";
        String password = "password123";
        List<String> roles = Arrays.asList("admin", "user");

        try {
            createUser(username, password, roles);
            System.out.println("Valid input: User created successfully");
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.err.println("Valid input: " + e.getMessage());
        }

        // Test invalid username input
        username = "1johndoe";
        try {
            createUser(username, password, roles);
            System.err.println("Invalid username input: Expected InvalidUsernameException, but no exception was thrown");
        } catch (InvalidUsernameException e) {
            System.out.println("Invalid username input: " + e.getMessage());
        } catch (InvalidPasswordException e) {
            System.err.println("Invalid username input: Unexpected InvalidPasswordException thrown");
        }

        // Test invalid password input
        username = "johndoe";
        password = "pass";
        try {
            createUser(username, password, roles);
            System.err.println("Invalid password input: Expected InvalidPasswordException, but no exception was thrown");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password input: " + e.getMessage());
        } catch (InvalidUsernameException e) {
            System.err.println("Invalid password input: Unexpected InvalidUsernameException thrown");
        }
        
        // Test null roles input
        username = "johndoe";
        password = "password123";
        roles = null;
        try {
            createUser(username, password, roles);
            System.err.println("Null roles input: Expected IllegalArgumentException, but no exception was thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Null roles input: " + e.getMessage());
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.err.println("Null roles input: Unexpected exception thrown");
        }

        // Test empty roles input
        username = "johndoe";
        password = "password123";
        roles = Arrays.asList();
        try {
            createUser(username, password, roles);
            System.err.println("Empty roles input: Expected IllegalArgumentException, but no exception was thrown");
        } catch (IllegalArgumentException e) {
            System.out.println("Empty roles input: " + e.getMessage());
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.err.println("Empty roles input: Unexpected exception thrown");
        }

    }


    public static void createUser(String username, String password, List<String> roles) 
    throws InvalidUsernameException, InvalidPasswordException {
        if (username == null || username.length() < 3)
            throw new InvalidUsernameException("Username cannot contain less than three symbols");

        if (!Character.isAlphabetic(username.charAt(0)))
            throw new InvalidUsernameException("Username cannot start with non-alphabetical character");
            
        if (password.length() < 8)
            throw new InvalidPasswordException("The length of the password cannot be less than 8.");

        if (roles == null || roles.isEmpty())
            throw new IllegalArgumentException("Roles assigned to the usercannot be empty");

        User user = new User(username, password, roles);
    }
 
}
