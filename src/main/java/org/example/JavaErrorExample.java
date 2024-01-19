package org.example;

public class JavaErrorExample {
    public static void main(String[] args) {
        try {
            recursiveMethod(0);
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void recursiveMethod(int counter) {
        System.out.println("Counter: " + counter);
        recursiveMethod(counter + 1);
    }
}

