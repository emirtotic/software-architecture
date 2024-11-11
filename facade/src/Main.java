public class Main {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("Laptop", 1, "12345", 999.99);
    }
}
