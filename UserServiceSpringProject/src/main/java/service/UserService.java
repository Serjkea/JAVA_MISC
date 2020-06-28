package main.java.service;

import main.java.annotations.ThisClassMethods;
import main.java.model.User;
import java.util.List;

public interface UserService {

    public void addUser(User user);
    public User getUserByName(String name);
    public List<User> getAllUsers();

}
