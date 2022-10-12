package com.proyecto.supermercado.model.repository;

import com.proyecto.supermercado.model.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
