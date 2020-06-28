package main.java;

import main.java.config.CallConfig;
import main.java.model.Message;
import main.java.repository.MessageStore;
import main.java.repository.MessageStoreImpl;
import main.java.service.CallService;
import main.java.service.CallServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@ComponentScan(basePackages = "main.java")
public class CallApplicationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CallConfig.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
//        context.setConfigLocation("resources/app-context.xml");
//        context.refresh();

        CallService callService = context.getBean(CallService.class);
        callService.addMessage(new Message("Hello"));
        callService.callMessage();

        System.out.println();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(n-> System.out.println(n));

        while(true);

    }

}
