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
 * Clase para mappear la tabla catalogos
 * @author Carlos
 */
@Entity
@Table(name="bg_catalogos")
public class Catalogo extends Auditoria implements Serializable{

    @Column(name="codigo", unique=true, nullable=false)
    private String codigo;
    
    @Column(name="nombre", nullable=false)
    private String nombre;
    
    @Column(name="descipcion", length=200)
    private String descripcion;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_catalogo_id", referencedColumnName="id")
    private TipoCatalogo tipoCatalogo;

    public Catalogo() {
        
    }

    public Catalogo(Long id, boolean activo, String codigo, String nombre, 
                    String descripcion, TipoCatalogo tipoCatalogo) {
        super.setId(id);
        super.setActivo(activo);
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoCatalogo = tipoCatalogo;
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

    public TipoCatalogo getTipoCatalogo() {
        return tipoCatalogo;
    }

    public void setTipoCatalogo(TipoCatalogo tipoCatalogo) {
        this.tipoCatalogo = tipoCatalogo;
    }

    /**
     * Muestra la descripcion del objeto
     * @return
     */
    @Override
    public String toString() {
        return "[ " + (codigo != null ? codigo : "") + " ] - " + (descripcion != null ? descripcion : "");
    }
    
    
}
