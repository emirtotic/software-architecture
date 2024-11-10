public class OrderFacade {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String item, int quantity, String account, double amount) {
        if (inventoryService.checkStock(item, quantity)) {
            if (paymentService.processPayment(account, amount)) {
                shippingService.shipItem(item, quantity);
                System.out.println("Order placed successfully for " + item);
            } else {
                System.out.println("Payment failed for account " + account);
            }
        } else {
            System.out.println("Item " + item + " is out of stock.");
        }
    }
}
