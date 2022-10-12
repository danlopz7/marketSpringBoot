package com.proyecto.supermercado.model.service.impl;

import com.proyecto.supermercado.model.entity.Product;
import com.proyecto.supermercado.model.repository.CustomerRepository;
import com.proyecto.supermercado.model.repository.ProductRepository;
import com.proyecto.supermercado.model.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository){
        super();
        this.repository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        repository.deleteById(id);
    }
}
