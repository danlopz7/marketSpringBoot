package com.proyecto.supermercado.model.service.impl;

import com.proyecto.supermercado.model.entity.Customer;
import com.proyecto.supermercado.model.repository.CustomerRepository;
import com.proyecto.supermercado.model.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository){
        super();
        this.repository = repository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer client) {
        return repository.save(client);
    }

    @Override
    public Customer updateCustomer(Customer client) {
        return repository.save(client);
    }

    @Override
    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }
}
