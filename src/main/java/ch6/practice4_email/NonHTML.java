package ch6.practice4_email;

// NonHTML implementation of the Format interface
class NonHTML implements Format {
    @Override
    public String getFormat() {
        return "NON-HTML"; // Return the format type as Non-HTML
    }
}