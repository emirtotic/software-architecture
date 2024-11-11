package commands;

import services.OrderService;

public class CreateOrderCommandHandler implements CommandHandler<CreateOrderCommand> {

    private OrderService orderService;

    public CreateOrderCommandHandler(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void handle(CreateOrderCommand command) {
        orderService.createOrder(command.getOrderId(), command.getCustomerName());
    }
}
