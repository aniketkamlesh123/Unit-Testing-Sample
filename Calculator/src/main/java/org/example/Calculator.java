package org.example;

import java.util.stream.IntStream;

public class Calculator {

    // Default constructor
    public Calculator() {
        // No initialization required for now
    }

    /**
     * Adds two numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return The sum of num1 and num2
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param num1 Minuend (the number to be subtracted from)
     * @param num2 Subtrahend (the number to subtract)
     * @return The result of num1 - num2
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 First number
     * @param num2 Second number
     * @return The product of num1 and num2
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides the first number by the second.
     * Throws an ArithmeticException if the divisor is zero.
     *
     * @param num1 Dividend (the number to be divided)
     * @param num2 Divisor (the number by which to divide)
     * @return The result of num1 / num2
     * @throws ArithmeticException if num2 is zero
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero!");
        }
        return num1 / num2;
    }

    /**
     * Finds the remainder of the first number divided by the second.
     * Throws an ArithmeticException if the divisor is zero.
     *
     * @param num1 Dividend
     * @param num2 Divisor
     * @return The remainder of num1 % num2
     * @throws ArithmeticException if num2 is zero
     */
    public double findRemainder(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero!");
        }
        return num1 % num2;
    }

    /**
     * Checks if a number is even.
     *
     * @param number The number to check
     * @return true if the number is even; false otherwise
     */
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Checks if a number is odd.
     *
     * @param number The number to check
     * @return true if the number is odd; false otherwise
     */
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    /**
     * Checks if a number is prime.
     *
     * @param number The number to check
     * @return true if the number is prime; false otherwise
     */
    public boolean isPrime(int number) {
        // Check for base cases
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // Exclude even numbers greater than 2
        }

        // Check for factors from 3 to the square root of the number
        return IntStream.rangeClosed(3, (int) Math.sqrt(number))
                .filter(n -> n % 2 != 0) // Check only odd numbers
                .noneMatch(i -> number % i == 0); // Ensure no factors found
    }
}
