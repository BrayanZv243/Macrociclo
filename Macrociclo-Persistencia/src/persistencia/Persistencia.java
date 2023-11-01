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
        if (persistencia == null) {
            return new Persistencia();
        }
        return persistencia;
    }

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

}
