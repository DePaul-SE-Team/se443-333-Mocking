package ch6.practice4_email;

// HTML implementation of the Format interface
class HTML implements Format {
    @Override
    public String getFormat() {
        return "HTML"; // Return the format type as HTML
    }
}