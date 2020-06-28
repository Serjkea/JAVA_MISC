package ru.practics.springbootdemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(MyProperties.class)
public class Configuration {

    @Bean
    @ConditionalOnProperty(value = "listener.flag", havingValue = "true")
    public MyListener myListener() {
        return new MyListener();
    }

    @Bean
//    @Profile("DEV")
    public NotificationListener notificationListener() {
        return new NotificationListener();
    }


}
