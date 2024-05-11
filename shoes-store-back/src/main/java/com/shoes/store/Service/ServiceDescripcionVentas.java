package com.shoes.store.Service;

import com.shoes.store.Entity.DescripcionVenta;
import com.shoes.store.IRepository.IRepositoryDescricionVenta;
import com.shoes.store.IService.IServiceDescripcionVentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDescripcionVentas implements IServiceDescripcionVentas {

    @Autowired
    private IRepositoryDescricionVenta descripcionVenta;

    @Override
    public List<DescripcionVenta> getDescripcionVentas() {
        return this.descripcionVenta.findAll();
    }

    @Override
    public DescripcionVenta getDescripcionVenta(Long id) {
        DescripcionVenta descripcionVenta = this.descripcionVenta.findById(id).orElse(null);
        return descripcionVenta;
    }

    @Override
    public void addDescripcionVenta(DescripcionVenta descripcionVenta) {

    }

    @Override
    public void deleteDescripcionVenta(Long id) {

    }
}
