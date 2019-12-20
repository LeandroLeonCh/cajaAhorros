/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.contabilidad;

import app.code.modelo.contabilidad.CuentaContable;
import java.util.List;
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
public class LogicaNegocioContabilidadTest {
    
    public LogicaNegocioContabilidadTest() {
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
     * Test of guaradarCuentaContable method, of class LogicaNegocioContabilidad.
     * @throws java.lang.Exception
     */
    @Test
    public void testGuaradarCuentaContable() throws Exception {
        System.out.println("guaradarCuentaContable");
        CuentaContable cuentaContable = null;
        LogicaNegocioContabilidad instance = null;
        boolean expResult = false;
        boolean result = instance.guaradarCuentaContable(cuentaContable);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaCuentaContable method, of class LogicaNegocioContabilidad.
     */
    @Test
    public void testListaCuentaContable() {
        System.out.println("listaCuentaContable");
        String criterio = "";
        int pagina = 0;
        LogicaNegocioContabilidad instance = null;
        List<CuentaContable> expResult = null;
        List<CuentaContable> result = instance.listaCuentaContable(criterio, pagina);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getControladorCuentaContable method, of class LogicaNegocioContabilidad.
     */
    @Test
    public void testGetControladorCuentaContable() {
        System.out.println("getControladorCuentaContable");
        LogicaNegocioContabilidad instance = null;
        ControladorCuentaContable expResult = null;
        ControladorCuentaContable result = instance.getControladorCuentaContable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
