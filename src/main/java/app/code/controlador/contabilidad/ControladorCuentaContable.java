/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.contabilidad;

import app.code.modelo.contabilidad.CuentaContable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author fanny
 */
public class ControladorCuentaContable {

  private final EntityManagerFactory entiManager;

    public ControladorCuentaContable(EntityManagerFactory entiManager) {
        this.entiManager = entiManager;
    }
    public EntityManager getEntityManager() {
        return this.entiManager.createEntityManager();
    }
      
    public void guaradar(CuentaContable cuenta){
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            cuenta.guardar(em);
            em.getTransaction().commit();
            System.out.println("Cuenta creada");
        } finally {
            if(em != null){
                em.close();
            }
        }
    }
    
    public List<CuentaContable> listaCuentaContable(){
        return listar(Long.MIN_VALUE);
    }
    
    public List<CuentaContable> listar(Long id){
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<CuentaContable> cc = cb.createQuery(CuentaContable.class);       
            Root<CuentaContable> cuentaContable = cc.from(CuentaContable.class);
            cc.multiselect(
                    cuentaContable.get("id"),
                    cuentaContable.get("codigo"),
                    cuentaContable.get("nombre"),
                    cuentaContable.get("descripcion"),
                    cuentaContable.get("es_total"),
                    cuentaContable.get("estado"),
                    cuentaContable.get("fecha_registro"),
                    cuentaContable.get("cat_id"),
                    cuentaContable.get("cue_con_id")
                    );
                    cc.where(
                        cb.and(
                            cb.equal(cuentaContable.get("id"), id)
                        )
                    );
                    return em.createQuery(cc).getResultList();
        } finally {
            em.close();
        }
    }
    
    public List<Tuple> obtenerCuentaPorRango(String criterio, int maxResultados, int primerResultado){
        EntityManager em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Tuple> cq = cb.createQuery(Tuple.class);
            Root<CuentaContable> cuentaContable = cq.from(CuentaContable.class);
            
            cq.multiselect(
                          cuentaContable.get("id"),
                    cuentaContable.get("codigo"),
                    cuentaContable.get("nombre"),
                    cuentaContable.get("descripcion"),
                    cuentaContable.get("es_total"),
                    cuentaContable.get("estado"),
                    cuentaContable.get("fecha_registro"),
                    cuentaContable.get("cat_id"),
                    cuentaContable.get("cue_con_id"));
            if(!(criterio == null  || criterio.isEmpty())){
                criterio = criterio.toUpperCase();
                cq.where(
                         cb.or(
                                cb.like(cb.upper(cuentaContable.get("username")), "%" + criterio+ "%")));
            }
            return em.createQuery(cq).setMaxResults(maxResultados).setFirstResult(primerResultado).getResultList();
        } finally{
            em.close();
        }
    }
    
    public CuentaContable findCuenta(Long id){
        EntityManager em = getEntityManager();
        try {
            return em.find(CuentaContable.class, id);
        } finally {
            em.close();
        }
    }
    
    public int getCuentaContableCount(){
        EntityManager em = getEntityManager();
        try {
            Query q = em.createQuery("select count(o) from bg_cuentas_contables as o");
            return ((Long)q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
