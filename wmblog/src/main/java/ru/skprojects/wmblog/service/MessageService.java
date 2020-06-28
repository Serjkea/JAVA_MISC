package ru.skprojects.wmblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skprojects.wmblog.model.Message;
import ru.skprojects.wmblog.repository.MessageRepository;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> findAll() {
        return this.messageRepository.findAll();
    }

    public void save(Message message) {
        this.messageRepository.save(message);
    }

}
