package ru.skprojects.springbootproject.service;

import ru.skprojects.springbootproject.domain.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    User getUserById(Long id);
    User getUserByName(String name);
    void deleteUser(User user);
    void deleteUserById(Long id);
    List<User> getAllUsers();
    void deleteAllUsers();

}
