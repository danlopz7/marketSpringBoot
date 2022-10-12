package com.proyecto.supermercado.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Container")
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reference;
    @Column(name = "type")
    private String type;

    public Container(){}

    public Container(String type){
        this.type = type;
    }

    @OneToMany
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
