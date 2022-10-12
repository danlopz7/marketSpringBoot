package com.proyecto.supermercado.controller;

import com.proyecto.supermercado.model.entity.Empleado;
import com.proyecto.supermercado.model.service.EmpleadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {

    private EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService){
        super();
        this.empleadoService = empleadoService;
    }

    //Handler method to handle list empleados and return mode and view.
    @GetMapping("/pages/empleados")
    public String listEmpleado(Model model){
        model.addAttribute("empleados", empleadoService.getAllEmpleados());
        return "pages/empleados";
    }

    @GetMapping("/pages/empleados/new")
    public String createEmpleadoForm(Model model){
        //create empleado object to hold student form data
        Empleado empleado = new Empleado();
        model.addAttribute("empleado", empleado);
        return "pages/create_empleado";
    }

    @PostMapping("/pages/empleados")
    public String saveEmpleado(@ModelAttribute("empleado") Empleado empleado){
        empleadoService.saveEmpleado(empleado);
        return "redirect:/pages/empleados";
    }

    @GetMapping("/pages/empleados/edit/{id}")
    public String editEmpleadoForm(@PathVariable Long id, Model model){
        model.addAttribute("empleado", empleadoService.getEmpleadoById(id));
        return "/pages/edit_empleado";
    }

    @PostMapping("/pages/empleados/{id}")
    public String updateEmpleado(@PathVariable Long id, @ModelAttribute("empleado") Empleado empleado, Model model){
        //get empleados from database by id
        Empleado existingEmpleado = empleadoService.getEmpleadoById(id);
        existingEmpleado.setId(id);
        existingEmpleado.setFirstName(empleado.getFirstName());
        existingEmpleado.setLastName(empleado.getLastName());
        existingEmpleado.setEmail(empleado.getEmail());

        //Save updated empleado object
        empleadoService.updateEmpleado(existingEmpleado);
        return "redirect:/pages/empleados";
    }

    //handler method for delete empleado request
    @GetMapping("/pages/empleados/{id}")
    public String deleteEmpleado(@PathVariable Long id){
        empleadoService.deleteEmpleadoById(id);
        return "redirect:/pages/empleados";
    }
}
