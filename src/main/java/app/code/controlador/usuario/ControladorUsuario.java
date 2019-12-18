/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.usuario;

import app.code.modelo.general.TipoCatalogo;
import app.code.modelo.usuario.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author EstAngelMesiasJadanC
 */
public class ControladorUsuario {

    private final EntityManagerFactory entityManager;

    public ControladorUsuario(EntityManagerFactory entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager.createEntityManager();
    }

    public void guardar(Usuario usuario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            usuario.guardar(em);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> obtenerUsuariosPorNombre(String nombre) {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Usuario> cq = cb.createQuery(Usuario.class);
            Root<Usuario> usuario = cq.from(Usuario.class);
            cq.multiselect(
                    usuario.get("id"),
                    usuario.get("username"),
                    usuario.get("password"),
                    usuario.get("nombre"),
                    usuario.get("apellido"),
                    usuario.get("es_admin")
            );

            cq.where(cb.and(cb.isTrue(usuario.get("activo")),
                    cb.equal(usuario.get("nombre"), nombre)
            ));
            return em.createQuery(cq).getResultList();
        } finally {
            em.close();
        }
    }

    public List<Tuple> obtenerUsuarioPorRango(String criterio, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Tuple> cq = cb.createQuery(Tuple.class);

            Root<Usuario> usuario = cq.from(Usuario.class);

            cq.multiselect(
                    usuario.get("id"),
                    usuario.get("username"),
                    usuario.get("password"),
                    usuario.get("nombre"),
                    usuario.get("apellido"),
                    usuario.get("es_admin")
            );

            if (!(criterio == null || criterio.isEmpty())) {
                criterio = criterio.toUpperCase();
                cq.where(
                        cb.or(
                                cb.like(cb.upper(usuario.get("username")), "%" + criterio + "%"))
                );
            }
            return em.createQuery(cq)
                    .setMaxResults(maxResults)
                    .setFirstResult(firstResult)
                    .getResultList();

        } finally {
            em.close();
        }
    }

    public Usuario findUsuario(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }
    public int getUsuarioCount(){
        EntityManager em=getEntityManager();
        try{
            Query  q = em.createQuery("SELECT count(o) FROM BG_USUARIOS as o");
            return ((Long)q.getSingleResult()).intValue();
        }finally{
            em.close();
        }
    }

}
