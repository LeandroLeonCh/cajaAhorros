/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.contabilidad;

import app.code.common.GeneralExeption;
import app.code.modelo.contabilidad.CuentaContable;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceException;
import javax.persistence.Tuple;

/**
 *
 * @author fanny
 */
public class RegistroContable {
     private final ControladorCuentaContable controladorCuentaContable;
    
    public RegistroContable(EntityManagerFactory entityManager){
        this.controladorCuentaContable = new ControladorCuentaContable(entityManager);
    }
    
    public void guaradarCuentaContable(CuentaContable cuentaContable) throws GeneralExeption{
        try {
            controladorCuentaContable.guaradar(cuentaContable);
        } catch (PersistenceException e) {
            throw new GeneralExeption("La cuenta ya esta registrada");
        }
    }
//    public List<Tuple> obtenerCatalogosPorRango(String criterio, int pagina){
//        return controladorCuentaContable.obtenerCatalogosPorRango(criterio, 5, pagina);
//    }
    
    public List<CuentaContable> listaCuentaContable(){
        return controladorCuentaContable.listaCuentaContable();
    }
    
    /*
    public List<Tuple> obtenerCatalogosPorRango(String criterio, int pagina){
        return controladorCatalogo.obtenerCatalogosPorRango(criterio, 5, pagina);
    }
    
    public void guardarTipoCatalogo(TipoCatalogo tipoCatalogo) throws GeneralExeption {
        controladorTipoCatalogo.guardar(tipoCatalogo);
    }
    
    public List<TipoCatalogo> obtenerListaTiposCatalogos() {
        return controladorTipoCatalogo.obtenerTiposCatalogos();
    }
    
    */
    
}
