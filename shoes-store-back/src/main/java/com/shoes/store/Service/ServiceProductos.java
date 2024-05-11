package com.shoes.store.Service;

import com.shoes.store.Entity.Productos;
import com.shoes.store.IRepository.IRepositoryProductos;
import com.shoes.store.IService.IServiceProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProductos implements IServiceProductos {

    @Autowired
    private IRepositoryProductos repositoryProductos;

    @Override
    public List<Productos> getProductos() {
        return this.repositoryProductos.findAll();
    }

    @Override
    public Productos getProducto(Long id) {
        Productos productos = this.repositoryProductos.findById(id).orElse(null);
        return productos;
    }

    @Override
    public void addProducto(Productos producto) {

    }

    @Override
    public void deleteProducto(Long id) {

    }
}
