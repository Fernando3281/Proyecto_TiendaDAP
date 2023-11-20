package com.tienda_v1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable { //la serializacion funciona para almacenar varios datos en el disco

    private static final long serialVersionUID = 1L;//esta linea funciona como auto increment para la tabla

    @Id //tabla usuario tiene un identificador que va a ser el id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// los valores generados que tipo de estrategia utilizan, identico = sea igual en BD y en la clase
    @Column(name = "id_usuario")//identifica cual es el numbre en la base de datos
    private long idUsuario;
    private String username;
    private String password;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_usuario")
    List<Rol> roles;


}
