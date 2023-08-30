package com.project.service;

import com.project.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    Optional<User> getUserById(String userId);

    List<User> getAllUsers();

    User updateUser(String userId, User updatedUser);

    void deleteUser(String userId);

}