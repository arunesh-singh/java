interface PaymentMethod { void pay(double amount); }

class CreditCardPayment implements PaymentMethod {
    private String cardNumber, cardHolderName;
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber; this.cardHolderName = cardHolderName;
    }
    public void pay(double amount) {
        System.out.println("Card: " + cardHolderName + ", $" + amount);
    }
}

class PayPalPayment implements PaymentMethod {
    private String email;
    public PayPalPayment(String email) { this.email = email; }
    public void pay(double amount) {
        System.out.println("PayPal: " + email + ", $" + amount);
    }
}

class OnlineStore {
    private PaymentMethod paymentMethod;
    public OnlineStore(PaymentMethod paymentMethod) { this.paymentMethod = paymentMethod; }
    public void checkout(double amount) { paymentMethod.pay(amount); }
}

public class pract9 {
    public static void main(String[] args) {
        new OnlineStore(new CreditCardPayment("1234567890123456", "John")).checkout(150.75);
        new OnlineStore(new PayPalPayment("john@ex.com")).checkout(89.99);
    }
}
