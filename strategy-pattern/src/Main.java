public class Main {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart2 = new ShoppingCart();

        cart.addItem(new Item("1234", 100));
        cart.addItem(new Item("5678", 200));
        cart.addItem(new Item("3344", 800));

        cart.pay(new CreditCardPayment("John Doe", "1234567890123456", "123", "12/25"));

        cart.pay(new PayPalPayment("john@example.com", "password123"));

        cart.pay(new BankTransferPayment("260-0000000001-23"));
    }
}