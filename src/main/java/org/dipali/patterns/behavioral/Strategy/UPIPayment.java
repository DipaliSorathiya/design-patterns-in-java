package org.dipali.patterns.behavioral.Strategy;

public class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
    }
}