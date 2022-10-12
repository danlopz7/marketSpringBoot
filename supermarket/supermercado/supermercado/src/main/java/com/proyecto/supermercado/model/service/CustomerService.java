package com.proyecto.supermercado.model.service;

import com.proyecto.supermercado.model.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer saveCustomer(Customer client);
    Customer updateCustomer(Customer client);
    void deleteCustomerById(Long id);

}
