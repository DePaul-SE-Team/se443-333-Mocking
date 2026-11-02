package ch6.practice6_stock;

import java.math.BigDecimal;

public class Stock {
    // symbol for stock AAPL = apple, NVDA = Nvidia
    private final String symbol;
    private final String name;
    private BigDecimal price;


    public Stock(String id, String name, BigDecimal price) {
        this.symbol = id;
        this.name = name;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Updates the stock's price with a new value
     * @param newPrice
     */
    public void updatePrice(BigDecimal newPrice) {
        this.price = newPrice;
    }
}
