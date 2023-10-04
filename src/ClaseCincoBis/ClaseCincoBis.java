/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseCincoBis;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;


public class ClaseCincoBis {
    
    public static void main(String[] args){
        System.out.println("Clase cinco bis");
        
        /*
        Un bucle es una estructura de control que te permiten repetir un bloque código mútilples veces
        
        Bucle for: es util cuando sabemos la cantidad de veces que se repite un bloque de código
        
        for(  inicializacion; condicion; expresion de iteración  ){
        
                            //codigo a repetir
        
        }
        
        */
        
        //Ejemplo n°1: sumamos del numero 1 al n
        
        /*
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero n: ");
        
        int n = scanner.nextInt();
        
        int suma = 0;
        
        for( int i = 1; i <= n; i++){
            suma += i; //Suma los numeros del 1 al n
        }
        
        System.out.println("La suma de los numeros del 1 al " + n + " es: " + suma);
        
        */
        
        //Ejemplo 2: imprimimos los numeros pares del 1 al n
        /*
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero n: ");
        
        int n = scanner.nextInt();
        
        for( int i = 2; i <= n; i+= 2 ){
            System.out.println(i);
        }
        */
        
        //Bucle while:  se utiliza cuando NO SABES cuantas veces se ejecutará un bloque de código y la ejecución depende de una condicion
        //sintaxis
        /*
        while ( condicion ){
            //codigo a repetir
        }
        */
        //Cuenta los digitos de un numero ingresado por el usuario
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        
        int numero = scanner.nextInt();
        
        int contador = 0;
        
        int temp = numero;
        
        while ( temp != 0 ){
            temp /= 10;
            contador++;
        }
        System.out.println("El numero " + numero + " tiene " + contador + " digitos. ");
        */
        
        //Algoritmo que imprime una secuencia de numeros ingresadas por el usuario
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número inicial: ");
        
        int inicio = scanner.nextInt();
        
        System.out.print("Ingrese número final: ");
        
        int fin = scanner.nextInt();
        
        for ( int i = inicio; i < fin; i ++){
            System.out.println(i); //Imprime en este caso la secuencia de números
        }
*/
    }
    
}
