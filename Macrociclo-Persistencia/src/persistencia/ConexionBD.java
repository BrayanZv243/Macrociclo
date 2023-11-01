package persistencia;

import interfaces.IConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD implements IConexionBD {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/macrociclos";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    private static Connection connection = null;
    private static ConexionBD conexionBD;

    @Override
    public Connection crearConexion() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            }
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión a la base de datos.");
        }
        return connection;
    }

    @Override
    public Connection obtenerConexion() {
        if (connection == null) {
            System.err.println("La conexión a la base de datos no ha sido establecida.");
        }
        return connection;
    }

    public static ConexionBD getInstance() {
        if (conexionBD == null) {
            return new ConexionBD();
        }
        return conexionBD;
    }

}
