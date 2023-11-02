package persistencia;

import entidades.Entrenador;
import factory.DAOSFactory;
import interfaces.IEntrenadorDAO;
import interfaces.IPersistencia;

public class Persistencia implements IPersistencia {

    IEntrenadorDAO entrenadorDAO;
    private static Persistencia persistencia;

    public Persistencia() {
        entrenadorDAO = DAOSFactory.crearEntrenadoresDAO();
    }

    public static Persistencia getInstance() {
        return persistencia == null ? new Persistencia() : persistencia;
    }

    // Inicio de métodos para el entrenador, abajo se pondrán de otras entidades.
    @Override
    public boolean registrarEntrenador(Entrenador entrenador) {
        return entrenadorDAO.registrarEntrenador(entrenador);
    }

    @Override
    public boolean eliminarEntrenador(String id) {
        return entrenadorDAO.eliminarEntrenador(id);
    }

    @Override
    public boolean actualizarEntrenador(String id, Entrenador entrenador) {
        return entrenadorDAO.actualizarEntrenador(id, entrenador);
    }

    @Override
    public Entrenador existeEntrenador(Entrenador entrenador) {
        return entrenadorDAO.existeEntrenador(entrenador);
    }

    // Fin de métodos de entrenador.
}
