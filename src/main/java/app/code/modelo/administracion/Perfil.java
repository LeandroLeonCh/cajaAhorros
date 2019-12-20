/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.administracion;

import app.code.modelo.Auditoria;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Clase para mappear la tabla perfiles
 * @author Carlos
 */
@Entity
@Table(name="bg_perfiles")
public class Perfil extends Auditoria implements Serializable{
    
    @Column(name="codigo", unique=true)
    private String codigo;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="descripcion")
    private String descripcion;
    
    public Perfil() {
      
    }
     
    public Perfil(Long id, boolean activo, String codigo, String nombre, String descripcion) {
        super.setId(id);
        super.setActivo(activo);
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "[ " + (codigo != null ? codigo : "") + " ] - " + (nombre !=null ? nombre : "");
    }
    
    
    
}
