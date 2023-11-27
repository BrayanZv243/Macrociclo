package interfaces;

import java.sql.*;

public interface IConexionBD {

    public Connection crearConexion();

    public Connection obtenerConexion();
}
