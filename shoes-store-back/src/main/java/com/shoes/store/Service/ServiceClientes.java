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
    public Optional<Clientes> listClienteId(Long id) {
        Optional<Clientes> clientesList = this.repositryClientes.findById(id);
        return clientesList;
    }

    @Override
    public Clientes addCliente(Clientes cliente) {
        Clientes clientes = this.repositryClientes.save(cliente);
        return clientes;
    }

    @Override
    public void deleteCliente(Long id) {
        repositryClientes.deleteById(id);
    }

    @Override
    public void updateCliente(Long id, Clientes cliente) {

       Clientes clientesexisten = repositryClientes.findById(id).orElseThrow();
        clientesexisten.setNombreCliente(cliente.getNombreCliente());
        clientesexisten.setApellidoCliente(cliente.getApellidoCliente());
        clientesexisten.setCiudad(cliente.getCiudad()) ;
        clientesexisten.setTelefono(cliente.getTelefono());
        clientesexisten.setTipoidentificacion(cliente.getTipoidentificacion());
        clientesexisten.setDireccion(cliente.getDireccion());
        clientesexisten.setEstado(cliente.getEstado());

        repositryClientes.save(clientesexisten);
    }

    @Override
    public List<Clientes> findByNombreCliente(String nombreCliente) {
        return repositryClientes.findByNombreCliente(nombreCliente);
    }
}
