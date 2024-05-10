package com.shoes.store.IRepository;

import com.shoes.store.Entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositryClientes extends JpaRepository<Clientes, Long> {
}
