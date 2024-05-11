package com.shoes.store.IRepository;

import com.shoes.store.Entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryProductos extends JpaRepository<Productos, Long> {
}
