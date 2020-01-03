/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.code.controlador.general;

import app.code.modelo.general.Catalogo;
import app.code.modelo.general.TipoCatalogo;
import java.util.List;
import javax.persistence.Persistence;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Carlos
 */
public class ControladorCatalogoTest {
    
    static ControladorCatalogo instanciaControlador;
    
    @BeforeClass
    public static void setUpClass() {
        // Crea la session de la empresa
        SessionFactory sessionAcitive = Persistence
                .createEntityManagerFactory("caja_ahorros")
                .unwrap(SessionFactory.class);
        // Iniciliza el contructor
        instanciaControlador = new ControladorCatalogo(sessionAcitive);
    }

    /**
     * Test of guardarCatalogo method, of class ControladorCatalogo.
     */
    @Test
    public void testGuardarCatalogo() {
        System.out.println("guardarCatalogo");
        Catalogo catalogo = new Catalogo("Tets5", "Tets1", "Tets1", 
                new TipoCatalogo(Integer.toUnsignedLong(2))
        );
        boolean resultado = instanciaControlador.guardarCatalogo(catalogo);
        assertTrue(resultado);
    }

    /**
     * Test of buscarCatalogo method, of class ControladorCatalogo.
     */
    @Test
    public void testBuscarCatalogo() {
        System.out.println("buscarCatalogo");
        Catalogo expResult = new Catalogo(Integer.toUnsignedLong(8));
        Catalogo resultado = instanciaControlador.buscarCatalogo(Integer.toUnsignedLong(8));
        assertEquals(expResult, resultado);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
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
     * Test of obtenerCatalogosPorRango method, of class ControladorCatalogo.
     */
    @Test
    public void testObtenerCatalogosPorRango_4args() {
        System.out.println("obtenerCatalogosPorRango");
        String criterio = "";
        int maxResults = 0;
        int firstResult = 0;
        boolean activos = false;
        ControladorCatalogo instance = null;
        List<Catalogo> expResult = null;
        List<Catalogo> result = instance.obtenerCatalogosPorRango(criterio, maxResults, firstResult, activos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of obtenerCatalogoCount method, of class ControladorCatalogo.
     */
    @Test
    public void testObtenerCatalogoCount_String_boolean() {
        System.out.println("obtenerCatalogoCount");
        String criterio = "";
        boolean activos = false;
        ControladorCatalogo instance = null;
        int expResult = 0;
        int result = instance.obtenerCatalogoCount(criterio, activos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
