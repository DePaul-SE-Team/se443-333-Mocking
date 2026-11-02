package ch6.practice4_email;

public class EmailService {
    // Delivery is a dependency injected into the EmailService class
    Delivery delivery;

    // Constructor that accepts a Delivery object and assigns it to the dev variable
    EmailService(Delivery dev) {
        this.delivery = dev;
    }

    // Method to send an email, accepting a boolean indicating if the email is in HTML format
    void sendEmail(Format format) {
        delivery.send(format);
    }
}


