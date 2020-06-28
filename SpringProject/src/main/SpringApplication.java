package main;

import main.config.AppConfig;
import main.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import main.service.UserService;

@ComponentScan
public class SpringApplication {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/main/resources/appcontext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.addUser(new User("Bob",35));
        userService.addUser(new User("Mike",23));
        System.out.println(userService.getAllUsers());
    }

}
