package main.java.service;

import main.java.model.Message;
import main.java.repository.MessageStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class CallServiceImpl implements CallService {

    private MessageStore messageStore;

    @Autowired
    public CallServiceImpl(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    @Scheduled(fixedDelay = 1000)
    @Override
    public void callMessage() {
        System.out.println(messageStore.getMessage());
    }

    @Override
    public void addMessage(Message message) {
        messageStore.addMessage(message);
    }

    @PostConstruct
    public void init() {
        System.out.println("Init method for class " + getClass().getSimpleName() + " call");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Pre destroy method " + getClass().getSimpleName() + " call");
    }
}
