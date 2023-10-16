/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_v1.service.impl;

import com.tienda_v1.dao.CategoriaDao;
import com.tienda_v1.domain.Categoria;
import com.tienda_v1.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoriaServiceImpl implements CategoriaService{
    
    @Autowired //La notacion Autowired crea un unico objeto mientras se ejecuta la aplicacion
    private CategoriaDao categoriaDao;
    
    public List<Categoria> getCategorias(boolean activos){
        var lista = categoriaDao.findAll();//Encuentra todos los datos de la lsta
        
        if(activos){
            lista.removeIf(e-> !e.isActivo());
            
        }
        return lista;
    }
    
}
