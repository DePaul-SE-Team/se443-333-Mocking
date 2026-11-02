package ch6.bookstore;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;
import static org.mockito.Mockito.*;

public class BookStoreTest {

    @Test
    void emptyOrder() {
        // TODO: What should the price overview look like for an empty order?
    }

    @Test
    void nullOrder() {
        // TODO: What does getPriceForCart() do when the order is null?
    }

    @Test
    void moreComplexOrder() {
        // TODO: Test an order with three books:
        //         - one with more stock than requested
        //         - one with exactly the requested stock (boundary!)
        //         - one with less stock than requested
        //       Check the total price, the purchases made, and the unavailable books.
        // Hint: Which dependencies need to be stubbed, and which interactions
        //       should be verified?
    }

}
