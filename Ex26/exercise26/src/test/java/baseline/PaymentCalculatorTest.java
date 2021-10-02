package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator pay = new PaymentCalculator(12,5000,100);

        assertEquals(70,pay.calculateMonthsUntilPaidOff());
    }
}