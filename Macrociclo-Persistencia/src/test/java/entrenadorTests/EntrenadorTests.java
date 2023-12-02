package entrenadorTests;

import entidades.Entrenador;
import java.util.Date;
import org.junit.Test;
import persistencia.EntrenadorDAO;
import static org.junit.Assert.*;
import persistencia.ConexionBD;

/**
 * Clase que se encargará de los tests del proyecto macrociclos-presentación.
 *
 * @author Brayan Zavala.
 */
public class EntrenadorTests {
    
    public EntrenadorTests() {
    }

    /**
     * Test para calcular la semanas en un periodo válido
     */
    @Test
    public void registrarEntrenadorTest() {
        System.out.println("Registramos un entrenador");
        
        boolean expResult = true;
        
        Entrenador e = new Entrenador("228899","Pepito123456","Ricardo Saavedra", "Ricardo@potros.itson.edu.mx");
        
        EntrenadorDAO entrenadorDAO = new EntrenadorDAO(ConexionBD.getInstance());
        
        boolean result = entrenadorDAO.registrarEntrenador(e);
        
        assertEquals(expResult, result);
    }
    
  
    
}
