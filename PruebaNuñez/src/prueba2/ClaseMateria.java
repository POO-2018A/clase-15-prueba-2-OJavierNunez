package prueba2;

public class ClaseMateria {
    private String nombre;
    private int nivel;

    public ClaseMateria(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return " "+nombre + " - "+nivel+" nivel";
    }
    
 
}
