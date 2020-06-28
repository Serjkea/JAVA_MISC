package ru.practics.springbootdemo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ProfileApplicationInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        if (configurableApplicationContext.getEnvironment().getActiveProfiles().length == 0) {
            System.out.println("App Init: No Active Profiles!");
        } else {
            System.out.println("App Init: ");
            for (String str: configurableApplicationContext.getEnvironment().getActiveProfiles()
                 ) {
                System.out.println(str);
            }
        }
    }
}
