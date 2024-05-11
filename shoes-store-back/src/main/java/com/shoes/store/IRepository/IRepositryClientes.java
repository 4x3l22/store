package com.shoes.store.IRepository;

import com.shoes.store.Entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IRepositryClientes extends JpaRepository<Clientes, Long> {
    @Query("SELECT c FROM Clientes c WHERE c.nombreCliente LIKE %:nombreCliente%")
    public List<Clientes> findByNombreCliente(@Param("nombreCliente") String nombreCliente);
}
