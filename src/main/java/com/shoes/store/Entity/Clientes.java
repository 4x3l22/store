package com.shoes.store.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_identificacion", nullable = false, length = 45)
    private String total;

    @Column(name = "identificacion", nullable = false)
    private String identificacion;

    @Column(name = "nombre_cliente", nullable = false)
    private String nombreCliente;

    @Column(name = "apellido_cliente", nullable = false, length = 45)
    private String apellidoCliente;

    @Column(name = "telefono", nullable = false, length = 15)
    private String telefono;

    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;

    @Column(name = "ciudad", nullable = false, length = 45)
    private String ciudad;

    @Column(name = "estado", nullable = false)
    private Boolean estado;

    @OneToMany(mappedBy = "clientes")
    private Set<Ventas> ventas = new HashSet<>();

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

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}

