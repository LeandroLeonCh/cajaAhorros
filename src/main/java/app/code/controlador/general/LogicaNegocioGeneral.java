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
import org.hibernate.SessionFactory;

/**
 *
 * @author Carlos
 */
public class LogicaNegocioGeneral {
  
    // Declarion de todos los contorladores del modulo
    private final ControladorTipoCatalogo controladorTipoCatalogo;
    private final ControladorCatalogo controladorCatalogo;
    
    public LogicaNegocioGeneral(SessionFactory sessionFactory){
        this.controladorTipoCatalogo = new ControladorTipoCatalogo(sessionFactory);
        this.controladorCatalogo = new ControladorCatalogo(sessionFactory);
    }
    
    public boolean guardarCatalogo(Catalogo catalogo) throws GeneralExeption {
//        try{
            return controladorCatalogo.guardarCatalogo(catalogo);
////        }catch( Int ex){
//            throw new GeneralExeption("El catalgo ya se encuentra registrado!");
//        }
    }
    
    public List<Catalogo> obtenerCatalogosPorRango(String criterio, int pagina){
        return controladorCatalogo.obtenerCatalogosPorRango(criterio, 50, pagina);
    }

    public void guardarTipoCatalogo(TipoCatalogo tipoCatalogo) throws GeneralExeption {
        controladorTipoCatalogo.guardar(tipoCatalogo);
    }

    public List<TipoCatalogo> obtenerListaTiposCatalogos(String criterio, int pagina) {
        return controladorTipoCatalogo.obtenerTiposCatalogos(criterio, 24, pagina);
    }

    public ControladorTipoCatalogo getControladorTipoCatalogo() {
        return controladorTipoCatalogo;
    }

    public ControladorCatalogo getControladorCatalogo() {
        return controladorCatalogo;
    }
    
}
