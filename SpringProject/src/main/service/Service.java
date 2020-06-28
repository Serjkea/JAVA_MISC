package main.service;

import main.domain.User;

import java.util.List;

public interface Service {

    void addUser(User user);
    List<User> getAllUsers();
    User getUserById(int id);
    void delete(int id);
}
