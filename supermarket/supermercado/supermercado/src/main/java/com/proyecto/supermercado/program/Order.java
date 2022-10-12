package com.proyecto.supermercado.program;

import java.util.List;
import java.util.Set;

public class Order extends com.proyecto.supermercado.model.entity.Order implements IPedido{


    @Override
    public String getReferencia() {
        return null;
    }

    @Override
    public void addContenedor(IContenedor contenedor) {

    }

    @Override
    public IContenedor addProducto(IProducto producto) {
        return null;
    }

    @Override
    public Set<IProducto> getProductos() {
        return null;
    }

    @Override
    public List<IContenedor> getContenedores() {
        return null;
    }
}
