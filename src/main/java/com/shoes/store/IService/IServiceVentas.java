package com.shoes.store.IService;

import com.shoes.store.Entity.Ventas;

import java.util.List;

public interface IServiceVentas {

    public List<Ventas> getVentas();
    public Ventas getVentas(Long id);
    public void addVentas(Ventas ventas);
    public void deleteVentas(Long id);

}
