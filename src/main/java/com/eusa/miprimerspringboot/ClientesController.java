/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eusa.miprimerspringboot;

import com.eusa.modelos.clientes;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DAW2
 */
@RestController
@RequestMapping("/api2")
public class ClientesController {
 
    

    
      @GetMapping("/clientes")
    public List<String> getMisClientes() {
        return Arrays.asList("Carlos");
    }

    @PostMapping("/clientes")
    public String crearCliente(@RequestBody clientes cliente) {
// Aquí normalmente guardaríamos el usuario en una base de datos
        return "Clientes creado: " + cliente.getNombre();
    }
    
       @PutMapping("/clientes")
    public String actualizarCliente(@RequestBody clientes cliente) {
// Aquí normalmente guardaríamos el usuario en una base de datos
        return "Clientes creado: " + cliente.getNombre();
    }

    
       @DeleteMapping("/clientes")
    public String borrarCliente(@RequestBody clientes cliente) {
// Aquí normalmente guardaríamos el usuario en una base de datos
        return "Clientes creado: " + cliente.getNombre();
    }

            @PatchMapping("/clientes")
    public String actualizacionParcialCliente(@RequestBody clientes cliente) {
// Aquí normalmente guardaríamos el usuario en una base de datos
        return "Clientes creado: " + cliente.getNombre();
    }

    
    
}
