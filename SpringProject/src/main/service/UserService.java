package main.service;

import main.domain.User;
import main.repository.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "userService")
public class UserService implements Service {

    private Storage userStorage;

    @Autowired
    public UserService(Storage storage) {
        this.userStorage = storage;
    }

    @Override
    public void addUser(User user) {
        userStorage.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userStorage.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userStorage.getUserById(id);
    }

    @Override
    public void delete(int id) {
        userStorage.delete(id);
    }
}
