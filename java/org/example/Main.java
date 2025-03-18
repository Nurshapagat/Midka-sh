package org.example;

import org.example.coffee_shop.*;
import org.example.payment_gateway.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> transactionHistory = new ArrayList<>();

        System.out.println("Choose your coffee:");
        System.out.println("1. Espresso ($2.5)");
        System.out.println("2. Cappuccino ($3.0)");
        System.out.print("Enter your choice: ");
        int coffeeChoice = scanner.nextInt();

        Coffee coffee = CoffeeFactory.createCoffee(coffeeChoice);

        System.out.println("Do you want to add Milk? (1-Yes, 0-No): ");
        int addMilk = scanner.nextInt();
        if (addMilk == 1) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.println("Total Cost: $" + coffee.getCost());

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. External API");
        System.out.print("Enter your choice: ");
        int paymentChoice = scanner.nextInt();

        PaymentMethod paymentMethod = PaymentFactory.getPaymentMethod(paymentChoice);

        System.out.println("Processing payment...");
        boolean success = paymentMethod.processPayment(coffee.getCost());

        String status = success ? "Completed" : "Failed";
        transactionHistory.add("Order: " + coffee.getDescription() + " | Cost: $" + coffee.getCost() + " | Status: " + status);

        System.out.println("Transaction " + status + "!");

        System.out.println("\n--- Transaction History ---");
        for (String record : transactionHistory) {
            System.out.println(record);
        }
    }
}
