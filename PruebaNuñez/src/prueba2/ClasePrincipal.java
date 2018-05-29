package prueba2;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClaseEstudiante [] estudiantes = new ClaseEstudiante[5];
        ClaseMateria ListaMaterias [] = new ClaseMateria [5];
        int contadorMaterias=0;
        
        for(int i = 0; i < estudiantes.length; i++) {
            System.out.println("******Datos del estudiante " + (i+1)+" *********");
            scan.nextLine();
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();
            
            System.out.print("Edad: ");
            int edad = scan.nextInt();
            
            estudiantes [i] = new ClaseEstudiante (nombre, edad);
            
            if (contadorMaterias <5){
                System.out.print("\tMaterias: \n ");
                System.out.println(" Materia 1:");
                System.out.println("Nombre: ");
                scan.nextLine();
                String nombreMateria = scan.nextLine();
                System.out.println("Nivel: ");
                int nivel = scan.nextInt();
                ClaseMateria materias = new ClaseMateria (nombreMateria, nivel);
                ListaMaterias [contadorMaterias] = materias;
                contadorMaterias++;
            }
            System.out.println("");
        }
        
        if (estudiantes.equals(estudiantes)){
            System.out.println("Existen duplicados\n");
        }else{
            System.out.println("Ingresados correctos");
        }
        
        System.out.println(" Se han ingresado los estudiantes con los siguientes datos: ");
        
        for(int i = 0; i< estudiantes.length; i++){
            System.out.println("**************Estudiante " +(i+1)+ " ****************");
            
            System.out.println(estudiantes[i].toString());
            System.out.println(ListaMaterias[i].toString());

            System.out.println("");
        }
    
    }
    
}
