/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package delucchigomez.Dominio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matias
 */
public class MicrosateliteTest {

    public MicrosateliteTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getNombre method, of class Microsatelite.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Microsatelite instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Microsatelite.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Microsatelite instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class Microsatelite.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        Microsatelite instance = null;
        double expResult = 0.0;
        double result = instance.getMax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMax method, of class Microsatelite.
     */
    @Test
    public void testSetMax() {
        System.out.println("setMax");
        double max = 0.0;
        Microsatelite instance = null;
        instance.setMax(max);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMin method, of class Microsatelite.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Microsatelite instance = null;
        double expResult = 0.0;
        double result = instance.getMin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMin method, of class Microsatelite.
     */
    @Test
    public void testSetMin() {
        System.out.println("setMin");
        double min = 0.0;
        Microsatelite instance = null;
        instance.setMin(min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoblacion method, of class Microsatelite.
     */
    @Test
    public void testGetPoblacion() {
        System.out.println("getPoblacion");
        Microsatelite instance = null;
        Poblacion expResult = null;
        Poblacion result = instance.getPoblacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarAlelo method, of class Microsatelite.
     */
    @Test
    public void testAgregarAlelo() {
        System.out.println("agregarAlelo");
        Alelo unAlelo = null;
        Microsatelite instance = null;
        instance.agregarAlelo(unAlelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRMP method, of class Microsatelite.
     */
    @Test
    public void testGetRMP() {
        System.out.println("getRMP");
        Microsatelite instance = null;
        double expResult = 0.0;
        double result = instance.getRMP();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPorcentajeAlelo method, of class Microsatelite.
     */
    @Test
    public void testObtenerPorcentajeAlelo() {
        System.out.println("obtenerPorcentajeAlelo");
        int numeroAlelo = 0;
        Microsatelite instance = null;
        double expResult = 0.0;
        double result = instance.obtenerPorcentajeAlelo(numeroAlelo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}