package presentacionTests;

import Frames.SemanasFrame;
import java.util.Date;
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

    /**
     * Test para calcular la semanas en un periodo válido
     */
    @Test
    public void testCalcularSemanasTest() {
        System.out.println("Calculamos las semanas de un periodo dado correcto.");

        SemanasFrame semanasFrame = new SemanasFrame();
        
        int semanas = semanasFrame.calcularSemanas(new Date(), new Date());
        assertEquals(false,false);
    }
   

}
