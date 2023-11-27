package negocio;

import BOSFactory.BOSFactory;
import entidades.Entrenador;
import entidades.Macrociclo;
import interfaces.IEntrenadorService;
import interfaces.IMacrocicloService;
import interfaces.IPersistenciaFachada;

public class PersistenciaFachada implements IPersistenciaFachada {

    IEntrenadorService entrenadorBO;
    IMacrocicloService macrocicloBO;
    private static PersistenciaFachada persistencia;

    public PersistenciaFachada() {
        entrenadorBO = BOSFactory.crearEntrenadorService();
         macrocicloBO = BOSFactory.crearMacrocicloService();
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

    @Override
    public boolean crearMacrociclo(Macrociclo macrociclo) {
         return macrocicloBO.crearMacrociclo(macrociclo);
    }

    @Override
    public boolean eliminarMacrociclo(String id) {
        return macrocicloBO.eliminarMacrociclo(id);
    }

    @Override
    public boolean actualizarMacrociclo(String id, Macrociclo macrociclo) {
       return macrocicloBO.actualizarMacrociclo(id, macrociclo);
    }
}
