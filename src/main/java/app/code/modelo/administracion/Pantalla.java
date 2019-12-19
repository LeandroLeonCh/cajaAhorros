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
 *
 * @author JuancUyaguari
 */
@Entity
@Table(name="bg_pantallas")
public class Pantalla extends Auditoria implements Serializable {
    
    @Column(name="codigo", unique = true)
    private String codigo;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="ruta_acceso")
    private String rutaacceso;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="es_accion")
    private boolean accion;

    public Pantalla(Long id, boolean activo) {
        super(id, activo);
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

    public String getRutaacceso() {
        return rutaacceso;
    }

    public void setRutaacceso(String rutaacceso) {
        this.rutaacceso = rutaacceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isAccion() {
        return accion;
    }

    public void setAccion(boolean accion) {
        this.accion = accion;
    }

    public Pantalla(String codigo, String nombre, String rutaacceso, String descripcion, boolean accion, Long id, boolean activo) {
        super(id, activo);
        this.codigo = codigo;
        this.nombre = nombre;
        this.rutaacceso = rutaacceso;
        this.descripcion = descripcion;
        this.accion = accion;
    }
    
}

