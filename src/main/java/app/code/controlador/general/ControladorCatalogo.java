/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.common.MultiResultTransformer;
import app.code.modelo.general.Catalogo;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
/**
 *
 * @author Carlos
 */
public final class ControladorCatalogo {
    
    private final SessionFactory sessionFactory;
    
    public ControladorCatalogo(SessionFactory sessionFactory) {
         this.sessionFactory = sessionFactory;
    }

    public Session getCurrentSession() {
        return sessionFactory.openSession();
    }
    
    public boolean guardarCatalogo(Catalogo catalogo) {
        Session session = getCurrentSession();
        try {
            session.getTransaction().begin();
            boolean guardado = catalogo.guardar(session);
            session.getTransaction().commit();
            return guardado;
        } finally {
            session.close();
        }
    }
    
    public Catalogo buscarCatalogo(Long id) {
        Session session = getCurrentSession();
        try {
            // Arma el query y los joins
            Criteria criteria = session.createCriteria(Catalogo.class, "CAT")
                .createAlias("CAT.tipoCatalogo", "TIP");
            // Agrego las columnas que quiero obtener
            criteria.setProjection(Projections.projectionList()
                .add(Projections.property("CAT.id"), "id")
                .add(Projections.property("CAT.activo"), "activo")
                .add(Projections.property("CAT.codigo"), "codigo")
                .add(Projections.property("CAT.nombre"), "nombre")
                .add(Projections.property("CAT.descripcion"), "descripcion")
                .add(Projections.property("TIP.id"), "tipoCatalogo.id")
            );
            // Agrega los criterios de busqueda
            criteria.add(Restrictions.eq("CAT.id", id));
            
            // Agrega el tipo de resultado a retornar
            criteria.setResultTransformer(new MultiResultTransformer(Catalogo.class));
            
            // Retorna el resultado de la busqueda
            return (Catalogo) criteria.uniqueResult();
            
        } finally {
            session.close();
        }
    }
        
    public List<Catalogo> obtenerCatalogosPorTipo(Long tipoId) {
        Session session = getCurrentSession();
        try {
            // Arma el query y los joins
            Criteria criteria = session.createCriteria(Catalogo.class, "CAT")
                .createAlias("CAT.tipoCatalogo", "TIP", JoinType.INNER_JOIN,
                        Restrictions.and(Restrictions.eq("TIP.id", tipoId),
                                Restrictions.eq("TIP.estado", true)
                        )
                );
            // Agrego las columnas que quiero obtener
            criteria.setProjection(Projections.projectionList()
                .add(Projections.property("CAT.id"), "id")
                .add(Projections.property("CAT.codigo"), "codigo")
                .add(Projections.property("CAT.nombre"), "nombre")
            );
            // Agrega los criterios de busqueda
            criteria.add(Restrictions.eq("CAT.estado", true));
            
            // Agrega el tipo de resultado a retornar
            criteria.setResultTransformer(new MultiResultTransformer(Catalogo.class));
            
            // Retorna el resultado del query
            return criteria.list();
        } finally {
            session.close();
        }
    }

    public List<Catalogo> obtenerCatalogosPorRango(String criterio, int maxResults, int firstResult) {
        return obtenerCatalogosPorRango(criterio, maxResults, firstResult, false);
    }
    
    
    public List<Catalogo> obtenerCatalogosPorRango(String criterio, int maxResults, int firstResult, boolean activos) {
        Session session = getCurrentSession();
        try {
            // Arma el query y los joins
            Criteria criteria = session.createCriteria(Catalogo.class, "CAT")
                .createAlias("CAT.tipoCatalogo", "TIP", JoinType.INNER_JOIN);
            // Agrego las columnas que quiero obtener
            criteria.setProjection(Projections.projectionList()
                .add(Projections.property("CAT.id"), "id")
                .add(Projections.property("CAT.activo"), "activo")
                .add(Projections.property("CAT.codigo"), "codigo")
                .add(Projections.property("CAT.nombre"), "nombre")
                .add(Projections.property("CAT.descripcion"), "descripcion")
                .add(Projections.property("TIP.id"), "tipoCatalogo.id")
                .add(Projections.property("TIP.codigo"), "tipoCatalogo.codigo")
                .add(Projections.property("TIP.nombre"), "tipoCatalogo.nombre")
            );
            if (activos){
               criteria.add(Restrictions.eq("CAT.activo", true));
            }
            // Agrega los criterios de busqueda
            criteria.add(Restrictions.or(
                Restrictions.ilike("CAT.codigo", "%" + criterio + "%"),
                Restrictions.ilike("CAT.nombre", "%" + criterio + "%"))
            );
            
            // Agrega el tipo de resultado a retornar
            criteria.setResultTransformer(new MultiResultTransformer(Catalogo.class));
            
            // Retorna el resultado del query
            return criteria.setMaxResults(maxResults)
                    .setFirstResult(firstResult)
                    .list();
        } finally {
            session.close();
        }
    }

    public int obtenerCatalogoCount(String criterio){
        return obtenerCatalogoCount(criterio, false);
    }
    
    public int obtenerCatalogoCount(String criterio, boolean activos) {
        Session session = getCurrentSession();
        try {
            // Arma el query y los joins
            Criteria criteria = session.createCriteria(Catalogo.class, "CAT");
            //Agrego los atributos que quiero retornar
            criteria.setProjection(Projections.count("CAT.id"));
            // Agrega los criterios de busqueda
            if (activos){
               criteria.add(Restrictions.eq("CAT.activo", true));
            }
            criteria.add(Restrictions.or(
                Restrictions.ilike("CAT.codigo", "%" + criterio + "%"),
                Restrictions.ilike("CAT.nombre", "%" + criterio + "%"))
            );
            return (int) criteria.uniqueResult();
        } finally {
            session.close();
        }
    }
    
}
