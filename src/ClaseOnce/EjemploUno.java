
 
package ClaseOnce;


public class EjemploUno {
    
    public static void main(String[] args) {
        
        //ejemplo1
        /*
        int resultado = 5 / 0;
        
        System.out.println(resultado);
        */
        //Intenta
        try{
            int resultado = 5 / 0;
            System.out.println(resultado);
        }catch( ArithmeticException  e){
            System.out.println("Error: Divisón por cero");
        }

        /*
        int edad = -5;
        
        if(edad <0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
*/
        
    }
    
    
}
