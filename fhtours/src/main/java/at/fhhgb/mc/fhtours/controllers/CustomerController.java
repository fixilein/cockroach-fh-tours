package at.fhhgb.mc.fhtours.controllers;

import at.fhhgb.mc.fhtours.entities.Customer;
import at.fhhgb.mc.fhtours.services.CustomerService;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

//
@RepositoryRestController
public class CustomerController {
    //
    private final CustomerService customerService;

    //
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //
    @RequestMapping(method = POST, value = "/customer")
    public @ResponseBody
    ResponseEntity<?> createCustomers(@RequestBody Customer customer, HttpServletRequest request) {
        Customer createdCustomer = customerService.save(customer);
//
        URI createdUri = URI.create(request.getRequestURL().toString() + "/" + createdCustomer.getId());
        return ResponseEntity.created(createdUri).body(createdCustomer);
    }
}