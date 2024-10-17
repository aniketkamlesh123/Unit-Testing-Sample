package org.example.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculator= new Calculator();

        System.out.println("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
        System.out.println("Remainder: " + calculator.findRemainder(num1, num2));

    }
}