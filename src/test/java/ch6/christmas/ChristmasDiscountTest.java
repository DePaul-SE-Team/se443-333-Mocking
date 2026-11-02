package ch6.christmas;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ChristmasDiscountTest {

    private final Clock clock = mock(Clock.class);
    private final ChristmasDiscount cd = new ChristmasDiscount(clock);

    @Test
    public void christmas() {
        // TODO: Check that a 15% discount is applied on Christmas day.
        // Hint: How can you control what "today" is inside a test?
        //       Be careful when comparing doubles.
    }

    @Test
    public void notChristmas() {
        // TODO: Check that no discount is applied on a day other than Christmas.
        // Hint: Which date makes a good boundary case?
    }
}
