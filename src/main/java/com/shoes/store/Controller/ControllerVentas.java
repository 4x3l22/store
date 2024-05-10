package com.shoes.store.Controller;

import com.shoes.store.Entity.Ventas;
import com.shoes.store.IService.IServiceVentas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/ventas")
public class ControllerVentas {

    private static final Logger logger = Logger.getLogger(ControllerVentas.class.getName());

    @Autowired
    private IServiceVentas serviceVentas;

    @GetMapping("/listarventas")
    public List<Ventas> getVentas(){
        List<Ventas> ventas = serviceVentas.getVentas();
        return ventas;
    }

    @PostMapping("/registroventas")
    public ResponseEntity<Ventas> addVentas(@RequestBody Ventas ventas){
        serviceVentas.addVentas(ventas);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
