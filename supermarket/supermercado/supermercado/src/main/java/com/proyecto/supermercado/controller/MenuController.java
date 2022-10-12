package com.proyecto.supermercado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/home")
    public String index(){
        return "home";
    }
}
