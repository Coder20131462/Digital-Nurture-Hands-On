class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String findCustomer(int id) {
        return customerRepository.findCustomerById(id);
    }
}