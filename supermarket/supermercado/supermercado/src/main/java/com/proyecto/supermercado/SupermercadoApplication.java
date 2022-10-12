package com.proyecto.supermercado;

import com.proyecto.supermercado.model.repository.CustomerRepository;
import com.proyecto.supermercado.model.repository.EmpleadoRepository;
import com.proyecto.supermercado.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SupermercadoApplication implements CommandLineRunner {

    public static void main(String[] args) {
      SpringApplication.run(SupermercadoApplication.class, args);
    }

    @Autowired private EmpleadoRepository empleadoRepository;
    @Autowired private CustomerRepository customerRepository;
    @Autowired private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
      // Sirve solo para crear los primeros elementos en la base de datos.
/*
      Empleado empleado1 = new Empleado("Jose", "Perez", "jose@gmail.com");
      empleadoRepository.save(empleado1);

      Empleado empleado2 = new Empleado("Cristiano", "Ronaldo", "cr7@gmail.com");
      empleadoRepository.save(empleado2);

      Empleado empleado3 = new Empleado("Lionel", "Messi", "elultimo10@gmail.com");
      empleadoRepository.save(empleado3);

 */
    }
  }
