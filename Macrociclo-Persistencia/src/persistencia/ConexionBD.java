package persistencia;

import interfaces.IConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD implements IConexionBD {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/macrociclos";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";
    private static Connection connection = null;
    private static ConexionBD conexionBD;

    @Override
    public Connection crearConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Carga el controlador JDBC de MySQL

            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            }
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión a la base de datos: " + e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }

    @Override
    public Connection obtenerConexion() {
        return connection == null ? crearConexion() : connection;
    }

    public static ConexionBD getInstance() {
        return conexionBD == null ? new ConexionBD() : conexionBD;
    }

}
