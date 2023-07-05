package com.comfenalco.productos.productos.resository;

import org.springframework.data.repository.CrudRepository;
import com.comfenalco.productos.productos.resository.entities.Producto;

public interface ProductoRepository extends CrudRepository<Producto,Long> {
    
}


