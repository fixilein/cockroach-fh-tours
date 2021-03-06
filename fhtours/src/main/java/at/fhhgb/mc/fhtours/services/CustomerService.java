package at.fhhgb.mc.fhtours.services;

import at.fhhgb.mc.fhtours.entities.Customer;
import at.fhhgb.mc.fhtours.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

//
@Service
public class CustomerService {
    //
    private final CustomerRepository customerRepository;

    //
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}