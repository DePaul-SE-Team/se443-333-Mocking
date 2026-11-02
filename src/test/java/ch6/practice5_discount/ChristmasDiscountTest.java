package ch6.practice5_discount;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ChristmasDiscountTest {

    @Test
    void applyDiscount() {
        // TODO: test ChristmasDiscount.applyDiscount(amount)
        // Hint: mock Time so now() returns a fixed date, e.g. LocalDate.of(2025, 12, 25).
        //       Check the discounted amount on Christmas (and try a non-Christmas date too).
    }
}
