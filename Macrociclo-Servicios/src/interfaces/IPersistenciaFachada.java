/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Entrenador;
import entidades.Macrociclo;

/**
 *
 * @author USER
 */
public interface IPersistenciaFachada {
    // Métodos del entrenador.

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
     * @return El entrenador si lo encontró, false en caso contrario.
     */
    public Entrenador existeEntrenador(Entrenador entrenador);
    
    
        // Métodos del macrociclo.
    
    /**
     * Crear a un macrociclo con sus datos
     *
     * @param macrociclo El macrociclo a crear.
     * @return true si se registró correctamente, false en caso contrario.
     */
    public boolean crearMacrociclo(Macrociclo macrociclo);

   /**
     * Eliminar un macrociclo con su id.
     *
     * @param id id del macrociclo a eliminar
     * @return El id del macrociclo a eliminar.
     */
    public boolean eliminarMacrociclo(String id);
    
    /**
     * Actualiza un macrociclo dado su id y sus nuevos datos.
     *
     * @param id El id del macrociclo a actualizar.
     * @param macrociclo Los nuevos datos del macrociclo.
     * @return El macrociclo actualizado.
     */
    public boolean actualizarMacrociclo(String id, Macrociclo macrociclo);
}
