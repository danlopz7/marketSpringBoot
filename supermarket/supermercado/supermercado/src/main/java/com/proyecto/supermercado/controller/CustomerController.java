package com.proyecto.supermercado.controller;

import com.proyecto.supermercado.model.entity.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

    @GetMapping("/pages/Customers")
    public String customers() {
    return "pages/Customers";
    }

   /* @GetMapping("/pages/Customers/new")
    public String createCustomerForm(Model model){
        //create empleado object to hold student form data
        // CREAR OBJETO CUSTOMER Empleado empleado = new Empleado();
        model.addAttribute("empleado", empleado);
        return "pages/create_customers";
    }*/
}
