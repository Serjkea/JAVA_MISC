package main.java.model;

import java.util.Objects;

public class Message {

    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(text, message.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}
