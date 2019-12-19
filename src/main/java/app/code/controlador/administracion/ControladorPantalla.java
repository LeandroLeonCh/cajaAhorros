/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.administracion;

import app.code.modelo.administracion.Pantalla;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author JuancUyaguari
 */
public class ControladorPantalla {

    private final EntityManagerFactory entityManager;

    public ControladorPantalla(EntityManagerFactory entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager() {
        return this.entityManager.createEntityManager();
    }

    public void guardar(Pantalla pantalla) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            pantalla.guardar(em);
            em.getTransaction().commit();

        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    public List<Pantalla> obtenerPantallaPorNombre(String nombre) {
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Pantalla> pq = cb.createQuery(Pantalla.class);

            Root<Pantalla> pantalla = pq.from(Pantalla.class);
            pq.multiselect(
                    pantalla.get("id"),
                    pantalla.get("codigo"),
                    pantalla.get("nombre"),
                    pantalla.get("ruta_acceso"),
                    pantalla.get("descripcion"),
                    pantalla.get("es_accion"));
            pq.where(
                    cb.and(
                            cb.isTrue(pantalla.get("activo")),
                            cb.equal(pantalla.get("nombre"), nombre)
                    )
            );
            return em.createQuery(pq).getResultList();
        } finally {
            em.close();
        }

    }
    
    public void actualizarPantalla(int id){
        EntityManager em = getEntityManager();
        
    }
    
    //    public List<Tuple> obtnerPantallaPorRango(int maxResults, int firstResult){
//        return obtnerPantallaPorRango("", maxResults, firstResult);
//    }
//    
//    public List<Tuple> obtnerPantallaPorRango(String criterio, int maxResults, int firstResult) {
//        EntityManager em = getEntityManager();
//        
//        try {
//            CriteriaBuilder cb = em.getCriteriaBuilder();
//            CriteriaQuery<Tuple> pq = cb.createQuery(Tuple.class);
//            
//            Root<Pantalla> pantalla = pq.from(Pantalla.class);
//            pq.multiselect(
//                pantalla.get("id"), 
//                pantalla.get("activo"), 
//                pantalla.get("codigo"),
//                pantalla.get("nombre"),
//                pantalla.get("descripcion"));
//            
//            return em.createQuery(pq)
//                    .setMaxResults(maxResults)
//                    .setFirstResult(firstResult)
//                    .getResultList();
//        } finally {
//            em.close();
//        }
//    }
}
