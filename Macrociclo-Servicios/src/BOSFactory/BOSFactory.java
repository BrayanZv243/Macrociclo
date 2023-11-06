package BOSFactory;

import interfaces.IEntrenadorService;
import interfaces.IMacrocicloService;
import negocio.EntrenadorService;
import negocio.MacrocicloService;

public class BOSFactory {

    public static IEntrenadorService crearEntrenadorService() {
        return new EntrenadorService();
    }
    public static IMacrocicloService crearMacrocicloService() {
        return new MacrocicloService();
    }
}
