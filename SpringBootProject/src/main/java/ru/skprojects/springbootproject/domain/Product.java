package ru.skprojects.springbootproject.domain;

public class Product {

    private Long id;
    private String name;
    private Double price;

    Product(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode() + this.name.hashCode() + this.price.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof Product) {
            Product tmp = (Product) obj;
            return tmp.id.equals(this.id) &&
                   tmp.name.equals(this.name) &&
                   tmp.price.equals(this.price);
        } return false;
    }

    @Override
    public String toString() {
        return "Product id: " + this.id + " name: " + this.name + " price: " + this.price;
    }
}
