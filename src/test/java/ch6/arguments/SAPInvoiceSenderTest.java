package ch6.arguments;

import ch6.stub.Invoice;
import ch6.stub.InvoiceFilter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.ArgumentCaptor;

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

    @ParameterizedTest
    @CsvSource({
            "Kim,Ki",
            "M,X"}
    )
    void sendToSapWithTheGeneratedId(String customer, String initialId) {
        // TODO: Check that the SapInvoice sent to SAP has the correct ID.
        //       ID format: today's date (MMddyyyy) + first two letters of the
        //       customer name, or "X" if the name is too short.
        // Hint: The SapInvoice is created inside the method, so you can't build
        //       it ahead of time. How can you grab the argument passed to a mock?
        //       (Look up Mockito's ArgumentCaptor.)
    }


    @Test
    void oldExample() {
        // TODO: Write a weaker version of the test above that only checks that
        //       *some* SapInvoice was sent.
        // Hint: Look up Mockito's argument matchers.
        // Think: What bugs would this test miss that the captor test catches?
    }


}
