package com.shoes.store.Controller;


import com.shoes.store.Entity.Clientes;
import com.shoes.store.IService.IServiceClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
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

    @GetMapping("/listarporid/{id}")
    public Clientes listClienteId(@PathVariable Long id){
        Optional<Clientes> clientes = this.serviceClientes.listClienteId(id);
        return clientes.orElse(null);
    }

    @GetMapping("/filtrar/{nombreCliente}")
    public ResponseEntity<List<Clientes>> filtrarClientes(@PathVariable(name = "nombreCliente", required = false) String nombreCliente){
        List<Clientes> clientes = serviceClientes.findByNombreCliente(nombreCliente);
        return ResponseEntity.ok(clientes);
    }

    @PostMapping("/registrocliente")
    public Clientes addCliente(@RequestBody Clientes cliente){
        Clientes clienter = serviceClientes.addCliente(cliente);
        return clienter;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateCliente(@PathVariable("id") Long id, @RequestBody Clientes cliente){
        serviceClientes.updateCliente(id, cliente);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable("id") Long id){
        serviceClientes.deleteCliente(id);
        return ResponseEntity.ok().build();
    }
}
