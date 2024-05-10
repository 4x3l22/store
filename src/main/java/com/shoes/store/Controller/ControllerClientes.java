package com.shoes.store.Controller;


import com.shoes.store.Entity.Clientes;
import com.shoes.store.IService.IServiceClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("api/v1/clientes")
public class ControllerClientes {

    private static final Logger logger = Logger.getLogger(ControllerClientes.class.getName());

    @Autowired
    private IServiceClientes serviceClientes;

    @GetMapping("/listarclientes")
    public List<Clientes> getClientes(){
        List<Clientes> productos = serviceClientes.getClientes();
        return productos;
    }

    @PostMapping("/registrocliente")
    public ResponseEntity<Clientes> addCliente(@RequestBody Clientes cliente){
        serviceClientes.addCliente(cliente);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
