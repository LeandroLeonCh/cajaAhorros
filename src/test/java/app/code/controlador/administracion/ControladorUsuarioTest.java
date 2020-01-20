/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.administracion;

import app.code.modelo.administracion.Usuario;
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
public class ControladorUsuarioTest {
    
    public ControladorUsuarioTest() {
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
     * Test of getCurrentSession method, of class ControladorUsuario.
     */
    @Test
    public void testGetCurrentSession() {
        System.out.println("getCurrentSession");
        ControladorUsuario instance = null;
        Session expResult = null;
        Session result = instance.getCurrentSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarUsuario method, of class ControladorUsuario.
     */
    @Test
    public void testGuardarUsuario() {
        System.out.println("guardarUsuario");
        Usuario usuario = null;
        ControladorUsuario instance = null;
        boolean expResult = false;
        boolean result = instance.guardarUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuarioPorRango method, of class ControladorUsuario.
     */
    @Test
    public void testObtenerUsuarioPorRango_3args() {
        System.out.println("obtenerUsuarioPorRango");
        String criterio = "";
        int maxResults = 0;
        int firstResult = 0;
        ControladorUsuario instance = null;
        List<Usuario> expResult = null;
        List<Usuario> result = instance.obtenerUsuarioPorRango(criterio, maxResults, firstResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerUsuarioPorRango method, of class ControladorUsuario.
     */
    @Test
    public void testObtenerUsuarioPorRango_4args() {
        System.out.println("obtenerUsuarioPorRango");
        String criterio = "";
        int maxResults = 0;
        int firstResult = 0;
        boolean activos = false;
        ControladorUsuario instance = null;
        List<Usuario> expResult = null;
        List<Usuario> result = instance.obtenerUsuarioPorRango(criterio, maxResults, firstResult, activos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
