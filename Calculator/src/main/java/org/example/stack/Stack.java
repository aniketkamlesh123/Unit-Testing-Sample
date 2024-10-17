package org.example.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    // Initialize queues.
    public Stack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // push element in stack to top of the stack
    public void push(int x) {

        // add an element in queue2
        queue2.add(x);

        // add queue1 all elements in queue2
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll());
        }

        // swap queue1 and queue2 references
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }

    // Removes the element at the top of the stack and returns it.
    public int pop() {

        // Check if the stack is not empty, then remove and return the top element (front of queue1).
        if (!queue1.isEmpty()) {
            return queue1.poll();
        }

        // If the stack is empty, throw an exception to indicate an underflow condition.
        throw new RuntimeException("Stack is empty");
    }


    //Returns the element on the top of the stack.
    public int top() {

        if (!queue1.isEmpty()) {
            // Check if the stack is not empty, then return the top element (front of queue1).
            return queue1.peek();
        }

        // If the stack is empty, throw an exception to indicate an underflow condition.
        throw new RuntimeException("Stack is empty");
    }

    // Check if stack is empty or not.
    public boolean empty() {

        // return true if stack is empty.
        return queue1.isEmpty();
    }

    // Displays the elements in the stack.
    public String display() {
        return queue1.toString();
    }
}
