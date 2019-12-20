/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import org.hibernate.Session;

/**
 *
 * @author Carlos
 */
@MappedSuperclass
public abstract class Auditoria {

    @Id 
    @GeneratedValue
    @Column(name="id", nullable=false)
    private Long id;

    @Column(name="activo", nullable=false)
    private boolean activo;
    
    @Column(name="usuario_registro", nullable=false, updatable=false)
    private Long usuarioRegistro;
        
    @Column(name="fecha_registro", nullable=false, updatable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaRegistro;
    
    public boolean guardar(Session session){
        if(this.id == null){
            this.setActivo(true);
            this.setFechaRegistro(new Date());
            this.setUsuarioRegistro(Long.valueOf(1));
        }
        return session.save(this) != null;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Long getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Long usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? this.id.hashCode() : 0);
        return hash;
    }


}
