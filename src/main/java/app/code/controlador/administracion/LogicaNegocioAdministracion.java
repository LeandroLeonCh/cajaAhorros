/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.administracion;

import app.code.common.GeneralExeption;
import app.code.modelo.administracion.Pantalla;
import app.code.modelo.administracion.Usuario;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Carlos
 */
public class LogicaNegocioAdministracion {
  
    // Declarion de todos los contorladores del modulo
    private final ControladorUsuario controladorUsuario;
    private final ControladorPantalla controladorPantalla;
    
    public LogicaNegocioAdministracion(SessionFactory sessionFactory){
        this.controladorUsuario = new ControladorUsuario(sessionFactory);
        this.controladorPantalla = new ControladorPantalla(sessionFactory);
    }

    public boolean guardarUsuario(Usuario usuario) throws GeneralExeption {
        return controladorUsuario.guardarUsuario(usuario);
    }

    public List<Usuario> obtenerUsuariosPorRango(String criterio, int pagina) {
        return controladorUsuario.obtenerUsuarioPorRango(criterio, 5, pagina);
    }
    
    
    public List<Pantalla> obtnerPantallaPorRango(String criterio, int pagina) {
        return controladorPantalla.obtnerPantallaPorRango(criterio, 20, pagina);
    }
    
    
    public boolean guardarPantalla(Pantalla pantalla){
        return controladorPantalla.guardarPantalla(pantalla);
    }

    public ControladorUsuario getControladorUsuario() {
        return controladorUsuario;
    }

    public ControladorPantalla getControladorPantalla() {
        return controladorPantalla;
    }

    
}
