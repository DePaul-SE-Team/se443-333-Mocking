package ch6.exception;

import ch6.stub.Invoice;
import ch6.stub.InvoiceFilter;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class SAPInvoiceSenderTest {

    private InvoiceFilter filter = mock(InvoiceFilter.class);
    private SAP sap = mock(SAP.class);
    private SAPInvoiceSender sender = new SAPInvoiceSender(filter, sap);

    @Test
    void returnFailedInvoices() {
        // TODO: SAP fails for one of the invoices. Check that this invoice is
        //       returned as failed and the others are still sent.
        // Hint: send() returns void. How do you make a void mock method throw?
        //       (Look up Mockito's doThrow.)
    }




}
