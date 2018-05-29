package prueba2;

public class ClaseEstudiante {
    private String nombre;
    private int edad;
    private ClaseMateria materias;

   ClaseEstudiante(String nombre, int edad) {
       this.nombre = nombre;
       this.edad = edad;
       //this.materias = materias;
   }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ClaseMateria getMaterias() {
        return materias;
    }

    public void setMaterias(ClaseMateria materias) {
        this.materias = materias;
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
        final ClaseEstudiante other = (ClaseEstudiante) obj;           
        if (!this.nombre.equals(other.nombre)) {
            
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Materias: ";
    }
      
}
