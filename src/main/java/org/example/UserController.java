package org.example;


public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void getUserDetails(Long userId) {
        try {
            User user = userService.getUserById(userId);
            System.out.println("User details: " + user);
        } catch (UserNotFoundException e) {
            System.out.println("User not found. Error: " + e.getMessage());
        }
    }
}

