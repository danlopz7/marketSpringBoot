package com.proyecto.supermercado.controller;

import com.proyecto.supermercado.model.entity.Product;
import com.proyecto.supermercado.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService){
        super();
        this.productService = productService;
    }

    @GetMapping("/pages/Products")
    public String productsController(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "pages/Products";
    }

    @GetMapping("/pages/Products/new")
    public String createProductForm(Model model){
        //create empleado object to hold student form data
        Product product = new Product();
        model.addAttribute("product", product);
        return "pages/create_products";
    }

    @PostMapping("/pages/Products")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/pages/Products";
    }

    @GetMapping("/pages/Products/edit/{id}")
    public String editProductForm(@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "/pages/edit_products";
    }

    @PostMapping("/pages/Products/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") Product product, Model model){
        //get empleados from database by id
        Product existingProduct = productService.getProductById(id);
        existingProduct.setId(id);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setWeight(product.getWeight());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setVolume(product.getVolume());
        existingProduct.setReference(product.getReference());

        //Save updated empleado object
        productService.updateProduct(existingProduct);
        return "redirect:/pages/Products";
    }


}
