package com.shoes.store.IService;

import com.shoes.store.Entity.Productos;

import java.util.List;

public interface IServiceProductos {

    public List<Productos> getProductos();
    public Productos getProducto(Long id);
    public void addProducto(Productos producto);
    public void deleteProducto(Long id);

}
