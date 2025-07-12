public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        double amount = 1276.56;
        PaymentStrategy cards = new CreditCardPayment("Rishi Kesh Rai",34000.00);
        paymentContext.setPaymentContext(cards);
        paymentContext.executePayment(amount);
    }
}