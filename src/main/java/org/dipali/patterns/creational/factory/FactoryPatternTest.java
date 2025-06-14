package org.dipali.patterns.creational.factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        circle.draw();  // Output: Drawing a Circle!

        Shape square = factory.getShape("square");
        square.draw();  // Output: Drawing a Square!
    }
}
