package com.tienda_v1.service;

import com.tienda_v1.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    // Se obtiene un listado de productos en un List
    public List<Producto> getProductos(boolean activos);
    
   // Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    // Se inserta un nuevo producto si el id del producto esta vacío
    // Se actualiza un producto si el id del producto NO esta vacío
    public void save(Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
    //Consulta tipo JPA
    public List<Producto>findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    //Consulta tipo JPQL
    public List<Producto>metodoJPQL(double precioInf, double precioSup);
    
    //Consulta con metodoNativo
    public List<Producto>metodoNativo(double precioInf, double precioSup);
}