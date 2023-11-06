package persistencia;

import entidades.Entrenador;
import entidades.Macrociclo;
import factory.DAOSFactory;
import interfaces.IEntrenadorDAO;
import interfaces.IMacrocicloDAO;
import interfaces.IPersistencia;

public class Persistencia implements IPersistencia {

    IEntrenadorDAO entrenadorDAO;
    IMacrocicloDAO macrocicloDAO;
    private static Persistencia persistencia;

    public Persistencia() {
        entrenadorDAO = DAOSFactory.crearEntrenadoresDAO();
        macrocicloDAO = DAOSFactory.crearMacrociclosDAO();
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
    
     // Inicio de métodos para el macrociclo, abajo se pondrán de otras entidades.
    @Override
    public boolean crearMacrociclo(Macrociclo macrociclo) {
        return macrocicloDAO.crearMacrociclo(macrociclo);
    }

    @Override
    public boolean eliminarMacrociclo(String id) {
        return macrocicloDAO.eliminarMacrociclo(id);
    }

    @Override
    public boolean actualizarMacrociclo(String id, Macrociclo Macrociclo) {
        return macrocicloDAO.actualizarMacrociclo(id, Macrociclo);
    }


    // Fin de métodos de entrenador.
}
