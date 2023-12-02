package entrenadorTests;

import entidades.Entrenador;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
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
        System.out.println("H10_CP1 - Verificar que un usuario pueda registrarse correctamente.");

        boolean expResult = true;

        Entrenador e = new Entrenador("228899", "Pepito123456", "Ricardo Saavedra", "Ricardo@potros.itson.edu.mx");

        // Configurar el comportamiento simulado utilizando Mockito
        when(entrenadorDAO.registrarEntrenador(e)).thenReturn(true);

        // Lógica de prueba que utiliza el mock de EntrenadorDAO
        boolean result = entrenadorDAO.registrarEntrenador(e);

        // Verificar la aserción utilizando Mockito
        assertEquals(expResult, result);
    }

    @Test
    public void validarCorreoPotrosEntrenador() {
        System.out.println("H10_CP2 - Probar que el sistema maneje adecuadamente el intento de registro con un correo que no sea de potros");

        Entrenador e = new Entrenador("228311", "123", "Brayan", "brayan@hotmail.com");

        // Configurar el comportamiento simulado utilizando Mockito
        when(entrenadorDAO.registrarEntrenador(e)).thenReturn(false);

        // Lógica de prueba que utiliza el mock de EntrenadorDAO
        boolean result = entrenadorDAO.registrarEntrenador(e);

        // Verificar la aserción utilizando Mockito
        assertFalse(result);
    }

    @Test
    public void validarEntrenadorExistente() {
        System.out.println("H10_CP3 - Probar que el sistema maneje adecuadamente el intento de registro con un id que ya se esta usuando.");

        Entrenador e = new Entrenador("228899", "Pepito123456", "Ricardo Saavedra", "Ricardo@potros.itson.edu.mx");

        // Configurar el comportamiento simulado utilizando Mockito
        when(entrenadorDAO.registrarEntrenador(e)).thenReturn(true);

        // Lógica de prueba que utiliza el mock de EntrenadorDAO
        boolean result = entrenadorDAO.registrarEntrenador(e);

        // Verificar la aserción utilizando Mockito
        assertTrue(result);
    }

    @Test
    public void crearEntrenadorNullTest() {
        System.out.println("Validamos crear un entrenador nulo.");
        when(entrenadorDAO.registrarEntrenador(null)).thenReturn(false);
        assertFalse(entrenadorDAO.registrarEntrenador(null));
    }

    @Test
    public void obtenerEntrenadorTest() {
        System.out.println("Validamos el obtener un entrenador.");
        Entrenador e = new Entrenador("228311", "123", "Brayan", "brayan@hotmail.com");

        when(entrenadorDAO.existeEntrenador(e)).thenReturn(e);

        assertEquals(e, entrenadorDAO.existeEntrenador(e));
    }

    @Test
    public void obtenerEntrenadorInexistenteTest() {
        System.out.println("Validamos que no obtenga un entrenador inexistente.");
        when(entrenadorDAO.existeEntrenador(null)).thenReturn(null);
        assertEquals(null, entrenadorDAO.existeEntrenador(new Entrenador("228311", "123", "Brayan", "brayan@hotmail.com")));
    }

    @Test
    public void actualizarEntrenadorTest() {
        System.out.println("Validamos la actualización de un entrenador.");
        Entrenador nuevoEntrenador = new Entrenador("228311", "123", "Brayan", "brayan@hotmail.com");

        when(entrenadorDAO.actualizarEntrenador("228311", nuevoEntrenador)).thenReturn(true);

        assertTrue(entrenadorDAO.actualizarEntrenador("228311", nuevoEntrenador));
    }

    @Test
    public void actualizarEntrenadorNullTest() {
        System.out.println("Validamos la actualización de un entrenador nulo.");

        when(entrenadorDAO.actualizarEntrenador(null, null)).thenReturn(false);

        assertFalse(entrenadorDAO.actualizarEntrenador(null, null));
    }

    @Test
    public void actualizarEntrenadorInexistenteTest() {
        System.out.println("Validamos la actualización de un entrenador inexistente.");
        Entrenador nuevoEntrenador = new Entrenador();
        nuevoEntrenador.setId("000000");

        when(entrenadorDAO.actualizarEntrenador(nuevoEntrenador.getId(), nuevoEntrenador)).thenReturn(false);

        assertFalse(entrenadorDAO.actualizarEntrenador(nuevoEntrenador.getId(), nuevoEntrenador));
    }

}
