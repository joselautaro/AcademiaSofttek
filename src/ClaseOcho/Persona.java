/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseOcho;


//Encapsulamiento y modificadores de acceso (Setter y getter)

//Set == establecer / Getter == obtener

/**
 *
 * @author Usuario
 */
public class Persona {
        
        private int edad;
        
        private double altura;
        //Constantes
        private final String nombre;
        
        public Persona(int edad, double altura, String nombre){
            this.edad = edad;
            this.altura = altura;
            this.nombre = nombre;
        }
        //Método Setter: Establecemos la altura 
        public void setEdad( int edad ){
            this.edad = edad;
        }
        
        //Metodo Getter: Obtener la edad
        
        public int getEdad(){
            return edad;
        }
        
        
        public void setAltura(double altura){
            this.altura = altura;
        }
        
        public double getAltura(){
            return altura;
        }
        

        public void mostrarDatos(){
            System.out.println("El nombre es: " + nombre);
            System.out.println("La edad es: " + edad);
            System.out.println("La altura es: " + altura);
        }
        
        
        
        
    
    
}
