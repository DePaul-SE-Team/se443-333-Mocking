package ch6.practice4_email;

// Interface for Delivery, which defines the send method that connects to an external API
interface Delivery {
    void send(Format format); // Connect to external API that sends email
}
