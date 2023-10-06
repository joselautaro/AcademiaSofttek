/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseOchoBis;

/**
 *
 * @author Usuario
 */
public class Estudiantes extends Persona{
        
        private int codigoEstudiante;
        
        private float notaFinal;
        
        public Estudiantes( String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal ){
            super(nombre, apellido, edad);
            this.codigoEstudiante = codigoEstudiante;
            this.notaFinal = notaFinal;
        } 
        
        public void mostrarDatos(){
            System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + 
                    "\nCódigo estudiante: " + codigoEstudiante + "\n Nota final: " + notaFinal);
        }
    
}
