package com.proyecto.supermercado.model.service;

import com.proyecto.supermercado.model.entity.Empleado;
import com.proyecto.supermercado.model.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductService {

    List<Product> getAllProducts();
    Product saveProduct(Product product);
    Product getProductById(Long id);
    Product updateProduct(Product product);
    void deleteProductById(Long id);
}
