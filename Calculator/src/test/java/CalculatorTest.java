import org.example.calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    // This method is executed before each test case to initialize the Calculator instance
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Test case for addition operation
    @Test
    public void testAddition() {
        double result = calculator.add(10, 12);
        assertEquals(22, result, "Addition of 10 and 12 should be 22");
    }

    // Test case for subtraction operation, verifying correct result
    @Test
    public void shouldReturnCorrectResultForSubtraction() {
        double result = calculator.subtract(13, 10);
        assertEquals(3, result, "Subtraction of 13 and 10 should be 3");
    }

    // Test case to ensure incorrect expected results for subtraction are handled
    @Test
    public void shouldFailWhenIncorrectSubtractionExpected() {
        double result = calculator.subtract(13, 10);
        assertNotEquals(5, result, "Subtraction of 13 and 10 should not equal 5");
    }

    // Test case for multiplication operation
    @Test
    public void testMultiplication() {
        double result = calculator.multiply(10, 45);
        assertEquals(450, result, "Multiplication of 10 and 45 should be 450");
    }

    // Test case for division operation
    @Test
    public void testDivision() {
        double result = calculator.divide(45, 9);
        assertEquals(5, result, "Division of 45 by 9 should be 5");
    }

    // Test case to handle division by zero, expecting an ArithmeticException
    @Test
    public void testDivisionByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Divisor cannot be zero!", exception.getMessage(), "Expected exception message for division by zero");
    }

    // Test case for finding the remainder of two numbers
    @Test
    public void testFindRemainder() {
        double result = calculator.findRemainder(12, 7);
        assertEquals(5, result, "Remainder of 12 divided by 7 should be 5");
    }

    // Test case to handle finding remainder with zero as divisor
    @Test
    public void testFindRemainderByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.findRemainder(10, 0);
        });
        assertEquals("Divisor cannot be zero!", exception.getMessage(), "Expected exception message for remainder by zero");
    }

    // Test cases for prime number verification
    @Test
    public void testPrimeNumbers() {
        assertTrue(calculator.isPrime(2), "2 should be prime");
        assertTrue(calculator.isPrime(3), "3 should be prime");
        assertTrue(calculator.isPrime(5), "5 should be prime");
    }

    // Test cases for non-prime number verification
    @Test
    public void testNonPrimeNumbers() {
        assertFalse(calculator.isPrime(1), "1 should not be prime");
        assertFalse(calculator.isPrime(4), "4 should not be prime");
        assertFalse(calculator.isPrime(9), "9 should not be prime");
    }

    // Test cases for even number verification
    @Test
    public void isEvenTest() {
        assertTrue(calculator.isEven(0), "0 should be even");
        assertTrue(calculator.isEven(2), "2 should be even");
        assertTrue(calculator.isEven(-4), "-4 should be even");
    }

    // Test cases for odd number verification
    @Test
    public void isOddTest() {
        assertTrue(calculator.isOdd(-3), "-3 should be odd");
        assertTrue(calculator.isOdd(7), "7 should be odd");
        assertTrue(calculator.isOdd(5), "5 should be odd");
    }
}
