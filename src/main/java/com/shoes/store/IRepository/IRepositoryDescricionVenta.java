package com.shoes.store.IRepository;

import com.shoes.store.Entity.DescripcionVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryDescricionVenta extends JpaRepository<DescripcionVenta, Long> {
}
