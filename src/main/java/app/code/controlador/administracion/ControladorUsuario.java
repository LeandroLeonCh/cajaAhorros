/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.administracion;

import app.code.common.MultiResultTransformer;
import app.code.modelo.general.TipoCatalogo;
import app.code.modelo.administracion.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class ControladorUsuario {

    private final SessionFactory sessionFactory;

    public ControladorUsuario(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getCurrentSession() {
        return sessionFactory.openSession();
    }

    public boolean guardarUsuario(Usuario usuario) {
        Session session = getCurrentSession();
        try {
            return usuario.guardar(session);
        } finally {
            session.close();
        }
    }

    public List<Usuario> obtenerUsuarioPorRango(String criterio, int maxResults, int firstResult) {
        return obtenerUsuarioPorRango(criterio, maxResults, firstResult, false);
    }
    
    public List<Usuario> obtenerUsuarioPorRango(String criterio, int maxResults, int firstResult, boolean activos) {
        Session session = getCurrentSession();
        try {
            
            Criteria criteria = session.createCriteria(Usuario.class, "USR");
            // Agrego las columnas que quiero obtener
            criteria.setProjection(Projections.projectionList()
                    .add(Projections.property("USR.id"), "id")
                    .add(Projections.property("USR.activo"), "activo")
                    .add(Projections.property("USR.username"), "username")
                    .add(Projections.property("USR.password"), "password")
                    .add(Projections.property("USR.esAdmin"), "esAdmin")
                    .add(Projections.property("USR.nombre"), "nombre")
                    .add(Projections.property("USR.apellido"), "apellido")
            );
             // Agrega los criterios de busqueda
            criteria.add(Restrictions.or(
                    Restrictions.ilike("USR.username", "%" + criterio + "%"),
                    Restrictions.ilike("USR.nombre", "%" + criterio + "%"),
                    Restrictions.ilike("USR.apellido", "%" + criterio + "%"))
            );
            // Agrega el tipo de resultado a retornar
            criteria.setResultTransformer(
                    new MultiResultTransformer(Usuario.class)
            );
            return criteria.setMaxResults(maxResults)
                    .setFirstResult(firstResult)
                    .list();
        } finally {
            session.close();
        }
    }

}
