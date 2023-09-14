package com.dummy.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dummy.customerapp.Customer;
import com.dummy.customerapp.dao.CustomerDao;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;
    
    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }

    public List<Customer> getCustomersByCountry(String country) {
        return customerDao.findByCountry(country);   
    }

    public List<Customer> getCustomersByCity(String city) {
        return customerDao.findByCity(city);
    }

    public List<Customer> getCustomersByPostalCode(String postalCode) {
        return customerDao.findByPostalCode(postalCode);
    }

    public String addCustomer(Customer customer) {
        customerDao.save(customer);
        return "Successfully added";
    }
}
