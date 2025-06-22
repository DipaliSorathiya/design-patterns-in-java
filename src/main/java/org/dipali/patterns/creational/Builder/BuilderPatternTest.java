package org.dipali.patterns.creational.Builder;

public class BuilderPatternTest {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setBase("Thin Crust")
                .setSize("Large")
                .addCheese(true)
                .addMushrooms(true)
                .addPepperoni(false)
                .build();

        System.out.println(pizza);
    }
}
