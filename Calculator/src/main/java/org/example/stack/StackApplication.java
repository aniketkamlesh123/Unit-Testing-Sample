package org.example.stack;

import java.util.Scanner;

public class StackApplication {

    private final Stack stack;
    private final Scanner input;

    public StackApplication() {
        this.stack = new Stack();
        this.input = new Scanner(System.in);
    }

    // Method to start the application and show menu
    public void start() {
        while (true) {
            showMenu();

            int choice = input.nextInt();
            processChoice(choice);
        }
    }

    // Display the menu options to the user
    private void showMenu() {
        System.out.println("\nChoose an operation:");
        System.out.println("1: Push");
        System.out.println("2: Pop");
        System.out.println("3: Top");
        System.out.println("4: Empty");
        System.out.println("5: View Stack");
        System.out.println("6: Exit");
    }

    // Process the user's choice and call appropriate Stack methods
    private void processChoice(int choice) {
        switch (choice) {
            case 1:
                pushElement();
                break;

            case 2:
                popElement();
                break;

            case 3:
                viewTop();
                break;

            case 4:
                checkIfEmpty();
                break;

            case 5:
                viewStack();
                break;

            case 6:
                exitApplication();
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
    }

    // Handle the push operation
    private void pushElement() {
        System.out.print("Enter an element: ");
        int element = input.nextInt();
        stack.push(element);
        System.out.println("Stack after push: " + stack.display());
    }

    // Handle the pop operation
    private void popElement() {
        try {
            System.out.println("Popped element: " + stack.pop());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Handle viewing the top element
    private void viewTop() {
        try {
            System.out.println("Top element: " + stack.top());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // Check if the stack is empty
    private void checkIfEmpty() {
        System.out.println("Is stack empty? " + stack.empty());
    }

    // View the current elements in the stack
    private void viewStack() {
        System.out.println("Stack contents: " + stack.display());
    }

    // Exit the application and break the loop
    private void exitApplication() {
        System.out.println("Exiting...");
        // Use 'break' to exit the loop and terminate
        System.exit(0);  // Alternatively, you can use a 'break' here if placed inside the while loop
    }
}
