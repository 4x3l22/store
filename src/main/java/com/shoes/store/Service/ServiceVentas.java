package com.shoes.store.Service;

import com.shoes.store.Entity.Ventas;
import com.shoes.store.IRepository.IRepositoryVentas;
import com.shoes.store.IService.IServiceVentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceVentas implements IServiceVentas {

    @Autowired
    private IRepositoryVentas repositoryVentas;

    @Override
    public List<com.shoes.store.Entity.Ventas> getVentas() {
        return this.repositoryVentas.findAll();
    }

    @Override
    public Ventas getVentas(Long id) {
        Optional<Ventas> ventas = this.repositoryVentas.findById(id);
        return ventas.orElse(null);
    }

    @Override
    public void addVentas(com.shoes.store.Entity.Ventas ventas) {

    }

    @Override
    public void deleteVentas(Long id) {

    }
}
