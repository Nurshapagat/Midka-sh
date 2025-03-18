package org.example.payment_gateway;

public class ExternalPaymentAPI {
    public boolean externalPay(double amount) {
        System.out.println("Processing external payment of $" + amount);
        return true;
    }
}
