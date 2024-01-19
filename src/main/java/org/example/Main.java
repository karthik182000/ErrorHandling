package org.example;

import org.example.UserController;
import org.example.UserRepository;
import org.example.UserService;

public class Main {
    public static void main(String[] args) {
        // Create instances of UserRepository, UserService, and UserController
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);
        UserController userController = new UserController(userService);

        // Example with a valid user ID
        userController.getUserDetails(1L);

        // Example with an invalid user ID (user not found)
        userController.getUserDetails(5L);
    }
}
