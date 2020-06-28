package ru.skprojects.springbootproject.domain;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private Long id;
    private Map<Product,Integer> orderList = new HashMap<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addProduct(@Valid Product product) {
        this.orderList.put(product,1);    //TODO!!!
    }

    public void addProduct(@Valid Product product, int count) {
        this.orderList.put(product,count); //TODO!!!
    }

    public void delProduct(@Valid Product product) {
        this.orderList.remove(product); //TODO!!!
    }

    public void delProduct(@Valid Product product, int count) {
        this.orderList.remove(product); //TODO!!!
    }

    @Override
    public int hashCode() {
        return this.id.hashCode() + this.orderList.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof Order) {
            Order tmp = (Order) obj;
            return this.id.equals(tmp.id) &&
                   this.orderList.equals(tmp.orderList);
        } return false;
    }

    @Override
    public String toString() {
        return "Order id: " + this.id + " Order List: " + this.orderList.toString();
    }

}
