/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.common;

import app.code.modelo.general.TipoCatalogo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;

/**
 *
 * @author Carlos
 */
public class TipoCatalogoJpaController implements Serializable {

    public TipoCatalogoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(TipoCatalogo tipoCatalogo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tipoCatalogo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TipoCatalogo tipoCatalogo){
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoCatalogo = em.merge(tipoCatalogo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = tipoCatalogo.getId();
                if (findTipoCatalogo(id) == null) {
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TipoCatalogo tipoCatalogo;
            try {
                tipoCatalogo = em.getReference(TipoCatalogo.class, id);
                tipoCatalogo.getId();
            } catch (EntityNotFoundException enfe) {
                throw new Exception("The tipoCatalogo with id " + id + " no longer exists.");
            }
            em.remove(tipoCatalogo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TipoCatalogo> findTipoCatalogoEntities() {
        return findTipoCatalogoEntities(true, -1, -1);
    }

    public List<TipoCatalogo> findTipoCatalogoEntities(int maxResults, int firstResult) {
        return findTipoCatalogoEntities(false, maxResults, firstResult);
    }

    private List<TipoCatalogo> findTipoCatalogoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select object(o) from TipoCatalogo as o");
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TipoCatalogo findTipoCatalogo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TipoCatalogo.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoCatalogoCount() {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from TipoCatalogo as o");
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
