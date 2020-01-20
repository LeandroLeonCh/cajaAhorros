/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.common.MultiResultTransformer;
import app.code.modelo.general.TipoCatalogo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Carlos
 */
public final class ControladorTipoCatalogo {
    
    private final SessionFactory sessionFactory;
    
    public ControladorTipoCatalogo(SessionFactory sessionFactory) {
         this.sessionFactory = sessionFactory;
    }
    
    public Session getCurrentSession() {
        return sessionFactory.openSession();
    }
    
    
    public boolean guardar(TipoCatalogo tipoCatalogo) {
        Session session = getCurrentSession();
        try {
            return tipoCatalogo.guardar(session);
        } finally {
            session.close();
        }
    }
   
    
    public List<TipoCatalogo> obtenerTiposCatalogos(String criterio, int maxResults, int firstResult) {
        return obtenerTiposCatalogos(criterio, maxResults, firstResult, false);
    }

    private List<TipoCatalogo> obtenerTiposCatalogos(String criterio, int maxResults, int firstResult, boolean activos) {
        Session session = getCurrentSession();
        try {
            Criteria criteria = session.createCriteria(TipoCatalogo.class, "TIP");
            criteria.setProjection(Projections.projectionList()
                    .add(Projections.property("TIP.id"), "id")
                    .add(Projections.property("TIP.activo"), "activo")
                    .add(Projections.property("TIP.codigo"), "codigo")
                    .add(Projections.property("TIP.nombre"), "nombre"));
            if(activos){
                criteria.add(Restrictions.eq("TIP.activo", true));
            }
            criteria.add(Restrictions.or(
                Restrictions.ilike("TIP.codigo", "%" + criterio + "%"),
                Restrictions.ilike("TIP.nombre", "%" + criterio + "%"))
            );
            criteria.setResultTransformer(new MultiResultTransformer(TipoCatalogo.class));
            return criteria.setMaxResults(maxResults)
                    .setFirstResult(firstResult)
                    .list();
        } finally {
            session.close();
        }
    }
    
}
