package persistencia;

import entidades.Entrenador;
import entidades.Macrociclo;
import interfaces.IConexionBD;
import interfaces.IMacrocicloDAO;
import java.sql.*;

public class MacrocicloDAO implements IMacrocicloDAO {

    private final IConexionBD conexion;
    private Connection baseDatos;

    public MacrocicloDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.obtenerConexion();
    }

    @Override
    public boolean crearMacrociclo(Macrociclo macrociclo) {
        // Verificar si la conexión a la base de datos es nula
        if (baseDatos == null) {
            System.err.println("Error: No se pudo obtener la conexión a la base de datos. ");
            return false;
        }

        PreparedStatement preparedStatement = null;

        try {
            // Consulta SQL para insertar un nuevo entrenador
            String insertQuery = "INSERT INTO macrociclos (deporte, rama, jefederama, metodologo, semanas) VALUES (?, ?, ?, ?, ?, ?)";

            // Crear una declaración preparada con la consulta SQL
            preparedStatement = baseDatos.prepareStatement(insertQuery);

            // Establecer los valores de los parámetros en la declaración preparada
            preparedStatement.setString(1, macrociclo.getDeporte());
            preparedStatement.setString(2, macrociclo.getRama());
            preparedStatement.setString(3, macrociclo.getJefeDeRama());
            preparedStatement.setString(5, macrociclo.getMetodologo());
            preparedStatement.setInt(6, macrociclo.getSemanas());

            // Ejecutar la consulta para insertar el entrenador
            int filasAfectadas = preparedStatement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Macrociclo agregado exitosamente.");
                return true;
            } else {
                System.err.println("Error al agregar el macrociclo.");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Error al agregar el macrociclo a la base de datos. " + e);
            return false;
        } finally {
            // Cerrar la declaración preparada
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al agregar macrociclo " + e);
            }
        }
    }

    @Override
    public boolean eliminarMacrociclo(String id) {
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
    public boolean actualizarMacrociclo(String id, Macrociclo macrociclo) {
        if (baseDatos == null) {
            System.err.println("Error: No se pudo obtener la conexión a la base de datos.");
            return false;
        }

        PreparedStatement preparedStatement = null;

        try {
            // Consulta SQL para actualizar los datos de un entrenador por su ID
            String updateQuery = "UPDATE entrenadores SET contraseña = ?, nombre = ?, correoPotros = ? WHERE id = ?";

            // Crear una declaración preparada con la consulta SQL
            preparedStatement = baseDatos.prepareStatement(updateQuery);

//            // Establecer los valores de los parámetros en la declaración preparada
//            preparedStatement.setString(1, entrenador.getContraseña());
//            preparedStatement.setString(2, entrenador.getNombre());
//            preparedStatement.setString(3, entrenador.getCorreoPotros());
//            preparedStatement.setString(4, id);

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

    @Override
    public Macrociclo existeMacrociclo(Macrociclo macrociclo) {
        try {
            // Verificar si la conexión a la base de datos es nula o está cerrada
            if (baseDatos == null || baseDatos.isClosed()) {
                System.err.println("Error: No se pudo obtener la conexión a la base de datos o la conexión está cerrada.");
                return null; // Devuelve null para indicar que no se pudo realizar la búsqueda.
            }
        } catch (SQLException ex) {
            System.out.println("Error en sql: " + ex);
        }

        String sql = "SELECT id, contraseña, nombre, correoPotros FROM entrenadores WHERE id = ? AND contraseña = ?";

        try (PreparedStatement preparedStatement = baseDatos.prepareStatement(sql)) {
//            preparedStatement.setString(1, entrenador.getId());
//            preparedStatement.setString(2, entrenador.getContraseña());

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Si el resultado contiene alguna fila, significa que el entrenador existe
                if (resultSet.next()) {
                    Entrenador encontrado = new Entrenador();
                    encontrado.setId(resultSet.getString("id"));
                    encontrado.setContraseña(resultSet.getString("contraseña"));
                    encontrado.setNombre(resultSet.getString("nombre"));
                    encontrado.setCorreoPotros(resultSet.getString("correoPotros"));
                    return null;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en SQL al verificar si el entrenador existe: " + e);
        }
        return null; // Devuelve null si el entrenador no fue encontrado en la base de datos.
    }
}
