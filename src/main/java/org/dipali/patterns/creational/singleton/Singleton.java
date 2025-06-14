package org.dipali.patterns.creational.singleton;

public class Singleton {

    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a public static method to get the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
