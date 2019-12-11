/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.modelo.general.Catalogo;
import app.code.modelo.general.TipoCatalogo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

/**
 *
 * @author Carlos
 */
public final class ControladorCatalogo {
    
    private final EntityManagerFactory entityManager;
    
    public ControladorCatalogo(EntityManagerFactory entityManager) {
         this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager.createEntityManager();
    }
    
    public void guardar(Catalogo catalogo) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            // Guarda el catalago
                   // Guarda el catalago
            TipoCatalogo tipoCatalogo = catalogo.getTipoCatalogo();
            if (tipoCatalogo != null) {
                tipoCatalogo = em.getReference(tipoCatalogo.getClass(), tipoCatalogo.getId());
                catalogo.setTipoCatalogo(tipoCatalogo);
            }
            catalogo.guardar(em);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Tuple> obtenerCatalogos() {
        return obtenerCatalogos("", -1, -1, true);
    }

    public List<Tuple> obtenerCatalogos(int maxResults, int firstResult) {
        return obtenerCatalogos("", maxResults, firstResult, false);
    }

    private List<Catalogo> findCatalogoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from Catalogo as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
    
    private List<Tuple> obtenerCatalogos(String criterio, int maxResults, int firstResult, boolean all) {
        EntityManager em = getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        try {
            CriteriaQuery<Tuple> cq = cb.createQuery(Tuple.class);
            Root<Catalogo> catalogo = cq.from(Catalogo.class);
            Join<Catalogo, TipoCatalogo> tipoCatalogo = catalogo.join("tipoCatalogo", JoinType.INNER);
            cq.multiselect(
                catalogo.get("id"), 
                catalogo.get("activo"), 
                catalogo.get("codigo"),
                catalogo.get("nombre"),
                catalogo.get("descripcion"),
                tipoCatalogo.get("codigo"),
                tipoCatalogo.get("nombre"));
            // Agrega el criterio
            if (!(criterio == null || criterio.isEmpty())) {
                criterio = criterio.toUpperCase();
                cq.where(
                    cb.or(
                        cb.like(cb.upper(catalogo.get("codigo")),
                                "%" + criterio + "%"),
                        cb.like(cb.upper(catalogo.get("nombre")),
                                "%" + criterio + "%")
                    )
                );
            }
            // Ejecuta el query
            Query query = em.createQuery(cq);
            if (!all) {
                query.setMaxResults(maxResults)
                     .setFirstResult(firstResult);
            }
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Catalogo findCatalogo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Catalogo.class, id);
        } finally {
            em.close();
        }
    }

    public int getCatalogoCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("SELECT count(o) FROM Catalogo as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
