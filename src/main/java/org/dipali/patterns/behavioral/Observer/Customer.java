package org.dipali.patterns.behavioral.Observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hey " + name + ", " + productName + " is back in stock!");
    }
}
