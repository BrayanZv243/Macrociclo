package factory;

import interfaces.IConexionBD;
import interfaces.IEntrenadorDAO;
import interfaces.IMacrocicloDAO;
import persistencia.ConexionBD;
import persistencia.EntrenadorDAO;
import persistencia.MacrocicloDAO;

public class DAOSFactory {

    private static final IConexionBD conexionBD = ConexionBD.getInstance();

    public static IEntrenadorDAO crearEntrenadoresDAO() {
        return new EntrenadorDAO(conexionBD);
    }
    public static IMacrocicloDAO crearMacrociclosDAO() {
        return new MacrocicloDAO(conexionBD);
    }
}
