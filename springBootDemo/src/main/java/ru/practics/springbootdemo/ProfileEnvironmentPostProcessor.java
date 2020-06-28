package ru.practics.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;


public class ProfileEnvironmentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        if (environment.getActiveProfiles().length == 0) {
            System.out.println("No Active Profiles!");
        } else {
            System.out.println("Profiles was found: ");
            for (String str: environment.getActiveProfiles()
                 ) {
                System.out.println(str);
            }
        }
    }
}
