package main.java.additional;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class MyContextRefreshedEventHandler implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Event!!!");
        if (contextRefreshedEvent.getApplicationContext().containsBean("messageStore")) System.out.println("messageStore was found!");
    }
}
