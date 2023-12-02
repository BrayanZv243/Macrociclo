package entrenadorTests;

import entidades.Entrenador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import persistencia.EntrenadorDAO;

/**
 * Clase que se encargará de los tests del proyecto macrociclos-persistencia.
 *
 * @author Brayan Zavala.
 */
public class EntrenadorTests {

    private EntrenadorDAO entrenadorDAO;

    @Before
    public void setUp() {
        // Inicializar el mock de EntrenadorDAO antes de cada prueba
        entrenadorDAO = mock(EntrenadorDAO.class);
    }

    @Test
    public void registrarEntrenadorTest() {
        System.out.println("Registramos un entrenador");

        boolean expResult = true;

        Entrenador e = new Entrenador("228899", "Pepito123456", "Ricardo Saavedra", "Ricardo@potros.itson.edu.mx");

        // Configurar el comportamiento simulado utilizando Mockito
        when(entrenadorDAO.registrarEntrenador(e)).thenReturn(true);

        // Lógica de prueba que utiliza el mock de EntrenadorDAO
        boolean result = entrenadorDAO.registrarEntrenador(e);

        // Verificar la aserción utilizando Mockito
        assertEquals(expResult, result);
    }
}
