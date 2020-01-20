/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.administracion;

import app.code.modelo.Auditoria;
import app.code.modelo.general.Catalogo;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="es_accion")
    private boolean esAccion;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_pantalla_id", referencedColumnName="id")
    private Catalogo tipoPantalla;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="pantalla_padre_id", referencedColumnName="id")
    private Pantalla pantallaPadre;
        
    public Pantalla() {
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

    public boolean isEsAccion() {
        return esAccion;
    }

    public void setEsAccion(boolean esAccion) {
        this.esAccion = esAccion;
    }

    public Pantalla getPantallaPadre() {
        return pantallaPadre;
    }

    public void setPantallaPadre(Pantalla pantallaPadre) {
        this.pantallaPadre = pantallaPadre;
    }

    public Catalogo getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(Catalogo tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }
    
    

    public Pantalla(String codigo, String nombre, String descripcion, boolean accion, Long id, boolean esAccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.esAccion = esAccion;
    }
    
}

