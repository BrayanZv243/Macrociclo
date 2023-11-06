package negocio;

import entidades.Macrociclo;
import interfaces.IMacrocicloService;
import interfaces.IPersistencia;
import persistencia.Persistencia;

public class MacrocicloService implements IMacrocicloService {

    IPersistencia persistencia = Persistencia.getInstance();

    @Override
    public boolean crearMacrociclo(Macrociclo macrociclo) {
        return validacionesNegocio() ? persistencia.crearMacrociclo(macrociclo) : false;
    }

    @Override
    public boolean eliminarMacrociclo(String id) {
        return validacionesNegocio() ? persistencia.eliminarMacrociclo(id) : false;
    }

    @Override
    public boolean actualizarMacrociclo(String id, Macrociclo macrociclo) {
        return validacionesNegocio() ? persistencia.actualizarMacrociclo(id, macrociclo) : false;
    }


    public boolean validacionesNegocio() {

        // Aquí van las validaciones de negocio.
        // ...
        return true;
    }

}
