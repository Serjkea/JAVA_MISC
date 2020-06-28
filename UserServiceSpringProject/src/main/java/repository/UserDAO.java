package main.java.repository;

import main.java.model.User;
import java.util.List;

public interface UserDAO {

    public void add(User user);
    public User getByName(String name);
    public List<User> getAll();

}
