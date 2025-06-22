package org.dipali.patterns.creational.Builder;

public class PizzaBuilder {

    private String base;
    private String size;
    private boolean cheese;
    private boolean mushrooms;
    private boolean pepperoni;

    // Setter methods with chaining
    public PizzaBuilder setBase(String base) {
        this.base = base;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder addCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public PizzaBuilder addMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }

    public PizzaBuilder addPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    // Build method
    public Pizza build() {
        return new Pizza(this);
    }

    // Getters for Pizza to access (package-private or public)
    public String getBase() { return base; }
    public String getSize() { return size; }
    public boolean hasCheese() { return cheese; }
    public boolean hasMushrooms() { return mushrooms; }
    public boolean hasPepperoni() { return pepperoni; }
}
