package org.example.payment_gateway;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
        return true;
    }
}
