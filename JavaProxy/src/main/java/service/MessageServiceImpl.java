package main.java.service;

import main.java.model.Message;

public class MessageServiceImpl implements MessageService {

    private Message message;

    public MessageServiceImpl() {
    }

    @Override
    public void printMessage() {
        System.out.println("MESSAGE: " + message.getText());
    }

    @Override
    public void addMessage(String text) {
        this.message = new Message(text);
    }
}
