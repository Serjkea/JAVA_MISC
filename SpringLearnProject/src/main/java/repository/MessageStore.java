package main.java.repository;

import main.java.model.Message;

public interface MessageStore {

    public void addMessage(Message message);
    public Message getMessage();

}
