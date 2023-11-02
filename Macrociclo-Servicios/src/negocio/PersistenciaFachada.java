package negocio;

import BOSFactory.BOSFactory;
import entidades.Entrenador;
import interfaces.IEntrenadorService;
import interfaces.IPersistenciaFachada;

public class PersistenciaFachada implements IPersistenciaFachada {

    IEntrenadorService entrenadorBO;
    private static PersistenciaFachada persistencia;

    public PersistenciaFachada() {
        entrenadorBO = BOSFactory.crearEntrenadorService();
    }

    public static PersistenciaFachada getInstance() {
        return persistencia == null ? new PersistenciaFachada() : persistencia;
    }

    @Override
    public boolean registrarEntrenador(Entrenador entrenador) {
        return entrenadorBO.registrarEntrenador(entrenador);
    }

    @Override
    public boolean eliminarEntrenador(String id) {
        return entrenadorBO.eliminarEntrenador(id);
    }

    @Override
    public boolean actualizarEntrenador(String id, Entrenador entrenador) {
        return entrenadorBO.actualizarEntrenador(id, entrenador);
    }

    @Override
    public Entrenador existeEntrenador(Entrenador entrenador) {
        return entrenadorBO.existeEntrenador(entrenador);
    }

}
