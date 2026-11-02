package ch6.practice3_bank;

// not implemented yet
public interface TransactionRepository {

    // in reality this might authenticate both account, talk to DB, get the amount from 1 and securely transfer to another account.
    void saveTransaction(Account fromAccount, Account toAccount, double amount);

    // in reality this might authenticate account, talk to DB, and return the balance.
    double getBalance(Account accountId);

}

