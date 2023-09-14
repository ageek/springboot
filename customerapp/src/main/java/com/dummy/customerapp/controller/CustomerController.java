package com.dummy.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dummy.customerapp.Customer;
import com.dummy.customerapp.service.CustomerService;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/allCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/country/{country}") 
    public List<Customer> getCustomersByCountry(@PathVariable String country) {
        return customerService.getCustomersByCountry(country);
    }

    @GetMapping("/city/{city}")
    public List<Customer> getCustomersByCity(@PathVariable String city) {
        return customerService.getCustomersByCity(city);
    }

    @GetMapping("/postalcode/{postalCode}")
    public List<Customer> getCustomersByPostalCode(@PathVariable String postalCode) {
        return customerService.getCustomersByPostalCode(postalCode);
    }

    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);

    }
    
}
