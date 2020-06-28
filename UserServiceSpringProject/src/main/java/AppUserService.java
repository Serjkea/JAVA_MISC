package main.java;

import main.java.model.User;
import main.java.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import main.java.service.UserService;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class AppUserService {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppUserService.class);
        //context.setConfigLocation("main/resources/app-config.xml");
        //context.refresh();
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.addUser(new User("Serg",35));
        userService.addUser(new User("Mike", 43));
        userService.addUser(new User("Bob", 30));
        userService.addUser(new User("Nik", 27));
        userService.getAllUsers().forEach(u-> System.out.println(u.getName() + " " + u.getAge()));
    }
}
