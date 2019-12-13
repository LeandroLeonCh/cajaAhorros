/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.usuarios;

import javax.persistence.Entity;
import javax.persistence.Table;
import app.code.modelo.Auditoria;
import java.io.Serializable;
import javax.persistence.Column;

/**
 *
 * @author EstAngelMesiasJadanC
 */
@Entity
@Table(name="BG_USUARIOS")
public class Usuario extends Auditoria implements Serializable{
    
    @Column(name="username")
    private String usuario;
    
    @Column(name="password")
    private String contrasenia;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="es_admin")
    private boolean esAdmin;
        
    public Usuario(Long id, boolean activo) {
        super(id, activo);
    }
    
    
}
