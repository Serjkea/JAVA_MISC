package main.domain;

public class User {

    private static int counter = 0;
    private int id = ++counter;
    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof User) {
            User tmp = (User) obj;
            return (this.id == tmp.id) && this.name.equals(tmp.name) && (this.age == tmp.age);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31*this.id + this.name.hashCode() + 31*this.age;
    }

    @Override
    public String toString() {
        return "id: " + this.id +
               " name: " + this.name +
               " age: " + this.age;
    }
}
