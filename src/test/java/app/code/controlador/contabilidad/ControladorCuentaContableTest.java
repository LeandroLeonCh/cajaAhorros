/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.contabilidad;

import app.code.modelo.contabilidad.CuentaContable;
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
public class ControladorCuentaContableTest {
    
    public ControladorCuentaContableTest() {
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
     * Test of getCurrentSession method, of class ControladorCuentaContable.
     */
    @Test
    public void testGetCurrentSession() {
        System.out.println("getCurrentSession");
        ControladorCuentaContable instance = null;
        Session expResult = null;
        Session result = instance.getCurrentSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarCuentaContable method, of class ControladorCuentaContable.
     */
    @Test
    public void testGuardarCuentaContable() {
        System.out.println("guardarCuentaContable");
        CuentaContable cuenta = null;
        ControladorCuentaContable instance = null;
        boolean expResult = false;
        boolean result = instance.guardarCuentaContable(cuenta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCuentaContable method, of class ControladorCuentaContable.
     */
    @Test
    public void testBuscarCuentaContable() {
        System.out.println("buscarCuentaContable");
        Long id = null;
        ControladorCuentaContable instance = null;
        CuentaContable expResult = null;
        CuentaContable result = instance.buscarCuentaContable(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCuentasContablePorRango method, of class ControladorCuentaContable.
     */
    @Test
    public void testObtenerCuentasContablePorRango_3args() {
        System.out.println("obtenerCuentasContablePorRango");
        String criterio = "";
        int maxResultados = 0;
        int primerResultado = 0;
        ControladorCuentaContable instance = null;
        List<CuentaContable> expResult = null;
        List<CuentaContable> result = instance.obtenerCuentasContablePorRango(criterio, maxResultados, primerResultado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCuentasContablePorRango method, of class ControladorCuentaContable.
     */
    @Test
    public void testObtenerCuentasContablePorRango_4args() {
        System.out.println("obtenerCuentasContablePorRango");
        String criterio = "";
        int maxResultados = 0;
        int primerResultado = 0;
        boolean activos = false;
        ControladorCuentaContable instance = null;
        List<CuentaContable> expResult = null;
        List<CuentaContable> result = instance.obtenerCuentasContablePorRango(criterio, maxResultados, primerResultado, activos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
