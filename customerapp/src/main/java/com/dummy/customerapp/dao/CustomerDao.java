package com.dummy.customerapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dummy.customerapp.Customer;


public interface CustomerDao extends JpaRepository<Customer, Integer>{
    List<Customer> findByCountry(String country);

    List<Customer> findByCity(String city);

    List<Customer> findByPostalCode(String postalCode);
}
