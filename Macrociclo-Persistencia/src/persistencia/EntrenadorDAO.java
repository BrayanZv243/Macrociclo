package persistencia;

import entidades.Entrenador;
import interfaces.IConexionBD;
import interfaces.IEntrenadorDAO;
import java.sql.*;

public class EntrenadorDAO implements IEntrenadorDAO {

    private final IConexionBD conexion;
    private final Connection baseDatos;

    public EntrenadorDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion();
    }

    @Override
    public boolean registrarEntrenador(Entrenador entrenador) {
        // Verificar si la conexión a la base de datos es nula
        if (baseDatos == null) {
            System.err.println("Error: No se pudo obtener la conexión a la base de datos.");
            return false;
        }

        PreparedStatement preparedStatement = null;

        try {
            // Consulta SQL para insertar un nuevo entrenador
            String insertQuery = "INSERT INTO entrenadores (id, contraseña, nombre) VALUES (?, ?, ?)";

            // Crear una declaración preparada con la consulta SQL
            preparedStatement = baseDatos.prepareStatement(insertQuery);

            // Establecer los valores de los parámetros en la declaración preparada
            preparedStatement.setString(1, entrenador.getId());
            preparedStatement.setString(2, entrenador.getContraseña());
            preparedStatement.setString(3, entrenador.getNombre());

            // Ejecutar la consulta para insertar el entrenador
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Entrenador agregado exitosamente.");
                return true;
            } else {
                System.err.println("Error al agregar el entrenador.");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Error al agregar el entrenador a la base de datos. " + e);
            return false;
        } finally {
            // Cerrar la declaración preparada
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al agregar entrenador " + e);
            }
        }
    }

    @Override
    public boolean eliminarEntrenador(String id) {
        if (baseDatos == null) {
            System.err.println("Error: No se pudo obtener la conexión a la base de datos.");
            return false;
        }

        PreparedStatement preparedStatement = null;

        try {
            // Consulta SQL para eliminar un entrenador por su ID
            String deleteQuery = "DELETE FROM entrenadores WHERE id = ?";

            // Crear una declaración preparada con la consulta SQL
            preparedStatement = baseDatos.prepareStatement(deleteQuery);

            // Establecer el valor del parámetro en la declaración preparada
            preparedStatement.setString(1, id);

            // Ejecutar la consulta para eliminar el entrenador
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Entrenador eliminado exitosamente.");
                return true;
            } else {
                System.err.println("No se encontró un entrenador con el ID especificado.");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar el entrenador de la base de datos.");
            return false;
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                System.out.println("error en sql: " + e);
            }
        }
    }

    @Override
    public boolean actualizarEntrenador(String id, Entrenador entrenador) {
        if (baseDatos == null) {
            System.err.println("Error: No se pudo obtener la conexión a la base de datos.");
            return false;
        }

        PreparedStatement preparedStatement = null;

        try {
            // Consulta SQL para actualizar los datos de un entrenador por su ID
            String updateQuery = "UPDATE entrenadores SET contraseña = ?, nombre = ? WHERE id = ?";

            // Crear una declaración preparada con la consulta SQL
            preparedStatement = baseDatos.prepareStatement(updateQuery);

            // Establecer los valores de los parámetros en la declaración preparada
            preparedStatement.setString(1, entrenador.getContraseña());
            preparedStatement.setString(2, entrenador.getNombre());
            preparedStatement.setString(3, id);

            // Ejecutar la consulta para actualizar el entrenador
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Entrenador actualizado exitosamente.");
                return true;
            } else {
                System.err.println("No se encontró un entrenador con el ID especificado.");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar el entrenador en la base de datos." + e);
            return false;
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error en sql: " + e);
            }
        }
    }

}
