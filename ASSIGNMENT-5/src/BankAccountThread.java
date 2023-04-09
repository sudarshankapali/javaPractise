public class BankAccountThread implements Runnable {
    private BankAccount account;
    private String transactionType;
    private int amount;

    public BankAccountThread(BankAccount account, String transactionType, int amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public void run() {
        if (transactionType.equals("deposit")) {
            account.deposit(amount);
        } else if (transactionType.equals("withdraw")) {
            account.withdraw(amount);
        }
    }
}
