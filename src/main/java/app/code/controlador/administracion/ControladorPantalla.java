/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.administracion;

import app.code.common.MultiResultTransformer;
import app.code.modelo.administracion.Pantalla;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.ResultTransformer;

/**
 *
 * @author JuancUyaguari
 */
public class ControladorPantalla {

    private final SessionFactory sessionFactory;

    public ControladorPantalla(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public Session getCurrentSession() {
        return sessionFactory.openSession();
    }

    public boolean guardarPantalla(Pantalla pantalla) {
        Session session = getCurrentSession();
        try {
            session.getTransaction().begin();
            boolean guardado =pantalla.guardar(session);
            session.getTransaction().commit();
            return guardado;
        } finally {
            session.close();
        }

    }
    
    public Pantalla buscarPantalla(Long id) {
        Session session = getCurrentSession();
        try {
            Criteria criteria = session.createCriteria(Pantalla.class, "PAN")
                    .createAlias("PAN.tipoPantalla", "TIP", JoinType.INNER_JOIN);
            criteria.setProjection(Projections.projectionList()
                    .add(Projections.property("PAN.id"), "id")
                    .add(Projections.property("PAN.activo"), "activo")
                    .add(Projections.property("PAN.codigo"), "codigo")
                    .add(Projections.property("PAN.nombre"), "nombre")
                    .add(Projections.property("PAN.esAccion"), "esAccion")
                    .add(Projections.property("TIP.id"), "tipoPantalla.id")
            );

            criteria.add(Restrictions.eq("PAN.id", id));

            criteria.setResultTransformer(new MultiResultTransformer(Pantalla.class));
            return (Pantalla) criteria.uniqueResult();

        } finally {
            session.close();
        }
    }
    
    public List<Pantalla> obtnerPantallaPorRango(String cirterio, int maxResults, int firstResult){
        return obtnerPantallaPorRango(cirterio, maxResults, firstResult, false);
    }
    
    public List<Pantalla> obtnerPantallaPorRango(String criterio, int maxResults, int firstResult, boolean activos) {
        Session session = getCurrentSession();
        try {
            // Arma el query y los joins
            Criteria criteria = session.createCriteria(Pantalla.class, "PAN")
                    .createAlias("PAN.tipoPantalla", "TIP", JoinType.INNER_JOIN);
         
            // Agrego las columnas que quiero obtener
            criteria.setProjection(Projections.projectionList()
                    .add(Projections.property("PAN.id"), "id")
                    .add(Projections.property("PAN.activo"), "activo")
                    .add(Projections.property("PAN.codigo"), "codigo")
                    .add(Projections.property("PAN.nombre"), "nombre")
                    .add(Projections.property("PAN.esAccion"), "esAccion")
                    .add(Projections.property("TIP.id"), "tipoPantalla.id")
                    .add(Projections.property("TIP.codigo"), "tipoPantalla.codigo")
                    .add(Projections.property("TIP.nombre"), "tipoPantalla.nombre")
            );
            
            if (activos) {
                criteria.add(Restrictions.eq("PAN.activo", true));
            }
            // Agrega los criterios de busqueda
            criteria.add(Restrictions.or(
                    Restrictions.ilike("PAN.codigo", "%" + criterio + "%"),
                    Restrictions.ilike("PAN.nombre", "%" + criterio + "%"))
            );
            // Agrega el tipo de resultado a retornar
            criteria.setResultTransformer(new MultiResultTransformer(Pantalla.class));
            
            return criteria.setMaxResults(maxResults)
                    .setFirstResult(firstResult)
                    .list();
        } finally {
            session.close();
        }
    }
    
}
