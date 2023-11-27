package interfaces;

import entidades.Entrenador;

public interface IEntrenadorDAO {

    /**
     * Registrar a un entrenador con sus datos
     *
     * @param entrenador El entrenador a registrar.
     * @return true si se registró correctamente, false en caso contrario.
     */
    public boolean registrarEntrenador(Entrenador entrenador);

    /**
     * Eliminar un entrenador con su id.
     *
     * @param id id del entrenador a eliminar
     * @return El id del entrenador a eliminar.
     */
    public boolean eliminarEntrenador(String id);

    /**
     * Actualiza un entrenador dado su id y sus nuevos datos.
     *
     * @param id El id del entrenador a actualizar.
     * @param entrenador Los nuevos datos del entrenador.
     * @return El entrenador actualizado.
     */
    public boolean actualizarEntrenador(String id, Entrenador entrenador);

    /**
     * Valida si el entrenador dado como parametro ya existe.
     *
     * @param entrenador El entrenador a comprobar si existe, especificamente
     * usa el id y la contraseña.
     * @return El entrenador si lo encontró, null en caso contrario.
     */
    public Entrenador existeEntrenador(Entrenador entrenador);

}
