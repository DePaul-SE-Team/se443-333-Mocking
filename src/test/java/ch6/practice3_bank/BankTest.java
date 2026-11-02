package ch6.practice3_bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class BankTest {

    @Test
    void transferMoney() {
        // TODO: test Bank.transferMoney(from, to, amount)
        // Hint: mock Account and TransactionRepository, and stub getBalance(from).
        //       Use assertThrows(...) when the amount is more than the balance,
        //       and verify(...) that saveTransaction(...) is called when it is enough.
    }
}
