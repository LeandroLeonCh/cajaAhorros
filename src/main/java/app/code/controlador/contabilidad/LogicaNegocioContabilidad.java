/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.contabilidad;

import app.code.common.GeneralExeption;
import app.code.modelo.contabilidad.CuentaContable;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Carlos
 */
public class LogicaNegocioContabilidad {
  
    // Declarion de todos los contorladores del modulo
    private final ControladorCuentaContable controladorCuentaContable;
    
    public LogicaNegocioContabilidad(SessionFactory sessionFactory){
        this.controladorCuentaContable = new ControladorCuentaContable(sessionFactory);
    }

    
    public boolean guaradarCuentaContable(CuentaContable cuentaContable) throws GeneralExeption{
            return controladorCuentaContable.guardarCuentaContable(cuentaContable);
    }

    public List<CuentaContable> listaCuentaContable(String criterio, int pagina){
        return controladorCuentaContable.obtenerCuentasContablePorRango(criterio, 25, pagina);
    }

    public ControladorCuentaContable getControladorCuentaContable() {
        return controladorCuentaContable;
    }
    
    
}
