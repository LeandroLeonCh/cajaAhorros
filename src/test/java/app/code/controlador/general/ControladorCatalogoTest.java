/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.modelo.general.Catalogo;
import java.util.List;
import javax.persistence.EntityManager;
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
public class ControladorCatalogoTest {
    
    public ControladorCatalogoTest() {
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
     * Test of getEntityManager method, of class ControladorCatalogo.
     */
    @Test
    public void testGetEntityManager() {
        System.out.println("getEntityManager");
        ControladorCatalogo instance = null;
        EntityManager expResult = null;
        //EntityManager result = instance.getEntityManager();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardar method, of class ControladorCatalogo.
     */
    @Test
    public void testGuardar() {
        System.out.println("guardar");
        Catalogo catalogo = null;
        ControladorCatalogo instance = null;
        //instance.guardar(catalogo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCatalogosPorTipo method, of class ControladorCatalogo.
     */
    @Test
    public void testObtenerCatalogosPorTipo() {
        System.out.println("obtenerCatalogosPorTipo");
        Long tipoId = null;
        ControladorCatalogo instance = null;
        List<Catalogo> expResult = null;
        List<Catalogo> result = instance.obtenerCatalogosPorTipo(tipoId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCatalogosPorRango method, of class ControladorCatalogo.
     */
    @Test
    public void testObtenerCatalogosPorRango_int_int() {
        System.out.println("obtenerCatalogosPorRango");
        int maxResults = 0;
        int firstResult = 0;
        ControladorCatalogo instance = null;
        List<Catalogo> expResult = null;
       // List<Catalogo> result = instance.obtenerCatalogosPorRango(maxResults, firstResult);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCatalogosPorRango method, of class ControladorCatalogo.
     */
    @Test
    public void testObtenerCatalogosPorRango_3args() {
        System.out.println("obtenerCatalogosPorRango");
        String criterio = "";
        int maxResults = 0;
        int firstResult = 0;
        ControladorCatalogo instance = null;
        List<Catalogo> expResult = null;
        List<Catalogo> result = instance.obtenerCatalogosPorRango(criterio, maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCatalogo method, of class ControladorCatalogo.
     */
    @Test
    public void testFindCatalogo() {
        System.out.println("findCatalogo");
        Long id = null;
        ControladorCatalogo instance = null;
        Catalogo expResult = null;
       // Catalogo result = instance.findCatalogo(id);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCatalogoCount method, of class ControladorCatalogo.
     */
    @Test
    public void testGetCatalogoCount() {
        System.out.println("getCatalogoCount");
        ControladorCatalogo instance = null;
        int expResult = 0;
        //int result = instance.getCatalogoCount();
      // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
