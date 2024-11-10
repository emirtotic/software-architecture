public class BankTransferPayment implements WayOfPayment {

    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Bank Transfer.");
    }
}