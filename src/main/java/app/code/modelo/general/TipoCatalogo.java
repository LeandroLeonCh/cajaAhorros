/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.general;

import app.code.modelo.Auditoria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Clase para mappear la tabla tipos catalogos
 * @author Carlos
 */
@Entity
@Table(name="bg_tipos_catalogos")
public class TipoCatalogo extends Auditoria implements Serializable{

    @Column(name="codigo", unique=true, nullable=false, length=20)
    private String codigo;
    
    @Column(name="nombre", nullable=false, length=100)
    private String nombre;
    
    @Column(name="descipcion", length=200)
    private String descripcion;
    
    @OneToMany(mappedBy = "tipoCatalogo", fetch=FetchType.LAZY)
    private List<Catalogo> listaCatalogos;

    public TipoCatalogo() {
        
    }
    
    public TipoCatalogo(Long id) {
        super.setId(id);
    }
       
    public TipoCatalogo(Long id, boolean activo, String codigo, String nombre) {
        super.setId(id);
        super.setActivo(activo);
        this.codigo = codigo;
        this.nombre = nombre;
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

    public List<Catalogo> getListaCatalogos() {
        return listaCatalogos;
    }

    public void setListaCatalogos(List<Catalogo> listaCatalogos) {
        this.listaCatalogos = listaCatalogos;
    }

    @Override
    public String toString() {
        return "[ " + (codigo != null ? codigo : "") + " ] - " + (nombre != null ? nombre : "");
    }
   
    
}
