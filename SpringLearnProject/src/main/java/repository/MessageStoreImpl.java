package main.java.repository;

import main.java.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public class MessageStoreImpl implements MessageStore {

    private Message message;

    @Override
    public void addMessage(Message message) {
        this.message = message;
    }

    @Override
    public Message getMessage() {
        return this.message;
    }
}
