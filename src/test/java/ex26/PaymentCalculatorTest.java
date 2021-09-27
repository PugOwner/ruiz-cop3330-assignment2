package ex26;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {



    @org.junit.jupiter.api.Test
    void calculateMonthsUntilPaidOff() {
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(.12, 5000, 100));
    }
}