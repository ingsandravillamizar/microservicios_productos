package com.comfenalco.productos.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comfenalco.productos.productos.resository.entities.Producto;
import com.comfenalco.productos.productos.services.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
   @Autowired
   private ProductoService productoService;

   @GetMapping("/productos")
   public List<Producto> index(){
       return productoService.findAll();
   }
}


 


 
