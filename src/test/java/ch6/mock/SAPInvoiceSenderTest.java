package ch6.mock;

import ch6.stub.Invoice;
import ch6.stub.InvoiceFilter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class SAPInvoiceSenderTest {

    private InvoiceFilter filter = mock(InvoiceFilter.class);
    private SAP sap = mock(SAP.class);
    private SAPInvoiceSender sender = new SAPInvoiceSender(filter, sap);

    @Test
    void sendToSap() {
        // TODO: Check that every low-value invoice is sent to SAP.
        // Hint: The method returns nothing. How can you check what it did?
    }

    @Test
    void noLowValueInvoices() {
        // TODO: Check that nothing is sent to SAP when there are no
        //       low-value invoices.
        // Hint: How do you check that a mock method was never called?
    }
}
