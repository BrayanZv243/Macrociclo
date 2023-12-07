package entidades;

import java.util.Objects;

public class Macrociclo {
    
    private Entrenador entrenador;
    private String deporte;
    private String rama;
    private String jefeDeRama;
    private String metodologo;
    private int semanas;

    public Macrociclo() {
    }

    public Macrociclo(String deporte, String rama, String jefeDeRama, String metodologo, int semanas, Entrenador entrenador) {
        this.deporte = deporte;
        this.rama = rama;
        this.jefeDeRama = jefeDeRama;
        this.entrenador = entrenador;
        this.metodologo = metodologo;
        this.semanas = semanas;
    }

    public Macrociclo(String deporte, String rama, String jefeDeRama, String metodologo, Entrenador entrenador) {
        this.deporte = deporte;
        this.rama = rama;
        this.jefeDeRama = jefeDeRama;
        this.entrenador = entrenador;
        this.metodologo = metodologo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getJefeDeRama() {
        return jefeDeRama;
    }

    public void setJefeDeRama(String jefeDeRama) {
        this.jefeDeRama = jefeDeRama;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getMetodologo() {
        return metodologo;
    }

    public void setMetodologo(String metodologo) {
        this.metodologo = metodologo;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.deporte);
        hash = 83 * hash + Objects.hashCode(this.rama);
        hash = 83 * hash + Objects.hashCode(this.jefeDeRama);
        hash = 83 * hash + Objects.hashCode(this.entrenador);
        hash = 83 * hash + Objects.hashCode(this.metodologo);
        hash = 83 * hash + this.semanas;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Macrociclo other = (Macrociclo) obj;
        if (this.semanas != other.semanas) {
            return false;
        }
        if (!Objects.equals(this.deporte, other.deporte)) {
            return false;
        }
        if (!Objects.equals(this.rama, other.rama)) {
            return false;
        }
        if (!Objects.equals(this.jefeDeRama, other.jefeDeRama)) {
            return false;
        }
        if (!Objects.equals(this.entrenador, other.entrenador)) {
            return false;
        }
        return Objects.equals(this.metodologo, other.metodologo);
    }

    @Override
    public String toString() {
        return "Mesociclo{" + "deporte=" + deporte + ", rama=" + rama + ", jefeDeRama=" + jefeDeRama + ", entrenador=" + entrenador + ", metodologo=" + metodologo + ", semanas=" + semanas + '}';
    }

   

}
