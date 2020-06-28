package ru.practics.springbootdemo;

import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
//@Profile("DEV")
public class DeveloperService {

    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        System.out.println("Developers...");
    }
}
