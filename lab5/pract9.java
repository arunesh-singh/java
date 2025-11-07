/*
 * Create an interface PaymentMethod with a method void pay(double amount).
 * Implement this interface in two classes: CreditCardPayment and PayPalPayment.
 * Write a class OnlineStore that accepts a PaymentMethod in its constructor and uses it to
 * process a payment.
 */

interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment...");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + maskCardNumber(cardNumber));
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful!");
    }

    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() > 4) {
            return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
        }
        return cardNumber;
    }
}

class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal Email: " + email);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful!");
    }
}

class OnlineStore {
    private PaymentMethod paymentMethod;

    public OnlineStore(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        System.out.println("=== Online Store Checkout ===");
        paymentMethod.pay(amount);
        System.out.println("=============================\n");
    }
}

public class pract9 {
    public static void main(String[] args) {
        CreditCardPayment creditCard = new CreditCardPayment("1234567890123456", "John Doe");
        PayPalPayment paypal = new PayPalPayment("john.doe@example.com");

        OnlineStore store1 = new OnlineStore(creditCard);
        store1.checkout(150.75);

        OnlineStore store2 = new OnlineStore(paypal);
        store2.checkout(89.99);
    }
}
