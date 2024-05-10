package com.shoes.store.IService;

import com.shoes.store.Entity.DescripcionVenta;

import java.util.List;

public interface IServiceDescripcionVentas {

    public List<DescripcionVenta> getDescripcionVentas();
    public DescripcionVenta getDescripcionVenta(Long id);
    public void addDescripcionVenta(DescripcionVenta descripcionVenta);
    public void deleteDescripcionVenta(Long id);

}
