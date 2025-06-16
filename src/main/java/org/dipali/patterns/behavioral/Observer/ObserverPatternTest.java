package org.dipali.patterns.behavioral.Observer;

public class ObserverPatternTest {

    public static void main(String[] args) {
        Product iphone = new Product("iPhone 15 Pro");

        Customer c1 = new Customer("Dipali");
        Customer c2 = new Customer("Aman");

        iphone.addObserver(c1);
        iphone.addObserver(c2);

        iphone.restock();
    }
}
