public class AdapterPatternExample {

    public static void main(String[] args) {
        System.out.println("--- Adapter Pattern Example ---");

        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        PaytmGateway paytmgateway = new PaytmGateway();
        PaymentProcessor paytmadapter =new PaytmAdapter(paytmgateway);

        System.out.println("\nUsing Stripe Adapter:");
        stripeAdapter.processPayment(250.50);

        System.out.println("\nUsing PaytmAdapter:");
        paytmadapter.processPayment(155.35);

    }
}