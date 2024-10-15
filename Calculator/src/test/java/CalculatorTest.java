import org.example.Calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        double result = calculator.add(10,12);
        assertEquals(22, result);
    }

    @Test
    void testSubtraction() {
        double result = calculator.subtract(13,10);
        assertEquals(5, result);
    }

    @Test
    void testMultiplication() {
        double result = calculator.multiply(10,45);
        assertEquals(450, result);
    }

    @Test
    void testDivision() {
        double result = calculator.divide(45,5);
        assertEquals(9, result);
    }

    @Test
    void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10,0);
        });
        assertEquals("Divisor cannot be zero!", exception.getMessage());
    }

    @Test
    void testFindRemainder() {
        double result = calculator.findRemainder(12,7);
        assertEquals(5, result);
    }

    @Test
    void testFindRemainderByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.findRemainder(10,0);
        });
        assertEquals("Divisor cannot be zero!", exception.getMessage());
    }
}
