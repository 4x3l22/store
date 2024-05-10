package com.shoes.store.IService;

import com.shoes.store.Entity.Clientes;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IServiceClientes {

    public List<Clientes> getClientes();
    public Clientes getCliente(Long id);
    public void addCliente(Clientes cliente);
    public void deleteCliente(Long id);
}
