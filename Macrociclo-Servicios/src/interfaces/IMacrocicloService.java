package interfaces;


import entidades.Macrociclo;

public interface IMacrocicloService {

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

}
