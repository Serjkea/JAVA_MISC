package main.java.model;

public class Message {

    private static int id_counter = 0;
    private int id;
    private String text;

    public Message(String text) {
        this.id = id_counter++;
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return this.id*31 + this.text.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        else if (obj instanceof Message) {
            Message tmp = (Message) obj;
            return tmp.id == this.id &&
                   tmp.text.equals(this.text);
        }
        return false;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " text: " + this.text;
    }
}
