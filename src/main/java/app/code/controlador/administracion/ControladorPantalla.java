/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.administracion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

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
    
    
}
