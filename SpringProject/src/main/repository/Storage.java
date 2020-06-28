package main.repository;

import main.domain.User;

import java.util.List;

public interface Storage {

    void add(User user);
    List<User> getAllUsers();
    User getUserById(int id);
    void delete(int id);

}
