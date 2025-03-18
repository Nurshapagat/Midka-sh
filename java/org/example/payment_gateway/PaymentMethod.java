package org.example.payment_gateway;

public interface PaymentMethod {
    boolean processPayment(double amount);
}
