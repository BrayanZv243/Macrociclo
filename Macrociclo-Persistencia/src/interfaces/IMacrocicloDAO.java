package interfaces;

import entidades.Entrenador;
import entidades.Macrociclo;

public interface IMacrocicloDAO {

    /**
     * Registrar a un entrenador con sus datos
     *
     * @param entrenador El entrenador a registrar.
     * @return true si se registró correctamente, false en caso contrario.
     */
    public boolean crearMacrociclo(Macrociclo macrociclo);

    /**
     * Eliminar un entrenador con su id.
     *
     * @param id id del entrenador a eliminar
     * @return El id del entrenador a eliminar.
     */
    public boolean eliminarMacrociclo(String id);

    /**
     * Actualiza un entrenador dado su id y sus nuevos datos.
     *
     * @param id El id del entrenador a actualizar.
     * @param entrenador Los nuevos datos del entrenador.
     * @return El entrenador actualizado.
     */
    public boolean actualizarMacrociclo(String id, Macrociclo macrociclo);

    /**
     * Valida si el entrenador dado como parametro ya existe.
     *
     * @param entrenador El entrenador a comprobar si existe, especificamente
     * usa el id y la contraseña.
     * @return El entrenador si lo encontró, null en caso contrario.
     */
    public Macrociclo existeMacrociclo(Macrociclo Macrociclo);

}
