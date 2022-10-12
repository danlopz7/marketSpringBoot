package com.proyecto.supermercado.model.service;

import com.proyecto.supermercado.model.entity.Empleado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoService {

    List<Empleado> getAllEmpleados();
    Empleado saveEmpleado(Empleado empleado);
    Empleado getEmpleadoById(Long id);
    Empleado updateEmpleado(Empleado empleado);
    void deleteEmpleadoById(Long id);
}
