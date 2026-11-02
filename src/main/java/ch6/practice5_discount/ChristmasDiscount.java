package ch6.practice5_discount;

import java.time.LocalDate;
import java.time.Month;

public class ChristmasDiscount {

    private final Time time;

    public ChristmasDiscount(Time time) {
        this.time = time;
    }

    public double applyDiscount(double rawAmount) {
        LocalDate today = time.now();

        double discountPercentage = 0;
        boolean isChristmas = today.getMonth()== Month.DECEMBER
                && today.getDayOfMonth()==25;

        if(isChristmas)
            discountPercentage = 0.15;

        return rawAmount - (rawAmount * discountPercentage);
    }
}