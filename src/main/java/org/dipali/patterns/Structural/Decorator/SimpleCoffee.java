package org.dipali.patterns.Structural.Decorator;

public class SimpleCoffee implements Beverage {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}