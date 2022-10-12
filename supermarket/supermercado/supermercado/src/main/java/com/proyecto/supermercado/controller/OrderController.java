package com.proyecto.supermercado.controller;

import com.proyecto.supermercado.model.entity.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

    @GetMapping("/pages/Orders")
    public String orderController(){
        return "pages/Orders";
    }

}
