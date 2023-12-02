package presentacionTests;

import java.util.Calendar;
import java.util.Date;
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

    /**
     * Test para calcular la semanas en un periodo válido
     */
    @Test
    public void calcularSemanasTest() {
        System.out.println("H3_CP1 - Se calculan las semanas con las fechas de inicio y final válidas.");

        Date fechaInicio = new Date(2023, 11, 28);
        Date fechaFin = new Date(2023, 12, 19);

        assertTrue(validacionesSemanas(fechaInicio, fechaFin));

    }

    @Test
    public void calcularSemanasConFormatoInvalidoTest() {
        System.out.println("H3_CP2 - Se ingresan fechas con un formato no válido.");

        Date fechaInicio = new Date(11, 2002, 5);
        Date fechaFin = new Date(2, 5, 19);

        assertFalse(validacionesSemanas(fechaInicio, fechaFin));
    }

    @Test
    public void calcularSemanasIncorrectasTest() {
        System.out.println("H3_CP3 - Se ingresa una fecha de inicio que es mayor a la fecha final.");

        Date fechaInicio = new Date(2025, 11, 28);
        Date fechaFin = new Date(2023, 12, 19);

        assertFalse(validacionesSemanas(fechaInicio, fechaFin));

    }

    @Test
    public void calcularSemanasSinFechaFinalTest() {
        System.out.println("H3_CP4 - Se ingresa una fecha de inicio pero no una fecha final para calcular las semanas.");

        Date fechaInicio = new Date(2025, 11, 28);

        assertFalse(validacionesSemanas(fechaInicio, null));
    }

    @Test
    public void calcularSemanasFechaInicioIgualFinal() {
        System.out.println("H3_CP5 - Se ingresa una fecha de inicio igual a la fecha final.");

        Date fechaInicio = new Date(2025, 11, 28);
        Date fechaFin = new Date(2025, 11, 28);

        assertFalse(validacionesSemanas(fechaInicio, fechaFin));
    }

    @Test
    public void calcularSemanasSinCompletarIntervalo7Dias() {
        System.out.println("H3_CP6 - Se ingresa una fecha final que no es capaz de completar el intervalo minímo de 7 días.");

        Date fechaInicio = new Date(2025, 11, 10);
        Date fechaFin = new Date(2025, 11, 16);

        assertFalse(validacionesSemanas(fechaInicio, fechaFin));
    }

    private boolean validacionesSemanas(Date inicio, Date fin) {

        try {
            if (inicio == null && fin == null) {
                return false;
            }
            // Validar que la fecha de inicio sea anterior a la fecha de fin
            if (inicio.after(fin)) {
                return false;
            }

            // Validar que el período sea de al menos 7 días
            long diferenciaEnMillis = fin.getTime() - inicio.getTime();
            long diferenciaEnDias = diferenciaEnMillis / (24 * 60 * 60 * 1000);
            if (diferenciaEnDias < 7) {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al validar semanas: " + e);
            return false;
        }

        return true;
    }

}
