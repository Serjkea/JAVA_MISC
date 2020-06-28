package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserStore {

    private List<User> users = new ArrayList<>();

    public UserStore() {}

    public void addUser(User user) {
        if (user != null) {
            users.add(user);
        } else {
            System.out.println("Error: user");
        }
    }

    public User getUserById(int id) {
        return users.get(id);
    }

    public User getUserByName(String name) {
        if (name != null) {
            for(int i = 0; i < users.size(); i++) {
                return (users.get(i).getFirstName().equals(name)) ? users.get(i): null;
            }
        } else {
            System.out.println("Error: user not found");
        }
        return null;
    }


}
