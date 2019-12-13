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
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
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
    public void guardar(Usuario usuario){
        EntityManager em=getEntityManager();
        try{
            em.getTransaction().begin();
            usuario.guardar(em);
            em.getTransaction().commit();
        }finally{
            if (em!=null) {
                em.close();
            }
        }
    }
    public List<Usuario> obtenerUsuariosPorNombre(String nombre){
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb= em.getCriteriaBuilder();
            CriteriaQuery<Usuario> cq=cb.createQuery(Usuario.class);
            Root<Usuario> usuario=cq.from(Usuario.class);
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
}
