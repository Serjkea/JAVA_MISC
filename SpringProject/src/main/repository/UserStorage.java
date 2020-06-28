package main.repository;

import main.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value ="userStorage")
public class UserStorage implements Storage {

    private List<User> storage = new ArrayList<User>();

    @Override
    public void add(User user) {
        storage.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return storage;
    }

    @Override
    public User getUserById(int id) {
        User temp = storage.get(id);
        return temp;
    }

    public void delete(int id) {
        for(User user:storage) {
            if (user.getId() == id) storage.remove(user);
        }
    }
}
