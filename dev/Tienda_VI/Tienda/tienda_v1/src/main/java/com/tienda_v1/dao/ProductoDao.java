package com.tienda_v1.dao;

import com.tienda_v1.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ferva
 */
public interface ProductoDao extends JpaRepository <Producto, Long> {
    
}
