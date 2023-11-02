package BOSFactory;

import interfaces.IEntrenadorService;
import negocio.EntrenadorService;

public class BOSFactory {

    public static IEntrenadorService crearEntrenadorService() {
        return new EntrenadorService();
    }
}
