package negocio;

import entidades.Entrenador;
import interfaces.IEntrenadorService;
import interfaces.IPersistencia;
import persistencia.Persistencia;

public class EntrenadorService implements IEntrenadorService {

    IPersistencia persistencia = Persistencia.getInstance();

    @Override
    public boolean registrarEntrenador(Entrenador entrenador) {
        return validacionesNegocio() ? persistencia.registrarEntrenador(entrenador) : false;
    }

    @Override
    public boolean eliminarEntrenador(String id) {
        return validacionesNegocio() ? persistencia.eliminarEntrenador(id) : false;
    }

    @Override
    public boolean actualizarEntrenador(String id, Entrenador entrenador) {
        return validacionesNegocio() ? persistencia.actualizarEntrenador(id, entrenador) : false;
    }

    @Override
    public Entrenador existeEntrenador(Entrenador entrenador) {
        return validacionesNegocio() ? persistencia.existeEntrenador(entrenador) : null;
    }

    public boolean validacionesNegocio() {

        // Aquí van las validaciones de negocio.
        // ...
        return true;
    }

}
