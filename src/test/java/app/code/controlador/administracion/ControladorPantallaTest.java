/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.administracion;

import app.code.modelo.administracion.Pantalla;
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
public class ControladorPantallaTest {
    
    public ControladorPantallaTest() {
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
     * Test of getCurrentSession method, of class ControladorPantalla.
     */
    @Test
    public void testGetCurrentSession() {
        System.out.println("getCurrentSession");
        ControladorPantalla instance = null;
        Session expResult = null;
        Session result = instance.getCurrentSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarPantalla method, of class ControladorPantalla.
     */
    @Test
    public void testGuardarPantalla() {
        System.out.println("guardarPantalla");
        Pantalla pantalla = null;
        ControladorPantalla instance = null;
        boolean expResult = false;
        boolean result = instance.guardarPantalla(pantalla);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPantalla method, of class ControladorPantalla.
     */
    @Test
    public void testBuscarPantalla() {
        System.out.println("buscarPantalla");
        Long id = null;
        ControladorPantalla instance = null;
        Pantalla expResult = null;
        Pantalla result = instance.buscarPantalla(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtnerPantallaPorRango method, of class ControladorPantalla.
     */
    @Test
    public void testObtnerPantallaPorRango_3args() {
        System.out.println("obtnerPantallaPorRango");
        String cirterio = "";
        int maxResults = 0;
        int firstResult = 0;
        ControladorPantalla instance = null;
        List<Pantalla> expResult = null;
        List<Pantalla> result = instance.obtnerPantallaPorRango(cirterio, maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtnerPantallaPorRango method, of class ControladorPantalla.
     */
    @Test
    public void testObtnerPantallaPorRango_4args() {
        System.out.println("obtnerPantallaPorRango");
        String criterio = "";
        int maxResults = 0;
        int firstResult = 0;
        boolean activos = false;
        ControladorPantalla instance = null;
        List<Pantalla> expResult = null;
        List<Pantalla> result = instance.obtnerPantallaPorRango(criterio, maxResults, firstResult, activos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
