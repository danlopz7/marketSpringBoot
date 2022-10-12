package com.proyecto.supermercado.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "reference")
    private String reference;
    @Column(name = "prod_name")
    private String productName;
    @Column(name = "price")
    private double price;
    @Column(name = "weight")
    private float weight;
    @Column(name = "volume")
    private int volume;

    public Product(){}

    public Product(String reference, String productName, double price, float weight, int volume){
        this.reference = reference;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
