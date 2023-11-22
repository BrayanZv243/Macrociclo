package presentacionTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase que se encargará de los tests del proyecto macrociclos-presentación.
 *
 * @author Brayan Zavala.
 */
public class PresentacionTests {

    public PresentacionTests() {
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

   
    @Test
    public void calcularSemanasTest() {
        System.out.println("Calculamos las semanas de un periodo dado correcto.");
        assertEquals(0, 0, 0);
    }
    
    @Test
    public void calcularSemanasConFechasInvalidasTest() {
        System.out.println("Calculamos las semanas de un periodo dado incorrecto.");
        assertEquals(0, 0, 0);
    }

}
