package com.shoes.store.IRepository;

import com.shoes.store.Entity.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryVentas extends JpaRepository<Ventas, Long> {
}
