/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.administracion;

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
@Table(name = "bg_usuarios")
public class Usuario extends Auditoria implements Serializable {

    @Column(name = "username")
    private String usuario;

    @Column(name = "contrasenia")
    private String contrasenia;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "es_admin")
    private boolean esAdmin;

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public Usuario(String usuario, String contrasenia, String nombre, String apellido, boolean esAdmin, Long id, boolean activo) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esAdmin = esAdmin;
    }

}
