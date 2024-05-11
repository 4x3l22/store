package com.shoes.store.Controller;


import com.shoes.store.Entity.Clientes;
import com.shoes.store.Entity.DescripcionVenta;
import com.shoes.store.Entity.Productos;
import com.shoes.store.IService.IServiceDescripcionVentas;
import com.shoes.store.IService.IServiceProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/descripcionventa")
public class ControllerDescripcionVenta {

    private static final Logger logger = Logger.getLogger(ControllerDescripcionVenta.class.getName());

    @Autowired
    private IServiceDescripcionVentas serviceDescripcionVentas;

    @GetMapping("/listardescripcionven")
    public List<DescripcionVenta> getDescripcionVentas(){
        List<DescripcionVenta> descripcionVentas = serviceDescripcionVentas.getDescripcionVentas();
        return descripcionVentas;
    }

    @PostMapping("/registrodescripcionven")
    public ResponseEntity<DescripcionVenta> addDescripcionVenta(@RequestBody DescripcionVenta descripcionVenta){
        serviceDescripcionVentas.addDescripcionVenta(descripcionVenta);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
