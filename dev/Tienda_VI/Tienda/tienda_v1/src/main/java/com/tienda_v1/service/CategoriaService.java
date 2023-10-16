package com.tienda_v1.service;

import com.tienda_v1.domain.Categoria;
import java.util.List;

/**
 *
 * @author ferva
 */
public interface CategoriaService {
    //Se declara un metodo para obtener un arraylist de objetos categoria,
    //estos objetos vienen de la base de datos, todos los registros
    
    public List<Categoria> getCategorias(boolean activos);
    
    //Abajo se colocaran los metodos para hacer el CRUD de categorias(SEMANA6)
}
