/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador;

import app.code.controlador.administracion.ControladorPantalla;
import app.code.controlador.general.RegistroGeneral;
import app.code.controlador.usuario.ControladorUsuario;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Carlos
 */
public class ControladorFactory {
    
    // Declaracion de la intancia de la clase
    private static ControladorFactory INSTANCIA;
    
    // Declaracion de todos los modulos
    public final RegistroGeneral GENERAL;
    public RegistroGeneral CONTABILIDAD;
    public final ControladorUsuario USUARIO;
    public final ControladorPantalla PANTALLA;
    
    private ControladorFactory(){
        // Crea el manager de persistencia
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("caja_ahorros");

        // Instancia los registro de los modulos
        this.GENERAL = new RegistroGeneral(entityManagerFactory);
        this.USUARIO = new ControladorUsuario(entityManagerFactory);
        this.PANTALLA = new ControladorPantalla(entityManagerFactory);
    }
    
    public static ControladorFactory getInstancia(){
        if(INSTANCIA == null){
            INSTANCIA = new ControladorFactory();
        }
        return INSTANCIA;
    }
    
    
}
