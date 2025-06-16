package org.dipali.patterns.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

class Product implements Subject {
    private String productName;
    private boolean inStock = false;
    private List<Observer> customers = new ArrayList<>();

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public void addObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer customer : customers) {
            customer.update(productName);
        }
    }

    public void restock() {
        this.inStock = true;
        System.out.println(productName + " is restocked!");
        notifyObservers();
    }
}