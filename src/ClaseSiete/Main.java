/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseSiete;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static void main(String[] args){
        
            Persona p1 = new Persona( "alejandro", 21 );
            
            p1.mostrarDatos();
            
            Persona p2 = new Persona("Montaña");
            
            p2.mostrarDatos("Montaña");
            
            Persona p3 = new Persona(10.5);
            
            p3.correr(10.5);
            
        
    }
    
}
