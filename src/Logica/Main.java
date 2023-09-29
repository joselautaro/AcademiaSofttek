/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    
            public static void main(String [] args){
                
                /**
                 * Este programa calcula el area de un triangulo
                 */
                
                //Definimos base y la alura del triángulo
                  double base = 5.0;
                  
                  double altura = 3.0;
                
                  //Calcular el area del triángulo
                  
                  double area = (base * altura) / 2;
                  
                  System.out.println("El area del triángulo es: "+ area);
                
                  
                  //______________________________________________________________________
                  
                  //Calcular el promedio de tres numeros
                  
                  
                  //Definir tres números
                  
                  int numero1 = 10;
                  
                  int numero2 = 15;
                  
                  int numero3 = 20;
                
                  //Caclular el promedio
                  
                  int promedio = (numero1 + numero2 + numero3) /3;
                  
                  //Mostrar el promedio
                 System.out.println("El promedio es:  " + promedio);
                 
                 //System.out.println((numero1 + numero2 + numero3) /3);
                
                 //_________________________________________________________________________________
                 
                 //Este programa convierte grados Celsius a grados fahrenheit
                 
                 //Definimos temperatura en grados celsius
                 
                 double celsius = 25.0;
                 
                 //Realizamos la conversión a grados fahrenheit
                 
                 double fahrenheit = ( celsius * 9 / 5 ) +32;
                 
                 //Mostrar el resultado
                 
                 System.out.println(celsius + " grados celsuis son equivalentes a " + fahrenheit + " grados fahrenheit");
                 
                 //__________________________________________________
                 
                 //Encontrar el máximo de dos números
                 
                 //Definir dos números
                 
                    int num1 = 8;
                    
                    int num2 = 12;
                    
                    //Encontrar el máximo
                    
                    int maximo = Math.max(num1, num2);
                    
                    System.out.println("El número máximo entre " + num1 + " y " + num2 + " es: " + maximo);
                    
                    //____________________________________________________________________
                    
                   //Programa para verificar si una cadena contiene una subcadena
                   
                   String cadena = "Hola, mundo!";
                   
                   String subcadena = "mundo";
                   
                   boolean contieneSubcadena = cadena.contains(subcadena);
                   
                   System.out.println("La cadena contiene la subcadena: " + contieneSubcadena);
                   
                   //______________________________________________________________
                   
                   //sumamos dartos ingresados por el usuario
                   
                   Scanner scanner = new Scanner(System.in);
                   
                   //Sñlicitar al usuario que ingrese dos numeros
                   
                   System.out.print("Ingrese primer numero");
                   int numX = scanner.nextInt();
                   
                   System.out.print("Ingrese segundo numero");
                   int numY = scanner.nextInt();
                
                   int suma = numX + numY;
                   
                   System.out.println("La suma es: "  + suma);
                   
                   scanner.close();
            }
    
}
