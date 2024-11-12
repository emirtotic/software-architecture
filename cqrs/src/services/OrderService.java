package services;

import models.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderService {

    private Map<String, Order> orders = new HashMap<>();

    public void createOrder(String orderId, String customerName) {
        Order order = new Order(orderId, customerName);
        orders.put(orderId, order);
        System.out.println("Order created for " + customerName);
    }

    public Order getOrderById(String orderId) {
        return orders.get(orderId);
    }
}
