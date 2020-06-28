package model;

public class Resource {

    private static long counter = 0L;

    private long id = ++counter;
    private String name;
    private int data;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else {
           if (obj instanceof Resource) {
               Resource temp = (Resource) obj;
               return  temp.name.equals(this.name) &&
                       (temp.data == this.data);
            } else {
               return false;
           }
        }
    }

    @Override
    public int hashCode() {
        return 31*this.name.hashCode() +
               31*this.data;
    }

    @Override
    public String toString() {
        return "id: " + this.id + " name: " + this.name + "data: " + this.data;
    }
}


