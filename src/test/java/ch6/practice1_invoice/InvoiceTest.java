package ch6.practice1_invoice;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class InvoiceTest {

    @Test
    void getInvoiceLessThan() {
        // TODO: test Invoice.getNumberOfInvoiceLessThan(amount)
        // Hint: mock the dao, stub getLowerThan(...) with when(...).thenReturn(...),
        //       pass the mock into the Invoice constructor, then assert the result.
    }
}
