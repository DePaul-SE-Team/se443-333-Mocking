package ch6.practice6_stock;
import java.math.BigDecimal;

// StockBroker collaborates with the MarketWatcher and Portfolio classes.
public class StockBroker {

    private final static BigDecimal LIMIT = new BigDecimal("0.10");

    public StockBroker(MarketWatcher market) {
        this.market = market;
    }

    /**
     * Sells stocks if there is 10% gain from selling the stock, otherwise, buys one stock.
     * @param stock
     * @return
     */
    void perform(Portfolio portfolio, Stock stock) {
        Stock liveStock = market.getQuote(stock.getSymbol());
        BigDecimal avgPrice = portfolio.getAvgPrice(stock); // your average stock in portfolio. (10)
        BigDecimal priceGained = liveStock.getPrice().subtract(avgPrice); // live stock - your stock (12 - 10 = 2)
        BigDecimal percentGain = priceGained.divide(avgPrice); // calculate  2/10 = 20% gain.
        // if is greater than 10 percentage you sell 10.
        if (percentGain.compareTo(LIMIT) > 0) {
            portfolio.sell(stock, 10);
        // If the percentage gain is below 10%, buy more of the stock.
        } else if (percentGain.compareTo(LIMIT) < 0) {
            portfolio.buy(stock); // Buy one share of the stock.
        }
    }

    private final MarketWatcher market;
}

