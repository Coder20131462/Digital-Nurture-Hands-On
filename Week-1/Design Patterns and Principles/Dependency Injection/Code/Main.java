public class Main{

    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);

        String customer = customerService.findCustomer(1);
        System.out.println("Found customer: " + customer);

        customer = customerService.findCustomer(2);
        System.out.println("Found customer: " + customer);
    }
}