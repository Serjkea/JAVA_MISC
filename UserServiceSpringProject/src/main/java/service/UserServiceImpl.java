package main.java.service;

import main.java.annotations.ThisClassMethods;
import main.java.annotations.ThisMethods;
import main.java.model.User;
import main.java.repository.UserDAO;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ThisClassMethods
public class UserServiceImpl implements UserService, BeanPostProcessor {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @ThisMethods
    @Override
    public void addUser(User user) {
        userDAO.add(user);
    }

    @Override
    public User getUserByName(String name) {
        return userDAO.getByName(name);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAll();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("POST PROCESS BEFORE INITIALIZATION");
        return null;
    }
}
