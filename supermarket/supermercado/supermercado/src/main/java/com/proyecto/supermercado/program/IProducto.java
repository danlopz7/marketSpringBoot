package com.proyecto.supermercado.program;

import com.proyecto.supermercado.program.contenedores.Contenedor;
import com.proyecto.supermercado.program.enums.Categoria;

public interface IProducto {
    String getReferencia();

    double getPrecio();

    float getPeso();

    boolean tengoEspacio(IContenedor contenedor);

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible(IProducto p);

    void meter(Contenedor contenedor);
}
