package org.example.coffee_shop;

public class CoffeeFactory {
    public static Coffee createCoffee(int choice) {
        switch (choice) {
            case 1: return new Espresso();
            case 2: return new Cappuccino();
            default: throw new IllegalArgumentException("Invalid coffee selection!");
        }
    }
}
