/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseSeis;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Operacion {
    
            //Atributos == Características de nuestro objeto
    
            int numero1;
            int numero2;
            int suma;
            int resta;
            int multiplicacion;
            int division;
            
            //Método == funcionalidades == acciones
            
            //Método para pedirle al usuario que nos digite 2 números
            
            public void leerNumero(){
                
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
                
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
                
            }
            
            //Método suma
            public void suma(){
                suma = numero1 + numero2;
            }
            
            
            //Método resta
            public void resta(){
                resta = numero1 - numero2;
            }
            
            //Método de multiplicación
            public void multiplicacion(){
                multiplicacion = numero1 * numero2;
            }
            
            //Método division
            
            public void division(){
                division = numero1 / numero2; 
            }
            
            //Método para mostrar resultados
            public void mostrarResultado(){
                System.out.println("La suma es: " + suma);
                System.out.println("La resta es: " + resta);
                System.out.println("La division es: "+ division);
                System.out.println("La multiplicación es: " + multiplicacion);
            }
      
            
    
    
}
