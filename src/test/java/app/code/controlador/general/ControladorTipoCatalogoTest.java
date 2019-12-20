/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.modelo.general.TipoCatalogo;
import java.util.List;
import org.hibernate.Session;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class ControladorTipoCatalogoTest {
    
    public ControladorTipoCatalogoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCurrentSession method, of class ControladorTipoCatalogo.
     */
    @Test
    public void testGetCurrentSession() {
        System.out.println("getCurrentSession");
        ControladorTipoCatalogo instance = null;
        Session expResult = null;
        Session result = instance.getCurrentSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class ControladorTipoCatalogo.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        TipoCatalogo tipoCatalogo = null;
        ControladorTipoCatalogo instance = null;
        boolean expResult = false;
        boolean result = instance.guardar(tipoCatalogo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerTiposCatalogos method, of class ControladorTipoCatalogo.
     */
    @Test
    public void testObtenerTiposCatalogos() {
        System.out.println("obtenerTiposCatalogos");
        String criterio = "";
        int maxResults = 0;
        int firstResult = 0;
        ControladorTipoCatalogo instance = null;
        List<TipoCatalogo> expResult = null;
        List<TipoCatalogo> result = instance.obtenerTiposCatalogos(criterio, maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
