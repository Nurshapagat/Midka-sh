# ☕💳 Online Payment Gateway & Coffee Shop Simulator

This project combines the combination **"Online Payment Gateway" + "Coffee Shop Simulator"** The project uses Factory Method, Decorator, and Adapter design patterns.

# Project Overview
This console program offers users to choose coffee and add additional ingredients to them (for example: milk). Users can also choose a payment method and edit the payment.

# Used design patterns
**1️⃣ Factory Method**
- Making coffee:
   - Coffee Factory makes different types of coffee (Espresso, Cappuccino).
   - All types of coffee implement the Coffee interface.
- Making a payment:
   - PaymentFactory creates different payment methods (CreditCardPayment, PayPalPayment).

**2️⃣ Decorator**
- Adding an additional ingredient:
   - Classes like MilkDecorator dynamically change the price of coffee.

**3️⃣ Adapter**
- External API integration:
   - ExternalPaymentAPI works with an external API for payment processing.
   - PaymentAdapter adapts the API to the subsystem.

# 📂 Project Structure
```bash
Midterm_task/
│── src/
│   ├── main/java/org/example/
│   │   ├── coffee_shop/
│   │   │   ├── Coffee.java
│   │   │   ├── CoffeeFactory.java
│   │   │   ├── Cappuccino.java
│   │   │   ├── Espresso.java
│   │   │   ├── CoffeeDecorator.java
│   │   │   ├── MilkDecorator.java
│   │   ├── payment_gateway/
│   │   │   ├── PaymentMethod.java
│   │   │   ├── PaymentFactory.java
│   │   │   ├── CreditCardPayment.java
│   │   │   ├── PayPalPayment.java
│   │   │   ├── ExternalPaymentAPI.java
│   │   │   ├── PaymentAdapter.java
│   │   ├── Main.java
│── README.md
