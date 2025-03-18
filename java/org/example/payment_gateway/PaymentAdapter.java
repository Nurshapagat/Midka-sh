package org.example.payment_gateway;

public class PaymentAdapter implements PaymentMethod {
    private ExternalPaymentAPI externalAPI = new ExternalPaymentAPI();

    @Override
    public boolean processPayment(double amount) {
        boolean success = externalAPI.externalPay(amount);
        System.out.println("Payment processed via External Payment API.");
        return success;
    }
}
