package org.example.payment_gateway;

public class PaymentFactory {
    public static PaymentMethod getPaymentMethod(int choice) {
        switch (choice) {
            case 1: return new CreditCardPayment();
            case 2: return new PayPalPayment();
            case 3: return new PaymentAdapter(); // External API
            default: throw new IllegalArgumentException("Invalid payment option!");
        }
    }
}
