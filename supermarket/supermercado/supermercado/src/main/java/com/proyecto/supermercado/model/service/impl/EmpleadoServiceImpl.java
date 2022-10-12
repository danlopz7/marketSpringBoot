package com.proyecto.supermercado.model.service.impl;

import com.proyecto.supermercado.model.entity.Empleado;
import com.proyecto.supermercado.model.repository.EmpleadoRepository;
import com.proyecto.supermercado.model.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository repository;

    @Autowired
    public EmpleadoServiceImpl(EmpleadoRepository empleadoRepository){
        super();
        this.repository = empleadoRepository;
    }

    @Override
    public List<Empleado> getAllEmpleados() {
        return repository.findAll();
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return repository.save(empleado);
    }

    @Override
    public Empleado getEmpleadoById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Empleado updateEmpleado(Empleado empleado) {
        return repository.save(empleado);
    }

    @Override
    public void deleteEmpleadoById(Long id) {
        repository.deleteById(id);
    }
}
