/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.modelo.general.TipoCatalogo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Carlos
 */
public final class ControladorTipoCatalogo {
    
    private final EntityManagerFactory entityManager;
    
    public ControladorTipoCatalogo(EntityManagerFactory entityManager) {
         this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager.createEntityManager();
    }
    
    
    public void guardar(TipoCatalogo tipoCatalogo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
    
            tipoCatalogo.guardar(em);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    
     public List<TipoCatalogo> obtenerTiposCatalogos(){
        return obtenerTiposCatalogos(true, -1, -1);
    }

    public List<TipoCatalogo> obtenerTiposCatalogos(int maxResults, int firstResult) {
        return obtenerTiposCatalogos(false, maxResults, firstResult);
    }

    private List<TipoCatalogo> obtenerTiposCatalogos(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            String sql = "SELECT NEW TipoCatalogo(c.id, c.activo, c.codigo, c.descripcion) "
                       + "FROM TipoCatalogo as c ";
            CriteriaBuilder criteria = em.getCriteriaBuilder();
            CriteriaQuery<TipoCatalogo> criteriaQuery = em.getCriteriaBuilder()
                    .createQuery(TipoCatalogo.class);
            Root<TipoCatalogo> tipoCatalogo = criteriaQuery.from(TipoCatalogo.class);
            criteriaQuery.multiselect(tipoCatalogo.get("id"), tipoCatalogo.get("activo"), tipoCatalogo.get("codigo"),
                    tipoCatalogo.get("nombre"));
            Query query = em.createQuery(criteriaQuery);
            if (!all) {
                query.setMaxResults(maxResults);
                query.setFirstResult(firstResult);
            }
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    
}
