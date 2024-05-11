package com.shoes.store.IService;

import com.shoes.store.Entity.Clientes;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IServiceClientes {

    public List<Clientes> getClientes();
    public void getCliente(Long id);
    public Clientes addCliente(Clientes cliente);
    public void deleteCliente(Long id);
}
