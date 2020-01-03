/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.general;

import app.code.modelo.Auditoria;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Clase para mappear la tabla localidades
 * @author Carlos
 */
@Entity
@Table(name="bg_localidades")
public class Localidad extends Auditoria implements Serializable {

    @Column(name="codigo", unique=true, nullable=false)
    private String codigo;
    
    @Column(name="nombre", nullable=false)
    private String nombre;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_localidad_id", referencedColumnName="id")
    private TipoCatalogo tipoLocalidad;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="localidad_padre_id", referencedColumnName="id")
    private Localidad localidadPadre;
        
    public Localidad() {
        
    }

    public Localidad(Long id, boolean activo, String codigo, String nombre, 
            TipoCatalogo tipoLocalidad, Localidad localidadPadre) {
        super.setId(id);
        super.setActivo(activo);
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoLocalidad = tipoLocalidad;
        this.localidadPadre = localidadPadre;
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

    /**
     * Muestra la descripcion del objeto
     * @return
     */
    @Override
    public String toString() {
        return "[ " + (codigo != null ? codigo : "") + " ] - " + (nombre != null ? nombre : "");
    }
    
    
}
