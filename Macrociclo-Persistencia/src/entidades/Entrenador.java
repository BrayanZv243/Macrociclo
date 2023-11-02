package entidades;

public class Entrenador {

    String id;
    String contraseña;
    String nombre;
    String correoPotros;

    public Entrenador() {
    }

    public Entrenador(String id, String contraseña, String nombre, String correoPotros) {
        this.id = id;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.correoPotros = correoPotros;
    }

    public Entrenador(String id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoPotros() {
        return correoPotros;
    }

    public void setCorreoPotros(String correoPotros) {
        this.correoPotros = correoPotros;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "id=" + id + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", correoPotros=" + correoPotros + '}';
    }

}
