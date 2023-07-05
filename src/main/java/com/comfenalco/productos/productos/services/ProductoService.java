package com.comfenalco.productos.productos.services;

import java.util.List;

import com.comfenalco.productos.productos.resository.entities.Producto;

public interface ProductoService {
    
    public List<Producto>findAll();

    public Producto findById(Long Id);

    public Producto save(Producto producto);

    public void delete(Producto producto);

}
