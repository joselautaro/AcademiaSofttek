/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;



public class Cinco {
    
            public static void main(String[] args){
                System.out.println("Clase Cinco");
              
                
                /***
                 *  Operadores de condicion: nos permite realizar comparaciones entre valores y tomar decisiones basadas en el resultado de esas comparaciones
                 * 
                 *  == (igual a): compara si dos valores son iguales 5 == 5 resultado true
                 * 
                 * != (Diferente de): comprueba si dos valores no son iguales
                 * 
                 * < (menor que): comprueba si un valor es menor que otro
                 * 
                 * > (mayor que): comprueba si un valor es mayor que otro
                 * 
                 * <= (menor o igual): comprueba si es menor o igual que el otro 9 <= 10
                 * 
                 * >=(mayor o igual): comprueba si es mayor o igual que el otro 10 >= 9 
                 * 
                 * && (and lógico): comprueba si ambas condiciones son verdaderas ((9 <= 10) && (10 >= 9))
                 * 
                 * || (OR lógico): comprueba si al menos una de las condiciones son verdaderas (9 <= 10) || (10 >= 9)
                 * 
                 * ! (NOT lógico): Invierte el valor de una condicion, si era verdadero, se vuelve falso y si es falso, se vuelve verdadero ((9 <= 10) && (10 >= 9))
                 * 
                 */
                
                //Sentencias Condicionales en JAVA
                
                /***
                 * 
                 * 1 - if:  si utiliza para tomar una decision basada en una condicion, si la condicion es verdadera, se va ejecutar el bloque código 
                 * 
                 *              if ( condicion  ){
                 *                  acá se ejecuta el código si la condicion es verdadera
                 *                }
                 * 
                 * 
                 *     ejemplo:       
                 *  int edad = 18;
               
               if ( edad >=  18){
                   System.out.println("Eres mayor de edad");
               }
               * 
               * 
               *        Sentencia del if - else: Nos permite ejecutar un bloque de código, si la condicion se cumple, afirmativamente, sinó es falsa
               * 
               *        int edad = 17; if ( edad >= 18){ System.out.println("Eres
               * mayor de edad"); }else{ System.out.println("No eres mayor de
               * edad"); }
               */
                
                /*
              if-else if-else: podemos manejar mútiples sentencias if-else encadenadas para manejar mútilples condiciones
                
                 if ( condicion1){
                    //código a ejecutar
                }else if (condicion2){
                    //código a ejecutar
                }else{
                    //código a ejecutar si ninguna de las condiciones anteriores son verdadera
                }
                
                int nota = 85;
                
                if ( nota >= 90 ){
                    System.out.println("Excelente");
                } else if (nota >= 70){
                    System.out.println("Aprobado");
                }else{
                    System.out.println("A prepararse para la siguiente");
                }
                **/
               
                /*
                
                int nota = 85;
                
                if ( nota >= 90 ){
                    System.out.println("Excelente");
                } else if (nota >= 70){
                    System.out.println("Aprobado");
                }else if (nota >= 60){
                    System.out.println("A prepararse para la siguiente");
                }else if (nota >= 50){
                    System.out.println("A prepararse para la siguiente");
                }
                
                4 -  Switch - Case: La sentencia 'switch' nos permite tomar decisiones basadas en el valor de una expresion, podemos utiizar mútiples 'case', para manejar
                diferentes valores de una expresion
                
                 switch ( expresion ) {
                    case valor1:
                        //Codigo a ejecutar si la expresion coincide con el valor1
                            break;
                    case valor2:
                        //codigo a ejecutar si la expresion coincide con el valor2
                            break;
                    default:
                        //Se ejecuta el código en el case de que ninguno de los dos valores coincida
                }
                 char letra = 'A';
                
                switch ( letra ) {
                    case 'B':
                        System.out.println("No coincide");
                       break;
                    case 'A':
                        System.out.println("Coincide con el char");
                        break;
                    default:
                        System.out.println("No coincide con ninguno de los anteriores");
                }
                */
                
                
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt();
                
                if(numero % 2 == 0){
                    System.out.println("El número ingresado es par");
                }else{
                    System.out.println("El número es impar");
                }
               
                
               
              
                 
                
                                                 
            }
    
}
