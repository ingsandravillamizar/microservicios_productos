package com.comfenalco.productos.productos.services.Impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comfenalco.productos.productos.resository.ProductoRepository;
import com.comfenalco.productos.productos.resository.entities.Producto;
import com.comfenalco.productos.productos.services.ProductoService;


@Service
public class ProductoServiceImpl implements ProductoService  {
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
       return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto findById(Long Id) {
       return productoRepository.findById(Id).orElse(null);
    }

    @Override
    @Transactional()
    public Producto save(Producto producto) {
      return productoRepository.save(producto);
    }

    @Override
       @Transactional()
    public void delete(Producto producto) {
        productoRepository.delete(producto);
    }
}
