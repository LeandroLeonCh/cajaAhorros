/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.general;

import app.code.modelo.Auditoria;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Carlos
 */
@Entity
@Table(name="gnr_tipos_catalogos")
public class TipoCatalogo extends Auditoria {
    
    @Column(name="codigo", unique=true, nullable=false)
    private String codigo;
    
    @Column(name="nombre", nullable=false)
    private String nombre;
    
    @Column(name="descipcion", length=200)
    private String descripcion;
    
    @OneToMany(mappedBy="Catalogo")
    private Set<Catalogo> listaCatalogos;

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

    public Set<Catalogo> getListaCatalogos() {
        return listaCatalogos;
    }

    public void setListaCatalogos(Set<Catalogo> listaCatalogos) {
        this.listaCatalogos = listaCatalogos;
    }
   
}
