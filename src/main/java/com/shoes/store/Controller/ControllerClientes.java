package com.shoes.store.Controller;


import com.shoes.store.Entity.Clientes;
import com.shoes.store.IService.IServiceClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/clientes")
public class ControllerClientes {

    private static final Logger logger = Logger.getLogger(ControllerClientes.class.getName());

    @Autowired
    private IServiceClientes serviceClientes;

    @GetMapping("/listarclientes")
    public List<Clientes> getClientes(){
        List<Clientes> clientes = serviceClientes.getClientes();
        return clientes;
    }

    @PostMapping("/registrocliente")
    public Clientes addCliente(@RequestBody Clientes cliente){
        Clientes clienter = serviceClientes.addCliente(cliente);
        return clienter;
    }

    @PutMapping("{id}")
    public void getCliente(@RequestBody Clientes cliente){

    }


}
