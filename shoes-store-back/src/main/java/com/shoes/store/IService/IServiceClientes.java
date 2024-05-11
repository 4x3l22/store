package com.shoes.store.IService;

import com.shoes.store.Entity.Clientes;

import java.util.List;
import java.util.Optional;

public interface IServiceClientes {

    public List<Clientes> getClientes();
    public Optional<Clientes> listClienteId(Long id);
    public Clientes addCliente(Clientes cliente);
    public void deleteCliente(Long id);
    public void updateCliente(Long id, Clientes cliente);
    public List<Clientes> findByNombreCliente(String nombreCliente);
}
