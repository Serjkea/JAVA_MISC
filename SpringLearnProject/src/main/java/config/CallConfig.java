package main.java.config;

import main.java.additional.MyBeanFactoryPostProcessor;
import main.java.additional.MyBeanPostProcessor;
import main.java.additional.MyContextRefreshedEventHandler;
import main.java.repository.MessageStore;
import main.java.repository.MessageStoreImpl;
import main.java.service.CallService;
import main.java.service.CallServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class CallConfig {

    @Bean
    public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor() {
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean
    public MyContextRefreshedEventHandler myContextRefreshedEventHandler() {
        return new MyContextRefreshedEventHandler();
    }

    @Bean
    public MessageStore messageStore() {
        return new MessageStoreImpl();
    }

    @Bean
    public CallService callService() {;
        return new CallServiceImpl(messageStore());
    }

}
