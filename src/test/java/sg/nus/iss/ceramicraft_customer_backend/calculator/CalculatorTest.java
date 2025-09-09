package sg.nus.iss.ceramicraft_customer_backend.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(5, calculator.subtract(2, -3));
        assertEquals(0, calculator.subtract(0, 0));
    }
}