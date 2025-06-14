package org.dipali.patterns.creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();

        // Will print true, since both refer to same instance
        System.out.println(obj1 == obj2);
    }
}
