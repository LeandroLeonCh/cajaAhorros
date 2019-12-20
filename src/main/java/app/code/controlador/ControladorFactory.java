/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador;

import app.code.controlador.general.LogicaNegocioGeneral;
import javax.persistence.Persistence;
import org.hibernate.SessionFactory;

/**
 *
 * @author Carlos
 */
public class ControladorFactory {
    
    // Declaracion de la intancia de la clase
    private static ControladorFactory INSTANCIA;
    
    // Declaracion de todos los modulos
    public final LogicaNegocioGeneral GENERAL;

    private ControladorFactory(){
        // Crea la session de la empresa
        SessionFactory sessionAcitive = Persistence
                .createEntityManagerFactory("caja_ahorros")
                .unwrap(SessionFactory.class);
        
        // Instancia los registro de los modulos
        this.GENERAL = new LogicaNegocioGeneral(sessionAcitive);
    }
    
    public static ControladorFactory getInstancia(){
        if(INSTANCIA == null){
            INSTANCIA = new ControladorFactory();
        }
        return INSTANCIA;
    }
    
    
}
