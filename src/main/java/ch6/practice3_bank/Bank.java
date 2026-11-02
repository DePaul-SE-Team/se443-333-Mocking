package ch6.practice3_bank;

public class Bank {
    private final TransactionRepository transactionRepository;


    public Bank(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    /**
     *
     * If amount to withdraw is greater than balance, then you can
     */
    public void transferMoney(Account fromAccount, Account toAccount, double amount) {
        // We don't really care what it really does that is up to the developer. We know that it returns some value, which is a double.
        // And, we want to make sure that when it is called, it returns something (priming it)
        double balance = transactionRepository.getBalance(fromAccount);

        if (balance < amount) {
            throw new RuntimeException();
        }

        // again, we don't care about how these are implemented, we only care that it returns some value
        // you have two mocks here
        transactionRepository.saveTransaction(fromAccount, toAccount, amount);
    }
}
