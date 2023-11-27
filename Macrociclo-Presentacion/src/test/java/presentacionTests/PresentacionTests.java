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
        System.out.println("Calculamos las semanas de un periodo dado correcto.");
        
        Date fechaInicio = new Date(2023,11, 28);
        Date fechaFin = new Date(2023,12, 19);
        
        validacionesSemanas(fechaInicio, fechaFin);
        
    }
    
    private void validacionesSemanas(Date inicio, Date fin) {
        if (inicio == null && fin == null) {
            fail("La fecha de inicio es nula");
        }
        // Validar que la fecha de inicio sea anterior a la fecha de fin
        if (inicio.after(fin)) {
            fail("La fecha de inicio del plan debe ser anterior a la fecha de fin del plan.");
        }

        // Validar que el período sea de al menos 7 días
        long diferenciaEnMillis = fin.getTime() - inicio.getTime();
        long diferenciaEnDias = diferenciaEnMillis / (24 * 60 * 60 * 1000);
        if (diferenciaEnDias < 7) {
            fail("El período debe ser de al menos 7 días.");
        }
        
        assertTrue(true);
    }
    
    
    
}
