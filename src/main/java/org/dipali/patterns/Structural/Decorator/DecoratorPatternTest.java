package org.dipali.patterns.Structural.Decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Beverage coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());

        // Add Milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());

        // Add Sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " ₹" + coffee.getCost());
    }
}