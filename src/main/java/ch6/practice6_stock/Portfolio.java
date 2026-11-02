package ch6.practice6_stock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Portfolio {
    private Map<String, List<Stock>> stockMap = new HashMap<String, List<Stock>>();

    /**
     * Adds a Stock to the portfolio.
     * @param stock
     */
    public void buy(Stock stock) {
        List<Stock> stocks = stockMap.get(stock.getSymbol());
        if(stocks != null) {
            stocks.add(stock);
        }else {
            stocks = new ArrayList<Stock>();
            stocks.add(stock);
            stockMap.put(stock.getSymbol(), stocks);
        }
    }

    /**
     * Removes a specified quantity of stocks from the portfolio based on the symbol.
     * @param stock
     * @param quantity
     */
    public void sell(Stock stock, int quantity) {
        List<Stock> stocks = stockMap.get(stock.getSymbol());
        if(stocks == null) {
            throw new IllegalStateException(stock.getSymbol()+" not bought");
        }

        if(stocks.size() < quantity) {
            quantity = stocks.size();
        }

        for(int i=quantity-1; i >=0; i--) {
            stocks.remove(i);
        }
    }

    /**
     * Calculates and returns the average price of all instances of a particular stock in the portfolio.
     * @param stock
     * @return
     */
    public BigDecimal getAvgPrice(Stock stock) {
        List<Stock> stocks = stockMap.get(stock.getSymbol());
        BigDecimal avgPrice = BigDecimal.ZERO;
        /**
         * traverses your stocks then just calculate average cost.
         */
        if(stocks != null) {
            for(Stock aStock:stocks) {
                avgPrice = avgPrice.add(aStock.getPrice());
            }

            avgPrice = avgPrice.divide(new BigDecimal(stocks.size()));
        }
        return avgPrice;
    }

    /**
     * Returns the total current value of the portfolio by summing the prices of all the stocks in the portfolio.
     * @return
     */
    public BigDecimal getCurrentValue() {
        BigDecimal avgPrice = BigDecimal.ZERO;
        for(String stockId: stockMap.keySet()) {
            for(Stock stock:stockMap.get(stockId)) {
                avgPrice = avgPrice.add(stock.getPrice());
            }
        }
        return avgPrice;
    }

}
