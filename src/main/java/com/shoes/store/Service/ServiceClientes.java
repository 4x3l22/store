package com.shoes.store.Service;

import com.shoes.store.Entity.Clientes;
import com.shoes.store.IRepository.IRepositryClientes;
import com.shoes.store.IService.IServiceClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceClientes implements IServiceClientes {

    @Autowired
    private IRepositryClientes repositryClientes;

    @Override
    public List<Clientes> getClientes() {
        return this.repositryClientes.findAll();
    }

    @Override
    public void getCliente(Long id) {

    }

    @Override
    public Clientes addCliente(Clientes cliente) {
        Clientes clientes = this.repositryClientes.save(cliente);
        return clientes;
    }

    @Override
    public void deleteCliente(Long id) {

    }
}
