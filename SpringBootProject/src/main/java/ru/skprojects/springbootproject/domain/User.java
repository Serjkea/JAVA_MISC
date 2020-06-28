package ru.skprojects.springbootproject.domain;

public class User {

    private Long id;
    private String name;
    private int age;

    User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        return this.id.hashCode() + this.age*31 + this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof User) {
            User tmp = (User) obj;
            return (tmp.id.equals(this.id)) &&
                   (tmp.age == this.age) &&
                   (tmp.name.equals(this.name));
        } return false;
    }

    @Override
    public String toString() {
        return "User id: " + this.id + " name: " + this.name + " age: " + this.age;
    }

}
