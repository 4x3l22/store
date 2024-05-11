package com.shoes.store.Controller;


import com.shoes.store.Entity.Clientes;
import com.shoes.store.Entity.Productos;
import com.shoes.store.IService.IServiceProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/productos")
public class ControllerProductos {

    private static final Logger logger = Logger.getLogger(ControllerProductos.class.getName());

    @Autowired
    private IServiceProductos serviceProductos;

    @GetMapping("/listarproductos")
    public List<Productos> getProductos(){
        List<Productos> productos = serviceProductos.getProductos();
        return productos;
    }

    @PostMapping("/registroproducto")
    public ResponseEntity<Clientes> addProducto(@RequestBody Productos productos){
        serviceProductos.addProducto(productos);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
