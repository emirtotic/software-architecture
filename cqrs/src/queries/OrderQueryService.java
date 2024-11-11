package queries;

import models.Order;
import services.OrderService;

public class OrderQueryService {

    private OrderService orderService;

    public OrderQueryService(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order getOrderById(String orderId) {
        return orderService.getOrderById(orderId);
    }
}
