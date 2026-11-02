package ch6.practice4_email;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class EmailServiceTest {

    @Test
    void sendEmail() {
        // TODO: test EmailService.sendEmail(format)
        // Hint: mock Delivery, pass it to EmailService, send an email with a real
        //       HTML (or NonHTML) object, then verify(...) that delivery.send(...) was called.
    }
}
