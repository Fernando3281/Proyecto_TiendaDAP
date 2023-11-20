package com.tienda_v1.dao;

import com.tienda_v1.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ferva
 */
public interface UsuarioDao extends JpaRepository <Usuario, Long>{
    
    Usuario findByUsername(String username);
    
    Usuario findByUsernameandPassword(String username, String Password);
    
    Usuario findByUsernameOrCorreo(String username, String correo);
    
    boolean existByUsernameOrCorreo(String username, String correo);
}
