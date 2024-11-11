package commands;

public class CreateOrderCommand {
    private String orderId;
    private String customerName;

    public CreateOrderCommand(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }
}

