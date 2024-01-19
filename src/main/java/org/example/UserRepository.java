package org.example;

public class UserRepository {
    public User findById(Long userId) {
        if (userId.equals(1L)) {
            return new User(1L, "karthik", "vajjala.karthik@gmail.com");
        } else {
            throw new UserNotFoundException("User not found with ID: " + userId);
        }
    }
}

