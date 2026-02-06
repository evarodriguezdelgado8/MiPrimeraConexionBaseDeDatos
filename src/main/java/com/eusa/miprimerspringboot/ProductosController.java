/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eusa.miprimerspringboot;

import java.util.Arrays;
import java.util.List;
import com.eusa.modelos.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DAW2
 */
@RestController
@RequestMapping("/api")
public class ProductosController {

    @GetMapping("/producto/{identificador}")
    public String obtenerProductoPorId(@PathVariable("identificador") String id) {
        return "Producto con ID: " + id;
    }
    
    @GetMapping("/buscar")
    public String buscarNombre(@RequestParam(name = "nombre", required = false) String nombre, @RequestParam(name = "categoria", required = false) String categoria) {
        if (nombre == null) {
            return "Mostrando todos los productos";
        }
        return "Buscando productos con nombre: " + nombre;
    }


}
