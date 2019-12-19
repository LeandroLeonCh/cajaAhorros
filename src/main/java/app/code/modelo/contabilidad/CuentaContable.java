/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.contabilidad;

import app.code.modelo.Auditoria;
import app.code.modelo.general.Catalogo;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author Carlos
 */

@Entity 
@Table(name="bg_cuentas_contables")
public class CuentaContable extends Auditoria{
     
    @Id 
    private Long id;
    
    @Column(name="codigo", unique=true, nullable=false)
    private String codigo;
    
    @Column(name="nombre", nullable=false)
    private String nombre;
    
    @Column(name="descripcion", length=200)
    private String descripcion;
    
    @Column(name="es_total")
    private boolean esTotal;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="cat_id", referencedColumnName="id")
    private Catalogo catalago;
    
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="cue_con_id", referencedColumnName="id")
    private CuentaContable cuentaPadre;

    public CuentaContable(Long id, boolean activo) {
        super(id, activo);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public boolean isEsTotal() {
        return esTotal;
    }

    public void setEsTotal(boolean esTotal) {
        this.esTotal = esTotal;
    }

    public Catalogo getCatalago() {
        return catalago;
    }

    public void setCatalago(Catalogo catalago) {
        this.catalago = catalago;
    }

    public CuentaContable getCuentaPadre() {
        return cuentaPadre;
    }

    public void setCuentaPadre(CuentaContable cuentaPadre) {
        this.cuentaPadre = cuentaPadre;
    }
    
    
}
