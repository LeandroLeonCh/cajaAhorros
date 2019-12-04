/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.modelo.contabilidad;

import app.code.modelo.Auditoria;
import javax.persistence.Id;
/**
 *
 * @author Carlos
 */
public class CuentaContable extends Auditoria{
   
    @Id 
    private Long id;
    
    
}
