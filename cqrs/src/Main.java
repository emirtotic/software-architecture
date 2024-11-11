import commands.CreateOrderCommand;
import commands.CreateOrderCommandHandler;
import models.Order;
import queries.OrderQueryService;
import services.OrderService;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        CreateOrderCommand createOrderCommand = new CreateOrderCommand("123", "Alice");
        CreateOrderCommandHandler createOrderHandler = new CreateOrderCommandHandler(orderService);
        createOrderHandler.handle(createOrderCommand);

        OrderQueryService queryService = new OrderQueryService(orderService);
        Order order = queryService.getOrderById("123");

        System.out.println("Order Status: " + order.getStatus());
    }
}