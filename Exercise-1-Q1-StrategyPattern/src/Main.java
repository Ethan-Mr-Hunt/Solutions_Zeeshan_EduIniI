public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Pay by Credit Card
        order.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        order.checkout(500);

        // Pay by PayPal
        order.setPaymentStrategy(new PayPalPayment("Sahil@gmail.com"));
        order.checkout(750);
    }
}

