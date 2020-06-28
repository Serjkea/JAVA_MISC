package main.java.service;

public class TextService implements MessageService {


    @Override
    public void printMessage() {
        System.out.println("Ha-Ha!");
    }

    @Override
    public void addMessage(String text) {

    }
}
