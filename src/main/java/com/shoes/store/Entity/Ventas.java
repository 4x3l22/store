package com.shoes.store.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "total", nullable = false, length = 45)
    private String total;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @Column(name = "fecha_venta", nullable = false)
    private LocalDate fechaVenta;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Clientes clientes;

    @OneToMany(mappedBy = "ventas")
    private Set<DescripcionVenta> descripcionVentas  = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
}

