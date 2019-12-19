/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.common.GeneralExeption;
import app.code.controlador.administracion.ControladorPantalla;
import app.code.controlador.contabilidad.ControladorCuentaContable;
import app.code.controlador.usuario.ControladorUsuario;
import app.code.modelo.administracion.Pantalla;
import app.code.modelo.contabilidad.CuentaContable;
import app.code.modelo.general.Catalogo;
import app.code.modelo.general.TipoCatalogo;
import app.code.modelo.usuario.Usuario;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Tuple;

/**
 *
 * @author Carlos
 */
public class RegistroGeneral {

    // Declarion de todos los contorladores del modulo
    private final ControladorTipoCatalogo controladorTipoCatalogo;
    private final ControladorCatalogo controladorCatalogo;
    private final ControladorUsuario controladorUsuario;
    private final ControladorPantalla controladorPantalla;
    private final ControladorCuentaContable controladorCuentaContable;

    public RegistroGeneral(EntityManagerFactory entityManager) {
        this.controladorTipoCatalogo = new ControladorTipoCatalogo(entityManager);
        this.controladorCatalogo = new ControladorCatalogo(entityManager);
        this.controladorUsuario = new ControladorUsuario(entityManager);
        this.controladorPantalla = new ControladorPantalla(entityManager);
        this.controladorCuentaContable = new ControladorCuentaContable(entityManager);
    }

    public void guardarCatalogo(Catalogo catalogo) throws GeneralExeption {
        try {
            controladorCatalogo.guardar(catalogo);
        } catch (PersistenceException ex) {
            throw new GeneralExeption("El catalgo ya se encuentra registrado!");
        }
    }

    public List<Tuple> obtenerCatalogosPorRango(String criterio, int pagina) {
        return controladorCatalogo.obtenerCatalogosPorRango(criterio, 5, pagina);
    }

    public void guardarTipoCatalogo(TipoCatalogo tipoCatalogo) throws GeneralExeption {
        controladorTipoCatalogo.guardar(tipoCatalogo);
    }

    public List<TipoCatalogo> obtenerListaTiposCatalogos() {
        return controladorTipoCatalogo.obtenerTiposCatalogos();
    }

    public void guardarUsuario(Usuario usuario) throws GeneralExeption {
        try {
            controladorUsuario.guardar(usuario);
        } catch (PersistenceException ex) {
            throw new GeneralExeption("El usuario ya se encuentra registrado");
        }
    }

    public List<Tuple> obtenerUsuariosPorRango(String criterio, int pagina) {
        return controladorUsuario.obtenerUsuarioPorRango(criterio, 5, pagina);
    }
    
    
    public void guardarPantalla(Pantalla pantalla){
        try {
            controladorPantalla.guardar(pantalla);
        } catch (PersistenceException e) {
        }
    }
    
     public void guaradarCuentaContable(CuentaContable cuentaContable) throws GeneralExeption{
        try {
            controladorCuentaContable.guaradar(cuentaContable);
        } catch (PersistenceException e) {
            throw new GeneralExeption("La cuenta ya esta registrada");
        }
    }

    public List<CuentaContable> listaCuentaContable(){
        return controladorCuentaContable.listaCuentaContable();
    }
}
