/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.administracion;

import app.code.modelo.Auditoria;
import javax.persistence.Column;

/**
 *
 * @author Carlos
 */
public class Perfil extends Auditoria {
    
    @Column(name="codigo", unique = true)
    private String codigo;
    
    @Column(name="codigo", unique = true)
    private String nombre;
    
    @Column(name="codigo", unique = true)
    private String descripcion;
    
}
