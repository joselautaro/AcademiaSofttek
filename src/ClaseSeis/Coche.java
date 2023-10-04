/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseSeis;

/**
 *
 * @author Usuario
 */
public class Coche {
    
            //Atributos o características que son como se ven en la vida real los objetos
    
            String color;
            
            String marca;
            
            int km;
            
            public static void main(String[] args){
                    
                //Nombre -- Nombre del objeto -- Constructor
                
                Coche coche1 = new Coche();
                
                coche1.color = "Blanco";
                coche1.marca = "Audi";
                coche1.km = 0;
                
                System.out.println("El color del coche1 es: " + coche1.color);
                System.out.println("La marca del coche1 es: " + coche1.marca);
                System.out.println("El kiloimetraje es: " + coche1.km);
                
                Coche coche2 = new Coche();
                
                coche2.color = "Negro";
                coche2.marca = "Toyota";
                coche2.km = 100;
                
                 System.out.println("\nEl color del coche2 es: " + coche2.color);
                System.out.println("La marca del coche2 es: " + coche2.marca);
                System.out.println("El kiloimetraje del coche2 es: " + coche2.km);
                
            }
    
    
}
