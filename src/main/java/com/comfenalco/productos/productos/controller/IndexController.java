package com.comfenalco.productos.productos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController


public class IndexController {
    @GetMapping("/saludar")
     public String holaMundo(){
         return "Hola mundo Desde Spring boot Microservicios";
     }

     @GetMapping("/saludar/{nombre}")
    public String saludar(@PathVariable String nombre){
         return "saludo..:"+ nombre;
     }
}

