package main.java.repository;

import main.java.model.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO, BeanPostProcessor {

    private List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public User getByName(String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("POST PROCESS AFTER INITIALIZATION");
        users.add(new User("INIT", 99));
        return null;
    }
}
