package ru.skprojects.springbootproject.service;

import ru.skprojects.springbootproject.domain.Order;

import java.util.List;

public interface OrderService {

    void addOrder(Order order);
    Order getOrderById(Long id);
    List<Order> getAllOrders();
    void deleteOrderById(Long id);
    void deleteOrder(Order order);
    void deleteAllOrders();

}
