package entrenadorTests;

import entidades.Entrenador;
import java.util.Date;
import org.junit.Test;
import persistencia.EntrenadorDAO;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import persistencia.ConexionBD;

/**
 * Clase que se encargará de los tests del proyecto macrociclos-presentación.
 *
 * @author Brayan Zavala.
 */
public class EntrenadorTests {
    
    public EntrenadorTests() {
    }
    private EntrenadorDAO entrenadorDAO;

    @Before
    public void setUp() {
        // Inicializar la instancia de EntrenadorDAO antes de cada prueba
        entrenadorDAO = new EntrenadorDAO(ConexionBD.getInstance());
    }

    @Test
    public void registrarEntrenadorTest() {
        System.out.println("Registramos un entrenador");

        boolean expResult = true;

        Entrenador e = new Entrenador("228899", "Pepito123456", "Ricardo Saavedra", "Ricardo@potros.itson.edu.mx");

        // Lógica de prueba que utiliza la instancia inicializada de EntrenadorDAO
        boolean result = entrenadorDAO.registrarEntrenador(e);

        assertEquals(expResult, result);
    }
  
    
}
