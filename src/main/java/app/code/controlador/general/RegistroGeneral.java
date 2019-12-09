/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.common.GeneralExeption;
import app.code.modelo.general.Catalogo;
import app.code.modelo.general.TipoCatalogo;
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
    
    public RegistroGeneral(EntityManagerFactory entityManager){
        this.controladorTipoCatalogo = new ControladorTipoCatalogo(entityManager);
        this.controladorCatalogo = new ControladorCatalogo(entityManager);
    }
    
    public void guardarCatalogo(Catalogo catalogo) throws GeneralExeption {
        try{
            controladorCatalogo.guardar(catalogo);
        }catch(PersistenceException ex){
            throw new GeneralExeption("El catalgo ya se encuentra registrado!");
        }
    }
    
    public List<Tuple> obtenerCatalogos(){
        return controladorCatalogo.obtenerCatalogos();
    }
    
    public void guardarTipoCatalogo(TipoCatalogo tipoCatalogo) throws GeneralExeption{
        controladorTipoCatalogo.guardar(tipoCatalogo);
    }
    
    // Registro de todos los metodos CONTROLADOR TIPO CATALGO
    public List<TipoCatalogo> obtenerListaTiposCatalogos() {
        return controladorTipoCatalogo.obtenerTiposCatalogos();
    }
    
}
