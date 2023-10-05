/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseSiete;

/**
 *
 * @author Usuario
 */
public class Persona {
    
            //Atributos
    
            String nombre;
            
            int edad;
            
            //Segundo Atributos
            
            String apellido;
            
            //Tercer atributo
            
            double km;
            
            //Método constructor, recibe parámetros como argumentos
            
            public Persona( String nombre, int edad ){
                
                this.nombre = nombre;
                
                this.edad = edad;
                
            }
            //Segunda sobrecarga de constructor persona
            public Persona(String apellido){
                this.apellido = apellido;
            }
            //Tercer sobrecarga de constructor persona
            public Persona(double km){
                this.km = km;
            }

            
            //Método clásico
            public void mostrarDatos(){
                
                System.out.println("El nombre es: " + nombre);
                System.out.println("La edad es: " + edad);
                
            }
            //Método de recarga
            public void mostrarDatos(String apellido){
                
                System.out.println("Mi apellido es: " + this.apellido);
                
            }
            
            public void correr( double km ){
                System.out.println("He corrido: " + this.km);
            }
    
    
}
