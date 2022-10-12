package com.proyecto.supermercado.model.repository;

import com.proyecto.supermercado.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
