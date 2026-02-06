/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eusa.miprimerspringboot;

import java.util.Arrays;
import java.util.List;
import com.eusa.modelos.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DAW2
 */
@RestController
@RequestMapping("/api")
public class UsuariosController {

    //Esto son llamadas GET
    @GetMapping("/users")
    public List<String> getAllUsers() {
        return Arrays.asList("Ana", "Luis", "Carlos");
    }

    @GetMapping("/user")
    public List<String> getUsers() {
        return Arrays.asList("Carlos");
    }
    
      @GetMapping("/usuario")
    public List<String> getUsersTest() {
        return Arrays.asList("Carlos");
    }

    @PostMapping("/usuario")
    public String crearUsuario(@RequestBody usuario usuario) {
// Aquí normalmente guardaríamos el usuario en una base de datos
        return "Usuario creado: " + usuario.getNombre();
    }

}
