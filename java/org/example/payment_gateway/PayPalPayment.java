package org.example.payment_gateway;

public class PayPalPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
        return true;
    }
}
