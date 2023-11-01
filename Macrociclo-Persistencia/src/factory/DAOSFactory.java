package factory;

import interfaces.IConexionBD;
import interfaces.IEntrenadorDAO;
import persistencia.ConexionBD;
import persistencia.EntrenadorDAO;

public class DAOSFactory {

    private static final IConexionBD conexionBD = ConexionBD.getInstance();

    public static IEntrenadorDAO crearEntrenadoresDAO() {
        return new EntrenadorDAO(conexionBD);
    }
    
    
}
